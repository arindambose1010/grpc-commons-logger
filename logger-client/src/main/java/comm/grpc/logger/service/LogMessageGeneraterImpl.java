package comm.grpc.logger.service;

import static io.grpc.ManagedChannelBuilder.forAddress;
import static java.time.LocalDateTime.now;

import org.springframework.stereotype.Service;

import comm.grpc.logger.util.Constant;
import comm.grpc.logger.stub.LogMessage;
import comm.grpc.logger.stub.LoggerGrpc;
import io.grpc.ManagedChannel;
import lombok.Builder;

@Service
@Builder
public class LogMessageGeneraterImpl implements LogMessageGenerater{
	
	public void info(String logMessage) {
		pushLogMsgToServer("INFO",logMessage,String.valueOf((now())));
	}
	
	public void error(String logMessage) {
		pushLogMsgToServer("ERROR",logMessage,String.valueOf((now())));
	}
	
	private void pushLogMsgToServer(String... logInfoStr) {
		ManagedChannel managedChannel = forAddress(Constant.HOST, Constant.PORT).usePlaintext().build();
		LoggerGrpc.LoggerBlockingStub callee = LoggerGrpc.newBlockingStub(managedChannel);
		callee.logMsg(LogMessage.newBuilder().setType(logInfoStr[0]).setLogMessage(logInfoStr[1])
				.setLogTime(logInfoStr[2]).build());
	}
}
