// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: alltypes.proto

package com.baidu.bjf.remoting.protobuf;

public final class RequriedMultiType {
  private RequriedMultiType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InterClassNameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional double doubleF = 1;
    /**
     * <code>optional double doubleF = 1;</code>
     */
    boolean hasDoubleF();
    /**
     * <code>optional double doubleF = 1;</code>
     */
    double getDoubleF();

    // required string stringF = 2;
    /**
     * <code>required string stringF = 2;</code>
     */
    boolean hasStringF();
    /**
     * <code>required string stringF = 2;</code>
     */
    java.lang.String getStringF();
    /**
     * <code>required string stringF = 2;</code>
     */
    com.google.protobuf.ByteString
        getStringFBytes();

    // required bool sex = 3;
    /**
     * <code>required bool sex = 3;</code>
     */
    boolean hasSex();
    /**
     * <code>required bool sex = 3;</code>
     */
    boolean getSex();
  }
  /**
   * Protobuf type {@code pkg.InterClassName}
   */
  public static final class InterClassName extends
      com.google.protobuf.GeneratedMessage
      implements InterClassNameOrBuilder {
    // Use InterClassName.newBuilder() to construct.
    private InterClassName(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private InterClassName(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final InterClassName defaultInstance;
    public static InterClassName getDefaultInstance() {
      return defaultInstance;
    }

    public InterClassName getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private InterClassName(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 9: {
              bitField0_ |= 0x00000001;
              doubleF_ = input.readDouble();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              stringF_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              sex_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.bjf.remoting.protobuf.RequriedMultiType.internal_static_pkg_InterClassName_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.bjf.remoting.protobuf.RequriedMultiType.internal_static_pkg_InterClassName_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName.class, com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName.Builder.class);
    }

    public static com.google.protobuf.Parser<InterClassName> PARSER =
        new com.google.protobuf.AbstractParser<InterClassName>() {
      public InterClassName parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InterClassName(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<InterClassName> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional double doubleF = 1;
    public static final int DOUBLEF_FIELD_NUMBER = 1;
    private double doubleF_;
    /**
     * <code>optional double doubleF = 1;</code>
     */
    public boolean hasDoubleF() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional double doubleF = 1;</code>
     */
    public double getDoubleF() {
      return doubleF_;
    }

    // required string stringF = 2;
    public static final int STRINGF_FIELD_NUMBER = 2;
    private java.lang.Object stringF_;
    /**
     * <code>required string stringF = 2;</code>
     */
    public boolean hasStringF() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string stringF = 2;</code>
     */
    public java.lang.String getStringF() {
      java.lang.Object ref = stringF_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          stringF_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string stringF = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStringFBytes() {
      java.lang.Object ref = stringF_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stringF_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required bool sex = 3;
    public static final int SEX_FIELD_NUMBER = 3;
    private boolean sex_;
    /**
     * <code>required bool sex = 3;</code>
     */
    public boolean hasSex() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required bool sex = 3;</code>
     */
    public boolean getSex() {
      return sex_;
    }

    private void initFields() {
      doubleF_ = 0D;
      stringF_ = "";
      sex_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStringF()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeDouble(1, doubleF_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getStringFBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, sex_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, doubleF_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getStringFBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, sex_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code pkg.InterClassName}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassNameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.baidu.bjf.remoting.protobuf.RequriedMultiType.internal_static_pkg_InterClassName_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.baidu.bjf.remoting.protobuf.RequriedMultiType.internal_static_pkg_InterClassName_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName.class, com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName.Builder.class);
      }

      // Construct using com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        doubleF_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        stringF_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        sex_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.bjf.remoting.protobuf.RequriedMultiType.internal_static_pkg_InterClassName_descriptor;
      }

      public com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName getDefaultInstanceForType() {
        return com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName.getDefaultInstance();
      }

      public com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName build() {
        com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName buildPartial() {
        com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName result = new com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.doubleF_ = doubleF_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.stringF_ = stringF_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sex_ = sex_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName) {
          return mergeFrom((com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName other) {
        if (other == com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName.getDefaultInstance()) return this;
        if (other.hasDoubleF()) {
          setDoubleF(other.getDoubleF());
        }
        if (other.hasStringF()) {
          bitField0_ |= 0x00000002;
          stringF_ = other.stringF_;
          onChanged();
        }
        if (other.hasSex()) {
          setSex(other.getSex());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStringF()) {
          
          return false;
        }
        if (!hasSex()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.baidu.bjf.remoting.protobuf.RequriedMultiType.InterClassName) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional double doubleF = 1;
      private double doubleF_ ;
      /**
       * <code>optional double doubleF = 1;</code>
       */
      public boolean hasDoubleF() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional double doubleF = 1;</code>
       */
      public double getDoubleF() {
        return doubleF_;
      }
      /**
       * <code>optional double doubleF = 1;</code>
       */
      public Builder setDoubleF(double value) {
        bitField0_ |= 0x00000001;
        doubleF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double doubleF = 1;</code>
       */
      public Builder clearDoubleF() {
        bitField0_ = (bitField0_ & ~0x00000001);
        doubleF_ = 0D;
        onChanged();
        return this;
      }

      // required string stringF = 2;
      private java.lang.Object stringF_ = "";
      /**
       * <code>required string stringF = 2;</code>
       */
      public boolean hasStringF() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string stringF = 2;</code>
       */
      public java.lang.String getStringF() {
        java.lang.Object ref = stringF_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          stringF_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string stringF = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStringFBytes() {
        java.lang.Object ref = stringF_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          stringF_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string stringF = 2;</code>
       */
      public Builder setStringF(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        stringF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string stringF = 2;</code>
       */
      public Builder clearStringF() {
        bitField0_ = (bitField0_ & ~0x00000002);
        stringF_ = getDefaultInstance().getStringF();
        onChanged();
        return this;
      }
      /**
       * <code>required string stringF = 2;</code>
       */
      public Builder setStringFBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        stringF_ = value;
        onChanged();
        return this;
      }

      // required bool sex = 3;
      private boolean sex_ ;
      /**
       * <code>required bool sex = 3;</code>
       */
      public boolean hasSex() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bool sex = 3;</code>
       */
      public boolean getSex() {
        return sex_;
      }
      /**
       * <code>required bool sex = 3;</code>
       */
      public Builder setSex(boolean value) {
        bitField0_ |= 0x00000004;
        sex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool sex = 3;</code>
       */
      public Builder clearSex() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sex_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:pkg.InterClassName)
    }

    static {
      defaultInstance = new InterClassName(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:pkg.InterClassName)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_pkg_InterClassName_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_pkg_InterClassName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016alltypes.proto\022\003pkg\"?\n\016InterClassName\022" +
      "\017\n\007doubleF\030\001 \001(\001\022\017\n\007stringF\030\002 \002(\t\022\013\n\003sex" +
      "\030\003 \002(\010B4\n\037com.baidu.bjf.remoting.protobu" +
      "fB\021RequriedMultiType"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_pkg_InterClassName_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_pkg_InterClassName_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_pkg_InterClassName_descriptor,
              new java.lang.String[] { "DoubleF", "StringF", "Sex", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
