package comm.grpc.logger.service;

import org.springframework.stereotype.Service;

@Service
public interface LogMessageGenerater {
	public void info(String reqLogMessage);
	public void error(String reqLogMessage);
}
