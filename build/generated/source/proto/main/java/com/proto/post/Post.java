// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: post/post.proto

package com.proto.post;

public final class Post {
  private Post() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_post_PostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_post_PostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_post_PostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_post_PostResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017post/post.proto\022\004post\"\031\n\013PostRequest\022\n" +
      "\n\002id\030\001 \001(\t\":\n\014PostResponse\022\n\n\002id\030\001 \001(\t\022\r" +
      "\n\005media\030\002 \001(\t\022\017\n\007content\030\003 \001(\t2=\n\013PostSe" +
      "rvice\022.\n\003Get\022\021.post.PostRequest\032\022.post.P" +
      "ostResponse\"\000B\022\n\016com.proto.postP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_post_PostRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_post_PostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_post_PostRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_post_PostResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_post_PostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_post_PostResponse_descriptor,
        new java.lang.String[] { "Id", "Media", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
