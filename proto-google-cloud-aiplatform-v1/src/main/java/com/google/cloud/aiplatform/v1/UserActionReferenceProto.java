/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/user_action_reference.proto

package com.google.cloud.aiplatform.v1;

public final class UserActionReferenceProto {
  private UserActionReferenceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UserActionReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UserActionReference_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1/user_action"
          + "_reference.proto\022\032google.cloud.aiplatfor"
          + "m.v1\032\034google/api/annotations.proto\"d\n\023Us"
          + "erActionReference\022\023\n\toperation\030\001 \001(\tH\000\022\033"
          + "\n\021data_labeling_job\030\002 \001(\tH\000\022\016\n\006method\030\003 "
          + "\001(\tB\013\n\treferenceB\334\001\n\036com.google.cloud.ai"
          + "platform.v1B\030UserActionReferenceProtoP\001Z"
          + "Dgoogle.golang.org/genproto/googleapis/c"
          + "loud/aiplatform/v1;aiplatform\252\002\032Google.C"
          + "loud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlat"
          + "form\\V1\352\002\035Google::Cloud::AIPlatform::V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_UserActionReference_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_UserActionReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UserActionReference_descriptor,
            new java.lang.String[] {
              "Operation", "DataLabelingJob", "Method", "Reference",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
