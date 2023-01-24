package org.bluk.physiblox.protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: v1/SimulationSession.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SimulationSessionGrpc {

  private SimulationSessionGrpc() {}

  public static final String SERVICE_NAME = "protos.SimulationSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.bluk.physiblox.protos.OpenSessionRequest,
      org.bluk.physiblox.protos.OpenSessionResponse> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Open",
      requestType = org.bluk.physiblox.protos.OpenSessionRequest.class,
      responseType = org.bluk.physiblox.protos.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.bluk.physiblox.protos.OpenSessionRequest,
      org.bluk.physiblox.protos.OpenSessionResponse> getOpenMethod() {
    io.grpc.MethodDescriptor<org.bluk.physiblox.protos.OpenSessionRequest, org.bluk.physiblox.protos.OpenSessionResponse> getOpenMethod;
    if ((getOpenMethod = SimulationSessionGrpc.getOpenMethod) == null) {
      synchronized (SimulationSessionGrpc.class) {
        if ((getOpenMethod = SimulationSessionGrpc.getOpenMethod) == null) {
          SimulationSessionGrpc.getOpenMethod = getOpenMethod =
              io.grpc.MethodDescriptor.<org.bluk.physiblox.protos.OpenSessionRequest, org.bluk.physiblox.protos.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bluk.physiblox.protos.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bluk.physiblox.protos.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SimulationSessionMethodDescriptorSupplier("Open"))
              .build();
        }
      }
    }
    return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.bluk.physiblox.protos.CloseSessionRequest,
      org.bluk.physiblox.protos.Empty> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = org.bluk.physiblox.protos.CloseSessionRequest.class,
      responseType = org.bluk.physiblox.protos.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.bluk.physiblox.protos.CloseSessionRequest,
      org.bluk.physiblox.protos.Empty> getCloseMethod() {
    io.grpc.MethodDescriptor<org.bluk.physiblox.protos.CloseSessionRequest, org.bluk.physiblox.protos.Empty> getCloseMethod;
    if ((getCloseMethod = SimulationSessionGrpc.getCloseMethod) == null) {
      synchronized (SimulationSessionGrpc.class) {
        if ((getCloseMethod = SimulationSessionGrpc.getCloseMethod) == null) {
          SimulationSessionGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<org.bluk.physiblox.protos.CloseSessionRequest, org.bluk.physiblox.protos.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bluk.physiblox.protos.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bluk.physiblox.protos.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SimulationSessionMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimulationSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimulationSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimulationSessionStub>() {
        @java.lang.Override
        public SimulationSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimulationSessionStub(channel, callOptions);
        }
      };
    return SimulationSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimulationSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimulationSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimulationSessionBlockingStub>() {
        @java.lang.Override
        public SimulationSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimulationSessionBlockingStub(channel, callOptions);
        }
      };
    return SimulationSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimulationSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimulationSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimulationSessionFutureStub>() {
        @java.lang.Override
        public SimulationSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimulationSessionFutureStub(channel, callOptions);
        }
      };
    return SimulationSessionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SimulationSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void open(org.bluk.physiblox.protos.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<org.bluk.physiblox.protos.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     */
    public void close(org.bluk.physiblox.protos.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<org.bluk.physiblox.protos.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.bluk.physiblox.protos.OpenSessionRequest,
                org.bluk.physiblox.protos.OpenSessionResponse>(
                  this, METHODID_OPEN)))
          .addMethod(
            getCloseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.bluk.physiblox.protos.CloseSessionRequest,
                org.bluk.physiblox.protos.Empty>(
                  this, METHODID_CLOSE)))
          .build();
    }
  }

  /**
   */
  public static final class SimulationSessionStub extends io.grpc.stub.AbstractAsyncStub<SimulationSessionStub> {
    private SimulationSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimulationSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimulationSessionStub(channel, callOptions);
    }

    /**
     */
    public void open(org.bluk.physiblox.protos.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<org.bluk.physiblox.protos.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void close(org.bluk.physiblox.protos.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<org.bluk.physiblox.protos.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SimulationSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<SimulationSessionBlockingStub> {
    private SimulationSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimulationSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimulationSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.bluk.physiblox.protos.OpenSessionResponse open(org.bluk.physiblox.protos.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.bluk.physiblox.protos.Empty close(org.bluk.physiblox.protos.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SimulationSessionFutureStub extends io.grpc.stub.AbstractFutureStub<SimulationSessionFutureStub> {
    private SimulationSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimulationSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimulationSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.bluk.physiblox.protos.OpenSessionResponse> open(
        org.bluk.physiblox.protos.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.bluk.physiblox.protos.Empty> close(
        org.bluk.physiblox.protos.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN = 0;
  private static final int METHODID_CLOSE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimulationSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SimulationSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN:
          serviceImpl.open((org.bluk.physiblox.protos.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<org.bluk.physiblox.protos.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((org.bluk.physiblox.protos.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<org.bluk.physiblox.protos.Empty>) responseObserver);
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

  private static abstract class SimulationSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimulationSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.bluk.physiblox.protos.SimulationSessionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SimulationSession");
    }
  }

  private static final class SimulationSessionFileDescriptorSupplier
      extends SimulationSessionBaseDescriptorSupplier {
    SimulationSessionFileDescriptorSupplier() {}
  }

  private static final class SimulationSessionMethodDescriptorSupplier
      extends SimulationSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SimulationSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (SimulationSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimulationSessionFileDescriptorSupplier())
              .addMethod(getOpenMethod())
              .addMethod(getCloseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
