// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CJCLCFNAGDO.proto

package emu.grasscutter.net.proto;

public final class CJCLCFNAGDOOuterClass {
  private CJCLCFNAGDOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CJCLCFNAGDOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CJCLCFNAGDO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 LIDKBBLDDOK = 6;</code>
     * @return The lIDKBBLDDOK.
     */
    int getLIDKBBLDDOK();

    /**
     * <code>uint32 min_finish_time = 13;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code CJCLCFNAGDO}
   */
  public static final class CJCLCFNAGDO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CJCLCFNAGDO)
      CJCLCFNAGDOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CJCLCFNAGDO.newBuilder() to construct.
    private CJCLCFNAGDO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CJCLCFNAGDO() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CJCLCFNAGDO();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CJCLCFNAGDO(
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
            case 48: {

              lIDKBBLDDOK_ = input.readUInt32();
              break;
            }
            case 80: {

              levelId_ = input.readUInt32();
              break;
            }
            case 88: {

              isOpen_ = input.readBool();
              break;
            }
            case 104: {

              minFinishTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.class, emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.Builder.class);
    }

    public static final int LIDKBBLDDOK_FIELD_NUMBER = 6;
    private int lIDKBBLDDOK_;
    /**
     * <code>uint32 LIDKBBLDDOK = 6;</code>
     * @return The lIDKBBLDDOK.
     */
    @java.lang.Override
    public int getLIDKBBLDDOK() {
      return lIDKBBLDDOK_;
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 13;
    private int minFinishTime_;
    /**
     * <code>uint32 min_finish_time = 13;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 11;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (lIDKBBLDDOK_ != 0) {
        output.writeUInt32(6, lIDKBBLDDOK_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      if (isOpen_ != false) {
        output.writeBool(11, isOpen_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(13, minFinishTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lIDKBBLDDOK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, lIDKBBLDDOK_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isOpen_);
      }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, minFinishTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO other = (emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO) obj;

      if (getLIDKBBLDDOK()
          != other.getLIDKBBLDDOK()) return false;
      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + LIDKBBLDDOK_FIELD_NUMBER;
      hash = (53 * hash) + getLIDKBBLDDOK();
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO prototype) {
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
     * Protobuf type {@code CJCLCFNAGDO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CJCLCFNAGDO)
        emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.class, emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.newBuilder()
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
        lIDKBBLDDOK_ = 0;

        minFinishTime_ = 0;

        levelId_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO build() {
        emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO buildPartial() {
        emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO result = new emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO(this);
        result.lIDKBBLDDOK_ = lIDKBBLDDOK_;
        result.minFinishTime_ = minFinishTime_;
        result.levelId_ = levelId_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO) {
          return mergeFrom((emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO other) {
        if (other == emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.getDefaultInstance()) return this;
        if (other.getLIDKBBLDDOK() != 0) {
          setLIDKBBLDDOK(other.getLIDKBBLDDOK());
        }
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int lIDKBBLDDOK_ ;
      /**
       * <code>uint32 LIDKBBLDDOK = 6;</code>
       * @return The lIDKBBLDDOK.
       */
      @java.lang.Override
      public int getLIDKBBLDDOK() {
        return lIDKBBLDDOK_;
      }
      /**
       * <code>uint32 LIDKBBLDDOK = 6;</code>
       * @param value The lIDKBBLDDOK to set.
       * @return This builder for chaining.
       */
      public Builder setLIDKBBLDDOK(int value) {
        
        lIDKBBLDDOK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LIDKBBLDDOK = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLIDKBBLDDOK() {
        
        lIDKBBLDDOK_ = 0;
        onChanged();
        return this;
      }

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {
        
        minFinishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        
        minFinishTime_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 11;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 11;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:CJCLCFNAGDO)
    }

    // @@protoc_insertion_point(class_scope:CJCLCFNAGDO)
    private static final emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO();
    }

    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CJCLCFNAGDO>
        PARSER = new com.google.protobuf.AbstractParser<CJCLCFNAGDO>() {
      @java.lang.Override
      public CJCLCFNAGDO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CJCLCFNAGDO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CJCLCFNAGDO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CJCLCFNAGDO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CJCLCFNAGDO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CJCLCFNAGDO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CJCLCFNAGDO.proto\"^\n\013CJCLCFNAGDO\022\023\n\013LI" +
      "DKBBLDDOK\030\006 \001(\r\022\027\n\017min_finish_time\030\r \001(\r" +
      "\022\020\n\010level_id\030\n \001(\r\022\017\n\007is_open\030\013 \001(\010B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CJCLCFNAGDO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CJCLCFNAGDO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CJCLCFNAGDO_descriptor,
        new java.lang.String[] { "LIDKBBLDDOK", "MinFinishTime", "LevelId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
