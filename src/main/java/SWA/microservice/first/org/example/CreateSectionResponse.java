// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subject.proto

package org.example;

/**
 * Protobuf type {@code subject.CreateSectionResponse}
 */
public final class CreateSectionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:subject.CreateSectionResponse)
    CreateSectionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSectionResponse.newBuilder() to construct.
  private CreateSectionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSectionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSectionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.Subject.internal_static_subject_CreateSectionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.Subject.internal_static_subject_CreateSectionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.CreateSectionResponse.class, org.example.CreateSectionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SECTION_FIELD_NUMBER = 1;
  private org.example.Entity.Section section_;
  /**
   * <code>.subject.Section section = 1;</code>
   * @return Whether the section field is set.
   */
  @java.lang.Override
  public boolean hasSection() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.subject.Section section = 1;</code>
   * @return The section.
   */
  @java.lang.Override
  public org.example.Entity.Section getSection() {
    return section_ == null ? org.example.Entity.Section.getDefaultInstance() : section_;
  }
  /**
   * <code>.subject.Section section = 1;</code>
   */
  @java.lang.Override
  public org.example.Entity.SectionOrBuilder getSectionOrBuilder() {
    return section_ == null ? org.example.Entity.Section.getDefaultInstance() : section_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getSection());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSection());
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
    if (!(obj instanceof org.example.CreateSectionResponse)) {
      return super.equals(obj);
    }
    org.example.CreateSectionResponse other = (org.example.CreateSectionResponse) obj;

    if (hasSection() != other.hasSection()) return false;
    if (hasSection()) {
      if (!getSection()
          .equals(other.getSection())) return false;
    }
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
    if (hasSection()) {
      hash = (37 * hash) + SECTION_FIELD_NUMBER;
      hash = (53 * hash) + getSection().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.CreateSectionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.CreateSectionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.CreateSectionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.CreateSectionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.CreateSectionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.CreateSectionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.CreateSectionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.CreateSectionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.example.CreateSectionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.example.CreateSectionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.CreateSectionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.CreateSectionResponse parseFrom(
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
  public static Builder newBuilder(org.example.CreateSectionResponse prototype) {
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
   * Protobuf type {@code subject.CreateSectionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:subject.CreateSectionResponse)
      org.example.CreateSectionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.Subject.internal_static_subject_CreateSectionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.Subject.internal_static_subject_CreateSectionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.CreateSectionResponse.class, org.example.CreateSectionResponse.Builder.class);
    }

    // Construct using org.example.CreateSectionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSectionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      section_ = null;
      if (sectionBuilder_ != null) {
        sectionBuilder_.dispose();
        sectionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.Subject.internal_static_subject_CreateSectionResponse_descriptor;
    }

    @java.lang.Override
    public org.example.CreateSectionResponse getDefaultInstanceForType() {
      return org.example.CreateSectionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.CreateSectionResponse build() {
      org.example.CreateSectionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.CreateSectionResponse buildPartial() {
      org.example.CreateSectionResponse result = new org.example.CreateSectionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.example.CreateSectionResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.section_ = sectionBuilder_ == null
            ? section_
            : sectionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof org.example.CreateSectionResponse) {
        return mergeFrom((org.example.CreateSectionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.CreateSectionResponse other) {
      if (other == org.example.CreateSectionResponse.getDefaultInstance()) return this;
      if (other.hasSection()) {
        mergeSection(other.getSection());
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
            case 10: {
              input.readMessage(
                  getSectionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private org.example.Entity.Section section_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.Entity.Section, org.example.Entity.Section.Builder, org.example.Entity.SectionOrBuilder> sectionBuilder_;
    /**
     * <code>.subject.Section section = 1;</code>
     * @return Whether the section field is set.
     */
    public boolean hasSection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.subject.Section section = 1;</code>
     * @return The section.
     */
    public org.example.Entity.Section getSection() {
      if (sectionBuilder_ == null) {
        return section_ == null ? org.example.Entity.Section.getDefaultInstance() : section_;
      } else {
        return sectionBuilder_.getMessage();
      }
    }
    /**
     * <code>.subject.Section section = 1;</code>
     */
    public Builder setSection(org.example.Entity.Section value) {
      if (sectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        section_ = value;
      } else {
        sectionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.subject.Section section = 1;</code>
     */
    public Builder setSection(
        org.example.Entity.Section.Builder builderForValue) {
      if (sectionBuilder_ == null) {
        section_ = builderForValue.build();
      } else {
        sectionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.subject.Section section = 1;</code>
     */
    public Builder mergeSection(org.example.Entity.Section value) {
      if (sectionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          section_ != null &&
          section_ != org.example.Entity.Section.getDefaultInstance()) {
          getSectionBuilder().mergeFrom(value);
        } else {
          section_ = value;
        }
      } else {
        sectionBuilder_.mergeFrom(value);
      }
      if (section_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.subject.Section section = 1;</code>
     */
    public Builder clearSection() {
      bitField0_ = (bitField0_ & ~0x00000001);
      section_ = null;
      if (sectionBuilder_ != null) {
        sectionBuilder_.dispose();
        sectionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.subject.Section section = 1;</code>
     */
    public org.example.Entity.Section.Builder getSectionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSectionFieldBuilder().getBuilder();
    }
    /**
     * <code>.subject.Section section = 1;</code>
     */
    public org.example.Entity.SectionOrBuilder getSectionOrBuilder() {
      if (sectionBuilder_ != null) {
        return sectionBuilder_.getMessageOrBuilder();
      } else {
        return section_ == null ?
            org.example.Entity.Section.getDefaultInstance() : section_;
      }
    }
    /**
     * <code>.subject.Section section = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.Entity.Section, org.example.Entity.Section.Builder, org.example.Entity.SectionOrBuilder> 
        getSectionFieldBuilder() {
      if (sectionBuilder_ == null) {
        sectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.example.Entity.Section, org.example.Entity.Section.Builder, org.example.Entity.SectionOrBuilder>(
                getSection(),
                getParentForChildren(),
                isClean());
        section_ = null;
      }
      return sectionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:subject.CreateSectionResponse)
  }

  // @@protoc_insertion_point(class_scope:subject.CreateSectionResponse)
  private static final org.example.CreateSectionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.CreateSectionResponse();
  }

  public static org.example.CreateSectionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSectionResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateSectionResponse>() {
    @java.lang.Override
    public CreateSectionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSectionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSectionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.CreateSectionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

