// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subject.proto

package org.example;

public interface PaginateSubjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subject.PaginateSubjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 page_number = 1;</code>
   * @return The pageNumber.
   */
  long getPageNumber();

  /**
   * <code>string subject_id = 2;</code>
   * @return The subjectId.
   */
  java.lang.String getSubjectId();
  /**
   * <code>string subject_id = 2;</code>
   * @return The bytes for subjectId.
   */
  com.google.protobuf.ByteString
      getSubjectIdBytes();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated int64 semester_whitelist = 4;</code>
   * @return A list containing the semesterWhitelist.
   */
  java.util.List<java.lang.Long> getSemesterWhitelistList();
  /**
   * <code>repeated int64 semester_whitelist = 4;</code>
   * @return The count of semesterWhitelist.
   */
  int getSemesterWhitelistCount();
  /**
   * <code>repeated int64 semester_whitelist = 4;</code>
   * @param index The index of the element to return.
   * @return The semesterWhitelist at the given index.
   */
  long getSemesterWhitelist(int index);

  /**
   * <code>int64 year_range_start = 5;</code>
   * @return The yearRangeStart.
   */
  long getYearRangeStart();

  /**
   * <code>int64 year_range_stop = 6;</code>
   * @return The yearRangeStop.
   */
  long getYearRangeStop();
}