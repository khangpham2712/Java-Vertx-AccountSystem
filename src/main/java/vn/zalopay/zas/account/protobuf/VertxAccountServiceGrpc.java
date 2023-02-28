package vn.zalopay.zas.account.protobuf;

import static vn.zalopay.zas.account.protobuf.AccountServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: account.proto")
public final class VertxAccountServiceGrpc {
    private VertxAccountServiceGrpc() {}

    public static AccountServiceVertxStub newVertxStub(io.grpc.Channel channel) {
        return new AccountServiceVertxStub(channel);
    }


    public static final class AccountServiceVertxStub extends io.grpc.stub.AbstractStub<AccountServiceVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private AccountServiceGrpc.AccountServiceStub delegateStub;

        private AccountServiceVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = AccountServiceGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private AccountServiceVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = AccountServiceGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected AccountServiceVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AccountServiceVertxStub(channel, callOptions);
        }


        public io.vertx.core.Future<vn.zalopay.zas.account.protobuf.AccountCreateResponse> accountCreate(vn.zalopay.zas.account.protobuf.AccountCreateRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::accountCreate);
        }


        public io.vertx.core.Future<vn.zalopay.zas.account.protobuf.AccountUpdateResponse> accountUpdate(vn.zalopay.zas.account.protobuf.AccountUpdateRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::accountUpdate);
        }


        public io.vertx.core.Future<vn.zalopay.zas.account.protobuf.AccountQueryResponse> accountQuery(vn.zalopay.zas.account.protobuf.AccountQueryRequest request) {
            return io.vertx.grpc.stub.ClientCalls.oneToOne(ctx, request, delegateStub::accountQuery);
        }

    }


    public static abstract class AccountServiceVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public AccountServiceVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }


        public io.vertx.core.Future<vn.zalopay.zas.account.protobuf.AccountCreateResponse> accountCreate(vn.zalopay.zas.account.protobuf.AccountCreateRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }


        public io.vertx.core.Future<vn.zalopay.zas.account.protobuf.AccountUpdateResponse> accountUpdate(vn.zalopay.zas.account.protobuf.AccountUpdateRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }


        public io.vertx.core.Future<vn.zalopay.zas.account.protobuf.AccountQueryResponse> accountQuery(vn.zalopay.zas.account.protobuf.AccountQueryRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            vn.zalopay.zas.account.protobuf.AccountServiceGrpc.getAccountCreateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vn.zalopay.zas.account.protobuf.AccountCreateRequest,
                                            vn.zalopay.zas.account.protobuf.AccountCreateResponse>(
                                            this, METHODID_ACCOUNT_CREATE, compression)))
                    .addMethod(
                            vn.zalopay.zas.account.protobuf.AccountServiceGrpc.getAccountUpdateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vn.zalopay.zas.account.protobuf.AccountUpdateRequest,
                                            vn.zalopay.zas.account.protobuf.AccountUpdateResponse>(
                                            this, METHODID_ACCOUNT_UPDATE, compression)))
                    .addMethod(
                            vn.zalopay.zas.account.protobuf.AccountServiceGrpc.getAccountQueryMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            vn.zalopay.zas.account.protobuf.AccountQueryRequest,
                                            vn.zalopay.zas.account.protobuf.AccountQueryResponse>(
                                            this, METHODID_ACCOUNT_QUERY, compression)))
                    .build();
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

        private final AccountServiceVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(AccountServiceVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_ACCOUNT_CREATE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vn.zalopay.zas.account.protobuf.AccountCreateRequest) request,
                            (io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountCreateResponse>) responseObserver,
                            compression,
                            serviceImpl::accountCreate);
                    break;
                case METHODID_ACCOUNT_UPDATE:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vn.zalopay.zas.account.protobuf.AccountUpdateRequest) request,
                            (io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountUpdateResponse>) responseObserver,
                            compression,
                            serviceImpl::accountUpdate);
                    break;
                case METHODID_ACCOUNT_QUERY:
                    io.vertx.grpc.stub.ServerCalls.oneToOne(
                            (vn.zalopay.zas.account.protobuf.AccountQueryRequest) request,
                            (io.grpc.stub.StreamObserver<vn.zalopay.zas.account.protobuf.AccountQueryResponse>) responseObserver,
                            compression,
                            serviceImpl::accountQuery);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
