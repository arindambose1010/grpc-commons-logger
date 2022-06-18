package comm.grpc.logger.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import comm.grpc.logger.stub.LoggerGrpc.LoggerBlockingStub;


public interface GenarateStub {
   LoggerBlockingStub getLogServerInstance();
}
