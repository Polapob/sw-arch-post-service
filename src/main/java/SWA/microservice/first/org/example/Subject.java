// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subject.proto

package org.example;

public final class Subject {
  private Subject() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_PaginateSubjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_PaginateSubjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_PaginateSubjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_PaginateSubjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_ValidateSubjectIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_ValidateSubjectIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_ValidateSubjectIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_ValidateSubjectIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_GetSubjectByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_GetSubjectByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_GetSubjectByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_GetSubjectByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_CreateSubjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_CreateSubjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_CreateSubjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_CreateSubjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_UpdateSubjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_UpdateSubjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_UpdateSubjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_UpdateSubjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_DeleteSubjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_DeleteSubjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_DeleteSubjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_DeleteSubjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_CreateSectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_CreateSectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_CreateSectionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_CreateSectionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_UpdateSectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_UpdateSectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_UpdateSectionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_UpdateSectionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_DeleteSectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_DeleteSectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_DeleteSectionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_DeleteSectionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_PaginatePostBySubjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_PaginatePostBySubjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_PaginatePostBySubjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_PaginatePostBySubjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_PaginateFileBySubjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_PaginateFileBySubjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subject_PaginateFileBySubjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subject_PaginateFileBySubjectResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rsubject.proto\022\007subject\032\014entity.proto\"\236" +
      "\001\n\026PaginateSubjectRequest\022\023\n\013page_number" +
      "\030\001 \001(\003\022\022\n\nsubject_id\030\002 \001(\t\022\014\n\004name\030\003 \001(\t" +
      "\022\032\n\022semester_whitelist\030\004 \003(\003\022\030\n\020year_ran" +
      "ge_start\030\005 \001(\003\022\027\n\017year_range_stop\030\006 \001(\003\"" +
      "\225\001\n\027PaginateSubjectResponse\022\023\n\013page_numb" +
      "er\030\001 \001(\003\022\020\n\010per_page\030\002 \001(\003\022\022\n\npage_count" +
      "\030\003 \001(\003\022\023\n\013total_count\030\004 \001(\003\022*\n\010subjects\030" +
      "\005 \003(\0132\030.subject.SubjectMetadata\"8\n\030Valid" +
      "ateSubjectIdRequest\022\n\n\002id\030\001 \001(\003\022\020\n\010is_ad" +
      "min\030c \001(\010\"*\n\031ValidateSubjectIdResponse\022\r" +
      "\n\005valid\030\001 \001(\010\"#\n\025GetSubjectByIdRequest\022\n" +
      "\n\002id\030\001 \001(\003\";\n\026GetSubjectByIdResponse\022!\n\007" +
      "subject\030\001 \001(\0132\020.subject.Subject\"\220\001\n\024Crea" +
      "teSubjectRequest\022\022\n\nsubject_id\030\001 \001(\t\022\014\n\004" +
      "name\030\002 \001(\t\022\020\n\010semester\030\003 \001(\003\022\014\n\004year\030\004 \001" +
      "(\003\022\017\n\007faculty\030\005 \001(\t\022\023\n\013description\030\006 \001(\t" +
      "\022\020\n\010is_admin\030c \001(\010\":\n\025CreateSubjectRespo" +
      "nse\022!\n\007subject\030\001 \001(\0132\020.subject.Subject\"\263" +
      "\001\n\024UpdateSubjectRequest\022\n\n\002id\030\001 \001(\003\022\022\n\ns" +
      "ubject_id\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\020\n\010semeste" +
      "r\030\004 \001(\003\022\014\n\004year\030\005 \001(\003\022\017\n\007faculty\030\006 \001(\t\022\023" +
      "\n\013description\030\007 \001(\t\022\025\n\rprerequisites\030\010 \003" +
      "(\t\022\020\n\010is_admin\030c \001(\010\":\n\025UpdateSubjectRes" +
      "ponse\022!\n\007subject\030\001 \001(\0132\020.subject.Subject" +
      "\"4\n\024DeleteSubjectRequest\022\n\n\002id\030\001 \001(\003\022\020\n\010" +
      "is_admin\030c \001(\010\":\n\025DeleteSubjectResponse\022" +
      "!\n\007subject\030\001 \001(\0132\020.subject.Subject\"a\n\024Cr" +
      "eateSectionRequest\022\022\n\nsubject_id\030\001 \001(\003\022\016" +
      "\n\006number\030\002 \001(\003\022\023\n\013description\030\003 \001(\t\022\020\n\010i" +
      "s_admin\030c \001(\010\":\n\025CreateSectionResponse\022!" +
      "\n\007section\030\001 \001(\0132\020.subject.Section\"Y\n\024Upd" +
      "ateSectionRequest\022\n\n\002id\030\001 \001(\003\022\016\n\006number\030" +
      "\003 \001(\003\022\023\n\013description\030\004 \001(\t\022\020\n\010is_admin\030c" +
      " \001(\010\":\n\025UpdateSectionResponse\022!\n\007section" +
      "\030\001 \001(\0132\020.subject.Section\"4\n\024DeleteSectio" +
      "nRequest\022\n\n\002id\030\001 \001(\003\022\020\n\010is_admin\030c \001(\010\":" +
      "\n\025DeleteSectionResponse\022!\n\007section\030\001 \001(\013" +
      "2\020.subject.Section\"\036\n\034PaginatePostBySubj" +
      "ectRequest\"\037\n\035PaginatePostBySubjectRespo" +
      "nse\"\036\n\034PaginateFileBySubjectRequest\"\037\n\035P" +
      "aginateFileBySubjectResponse2\306\007\n\016Subject" +
      "Service\022U\n\020PaginateSubjects\022\037.subject.Pa" +
      "ginateSubjectRequest\032 .subject.PaginateS" +
      "ubjectResponse\022Q\n\016GetSubjectById\022\036.subje" +
      "ct.GetSubjectByIdRequest\032\037.subject.GetSu" +
      "bjectByIdResponse\022Z\n\021ValidateSubjectId\022!" +
      ".subject.ValidateSubjectIdRequest\032\".subj" +
      "ect.ValidateSubjectIdResponse\022N\n\rCreateS" +
      "ubject\022\035.subject.CreateSubjectRequest\032\036." +
      "subject.CreateSubjectResponse\022N\n\rUpdateS" +
      "ubject\022\035.subject.UpdateSubjectRequest\032\036." +
      "subject.UpdateSubjectResponse\022N\n\rDeleteS" +
      "ubject\022\035.subject.DeleteSubjectRequest\032\036." +
      "subject.DeleteSubjectResponse\022N\n\rCreateS" +
      "ection\022\035.subject.CreateSectionRequest\032\036." +
      "subject.CreateSectionResponse\022N\n\rUpdateS" +
      "ection\022\035.subject.UpdateSectionRequest\032\036." +
      "subject.UpdateSectionResponse\022N\n\rDeleteS" +
      "ection\022\035.subject.DeleteSectionRequest\032\036." +
      "subject.DeleteSectionResponse\022f\n\025Paginat" +
      "ePostBySubject\022%.subject.PaginatePostByS" +
      "ubjectRequest\032&.subject.PaginatePostBySu" +
      "bjectResponse\022f\n\025PaginateFileBySubject\022%" +
      ".subject.PaginateFileBySubjectRequest\032&." +
      "subject.PaginateFileBySubjectResponseB\017\n" +
      "\013org.exampleP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.example.Entity.getDescriptor(),
        });
    internal_static_subject_PaginateSubjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_subject_PaginateSubjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_PaginateSubjectRequest_descriptor,
        new java.lang.String[] { "PageNumber", "SubjectId", "Name", "SemesterWhitelist", "YearRangeStart", "YearRangeStop", });
    internal_static_subject_PaginateSubjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_subject_PaginateSubjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_PaginateSubjectResponse_descriptor,
        new java.lang.String[] { "PageNumber", "PerPage", "PageCount", "TotalCount", "Subjects", });
    internal_static_subject_ValidateSubjectIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_subject_ValidateSubjectIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_ValidateSubjectIdRequest_descriptor,
        new java.lang.String[] { "Id", "IsAdmin", });
    internal_static_subject_ValidateSubjectIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_subject_ValidateSubjectIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_ValidateSubjectIdResponse_descriptor,
        new java.lang.String[] { "Valid", });
    internal_static_subject_GetSubjectByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_subject_GetSubjectByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_GetSubjectByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_subject_GetSubjectByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_subject_GetSubjectByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_GetSubjectByIdResponse_descriptor,
        new java.lang.String[] { "Subject", });
    internal_static_subject_CreateSubjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_subject_CreateSubjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_CreateSubjectRequest_descriptor,
        new java.lang.String[] { "SubjectId", "Name", "Semester", "Year", "Faculty", "Description", "IsAdmin", });
    internal_static_subject_CreateSubjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_subject_CreateSubjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_CreateSubjectResponse_descriptor,
        new java.lang.String[] { "Subject", });
    internal_static_subject_UpdateSubjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_subject_UpdateSubjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_UpdateSubjectRequest_descriptor,
        new java.lang.String[] { "Id", "SubjectId", "Name", "Semester", "Year", "Faculty", "Description", "Prerequisites", "IsAdmin", });
    internal_static_subject_UpdateSubjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_subject_UpdateSubjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_UpdateSubjectResponse_descriptor,
        new java.lang.String[] { "Subject", });
    internal_static_subject_DeleteSubjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_subject_DeleteSubjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_DeleteSubjectRequest_descriptor,
        new java.lang.String[] { "Id", "IsAdmin", });
    internal_static_subject_DeleteSubjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_subject_DeleteSubjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_DeleteSubjectResponse_descriptor,
        new java.lang.String[] { "Subject", });
    internal_static_subject_CreateSectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_subject_CreateSectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_CreateSectionRequest_descriptor,
        new java.lang.String[] { "SubjectId", "Number", "Description", "IsAdmin", });
    internal_static_subject_CreateSectionResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_subject_CreateSectionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_CreateSectionResponse_descriptor,
        new java.lang.String[] { "Section", });
    internal_static_subject_UpdateSectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_subject_UpdateSectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_UpdateSectionRequest_descriptor,
        new java.lang.String[] { "Id", "Number", "Description", "IsAdmin", });
    internal_static_subject_UpdateSectionResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_subject_UpdateSectionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_UpdateSectionResponse_descriptor,
        new java.lang.String[] { "Section", });
    internal_static_subject_DeleteSectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_subject_DeleteSectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_DeleteSectionRequest_descriptor,
        new java.lang.String[] { "Id", "IsAdmin", });
    internal_static_subject_DeleteSectionResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_subject_DeleteSectionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_DeleteSectionResponse_descriptor,
        new java.lang.String[] { "Section", });
    internal_static_subject_PaginatePostBySubjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_subject_PaginatePostBySubjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_PaginatePostBySubjectRequest_descriptor,
        new java.lang.String[] { });
    internal_static_subject_PaginatePostBySubjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_subject_PaginatePostBySubjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_PaginatePostBySubjectResponse_descriptor,
        new java.lang.String[] { });
    internal_static_subject_PaginateFileBySubjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_subject_PaginateFileBySubjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_PaginateFileBySubjectRequest_descriptor,
        new java.lang.String[] { });
    internal_static_subject_PaginateFileBySubjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_subject_PaginateFileBySubjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subject_PaginateFileBySubjectResponse_descriptor,
        new java.lang.String[] { });
    org.example.Entity.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
