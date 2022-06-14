package comm.grpc.logger.service;

import static java.time.LocalDateTime.now;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.grpc.logger.entity.LogMessageBuilder;
import comm.grpc.logger.stub.LogMessage;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Service
@Builder
@Slf4j
public class LogMessageGeneraterImpl implements LogMessageGenerater{
	
	@Autowired
	GenarateLoggerBlockingStub stub;
	
	 public void generateLogs(String... logInfoStr) {
		 try{
			 stub.getLogServerInstance().logMsg(LogMessage.newBuilder().setType(logInfoStr[0]).setLogMessage(logInfoStr[1])
						.setLogTime(logInfoStr[2]).build());
		 }catch(Exception e) {
			 localLogPrint(logInfoStr);
		 }
	}

	
	private void localLogPrint(String... logInfoStr) {
		log.error(LogMessageBuilder.builder()
				.type(logInfoStr[0])
				.logMessage(logInfoStr[1])
				.logTime(logInfoStr[2]).build().toString());
	}	
	
	public void info(String logMessage) {
		generateLogs("INFO",logMessage,String.valueOf((now())));
	}
	
	public void error(String logMessage) {
		generateLogs("ERROR",logMessage,String.valueOf((now())));
	}
}
