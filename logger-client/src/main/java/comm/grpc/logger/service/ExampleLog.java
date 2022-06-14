package comm.grpc.logger.service;

import org.springframework.stereotype.Component;

import comm.grpc.logger.annotaton.Log;

@Component
public class ExampleLog {

	@Log
	public String getEmp(int id) {
		return "Arindam,Bose";
	}
}
