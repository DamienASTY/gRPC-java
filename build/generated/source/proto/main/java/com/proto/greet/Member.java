// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: member/member.proto

package com.proto.greet;

public final class Member {
  private Member() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_member_MemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_member_MemberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_member_MemberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_member_MemberResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023member/member.proto\022\006member\"!\n\rMemberR" +
      "equest\022\020\n\010username\030\001 \001(\t\"I\n\016MemberRespon" +
      "se\022\020\n\010username\030\001 \001(\t\022\022\n\nfirst_name\030\002 \001(\t" +
      "\022\021\n\tlast_name\030\003 \001(\t2E\n\rMemberService\0224\n\003" +
      "Get\022\025.member.MemberRequest\032\026.member.Memb" +
      "erResponseB\023\n\017com.proto.greetP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_member_MemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_member_MemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_member_MemberRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_member_MemberResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_member_MemberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_member_MemberResponse_descriptor,
        new java.lang.String[] { "Username", "FirstName", "LastName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
