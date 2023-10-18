// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subject.proto

package org.example;

/**
 * Protobuf type {@code subject.PaginateSubjectRequest}
 */
public final class PaginateSubjectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:subject.PaginateSubjectRequest)
    PaginateSubjectRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaginateSubjectRequest.newBuilder() to construct.
  private PaginateSubjectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaginateSubjectRequest() {
    subjectId_ = "";
    name_ = "";
    semesterWhitelist_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaginateSubjectRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.Subject.internal_static_subject_PaginateSubjectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.Subject.internal_static_subject_PaginateSubjectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.PaginateSubjectRequest.class, org.example.PaginateSubjectRequest.Builder.class);
  }

  public static final int PAGE_NUMBER_FIELD_NUMBER = 1;
  private long pageNumber_ = 0L;
  /**
   * <code>int64 page_number = 1;</code>
   * @return The pageNumber.
   */
  @java.lang.Override
  public long getPageNumber() {
    return pageNumber_;
  }

  public static final int SUBJECT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subjectId_ = "";
  /**
   * <code>string subject_id = 2;</code>
   * @return The subjectId.
   */
  @java.lang.Override
  public java.lang.String getSubjectId() {
    java.lang.Object ref = subjectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectId_ = s;
      return s;
    }
  }
  /**
   * <code>string subject_id = 2;</code>
   * @return The bytes for subjectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectIdBytes() {
    java.lang.Object ref = subjectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEMESTER_WHITELIST_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList semesterWhitelist_ =
      emptyLongList();
  /**
   * <code>repeated int64 semester_whitelist = 4;</code>
   * @return A list containing the semesterWhitelist.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getSemesterWhitelistList() {
    return semesterWhitelist_;
  }
  /**
   * <code>repeated int64 semester_whitelist = 4;</code>
   * @return The count of semesterWhitelist.
   */
  public int getSemesterWhitelistCount() {
    return semesterWhitelist_.size();
  }
  /**
   * <code>repeated int64 semester_whitelist = 4;</code>
   * @param index The index of the element to return.
   * @return The semesterWhitelist at the given index.
   */
  public long getSemesterWhitelist(int index) {
    return semesterWhitelist_.getLong(index);
  }
  private int semesterWhitelistMemoizedSerializedSize = -1;

  public static final int YEAR_RANGE_START_FIELD_NUMBER = 5;
  private long yearRangeStart_ = 0L;
  /**
   * <code>int64 year_range_start = 5;</code>
   * @return The yearRangeStart.
   */
  @java.lang.Override
  public long getYearRangeStart() {
    return yearRangeStart_;
  }

  public static final int YEAR_RANGE_STOP_FIELD_NUMBER = 6;
  private long yearRangeStop_ = 0L;
  /**
   * <code>int64 year_range_stop = 6;</code>
   * @return The yearRangeStop.
   */
  @java.lang.Override
  public long getYearRangeStop() {
    return yearRangeStop_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (pageNumber_ != 0L) {
      output.writeInt64(1, pageNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subjectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subjectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (getSemesterWhitelistList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(semesterWhitelistMemoizedSerializedSize);
    }
    for (int i = 0; i < semesterWhitelist_.size(); i++) {
      output.writeInt64NoTag(semesterWhitelist_.getLong(i));
    }
    if (yearRangeStart_ != 0L) {
      output.writeInt64(5, yearRangeStart_);
    }
    if (yearRangeStop_ != 0L) {
      output.writeInt64(6, yearRangeStop_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pageNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subjectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subjectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < semesterWhitelist_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(semesterWhitelist_.getLong(i));
      }
      size += dataSize;
      if (!getSemesterWhitelistList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      semesterWhitelistMemoizedSerializedSize = dataSize;
    }
    if (yearRangeStart_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, yearRangeStart_);
    }
    if (yearRangeStop_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, yearRangeStop_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.PaginateSubjectRequest)) {
      return super.equals(obj);
    }
    org.example.PaginateSubjectRequest other = (org.example.PaginateSubjectRequest) obj;

    if (getPageNumber()
        != other.getPageNumber()) return false;
    if (!getSubjectId()
        .equals(other.getSubjectId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getSemesterWhitelistList()
        .equals(other.getSemesterWhitelistList())) return false;
    if (getYearRangeStart()
        != other.getYearRangeStart()) return false;
    if (getYearRangeStop()
        != other.getYearRangeStop()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageNumber());
    hash = (37 * hash) + SUBJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubjectId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getSemesterWhitelistCount() > 0) {
      hash = (37 * hash) + SEMESTER_WHITELIST_FIELD_NUMBER;
      hash = (53 * hash) + getSemesterWhitelistList().hashCode();
    }
    hash = (37 * hash) + YEAR_RANGE_START_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getYearRangeStart());
    hash = (37 * hash) + YEAR_RANGE_STOP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getYearRangeStop());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.PaginateSubjectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.PaginateSubjectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.PaginateSubjectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.PaginateSubjectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.PaginateSubjectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.PaginateSubjectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.PaginateSubjectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.PaginateSubjectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.example.PaginateSubjectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.example.PaginateSubjectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.PaginateSubjectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.PaginateSubjectRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.example.PaginateSubjectRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code subject.PaginateSubjectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:subject.PaginateSubjectRequest)
      org.example.PaginateSubjectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.Subject.internal_static_subject_PaginateSubjectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.Subject.internal_static_subject_PaginateSubjectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.PaginateSubjectRequest.class, org.example.PaginateSubjectRequest.Builder.class);
    }

    // Construct using org.example.PaginateSubjectRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pageNumber_ = 0L;
      subjectId_ = "";
      name_ = "";
      semesterWhitelist_ = emptyLongList();
      yearRangeStart_ = 0L;
      yearRangeStop_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.Subject.internal_static_subject_PaginateSubjectRequest_descriptor;
    }

    @java.lang.Override
    public org.example.PaginateSubjectRequest getDefaultInstanceForType() {
      return org.example.PaginateSubjectRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.PaginateSubjectRequest build() {
      org.example.PaginateSubjectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.PaginateSubjectRequest buildPartial() {
      org.example.PaginateSubjectRequest result = new org.example.PaginateSubjectRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.example.PaginateSubjectRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageNumber_ = pageNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subjectId_ = subjectId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        semesterWhitelist_.makeImmutable();
        result.semesterWhitelist_ = semesterWhitelist_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.yearRangeStart_ = yearRangeStart_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.yearRangeStop_ = yearRangeStop_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.PaginateSubjectRequest) {
        return mergeFrom((org.example.PaginateSubjectRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.PaginateSubjectRequest other) {
      if (other == org.example.PaginateSubjectRequest.getDefaultInstance()) return this;
      if (other.getPageNumber() != 0L) {
        setPageNumber(other.getPageNumber());
      }
      if (!other.getSubjectId().isEmpty()) {
        subjectId_ = other.subjectId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.semesterWhitelist_.isEmpty()) {
        if (semesterWhitelist_.isEmpty()) {
          semesterWhitelist_ = other.semesterWhitelist_;
          semesterWhitelist_.makeImmutable();
          bitField0_ |= 0x00000008;
        } else {
          ensureSemesterWhitelistIsMutable();
          semesterWhitelist_.addAll(other.semesterWhitelist_);
        }
        onChanged();
      }
      if (other.getYearRangeStart() != 0L) {
        setYearRangeStart(other.getYearRangeStart());
      }
      if (other.getYearRangeStop() != 0L) {
        setYearRangeStop(other.getYearRangeStop());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              pageNumber_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              subjectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              long v = input.readInt64();
              ensureSemesterWhitelistIsMutable();
              semesterWhitelist_.addLong(v);
              break;
            } // case 32
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureSemesterWhitelistIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                semesterWhitelist_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 34
            case 40: {
              yearRangeStart_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              yearRangeStop_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long pageNumber_ ;
    /**
     * <code>int64 page_number = 1;</code>
     * @return The pageNumber.
     */
    @java.lang.Override
    public long getPageNumber() {
      return pageNumber_;
    }
    /**
     * <code>int64 page_number = 1;</code>
     * @param value The pageNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPageNumber(long value) {

      pageNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 page_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNumber() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageNumber_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object subjectId_ = "";
    /**
     * <code>string subject_id = 2;</code>
     * @return The subjectId.
     */
    public java.lang.String getSubjectId() {
      java.lang.Object ref = subjectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subject_id = 2;</code>
     * @return The bytes for subjectId.
     */
    public com.google.protobuf.ByteString
        getSubjectIdBytes() {
      java.lang.Object ref = subjectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subject_id = 2;</code>
     * @param value The subjectId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subjectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string subject_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectId() {
      subjectId_ = getDefaultInstance().getSubjectId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string subject_id = 2;</code>
     * @param value The bytes for subjectId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subjectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList semesterWhitelist_ = emptyLongList();
    private void ensureSemesterWhitelistIsMutable() {
      if (!semesterWhitelist_.isModifiable()) {
        semesterWhitelist_ = makeMutableCopy(semesterWhitelist_);
      }
      bitField0_ |= 0x00000008;
    }
    /**
     * <code>repeated int64 semester_whitelist = 4;</code>
     * @return A list containing the semesterWhitelist.
     */
    public java.util.List<java.lang.Long>
        getSemesterWhitelistList() {
      semesterWhitelist_.makeImmutable();
      return semesterWhitelist_;
    }
    /**
     * <code>repeated int64 semester_whitelist = 4;</code>
     * @return The count of semesterWhitelist.
     */
    public int getSemesterWhitelistCount() {
      return semesterWhitelist_.size();
    }
    /**
     * <code>repeated int64 semester_whitelist = 4;</code>
     * @param index The index of the element to return.
     * @return The semesterWhitelist at the given index.
     */
    public long getSemesterWhitelist(int index) {
      return semesterWhitelist_.getLong(index);
    }
    /**
     * <code>repeated int64 semester_whitelist = 4;</code>
     * @param index The index to set the value at.
     * @param value The semesterWhitelist to set.
     * @return This builder for chaining.
     */
    public Builder setSemesterWhitelist(
        int index, long value) {

      ensureSemesterWhitelistIsMutable();
      semesterWhitelist_.setLong(index, value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 semester_whitelist = 4;</code>
     * @param value The semesterWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addSemesterWhitelist(long value) {

      ensureSemesterWhitelistIsMutable();
      semesterWhitelist_.addLong(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 semester_whitelist = 4;</code>
     * @param values The semesterWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addAllSemesterWhitelist(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureSemesterWhitelistIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, semesterWhitelist_);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 semester_whitelist = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSemesterWhitelist() {
      semesterWhitelist_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    private long yearRangeStart_ ;
    /**
     * <code>int64 year_range_start = 5;</code>
     * @return The yearRangeStart.
     */
    @java.lang.Override
    public long getYearRangeStart() {
      return yearRangeStart_;
    }
    /**
     * <code>int64 year_range_start = 5;</code>
     * @param value The yearRangeStart to set.
     * @return This builder for chaining.
     */
    public Builder setYearRangeStart(long value) {

      yearRangeStart_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 year_range_start = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearYearRangeStart() {
      bitField0_ = (bitField0_ & ~0x00000010);
      yearRangeStart_ = 0L;
      onChanged();
      return this;
    }

    private long yearRangeStop_ ;
    /**
     * <code>int64 year_range_stop = 6;</code>
     * @return The yearRangeStop.
     */
    @java.lang.Override
    public long getYearRangeStop() {
      return yearRangeStop_;
    }
    /**
     * <code>int64 year_range_stop = 6;</code>
     * @param value The yearRangeStop to set.
     * @return This builder for chaining.
     */
    public Builder setYearRangeStop(long value) {

      yearRangeStop_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int64 year_range_stop = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearYearRangeStop() {
      bitField0_ = (bitField0_ & ~0x00000020);
      yearRangeStop_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:subject.PaginateSubjectRequest)
  }

  // @@protoc_insertion_point(class_scope:subject.PaginateSubjectRequest)
  private static final org.example.PaginateSubjectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.PaginateSubjectRequest();
  }

  public static org.example.PaginateSubjectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaginateSubjectRequest>
      PARSER = new com.google.protobuf.AbstractParser<PaginateSubjectRequest>() {
    @java.lang.Override
    public PaginateSubjectRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PaginateSubjectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaginateSubjectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.PaginateSubjectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

