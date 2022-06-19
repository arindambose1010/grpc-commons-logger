package comm.grpc.logger.service;



import comm.grpc.logger.entity.LoggerBuilder;


public interface LogGenerater {
	void generateLogs(LoggerBuilder loggerBuilder);
	
}
