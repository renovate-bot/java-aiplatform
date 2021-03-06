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
// source: google/cloud/aiplatform/v1beta1/featurestore_monitoring.proto

package com.google.cloud.aiplatform.v1beta1;

public final class FeaturestoreMonitoringProto {
  private FeaturestoreMonitoringProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/aiplatform/v1beta1/featur"
          + "estore_monitoring.proto\022\037google.cloud.ai"
          + "platform.v1beta1\032\036google/protobuf/durati"
          + "on.proto\032\034google/api/annotations.proto\"\347"
          + "\001\n\034FeaturestoreMonitoringConfig\022i\n\021snaps"
          + "hot_analysis\030\001 \001(\0132N.google.cloud.aiplat"
          + "form.v1beta1.FeaturestoreMonitoringConfi"
          + "g.SnapshotAnalysis\032\\\n\020SnapshotAnalysis\022\020"
          + "\n\010disabled\030\001 \001(\010\0226\n\023monitoring_interval\030"
          + "\002 \001(\0132\031.google.protobuf.DurationB\217\001\n#com"
          + ".google.cloud.aiplatform.v1beta1B\033Featur"
          + "estoreMonitoringProtoP\001ZIgoogle.golang.o"
          + "rg/genproto/googleapis/cloud/aiplatform/"
          + "v1beta1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_descriptor,
            new java.lang.String[] {
              "SnapshotAnalysis",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeaturestoreMonitoringConfig_SnapshotAnalysis_descriptor,
            new java.lang.String[] {
              "Disabled", "MonitoringInterval",
            });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
