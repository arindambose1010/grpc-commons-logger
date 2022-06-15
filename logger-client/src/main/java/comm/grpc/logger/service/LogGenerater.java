package comm.grpc.logger.service;

public interface LogGenerater {
	void generateLogs(String appName, String className, String methodName, String type, String reqLogMessage,
			String resLogMessage, String logTime);
	
}
