package vn.zalopay.zas.account.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: account.proto")
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "zas.protobuf.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<vn.zalopay.zas.account.protobuf.AccountCreateRequest,
      vn.zalopay.zas.account.protobuf.AccountCreateResponse> getAccountCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "accountCreate",
      requestType = vn.zalopay.zas.account.protobuf.AccountCreateRequest.class,
      responseType = vn.zalopay.zas.account.protobuf.AccountCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vn.zalopay.zas.account.protobuf.AccountCreateRequest,
      vn.zalopay.zas.account.protobuf.AccountCreateResponse> getAccountCreateMethod() {
    io.grpc.MethodDescriptor<vn.zalopay.zas.account.protobuf.AccountCreateRequest, vn.zalopay.zas.account.protobuf.AccountCreateResponse> getAccountCreateMethod;
    if ((getAccountCreateMethod = AccountServiceGrpc.getAccountCreateMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAccountCreateMethod = AccountServiceGrpc.getAccountCreateMethod) == null) {
          AccountServiceGrpc.getAccountCreateMethod = getAccountCreateMethod =
              io.grpc.MethodDescriptor.<vn.zalopay.zas.account.protobuf.AccountCreateRequest, vn.zalopay.zas.account.protobuf.AccountCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "zas.protobuf.AccountService", "accountCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.zalopay.zas.account.protobuf.AccountCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.zalopay.zas.account.protobuf.AccountCreateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("accountCreate"))
                  .build();
          }
        }
     }
     return getAccountCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vn.zalopay.zas.account.protobuf.AccountUpdateRequest,
      vn.zalopay.zas.account.protobuf.AccountUpdateResponse> getAccountUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "accountUpdate",
      requestType = vn.zalopay.zas.account.protobuf.AccountUpdateRequest.class,
      responseType = vn.zalopay.zas.account.protobuf.AccountUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vn.zalopay.zas.account.protobuf.AccountUpdateRequest,
      vn.zalopay.zas.account.protobuf.AccountUpdateResponse> getAccountUpdateMethod() {
    io.grpc.MethodDescriptor<vn.zalopay.zas.account.protobuf.AccountUpdateRequest, vn.zalopay.zas.account.protobuf.AccountUpdateResponse> getAccountUpdateMethod;
    if ((getAccountUpdateMethod = AccountServiceGrpc.getAccountUpdateMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAccountUpdateMethod = AccountServiceGrpc.getAccountUpdateMethod) == null) {
          AccountServiceGrpc.getAccountUpdateMethod = getAccountUpdateMethod =
              io.grpc.MethodDescriptor.<vn.zalopay.zas.account.protobuf.AccountUpdateRequest, vn.zalopay.zas.account.protobuf.AccountUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "zas.protobuf.AccountService", "accountUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.zalopay.zas.account.protobuf.AccountUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.zalopay.zas.account.protobuf.AccountUpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("accountUpdate"))
                  .build();
          }
        }
     }
     return getAccountUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vn.zalopay.zas.account.protobuf.AccountQueryRequest,
      vn.zalopay.zas.account.protobuf.AccountQueryResponse> getAccountQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "accountQuery",
      requestType = vn.zalopay.zas.account.protobuf.AccountQueryRequest.class,
      responseType = vn.zalopay.zas.account.protobuf.AccountQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vn.zalopay.zas.account.protobuf.AccountQueryRequest,
      vn.zalopay.zas.account.protobuf.AccountQueryResponse> getAccountQueryMethod() {
    io.grpc.MethodDescriptor<vn.zalopay.zas.account.protobuf.AccountQueryRequest, vn.zalopay.zas.account.protobuf.AccountQueryResponse> getAccountQueryMethod;
    if ((getAccountQueryMethod = AccountServiceGrpc.getAccountQueryMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAccountQueryMethod = AccountServiceGrpc.getAccountQueryMethod) == null) {
          AccountServiceGrpc.getAccountQueryMethod = getAccountQueryMethod =
              io.grpc.MethodDescriptor.<vn.zalopay.zas.account.protobuf.AccountQueryRequest, vn.zalopay.zas.account.protobuf.AccountQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "zas.protobuf.AccountService", "accountQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.zalopay.zas.account.protobuf.AccountQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.zalopay.zas.account.protobuf.AccountQueryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("accountQuery"))
                  .build();
          }
        }
     }
     return getAccountQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    return new AccountServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void accountCreate(vn.zalopay.zas.account.protobuf.AccountCreateRequest request,
        io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountCreateMethod(), responseObserver);
    }

    /**
     */
    public void accountUpdate(vn.zalopay.zas.account.protobuf.AccountUpdateRequest request,
        io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountUpdateMethod(), responseObserver);
    }

    /**
     */
    public void accountQuery(vn.zalopay.zas.account.protobuf.AccountQueryRequest request,
        io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountQueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountQueryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAccountCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vn.zalopay.zas.account.protobuf.AccountCreateRequest,
                vn.zalopay.zas.account.protobuf.AccountCreateResponse>(
                  this, METHODID_ACCOUNT_CREATE)))
          .addMethod(
            getAccountUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vn.zalopay.zas.account.protobuf.AccountUpdateRequest,
                vn.zalopay.zas.account.protobuf.AccountUpdateResponse>(
                  this, METHODID_ACCOUNT_UPDATE)))
          .addMethod(
            getAccountQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vn.zalopay.zas.account.protobuf.AccountQueryRequest,
                vn.zalopay.zas.account.protobuf.AccountQueryResponse>(
                  this, METHODID_ACCOUNT_QUERY)))
          .build();
    }
  }

  /**
   */
  public static final class AccountServiceStub extends io.grpc.stub.AbstractStub<AccountServiceStub> {
    private AccountServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void accountCreate(vn.zalopay.zas.account.protobuf.AccountCreateRequest request,
        io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountUpdate(vn.zalopay.zas.account.protobuf.AccountUpdateRequest request,
        io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountQuery(vn.zalopay.zas.account.protobuf.AccountQueryRequest request,
        io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountQueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountQueryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public vn.zalopay.zas.account.protobuf.AccountCreateResponse accountCreate(vn.zalopay.zas.account.protobuf.AccountCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public vn.zalopay.zas.account.protobuf.AccountUpdateResponse accountUpdate(vn.zalopay.zas.account.protobuf.AccountUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public vn.zalopay.zas.account.protobuf.AccountQueryResponse accountQuery(vn.zalopay.zas.account.protobuf.AccountQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountServiceFutureStub extends io.grpc.stub.AbstractStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vn.zalopay.zas.account.protobuf.AccountCreateResponse> accountCreate(
        vn.zalopay.zas.account.protobuf.AccountCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vn.zalopay.zas.account.protobuf.AccountUpdateResponse> accountUpdate(
        vn.zalopay.zas.account.protobuf.AccountUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vn.zalopay.zas.account.protobuf.AccountQueryResponse> accountQuery(
        vn.zalopay.zas.account.protobuf.AccountQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNT_CREATE = 0;
  private static final int METHODID_ACCOUNT_UPDATE = 1;
  private static final int METHODID_ACCOUNT_QUERY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACCOUNT_CREATE:
          serviceImpl.accountCreate((vn.zalopay.zas.account.protobuf.AccountCreateRequest) request,
              (io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountCreateResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_UPDATE:
          serviceImpl.accountUpdate((vn.zalopay.zas.account.protobuf.AccountUpdateRequest) request,
              (io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountUpdateResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_QUERY:
          serviceImpl.accountQuery((vn.zalopay.zas.account.protobuf.AccountQueryRequest) request,
              (io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountQueryResponse>) responseObserver);
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

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return vn.zalopay.zas.account.protobuf.AccountManagement.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getAccountCreateMethod())
              .addMethod(getAccountUpdateMethod())
              .addMethod(getAccountQueryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
