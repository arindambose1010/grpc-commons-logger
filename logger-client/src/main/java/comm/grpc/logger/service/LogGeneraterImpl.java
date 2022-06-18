package comm.grpc.logger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import comm.grpc.logger.entity.LoggerBuilder;
import comm.grpc.logger.stub.LogData;
import comm.grpc.logger.stub.LoggerGrpc.LoggerBlockingStub;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Builder
public class LogGeneraterImpl  implements LogGenerater{
	
	@Autowired
	GenarateStub stub;
	
	 public void generateLogs(LoggerBuilder loggerBuilder) {
		 try{
			 pushLogToServer(stub.getLogServerInstance(),loggerBuilder);
		 }catch(Exception e) {
			 localLogPrint(loggerBuilder);
		 }
	}

	
	private void localLogPrint(LoggerBuilder logger) {
		log.error(logger.toString());
	}	
	
	private void pushLogToServer(LoggerBlockingStub loggerStub,LoggerBuilder loggerBuilder) {
		loggerStub.log(LogData.newBuilder()
			.setAppName(loggerBuilder.getAppName())
			.setClassName(loggerBuilder.getClassName())
			.setMethodName(loggerBuilder.getMethodName())
			.setType(loggerBuilder.getType())
			.setRequestLogMessage(loggerBuilder.getRequestLogMessage())
			.setResponseLogMessage(loggerBuilder.getResponseLogMessage())
			.setLogTime(loggerBuilder.getLogTime()).build());

   }
}
