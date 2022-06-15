package comm.grpc.logger.aspect;

import static java.time.LocalDateTime.now;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
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
import comm.grpc.logger.service.LogGenerater;

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
		logGenerater.generateLogs(appName
				, joinPoint.getSignature().getDeclaringTypeName()
				, joinPoint.getSignature().getName()
				, logType.name()
				, String.valueOf(Stream.of(joinPoint.getArgs()).collect(Collectors.toList()))
				, String.valueOf(result)
				, String.valueOf((now())));
	}
}