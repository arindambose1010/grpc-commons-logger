// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: loggerSchema.proto

package comm.grpc.logger.stub;

/**
 * Protobuf type {@code LogData}
 */
public  final class LogData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LogData)
    LogDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogData.newBuilder() to construct.
  private LogData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogData() {
    appName_ = "";
    className_ = "";
    methodName_ = "";
    type_ = "";
    requestLogMessage_ = "";
    responseLogMessage_ = "";
    logTime_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogData(
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

            appName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            className_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            methodName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            requestLogMessage_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            responseLogMessage_ = s;
            break;
          }
          case 58: {
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
    return comm.grpc.logger.stub.LoggerSchema.internal_static_LogData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return comm.grpc.logger.stub.LoggerSchema.internal_static_LogData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            comm.grpc.logger.stub.LogData.class, comm.grpc.logger.stub.LogData.Builder.class);
  }

  public static final int APPNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object appName_;
  /**
   * <code>string appName = 1;</code>
   */
  public java.lang.String getAppName() {
    java.lang.Object ref = appName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appName_ = s;
      return s;
    }
  }
  /**
   * <code>string appName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAppNameBytes() {
    java.lang.Object ref = appName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLASSNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object className_;
  /**
   * <code>string className = 2;</code>
   */
  public java.lang.String getClassName() {
    java.lang.Object ref = className_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      className_ = s;
      return s;
    }
  }
  /**
   * <code>string className = 2;</code>
   */
  public com.google.protobuf.ByteString
      getClassNameBytes() {
    java.lang.Object ref = className_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      className_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METHODNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object methodName_;
  /**
   * <code>string methodName = 3;</code>
   */
  public java.lang.String getMethodName() {
    java.lang.Object ref = methodName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      methodName_ = s;
      return s;
    }
  }
  /**
   * <code>string methodName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMethodNameBytes() {
    java.lang.Object ref = methodName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      methodName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 4;</code>
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
   * <code>string type = 4;</code>
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

  public static final int REQUESTLOGMESSAGE_FIELD_NUMBER = 5;
  private volatile java.lang.Object requestLogMessage_;
  /**
   * <code>string requestLogMessage = 5;</code>
   */
  public java.lang.String getRequestLogMessage() {
    java.lang.Object ref = requestLogMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestLogMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string requestLogMessage = 5;</code>
   */
  public com.google.protobuf.ByteString
      getRequestLogMessageBytes() {
    java.lang.Object ref = requestLogMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestLogMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSELOGMESSAGE_FIELD_NUMBER = 6;
  private volatile java.lang.Object responseLogMessage_;
  /**
   * <code>string responseLogMessage = 6;</code>
   */
  public java.lang.String getResponseLogMessage() {
    java.lang.Object ref = responseLogMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseLogMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string responseLogMessage = 6;</code>
   */
  public com.google.protobuf.ByteString
      getResponseLogMessageBytes() {
    java.lang.Object ref = responseLogMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseLogMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOGTIME_FIELD_NUMBER = 7;
  private volatile java.lang.Object logTime_;
  /**
   * <code>string logTime = 7;</code>
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
   * <code>string logTime = 7;</code>
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
    if (!getAppNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appName_);
    }
    if (!getClassNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, className_);
    }
    if (!getMethodNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, methodName_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, type_);
    }
    if (!getRequestLogMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, requestLogMessage_);
    }
    if (!getResponseLogMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, responseLogMessage_);
    }
    if (!getLogTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, logTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAppNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appName_);
    }
    if (!getClassNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, className_);
    }
    if (!getMethodNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, methodName_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, type_);
    }
    if (!getRequestLogMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, requestLogMessage_);
    }
    if (!getResponseLogMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, responseLogMessage_);
    }
    if (!getLogTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, logTime_);
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
    if (!(obj instanceof comm.grpc.logger.stub.LogData)) {
      return super.equals(obj);
    }
    comm.grpc.logger.stub.LogData other = (comm.grpc.logger.stub.LogData) obj;

    boolean result = true;
    result = result && getAppName()
        .equals(other.getAppName());
    result = result && getClassName()
        .equals(other.getClassName());
    result = result && getMethodName()
        .equals(other.getMethodName());
    result = result && getType()
        .equals(other.getType());
    result = result && getRequestLogMessage()
        .equals(other.getRequestLogMessage());
    result = result && getResponseLogMessage()
        .equals(other.getResponseLogMessage());
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
    hash = (37 * hash) + APPNAME_FIELD_NUMBER;
    hash = (53 * hash) + getAppName().hashCode();
    hash = (37 * hash) + CLASSNAME_FIELD_NUMBER;
    hash = (53 * hash) + getClassName().hashCode();
    hash = (37 * hash) + METHODNAME_FIELD_NUMBER;
    hash = (53 * hash) + getMethodName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + REQUESTLOGMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getRequestLogMessage().hashCode();
    hash = (37 * hash) + RESPONSELOGMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseLogMessage().hashCode();
    hash = (37 * hash) + LOGTIME_FIELD_NUMBER;
    hash = (53 * hash) + getLogTime().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static comm.grpc.logger.stub.LogData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static comm.grpc.logger.stub.LogData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static comm.grpc.logger.stub.LogData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static comm.grpc.logger.stub.LogData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static comm.grpc.logger.stub.LogData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static comm.grpc.logger.stub.LogData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static comm.grpc.logger.stub.LogData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static comm.grpc.logger.stub.LogData parseFrom(
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
  public static Builder newBuilder(comm.grpc.logger.stub.LogData prototype) {
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
   * Protobuf type {@code LogData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LogData)
      comm.grpc.logger.stub.LogDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return comm.grpc.logger.stub.LoggerSchema.internal_static_LogData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return comm.grpc.logger.stub.LoggerSchema.internal_static_LogData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              comm.grpc.logger.stub.LogData.class, comm.grpc.logger.stub.LogData.Builder.class);
    }

    // Construct using comm.grpc.logger.stub.LogData.newBuilder()
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
      appName_ = "";

      className_ = "";

      methodName_ = "";

      type_ = "";

      requestLogMessage_ = "";

      responseLogMessage_ = "";

      logTime_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return comm.grpc.logger.stub.LoggerSchema.internal_static_LogData_descriptor;
    }

    @java.lang.Override
    public comm.grpc.logger.stub.LogData getDefaultInstanceForType() {
      return comm.grpc.logger.stub.LogData.getDefaultInstance();
    }

    @java.lang.Override
    public comm.grpc.logger.stub.LogData build() {
      comm.grpc.logger.stub.LogData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public comm.grpc.logger.stub.LogData buildPartial() {
      comm.grpc.logger.stub.LogData result = new comm.grpc.logger.stub.LogData(this);
      result.appName_ = appName_;
      result.className_ = className_;
      result.methodName_ = methodName_;
      result.type_ = type_;
      result.requestLogMessage_ = requestLogMessage_;
      result.responseLogMessage_ = responseLogMessage_;
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
      if (other instanceof comm.grpc.logger.stub.LogData) {
        return mergeFrom((comm.grpc.logger.stub.LogData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(comm.grpc.logger.stub.LogData other) {
      if (other == comm.grpc.logger.stub.LogData.getDefaultInstance()) return this;
      if (!other.getAppName().isEmpty()) {
        appName_ = other.appName_;
        onChanged();
      }
      if (!other.getClassName().isEmpty()) {
        className_ = other.className_;
        onChanged();
      }
      if (!other.getMethodName().isEmpty()) {
        methodName_ = other.methodName_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getRequestLogMessage().isEmpty()) {
        requestLogMessage_ = other.requestLogMessage_;
        onChanged();
      }
      if (!other.getResponseLogMessage().isEmpty()) {
        responseLogMessage_ = other.responseLogMessage_;
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
      comm.grpc.logger.stub.LogData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (comm.grpc.logger.stub.LogData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object appName_ = "";
    /**
     * <code>string appName = 1;</code>
     */
    public java.lang.String getAppName() {
      java.lang.Object ref = appName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string appName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppNameBytes() {
      java.lang.Object ref = appName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string appName = 1;</code>
     */
    public Builder setAppName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string appName = 1;</code>
     */
    public Builder clearAppName() {
      
      appName_ = getDefaultInstance().getAppName();
      onChanged();
      return this;
    }
    /**
     * <code>string appName = 1;</code>
     */
    public Builder setAppNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object className_ = "";
    /**
     * <code>string className = 2;</code>
     */
    public java.lang.String getClassName() {
      java.lang.Object ref = className_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        className_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string className = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClassNameBytes() {
      java.lang.Object ref = className_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        className_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string className = 2;</code>
     */
    public Builder setClassName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      className_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string className = 2;</code>
     */
    public Builder clearClassName() {
      
      className_ = getDefaultInstance().getClassName();
      onChanged();
      return this;
    }
    /**
     * <code>string className = 2;</code>
     */
    public Builder setClassNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      className_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object methodName_ = "";
    /**
     * <code>string methodName = 3;</code>
     */
    public java.lang.String getMethodName() {
      java.lang.Object ref = methodName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        methodName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string methodName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        methodName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string methodName = 3;</code>
     */
    public Builder setMethodName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      methodName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string methodName = 3;</code>
     */
    public Builder clearMethodName() {
      
      methodName_ = getDefaultInstance().getMethodName();
      onChanged();
      return this;
    }
    /**
     * <code>string methodName = 3;</code>
     */
    public Builder setMethodNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      methodName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 4;</code>
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
     * <code>string type = 4;</code>
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
     * <code>string type = 4;</code>
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
     * <code>string type = 4;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 4;</code>
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

    private java.lang.Object requestLogMessage_ = "";
    /**
     * <code>string requestLogMessage = 5;</code>
     */
    public java.lang.String getRequestLogMessage() {
      java.lang.Object ref = requestLogMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestLogMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string requestLogMessage = 5;</code>
     */
    public com.google.protobuf.ByteString
        getRequestLogMessageBytes() {
      java.lang.Object ref = requestLogMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestLogMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string requestLogMessage = 5;</code>
     */
    public Builder setRequestLogMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestLogMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string requestLogMessage = 5;</code>
     */
    public Builder clearRequestLogMessage() {
      
      requestLogMessage_ = getDefaultInstance().getRequestLogMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string requestLogMessage = 5;</code>
     */
    public Builder setRequestLogMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestLogMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object responseLogMessage_ = "";
    /**
     * <code>string responseLogMessage = 6;</code>
     */
    public java.lang.String getResponseLogMessage() {
      java.lang.Object ref = responseLogMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseLogMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string responseLogMessage = 6;</code>
     */
    public com.google.protobuf.ByteString
        getResponseLogMessageBytes() {
      java.lang.Object ref = responseLogMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseLogMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string responseLogMessage = 6;</code>
     */
    public Builder setResponseLogMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responseLogMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string responseLogMessage = 6;</code>
     */
    public Builder clearResponseLogMessage() {
      
      responseLogMessage_ = getDefaultInstance().getResponseLogMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string responseLogMessage = 6;</code>
     */
    public Builder setResponseLogMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      responseLogMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object logTime_ = "";
    /**
     * <code>string logTime = 7;</code>
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
     * <code>string logTime = 7;</code>
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
     * <code>string logTime = 7;</code>
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
     * <code>string logTime = 7;</code>
     */
    public Builder clearLogTime() {
      
      logTime_ = getDefaultInstance().getLogTime();
      onChanged();
      return this;
    }
    /**
     * <code>string logTime = 7;</code>
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


    // @@protoc_insertion_point(builder_scope:LogData)
  }

  // @@protoc_insertion_point(class_scope:LogData)
  private static final comm.grpc.logger.stub.LogData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new comm.grpc.logger.stub.LogData();
  }

  public static comm.grpc.logger.stub.LogData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogData>
      PARSER = new com.google.protobuf.AbstractParser<LogData>() {
    @java.lang.Override
    public LogData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public comm.grpc.logger.stub.LogData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

