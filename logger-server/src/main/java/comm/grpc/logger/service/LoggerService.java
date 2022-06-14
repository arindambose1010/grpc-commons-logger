package comm.grpc.logger.service;

import static comm.grpc.logger.stub.LogResponse.newBuilder;

import comm.grpc.logger.stub.LogData;
import comm.grpc.logger.stub.LogResponse;
import comm.grpc.logger.stub.LogResponse.Builder;
import comm.grpc.logger.stub.LoggerGrpc.LoggerImplBase;
import comm.grpc.logger.valueobject.LoggerBuilder;

import io.grpc.stub.StreamObserver;

import lombok.extern.slf4j.Slf4j;

import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Slf4j
public class LoggerService extends LoggerImplBase {
	private static String SUCCESS = "success";
	private static int SUCCESS_CODE = 2000;
	private static String ERROR = "error";
	private static int ERROR_CODE = 5000;
	
	public void log(LogData request, StreamObserver<LogResponse> response) {
		writeLogToFile(request, response);
	}

	private void writeLogToFile(LogData request, StreamObserver<LogResponse> responseObserver) {
		Builder response = newBuilder();
		try {
			log.info(String.valueOf(LoggerBuilder.builder().appName(request.getAppName())
					.className(request.getClassName()).methodName(request.getMethodName())
					.requestLogMessage(request.getRequestLogMessage())
					.responseLogMessage(request.getResponseLogMessage()).logTime(request.getLogTime()).build()));
			response.setResponseMessage(SUCCESS);
			response.setStatus(SUCCESS_CODE);
		} catch (Exception ex) {
			response.setResponseMessage(ERROR + ex.getMessage());
			response.setStatus(ERROR_CODE);
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
}
