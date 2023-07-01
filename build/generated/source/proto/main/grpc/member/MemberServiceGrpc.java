package member;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: member/member.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MemberServiceGrpc {

  private MemberServiceGrpc() {}

  public static final String SERVICE_NAME = "member.MemberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<member.Member.MemberRequest,
      member.Member.MemberResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = member.Member.MemberRequest.class,
      responseType = member.Member.MemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<member.Member.MemberRequest,
      member.Member.MemberResponse> getGetMethod() {
    io.grpc.MethodDescriptor<member.Member.MemberRequest, member.Member.MemberResponse> getGetMethod;
    if ((getGetMethod = MemberServiceGrpc.getGetMethod) == null) {
      synchronized (MemberServiceGrpc.class) {
        if ((getGetMethod = MemberServiceGrpc.getGetMethod) == null) {
          MemberServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<member.Member.MemberRequest, member.Member.MemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  member.Member.MemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  member.Member.MemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MemberServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MemberServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberServiceStub>() {
        @java.lang.Override
        public MemberServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberServiceStub(channel, callOptions);
        }
      };
    return MemberServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MemberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberServiceBlockingStub>() {
        @java.lang.Override
        public MemberServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberServiceBlockingStub(channel, callOptions);
        }
      };
    return MemberServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MemberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberServiceFutureStub>() {
        @java.lang.Override
        public MemberServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberServiceFutureStub(channel, callOptions);
        }
      };
    return MemberServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void get(member.Member.MemberRequest request,
        io.grpc.stub.StreamObserver<member.Member.MemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MemberService.
   */
  public static abstract class MemberServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MemberServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MemberService.
   */
  public static final class MemberServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MemberServiceStub> {
    private MemberServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(member.Member.MemberRequest request,
        io.grpc.stub.StreamObserver<member.Member.MemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MemberService.
   */
  public static final class MemberServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MemberServiceBlockingStub> {
    private MemberServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public member.Member.MemberResponse get(member.Member.MemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MemberService.
   */
  public static final class MemberServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MemberServiceFutureStub> {
    private MemberServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<member.Member.MemberResponse> get(
        member.Member.MemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((member.Member.MemberRequest) request,
              (io.grpc.stub.StreamObserver<member.Member.MemberResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              member.Member.MemberRequest,
              member.Member.MemberResponse>(
                service, METHODID_GET)))
        .build();
  }

  private static abstract class MemberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MemberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return member.Member.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MemberService");
    }
  }

  private static final class MemberServiceFileDescriptorSupplier
      extends MemberServiceBaseDescriptorSupplier {
    MemberServiceFileDescriptorSupplier() {}
  }

  private static final class MemberServiceMethodDescriptorSupplier
      extends MemberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MemberServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MemberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MemberServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
