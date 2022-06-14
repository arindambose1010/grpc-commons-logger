package comm.grpc.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import comm.grpc.logger.annotaton.Log;
import comm.grpc.logger.service.LogMessageGenerater;

@Component
public class ExampleLog {

	@Autowired
	LogMessageGenerater log;
	
	@Log(name = "TestApp")
	public String getEmp1(int id) {
		return "Arindam,Bose";
	}
	
	@Log
	public String getEmp(String id) {
		return "Arindam,Bose";
	}
	
	public void getEmp() {
		log.info("Arindam,Bose---->");
	}
	
}
