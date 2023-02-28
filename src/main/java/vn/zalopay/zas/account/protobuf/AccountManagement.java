// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account.proto

package vn.zalopay.zas.account.protobuf;

public final class AccountManagement {
  private AccountManagement() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zas_protobuf_Account_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zas_protobuf_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zas_protobuf_AccountCreateRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zas_protobuf_AccountCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zas_protobuf_AccountCreateResponse_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zas_protobuf_AccountCreateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zas_protobuf_AccountUpdateRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zas_protobuf_AccountUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zas_protobuf_AccountUpdateResponse_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zas_protobuf_AccountUpdateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zas_protobuf_AccountQueryRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zas_protobuf_AccountQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zas_protobuf_AccountQueryResponse_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zas_protobuf_AccountQueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\raccount.proto\022\014zas.protobuf\"B\n\007Account" +
      "\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\020\n\010password\030\003" +
      " \001(\t\022\013\n\003dob\030\004 \001(\t\"C\n\024AccountCreateReques" +
      "t\022\014\n\004name\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\013\n\003dob" +
      "\030\003 \001(\t\"_\n\025AccountCreateResponse\022\021\n\terror" +
      "Code\030\001 \001(\003\022\013\n\003msg\030\002 \001(\t\022&\n\007account\030\003 \001(\013" +
      "2\025.zas.protobuf.Account\"O\n\024AccountUpdate" +
      "Request\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\020\n\010pas" +
      "sword\030\003 \001(\t\022\013\n\003dob\030\004 \001(\t\"_\n\025AccountUpdat" +
      "eResponse\022\021\n\terrorCode\030\001 \001(\003\022\013\n\003msg\030\002 \001(",
      "\t\022&\n\007account\030\003 \001(\0132\025.zas.protobuf.Accoun" +
      "t\"!\n\023AccountQueryRequest\022\n\n\002id\030\001 \001(\003\"^\n\024" +
      "AccountQueryResponse\022\021\n\terrorCode\030\001 \001(\003\022" +
      "\013\n\003msg\030\002 \001(\t\022&\n\007account\030\003 \001(\0132\025.zas.prot" +
      "obuf.Account2\233\002\n\016AccountService\022X\n\raccou" +
      "ntCreate\022\".zas.protobuf.AccountCreateReq" +
      "uest\032#.zas.protobuf.AccountCreateRespons" +
      "e\022X\n\raccountUpdate\022\".zas.protobuf.Accoun" +
      "tUpdateRequest\032#.zas.protobuf.AccountUpd" +
      "ateResponse\022U\n\014accountQuery\022!.zas.protob",
      "uf.AccountQueryRequest\032\".zas.protobuf.Ac" +
      "countQueryResponseB2\n\033vn.zalopay.zas.acc" +
      "ount.grpcB\021AccountManagementP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_zas_protobuf_Account_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zas_protobuf_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zas_protobuf_Account_descriptor,
        new java.lang.String[] { "Id", "Name", "Password", "Dob", });
    internal_static_zas_protobuf_AccountCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_zas_protobuf_AccountCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zas_protobuf_AccountCreateRequest_descriptor,
        new java.lang.String[] { "Name", "Password", "Dob", });
    internal_static_zas_protobuf_AccountCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_zas_protobuf_AccountCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zas_protobuf_AccountCreateResponse_descriptor,
        new java.lang.String[] { "ErrorCode", "Msg", "Account", });
    internal_static_zas_protobuf_AccountUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_zas_protobuf_AccountUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zas_protobuf_AccountUpdateRequest_descriptor,
        new java.lang.String[] { "Id", "Name", "Password", "Dob", });
    internal_static_zas_protobuf_AccountUpdateResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_zas_protobuf_AccountUpdateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zas_protobuf_AccountUpdateResponse_descriptor,
        new java.lang.String[] { "ErrorCode", "Msg", "Account", });
    internal_static_zas_protobuf_AccountQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_zas_protobuf_AccountQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zas_protobuf_AccountQueryRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_zas_protobuf_AccountQueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_zas_protobuf_AccountQueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zas_protobuf_AccountQueryResponse_descriptor,
        new java.lang.String[] { "ErrorCode", "Msg", "Account", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}