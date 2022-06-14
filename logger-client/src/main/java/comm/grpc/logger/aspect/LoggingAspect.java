package comm.grpc.logger.aspect;

import static java.time.LocalDateTime.now;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import comm.grpc.logger.annotaton.Log;
import comm.grpc.logger.annotaton.MESSAGE_TYPE;
import comm.grpc.logger.entity.LoggerBuilder;
import comm.grpc.logger.service.LogGenerater;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {
	
	@Autowired
	LogGenerater logGenerater;

	@AfterReturning(pointcut = "@annotation(comm.grpc.logger.annotaton.Log)",returning = "result")
	public void logAfterReturn(JoinPoint joinPoint,Object result) {
		buildLogs(joinPoint,result,MESSAGE_TYPE.INFO,getAppName(joinPoint));
	}
	
	@AfterThrowing(pointcut = "@annotation(comm.grpc.logger.annotaton.Log)",throwing ="result")
	public void logAfterError(JoinPoint joinPoint,Object result) {
		buildLogs(joinPoint,result,MESSAGE_TYPE.ERROR,getAppName(joinPoint));
	}

	
	private String getAppName(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		try {
			Class<?> cls = Class.forName(signature.getDeclaringTypeName());
			return Stream.of(cls.getMethods())
					.filter(methodName->methodName.getName().equals(signature.getName()))
					.findFirst()
					.get().getAnnotation(Log.class).name();
		} catch (Exception e) {
			return "";
		}
	}
	
	
	private void buildLogs(JoinPoint joinPoint,Object result,MESSAGE_TYPE logType,String appName) {
		LoggerBuilder logger = LoggerBuilder.builder()
				.appName(appName)
				.className(joinPoint.getSignature().getDeclaringTypeName())
				.methodName(joinPoint.getSignature().getName())
				.type(logType.toString())
				.requestLogMessage(String.valueOf(Stream.of(joinPoint.getArgs()).collect(Collectors.toList())))
				.responseLogMessage(String.valueOf(result))
				.logTime(String.valueOf((now())))
				.build();
		logGenerater.generateLogs(logger);
	}
}