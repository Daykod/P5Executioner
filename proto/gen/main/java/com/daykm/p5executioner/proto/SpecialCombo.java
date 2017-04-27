// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package com.daykm.p5executioner.proto;

/**
 * Protobuf type {@code p5.SpecialCombo}
 */
public final class SpecialCombo
		extends com.google.protobuf.GeneratedMessageLite<SpecialCombo, SpecialCombo.Builder> implements
		// @@protoc_insertion_point(message_implements:p5.SpecialCombo)
		SpecialComboOrBuilder {
	private SpecialCombo() {
		result_ = "";
    sources_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  private int bitField0_;
  public static final int RESULT_FIELD_NUMBER = 1;
  private java.lang.String result_;
  /**
   * <code>string result = 1;</code>
   */
  public java.lang.String getResult() {
    return result_;
  }
  /**
   * <code>string result = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResultBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(result_);
  }
  /**
   * <code>string result = 1;</code>
   */
  private void setResult(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    result_ = value;
  }
  /**
   * <code>string result = 1;</code>
   */
  private void clearResult() {
    
    result_ = getDefaultInstance().getResult();
  }
  /**
   * <code>string result = 1;</code>
   */
  private void setResultBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    result_ = value.toStringUtf8();
  }

  public static final int SOURCES_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<String> sources_;
  /**
   * <code>repeated string sources = 2;</code>
   */
  public java.util.List<String> getSourcesList() {
    return sources_;
  }
  /**
   * <code>repeated string sources = 2;</code>
   */
  public int getSourcesCount() {
    return sources_.size();
  }
  /**
   * <code>repeated string sources = 2;</code>
   */
  public java.lang.String getSources(int index) {
    return sources_.get(index);
  }
  /**
   * <code>repeated string sources = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSourcesBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        sources_.get(index));
  }
  private void ensureSourcesIsMutable() {
    if (!sources_.isModifiable()) {
      sources_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(sources_);
     }
  }
  /**
   * <code>repeated string sources = 2;</code>
   */
  private void setSources(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureSourcesIsMutable();
    sources_.set(index, value);
  }
  /**
   * <code>repeated string sources = 2;</code>
   */
  private void addSources(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureSourcesIsMutable();
    sources_.add(value);
  }
  /**
   * <code>repeated string sources = 2;</code>
   */
  private void addAllSources(
      java.lang.Iterable<java.lang.String> values) {
    ensureSourcesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, sources_);
  }
  /**
   * <code>repeated string sources = 2;</code>
   */
  private void clearSources() {
    sources_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <code>repeated string sources = 2;</code>
   */
  private void addSourcesBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    ensureSourcesIsMutable();
    sources_.add(value.toStringUtf8());
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!result_.isEmpty()) {
      output.writeString(1, getResult());
    }
    for (int i = 0; i < sources_.size(); i++) {
      output.writeString(2, sources_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!result_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getResult());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < sources_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(sources_.get(i));
      }
      size += dataSize;
      size += 1 * getSourcesList().size();
    }
    memoizedSerializedSize = size;
    return size;
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseFrom(
			com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseFrom(
			com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseFrom(byte[] data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseFrom(java.io.InputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseDelimitedFrom(
			java.io.InputStream input) throws java.io.IOException {
		return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseDelimitedFrom(
			java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseFrom(
			com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }

	public static com.daykm.p5executioner.proto.SpecialCombo parseFrom(
			com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

	public static Builder newBuilder(com.daykm.p5executioner.proto.SpecialCombo prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

  /**
	 * Protobuf type {@code p5.SpecialCombo}
	 */
	public static final class Builder extends
			com.google.protobuf.GeneratedMessageLite.Builder<com.daykm.p5executioner.proto.SpecialCombo, Builder>
			implements
			// @@protoc_insertion_point(builder_implements:p5.SpecialCombo)
			com.daykm.p5executioner.proto.SpecialComboOrBuilder {
		// Construct using com.daykm.p5executioner.proto.SpecialCombo.newBuilder()
		private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string result = 1;</code>
     */
    public java.lang.String getResult() {
      return instance.getResult();
    }
    /**
     * <code>string result = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      return instance.getResultBytes();
    }
    /**
     * <code>string result = 1;</code>
     */
    public Builder setResult(
        java.lang.String value) {
      copyOnWrite();
      instance.setResult(value);
      return this;
    }
    /**
     * <code>string result = 1;</code>
     */
    public Builder clearResult() {
      copyOnWrite();
      instance.clearResult();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setResultBytes(value);
      return this;
    }

    /**
     * <code>repeated string sources = 2;</code>
     */
    public java.util.List<String>
        getSourcesList() {
      return java.util.Collections.unmodifiableList(
          instance.getSourcesList());
    }
    /**
     * <code>repeated string sources = 2;</code>
     */
    public int getSourcesCount() {
      return instance.getSourcesCount();
    }
    /**
     * <code>repeated string sources = 2;</code>
     */
    public java.lang.String getSources(int index) {
      return instance.getSources(index);
    }
    /**
     * <code>repeated string sources = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSourcesBytes(int index) {
      return instance.getSourcesBytes(index);
    }
    /**
     * <code>repeated string sources = 2;</code>
     */
    public Builder setSources(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setSources(index, value);
      return this;
    }
    /**
     * <code>repeated string sources = 2;</code>
     */
    public Builder addSources(
        java.lang.String value) {
      copyOnWrite();
      instance.addSources(value);
      return this;
    }
    /**
     * <code>repeated string sources = 2;</code>
     */
    public Builder addAllSources(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllSources(values);
      return this;
    }
    /**
     * <code>repeated string sources = 2;</code>
     */
    public Builder clearSources() {
      copyOnWrite();
      instance.clearSources();
      return this;
    }
    /**
     * <code>repeated string sources = 2;</code>
     */
    public Builder addSourcesBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addSourcesBytes(value);
      return this;
    }

		// @@protoc_insertion_point(builder_scope:p5.SpecialCombo)
	}

	protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
				return new com.daykm.p5executioner.proto.SpecialCombo();
			}
			case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        sources_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
				com.daykm.p5executioner.proto.SpecialCombo other =
						(com.daykm.p5executioner.proto.SpecialCombo) arg1;
				result_ = visitor.visitString(!result_.isEmpty(), result_, !other.result_.isEmpty(), other.result_);
        sources_= visitor.visitList(sources_, other.sources_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                result_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();
                if (!sources_.isModifiable()) {
                  sources_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(sources_);
                }
                sources_.add(s);
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
				if (PARSER == null) {
					synchronized (com.daykm.p5executioner.proto.SpecialCombo.class) {
						if (PARSER == null) {
							PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }

	// @@protoc_insertion_point(class_scope:p5.SpecialCombo)
	private static final com.daykm.p5executioner.proto.SpecialCombo DEFAULT_INSTANCE;

	static {
		DEFAULT_INSTANCE = new SpecialCombo();
		DEFAULT_INSTANCE.makeImmutable();
	}

	public static com.daykm.p5executioner.proto.SpecialCombo getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static volatile com.google.protobuf.Parser<SpecialCombo> PARSER;

	public static com.google.protobuf.Parser<SpecialCombo> parser() {
		return DEFAULT_INSTANCE.getParserForType();
	}
}

