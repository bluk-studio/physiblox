// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/SimulationSession.proto

package org.bluk.physiblox.protos;

/**
 * <pre>
 * &gt;response
 * </pre>
 *
 * Protobuf type {@code protos.OpenSessionResponse}
 */
public final class OpenSessionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.OpenSessionResponse)
    OpenSessionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenSessionResponse.newBuilder() to construct.
  private OpenSessionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenSessionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenSessionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpenSessionResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            isOpened_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.bluk.physiblox.protos.SimulationSessionProto.internal_static_protos_OpenSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.bluk.physiblox.protos.SimulationSessionProto.internal_static_protos_OpenSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.bluk.physiblox.protos.OpenSessionResponse.class, org.bluk.physiblox.protos.OpenSessionResponse.Builder.class);
  }

  public static final int ISOPENED_FIELD_NUMBER = 1;
  private boolean isOpened_;
  /**
   * <code>bool isOpened = 1[json_name = "isOpened"];</code>
   * @return The isOpened.
   */
  @java.lang.Override
  public boolean getIsOpened() {
    return isOpened_;
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
    if (isOpened_ != false) {
      output.writeBool(1, isOpened_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isOpened_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isOpened_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.bluk.physiblox.protos.OpenSessionResponse)) {
      return super.equals(obj);
    }
    org.bluk.physiblox.protos.OpenSessionResponse other = (org.bluk.physiblox.protos.OpenSessionResponse) obj;

    if (getIsOpened()
        != other.getIsOpened()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ISOPENED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpened());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bluk.physiblox.protos.OpenSessionResponse parseFrom(
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
  public static Builder newBuilder(org.bluk.physiblox.protos.OpenSessionResponse prototype) {
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
   * <pre>
   * &gt;response
   * </pre>
   *
   * Protobuf type {@code protos.OpenSessionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.OpenSessionResponse)
      org.bluk.physiblox.protos.OpenSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bluk.physiblox.protos.SimulationSessionProto.internal_static_protos_OpenSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bluk.physiblox.protos.SimulationSessionProto.internal_static_protos_OpenSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.bluk.physiblox.protos.OpenSessionResponse.class, org.bluk.physiblox.protos.OpenSessionResponse.Builder.class);
    }

    // Construct using org.bluk.physiblox.protos.OpenSessionResponse.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      isOpened_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.bluk.physiblox.protos.SimulationSessionProto.internal_static_protos_OpenSessionResponse_descriptor;
    }

    @java.lang.Override
    public org.bluk.physiblox.protos.OpenSessionResponse getDefaultInstanceForType() {
      return org.bluk.physiblox.protos.OpenSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.bluk.physiblox.protos.OpenSessionResponse build() {
      org.bluk.physiblox.protos.OpenSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.bluk.physiblox.protos.OpenSessionResponse buildPartial() {
      org.bluk.physiblox.protos.OpenSessionResponse result = new org.bluk.physiblox.protos.OpenSessionResponse(this);
      result.isOpened_ = isOpened_;
      onBuilt();
      return result;
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
      if (other instanceof org.bluk.physiblox.protos.OpenSessionResponse) {
        return mergeFrom((org.bluk.physiblox.protos.OpenSessionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.bluk.physiblox.protos.OpenSessionResponse other) {
      if (other == org.bluk.physiblox.protos.OpenSessionResponse.getDefaultInstance()) return this;
      if (other.getIsOpened() != false) {
        setIsOpened(other.getIsOpened());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.bluk.physiblox.protos.OpenSessionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.bluk.physiblox.protos.OpenSessionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isOpened_ ;
    /**
     * <code>bool isOpened = 1[json_name = "isOpened"];</code>
     * @return The isOpened.
     */
    @java.lang.Override
    public boolean getIsOpened() {
      return isOpened_;
    }
    /**
     * <code>bool isOpened = 1[json_name = "isOpened"];</code>
     * @param value The isOpened to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpened(boolean value) {
      
      isOpened_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isOpened = 1[json_name = "isOpened"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpened() {
      
      isOpened_ = false;
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


    // @@protoc_insertion_point(builder_scope:protos.OpenSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:protos.OpenSessionResponse)
  private static final org.bluk.physiblox.protos.OpenSessionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.bluk.physiblox.protos.OpenSessionResponse();
  }

  public static org.bluk.physiblox.protos.OpenSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenSessionResponse>
      PARSER = new com.google.protobuf.AbstractParser<OpenSessionResponse>() {
    @java.lang.Override
    public OpenSessionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpenSessionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpenSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.bluk.physiblox.protos.OpenSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

