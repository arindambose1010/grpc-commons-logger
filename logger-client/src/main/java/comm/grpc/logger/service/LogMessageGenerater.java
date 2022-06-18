package comm.grpc.logger.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface LogMessageGenerater {
	public void info(String reqLogMessage);
	public void error(String reqLogMessage);
}
