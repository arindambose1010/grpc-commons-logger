package comm.grpc.logger.service;


public interface LogMessageGenerater {
	public void info(String reqLogMessage);
	public void error(String reqLogMessage);
}
