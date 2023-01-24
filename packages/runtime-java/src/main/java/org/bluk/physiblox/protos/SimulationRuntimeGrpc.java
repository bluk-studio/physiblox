package org.bluk.physiblox.protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: v1/SimulationRuntime.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SimulationRuntimeGrpc {

  private SimulationRuntimeGrpc() {}

  public static final String SERVICE_NAME = "protos.SimulationRuntime";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimulationRuntimeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimulationRuntimeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimulationRuntimeStub>() {
        @java.lang.Override
        public SimulationRuntimeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimulationRuntimeStub(channel, callOptions);
        }
      };
    return SimulationRuntimeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimulationRuntimeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimulationRuntimeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimulationRuntimeBlockingStub>() {
        @java.lang.Override
        public SimulationRuntimeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimulationRuntimeBlockingStub(channel, callOptions);
        }
      };
    return SimulationRuntimeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimulationRuntimeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimulationRuntimeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimulationRuntimeFutureStub>() {
        @java.lang.Override
        public SimulationRuntimeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimulationRuntimeFutureStub(channel, callOptions);
        }
      };
    return SimulationRuntimeFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SimulationRuntimeImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class SimulationRuntimeStub extends io.grpc.stub.AbstractAsyncStub<SimulationRuntimeStub> {
    private SimulationRuntimeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimulationRuntimeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimulationRuntimeStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SimulationRuntimeBlockingStub extends io.grpc.stub.AbstractBlockingStub<SimulationRuntimeBlockingStub> {
    private SimulationRuntimeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimulationRuntimeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimulationRuntimeBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SimulationRuntimeFutureStub extends io.grpc.stub.AbstractFutureStub<SimulationRuntimeFutureStub> {
    private SimulationRuntimeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimulationRuntimeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimulationRuntimeFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimulationRuntimeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SimulationRuntimeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
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

  private static abstract class SimulationRuntimeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimulationRuntimeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.bluk.physiblox.protos.SimulationRuntimeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SimulationRuntime");
    }
  }

  private static final class SimulationRuntimeFileDescriptorSupplier
      extends SimulationRuntimeBaseDescriptorSupplier {
    SimulationRuntimeFileDescriptorSupplier() {}
  }

  private static final class SimulationRuntimeMethodDescriptorSupplier
      extends SimulationRuntimeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SimulationRuntimeMethodDescriptorSupplier(String methodName) {
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
      synchronized (SimulationRuntimeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimulationRuntimeFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
