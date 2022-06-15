package comm.grpc.logger.service;

import static io.grpc.ManagedChannelBuilder.forAddress;

import comm.grpc.logger.stub.LogData;
import comm.grpc.logger.stub.LoggerGrpc;

import io.grpc.ManagedChannel;
import lombok.Builder;

import org.springframework.stereotype.Service;

@Service
@Builder
public class LogGeneraterImpl  implements LogGenerater{
	
	private final String HOST = "localhost";
	private final int PORT = 9090;
    
	 public void generateLogs(String appName, String className, String methodName, String type, String reqLogMessage,
			String resLogMessage, String logTime) {
		pushLogToServer(appName, className, methodName,type,reqLogMessage,resLogMessage,logTime);
	}

	
	private void pushLogToServer(String... logInfoStr) {
		ManagedChannel managedChannel = forAddress(HOST, PORT).usePlaintext().build();
		LoggerGrpc.LoggerBlockingStub callee = LoggerGrpc.newBlockingStub(managedChannel);
		callee.log(LogData.newBuilder().setAppName(logInfoStr[0]).setClassName(logInfoStr[1])
				.setMethodName(logInfoStr[2]).setType(logInfoStr[3]).setRequestLogMessage(logInfoStr[4])
				.setResponseLogMessage(logInfoStr[5]).setLogTime(logInfoStr[6]).build());
	}
	

}
