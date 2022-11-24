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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: QA.proto")
public final class QAServiceGrpc {

  private QAServiceGrpc() {}

  public static final String SERVICE_NAME = "QAService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<QA.QARequest,
      QA.QAResponse> getAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ask",
      requestType = QA.QARequest.class,
      responseType = QA.QAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QA.QARequest,
      QA.QAResponse> getAskMethod() {
    io.grpc.MethodDescriptor<QA.QARequest, QA.QAResponse> getAskMethod;
    if ((getAskMethod = QAServiceGrpc.getAskMethod) == null) {
      synchronized (QAServiceGrpc.class) {
        if ((getAskMethod = QAServiceGrpc.getAskMethod) == null) {
          QAServiceGrpc.getAskMethod = getAskMethod =
              io.grpc.MethodDescriptor.<QA.QARequest, QA.QAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QA.QARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QA.QAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QAServiceMethodDescriptorSupplier("Ask"))
              .build();
        }
      }
    }
    return getAskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QAServiceStub newStub(io.grpc.Channel channel) {
    return new QAServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QAServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QAServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QAServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QAServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class QAServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ask(QA.QARequest request,
        io.grpc.stub.StreamObserver<QA.QAResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAskMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                QA.QARequest,
                QA.QAResponse>(
                  this, METHODID_ASK)))
          .build();
    }
  }

  /**
   */
  public static final class QAServiceStub extends io.grpc.stub.AbstractStub<QAServiceStub> {
    private QAServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QAServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QAServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QAServiceStub(channel, callOptions);
    }

    /**
     */
    public void ask(QA.QARequest request,
        io.grpc.stub.StreamObserver<QA.QAResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QAServiceBlockingStub extends io.grpc.stub.AbstractStub<QAServiceBlockingStub> {
    private QAServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QAServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QAServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QAServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public QA.QAResponse ask(QA.QARequest request) {
      return blockingUnaryCall(
          getChannel(), getAskMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QAServiceFutureStub extends io.grpc.stub.AbstractStub<QAServiceFutureStub> {
    private QAServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QAServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QAServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QAServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<QA.QAResponse> ask(
        QA.QARequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QAServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QAServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASK:
          serviceImpl.ask((QA.QARequest) request,
              (io.grpc.stub.StreamObserver<QA.QAResponse>) responseObserver);
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

  private static abstract class QAServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QAServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return QA.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QAService");
    }
  }

  private static final class QAServiceFileDescriptorSupplier
      extends QAServiceBaseDescriptorSupplier {
    QAServiceFileDescriptorSupplier() {}
  }

  private static final class QAServiceMethodDescriptorSupplier
      extends QAServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QAServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QAServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QAServiceFileDescriptorSupplier())
              .addMethod(getAskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
