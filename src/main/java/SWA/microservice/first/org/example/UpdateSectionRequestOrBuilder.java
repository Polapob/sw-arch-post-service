// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subject.proto

package org.example;

public interface UpdateSectionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subject.UpdateSectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>int64 number = 3;</code>
   * @return The number.
   */
  long getNumber();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>bool is_admin = 99;</code>
   * @return The isAdmin.
   */
  boolean getIsAdmin();
}
