package comm.grpc.logger.service;

import static io.grpc.ManagedChannelBuilder.forAddress;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import comm.grpc.logger.stub.LoggerGrpc;
import comm.grpc.logger.stub.LoggerGrpc.LoggerBlockingStub;
import lombok.Builder;

@Service
@Builder
public class GenarateLoggerBlockingStub implements GenarateStub {

	private final String HOST = "localhost";
	private final int PORT = 9090;
    
	public LoggerBlockingStub getLogServerInstance() {
		 return Optional
				 .of(LoggerGrpc.newBlockingStub(forAddress(HOST, PORT)
						 .usePlaintext()
						 .build()))
				 .get();
	}
}
