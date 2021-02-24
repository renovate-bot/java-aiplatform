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
// source: google/cloud/aiplatform/v1/data_labeling_job.proto

package com.google.cloud.aiplatform.v1;

public final class DataLabelingJobProto {
  private DataLabelingJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DataLabelingJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DataLabelingJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DataLabelingJob_AnnotationLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DataLabelingJob_AnnotationLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DataLabelingJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DataLabelingJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ActiveLearningConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ActiveLearningConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SampleConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SampleConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TrainingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TrainingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1/data_labeli"
          + "ng_job.proto\022\032google.cloud.aiplatform.v1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\0321google/cloud/aipla"
          + "tform/v1/accelerator_type.proto\0320google/"
          + "cloud/aiplatform/v1/encryption_spec.prot"
          + "o\032*google/cloud/aiplatform/v1/job_state."
          + "proto\0320google/cloud/aiplatform/v1/specia"
          + "list_pool.proto\032\034google/protobuf/struct."
          + "proto\032\037google/protobuf/timestamp.proto\032\027"
          + "google/rpc/status.proto\032\027google/type/mon"
          + "ey.proto\032\034google/api/annotations.proto\"\337"
          + "\010\n\017DataLabelingJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022;\n\010datasets\030\003 \003"
          + "(\tB)\340A\002\372A#\n!aiplatform.googleapis.com/Da"
          + "taset\022\\\n\021annotation_labels\030\014 \003(\0132A.googl"
          + "e.cloud.aiplatform.v1.DataLabelingJob.An"
          + "notationLabelsEntry\022\032\n\rlabeler_count\030\004 \001"
          + "(\005B\003\340A\002\022\034\n\017instruction_uri\030\005 \001(\tB\003\340A\002\022\036\n"
          + "\021inputs_schema_uri\030\006 \001(\tB\003\340A\002\022+\n\006inputs\030"
          + "\007 \001(\0132\026.google.protobuf.ValueB\003\340A\002\0228\n\005st"
          + "ate\030\010 \001(\0162$.google.cloud.aiplatform.v1.J"
          + "obStateB\003\340A\003\022\036\n\021labeling_progress\030\r \001(\005B"
          + "\003\340A\003\022.\n\rcurrent_spend\030\016 \001(\0132\022.google.typ"
          + "e.MoneyB\003\340A\003\0224\n\013create_time\030\t \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\0224\n\013update_tim"
          + "e\030\n \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\022&\n\005error\030\026 \001(\0132\022.google.rpc.StatusB\003\340A\003"
          + "\022G\n\006labels\030\013 \003(\01327.google.cloud.aiplatfo"
          + "rm.v1.DataLabelingJob.LabelsEntry\022\030\n\020spe"
          + "cialist_pools\030\020 \003(\t\022C\n\017encryption_spec\030\024"
          + " \001(\0132*.google.cloud.aiplatform.v1.Encryp"
          + "tionSpec\022P\n\026active_learning_config\030\025 \001(\013"
          + "20.google.cloud.aiplatform.v1.ActiveLear"
          + "ningConfig\0327\n\025AnnotationLabelsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032-\n\013LabelsEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:|\352Ay\n"
          + ")aiplatform.googleapis.com/DataLabelingJ"
          + "ob\022Lprojects/{project}/locations/{locati"
          + "on}/dataLabelingJobs/{data_labeling_job}"
          + "\"\370\001\n\024ActiveLearningConfig\022\035\n\023max_data_it"
          + "em_count\030\001 \001(\003H\000\022\"\n\030max_data_item_percen"
          + "tage\030\002 \001(\005H\000\022?\n\rsample_config\030\003 \001(\0132(.go"
          + "ogle.cloud.aiplatform.v1.SampleConfig\022C\n"
          + "\017training_config\030\004 \001(\0132*.google.cloud.ai"
          + "platform.v1.TrainingConfigB\027\n\025human_labe"
          + "ling_budget\"\270\002\n\014SampleConfig\022)\n\037initial_"
          + "batch_sample_percentage\030\001 \001(\005H\000\022+\n!follo"
          + "wing_batch_sample_percentage\030\003 \001(\005H\001\022P\n\017"
          + "sample_strategy\030\005 \001(\01627.google.cloud.aip"
          + "latform.v1.SampleConfig.SampleStrategy\"B"
          + "\n\016SampleStrategy\022\037\n\033SAMPLE_STRATEGY_UNSP"
          + "ECIFIED\020\000\022\017\n\013UNCERTAINTY\020\001B\033\n\031initial_ba"
          + "tch_sample_sizeB\035\n\033following_batch_sampl"
          + "e_size\"6\n\016TrainingConfig\022$\n\034timeout_trai"
          + "ning_milli_hours\030\001 \001(\003B~\n\036com.google.clo"
          + "ud.aiplatform.v1B\024DataLabelingJobProtoP\001"
          + "ZDgoogle.golang.org/genproto/googleapis/"
          + "cloud/aiplatform/v1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.AcceleratorTypeProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.SpecialistPoolProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_DataLabelingJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_DataLabelingJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DataLabelingJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Datasets",
              "AnnotationLabels",
              "LabelerCount",
              "InstructionUri",
              "InputsSchemaUri",
              "Inputs",
              "State",
              "LabelingProgress",
              "CurrentSpend",
              "CreateTime",
              "UpdateTime",
              "Error",
              "Labels",
              "SpecialistPools",
              "EncryptionSpec",
              "ActiveLearningConfig",
            });
    internal_static_google_cloud_aiplatform_v1_DataLabelingJob_AnnotationLabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_DataLabelingJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_DataLabelingJob_AnnotationLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DataLabelingJob_AnnotationLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_DataLabelingJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_DataLabelingJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_DataLabelingJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DataLabelingJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ActiveLearningConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ActiveLearningConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ActiveLearningConfig_descriptor,
            new java.lang.String[] {
              "MaxDataItemCount",
              "MaxDataItemPercentage",
              "SampleConfig",
              "TrainingConfig",
              "HumanLabelingBudget",
            });
    internal_static_google_cloud_aiplatform_v1_SampleConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_SampleConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SampleConfig_descriptor,
            new java.lang.String[] {
              "InitialBatchSamplePercentage",
              "FollowingBatchSamplePercentage",
              "SampleStrategy",
              "InitialBatchSampleSize",
              "FollowingBatchSampleSize",
            });
    internal_static_google_cloud_aiplatform_v1_TrainingConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_TrainingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TrainingConfig_descriptor,
            new java.lang.String[] {
              "TimeoutTrainingMilliHours",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.AcceleratorTypeProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.SpecialistPoolProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}