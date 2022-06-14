package comm.grpc.logger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import comm.grpc.logger.aspect.LoggingAspect;

@SpringBootTest
@Import (LoggingAspect.class)
class LoggerClientApplicationTest {

	@Autowired
	ExampleLog exampleLog;
	
	@Test
	void test() {
		exampleLog.getEmp1(1);
		exampleLog.getEmp("arindam bose you are good");
		exampleLog.getEmp();
	}

}
