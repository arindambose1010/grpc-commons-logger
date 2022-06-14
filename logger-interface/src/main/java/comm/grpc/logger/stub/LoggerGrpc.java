package comm.grpc.logger.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: loggerSchema.proto")
public final class LoggerGrpc {

  private LoggerGrpc() {}

  public static final String SERVICE_NAME = "Logger";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<comm.grpc.logger.stub.LogData,
      comm.grpc.logger.stub.LogResponse> getLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "log",
      requestType = comm.grpc.logger.stub.LogData.class,
      responseType = comm.grpc.logger.stub.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<comm.grpc.logger.stub.LogData,
      comm.grpc.logger.stub.LogResponse> getLogMethod() {
    io.grpc.MethodDescriptor<comm.grpc.logger.stub.LogData, comm.grpc.logger.stub.LogResponse> getLogMethod;
    if ((getLogMethod = LoggerGrpc.getLogMethod) == null) {
      synchronized (LoggerGrpc.class) {
        if ((getLogMethod = LoggerGrpc.getLogMethod) == null) {
          LoggerGrpc.getLogMethod = getLogMethod = 
              io.grpc.MethodDescriptor.<comm.grpc.logger.stub.LogData, comm.grpc.logger.stub.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Logger", "log"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  comm.grpc.logger.stub.LogData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  comm.grpc.logger.stub.LogResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LoggerMethodDescriptorSupplier("log"))
                  .build();
          }
        }
     }
     return getLogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoggerStub newStub(io.grpc.Channel channel) {
    return new LoggerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoggerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LoggerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoggerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LoggerFutureStub(channel);
  }

  /**
   */
  public static abstract class LoggerImplBase implements io.grpc.BindableService {

    /**
     */
    public void log(comm.grpc.logger.stub.LogData request,
        io.grpc.stub.StreamObserver<comm.grpc.logger.stub.LogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                comm.grpc.logger.stub.LogData,
                comm.grpc.logger.stub.LogResponse>(
                  this, METHODID_LOG)))
          .build();
    }
  }

  /**
   */
  public static final class LoggerStub extends io.grpc.stub.AbstractStub<LoggerStub> {
    private LoggerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoggerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoggerStub(channel, callOptions);
    }

    /**
     */
    public void log(comm.grpc.logger.stub.LogData request,
        io.grpc.stub.StreamObserver<comm.grpc.logger.stub.LogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LoggerBlockingStub extends io.grpc.stub.AbstractStub<LoggerBlockingStub> {
    private LoggerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoggerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoggerBlockingStub(channel, callOptions);
    }

    /**
     */
    public comm.grpc.logger.stub.LogResponse log(comm.grpc.logger.stub.LogData request) {
      return blockingUnaryCall(
          getChannel(), getLogMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LoggerFutureStub extends io.grpc.stub.AbstractStub<LoggerFutureStub> {
    private LoggerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoggerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoggerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<comm.grpc.logger.stub.LogResponse> log(
        comm.grpc.logger.stub.LogData request) {
      return futureUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoggerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoggerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG:
          serviceImpl.log((comm.grpc.logger.stub.LogData) request,
              (io.grpc.stub.StreamObserver<comm.grpc.logger.stub.LogResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LoggerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoggerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return comm.grpc.logger.stub.LoggerSchema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Logger");
    }
  }

  private static final class LoggerFileDescriptorSupplier
      extends LoggerBaseDescriptorSupplier {
    LoggerFileDescriptorSupplier() {}
  }

  private static final class LoggerMethodDescriptorSupplier
      extends LoggerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoggerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LoggerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoggerFileDescriptorSupplier())
              .addMethod(getLogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
