package comm.grpc.logger.service;


import comm.grpc.logger.stub.LoggerGrpc.LoggerBlockingStub;


public interface GenarateStub {
   LoggerBlockingStub getLogServerInstance();
}
