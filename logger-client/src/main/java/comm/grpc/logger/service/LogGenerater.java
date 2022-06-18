package comm.grpc.logger.service;

import org.springframework.stereotype.Service;

import comm.grpc.logger.entity.LoggerBuilder;


public interface LogGenerater {
	void generateLogs(LoggerBuilder loggerBuilder);
	
}
