// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: loggerSchema.proto

package comm.grpc.logger.stub;

/**
 * Protobuf type {@code LogMessage}
 */
public  final class LogMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LogMessage)
    LogMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogMessage.newBuilder() to construct.
  private LogMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogMessage() {
    type_ = "";
    logMessage_ = "";
    logTime_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            logMessage_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            logTime_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return comm.grpc.logger.stub.LoggerSchema.internal_static_LogMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return comm.grpc.logger.stub.LoggerSchema.internal_static_LogMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            comm.grpc.logger.stub.LogMessage.class, comm.grpc.logger.stub.LogMessage.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 1;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOGMESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object logMessage_;
  /**
   * <code>string logMessage = 2;</code>
   */
  public java.lang.String getLogMessage() {
    java.lang.Object ref = logMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string logMessage = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLogMessageBytes() {
    java.lang.Object ref = logMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOGTIME_FIELD_NUMBER = 3;
  private volatile java.lang.Object logTime_;
  /**
   * <code>string logTime = 3;</code>
   */
  public java.lang.String getLogTime() {
    java.lang.Object ref = logTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logTime_ = s;
      return s;
    }
  }
  /**
   * <code>string logTime = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLogTimeBytes() {
    java.lang.Object ref = logTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (!getLogMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, logMessage_);
    }
    if (!getLogTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, logTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (!getLogMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, logMessage_);
    }
    if (!getLogTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, logTime_);
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
    if (!(obj instanceof comm.grpc.logger.stub.LogMessage)) {
      return super.equals(obj);
    }
    comm.grpc.logger.stub.LogMessage other = (comm.grpc.logger.stub.LogMessage) obj;

    boolean result = true;
    result = result && getType()
        .equals(other.getType());
    result = result && getLogMessage()
        .equals(other.getLogMessage());
    result = result && getLogTime()
        .equals(other.getLogTime());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + LOGMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLogMessage().hashCode();
    hash = (37 * hash) + LOGTIME_FIELD_NUMBER;
    hash = (53 * hash) + getLogTime().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static comm.grpc.logger.stub.LogMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static comm.grpc.logger.stub.LogMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static comm.grpc.logger.stub.LogMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static comm.grpc.logger.stub.LogMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static comm.grpc.logger.stub.LogMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static comm.grpc.logger.stub.LogMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static comm.grpc.logger.stub.LogMessage parseFrom(
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
  public static Builder newBuilder(comm.grpc.logger.stub.LogMessage prototype) {
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
   * Protobuf type {@code LogMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LogMessage)
      comm.grpc.logger.stub.LogMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return comm.grpc.logger.stub.LoggerSchema.internal_static_LogMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return comm.grpc.logger.stub.LoggerSchema.internal_static_LogMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              comm.grpc.logger.stub.LogMessage.class, comm.grpc.logger.stub.LogMessage.Builder.class);
    }

    // Construct using comm.grpc.logger.stub.LogMessage.newBuilder()
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
      type_ = "";

      logMessage_ = "";

      logTime_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return comm.grpc.logger.stub.LoggerSchema.internal_static_LogMessage_descriptor;
    }

    @java.lang.Override
    public comm.grpc.logger.stub.LogMessage getDefaultInstanceForType() {
      return comm.grpc.logger.stub.LogMessage.getDefaultInstance();
    }

    @java.lang.Override
    public comm.grpc.logger.stub.LogMessage build() {
      comm.grpc.logger.stub.LogMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public comm.grpc.logger.stub.LogMessage buildPartial() {
      comm.grpc.logger.stub.LogMessage result = new comm.grpc.logger.stub.LogMessage(this);
      result.type_ = type_;
      result.logMessage_ = logMessage_;
      result.logTime_ = logTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof comm.grpc.logger.stub.LogMessage) {
        return mergeFrom((comm.grpc.logger.stub.LogMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(comm.grpc.logger.stub.LogMessage other) {
      if (other == comm.grpc.logger.stub.LogMessage.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getLogMessage().isEmpty()) {
        logMessage_ = other.logMessage_;
        onChanged();
      }
      if (!other.getLogTime().isEmpty()) {
        logTime_ = other.logTime_;
        onChanged();
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
      comm.grpc.logger.stub.LogMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (comm.grpc.logger.stub.LogMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object logMessage_ = "";
    /**
     * <code>string logMessage = 2;</code>
     */
    public java.lang.String getLogMessage() {
      java.lang.Object ref = logMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logMessage = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLogMessageBytes() {
      java.lang.Object ref = logMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logMessage = 2;</code>
     */
    public Builder setLogMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      logMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string logMessage = 2;</code>
     */
    public Builder clearLogMessage() {
      
      logMessage_ = getDefaultInstance().getLogMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string logMessage = 2;</code>
     */
    public Builder setLogMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      logMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object logTime_ = "";
    /**
     * <code>string logTime = 3;</code>
     */
    public java.lang.String getLogTime() {
      java.lang.Object ref = logTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logTime = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLogTimeBytes() {
      java.lang.Object ref = logTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logTime = 3;</code>
     */
    public Builder setLogTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      logTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string logTime = 3;</code>
     */
    public Builder clearLogTime() {
      
      logTime_ = getDefaultInstance().getLogTime();
      onChanged();
      return this;
    }
    /**
     * <code>string logTime = 3;</code>
     */
    public Builder setLogTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      logTime_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LogMessage)
  }

  // @@protoc_insertion_point(class_scope:LogMessage)
  private static final comm.grpc.logger.stub.LogMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new comm.grpc.logger.stub.LogMessage();
  }

  public static comm.grpc.logger.stub.LogMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogMessage>
      PARSER = new com.google.protobuf.AbstractParser<LogMessage>() {
    @java.lang.Override
    public LogMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public comm.grpc.logger.stub.LogMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

