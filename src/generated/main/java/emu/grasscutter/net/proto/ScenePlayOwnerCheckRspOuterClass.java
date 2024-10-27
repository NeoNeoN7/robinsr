// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayOwnerCheckRsp.proto

package emu.grasscutter.net.proto;

public final class ScenePlayOwnerCheckRspOuterClass {
  private ScenePlayOwnerCheckRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayOwnerCheckRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayOwnerCheckRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 param_list = 7;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Integer> getParamListList();
    /**
     * <code>repeated uint32 param_list = 7;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated uint32 param_list = 7;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    int getParamList(int index);

    /**
     * <code>uint32 play_id = 13;</code>
     * @return The playId.
     */
    int getPlayId();

    /**
     * <code>bool is_skip_match = 5;</code>
     * @return The isSkipMatch.
     */
    boolean getIsSkipMatch();

    /**
     * <code>uint32 wrong_uid = 8;</code>
     * @return The wrongUid.
     */
    int getWrongUid();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2989
   * Obf: AAJJMIGOGKD
   * </pre>
   *
   * Protobuf type {@code ScenePlayOwnerCheckRsp}
   */
  public static final class ScenePlayOwnerCheckRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayOwnerCheckRsp)
      ScenePlayOwnerCheckRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayOwnerCheckRsp.newBuilder() to construct.
    private ScenePlayOwnerCheckRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayOwnerCheckRsp() {
      paramList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayOwnerCheckRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayOwnerCheckRsp(
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
            case 40: {

              isSkipMatch_ = input.readBool();
              break;
            }
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              paramList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                paramList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 64: {

              wrongUid_ = input.readUInt32();
              break;
            }
            case 104: {

              playId_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.class, emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.Builder.class);
    }

    public static final int PARAM_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList paramList_;
    /**
     * <code>repeated uint32 param_list = 7;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated uint32 param_list = 7;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated uint32 param_list = 7;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public int getParamList(int index) {
      return paramList_.getInt(index);
    }
    private int paramListMemoizedSerializedSize = -1;

    public static final int PLAY_ID_FIELD_NUMBER = 13;
    private int playId_;
    /**
     * <code>uint32 play_id = 13;</code>
     * @return The playId.
     */
    @java.lang.Override
    public int getPlayId() {
      return playId_;
    }

    public static final int IS_SKIP_MATCH_FIELD_NUMBER = 5;
    private boolean isSkipMatch_;
    /**
     * <code>bool is_skip_match = 5;</code>
     * @return The isSkipMatch.
     */
    @java.lang.Override
    public boolean getIsSkipMatch() {
      return isSkipMatch_;
    }

    public static final int WRONG_UID_FIELD_NUMBER = 8;
    private int wrongUid_;
    /**
     * <code>uint32 wrong_uid = 8;</code>
     * @return The wrongUid.
     */
    @java.lang.Override
    public int getWrongUid() {
      return wrongUid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (isSkipMatch_ != false) {
        output.writeBool(5, isSkipMatch_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeUInt32NoTag(paramList_.getInt(i));
      }
      if (wrongUid_ != 0) {
        output.writeUInt32(8, wrongUid_);
      }
      if (playId_ != 0) {
        output.writeUInt32(13, playId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSkipMatch_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isSkipMatch_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < paramList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(paramList_.getInt(i));
        }
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
      }
      if (wrongUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, wrongUid_);
      }
      if (playId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, playId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp other = (emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp) obj;

      if (!getParamListList()
          .equals(other.getParamListList())) return false;
      if (getPlayId()
          != other.getPlayId()) return false;
      if (getIsSkipMatch()
          != other.getIsSkipMatch()) return false;
      if (getWrongUid()
          != other.getWrongUid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (37 * hash) + PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayId();
      hash = (37 * hash) + IS_SKIP_MATCH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSkipMatch());
      hash = (37 * hash) + WRONG_UID_FIELD_NUMBER;
      hash = (53 * hash) + getWrongUid();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp prototype) {
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
     * CmdId: 2989
     * Obf: AAJJMIGOGKD
     * </pre>
     *
     * Protobuf type {@code ScenePlayOwnerCheckRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayOwnerCheckRsp)
        emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.class, emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.newBuilder()
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
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        playId_ = 0;

        isSkipMatch_ = false;

        wrongUid_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp build() {
        emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp buildPartial() {
        emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp result = new emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramList_ = paramList_;
        result.playId_ = playId_;
        result.isSkipMatch_ = isSkipMatch_;
        result.wrongUid_ = wrongUid_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp other) {
        if (other == emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.getDefaultInstance()) return this;
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
          }
          onChanged();
        }
        if (other.getPlayId() != 0) {
          setPlayId(other.getPlayId());
        }
        if (other.getIsSkipMatch() != false) {
          setIsSkipMatch(other.getIsSkipMatch());
        }
        if (other.getWrongUid() != 0) {
          setWrongUid(other.getWrongUid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList paramList_ = emptyIntList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 param_list = 7;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Integer>
          getParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated uint32 param_list = 7;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated uint32 param_list = 7;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public int getParamList(int index) {
        return paramList_.getInt(index);
      }
      /**
       * <code>repeated uint32 param_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The paramList to set.
       * @return This builder for chaining.
       */
      public Builder setParamList(
          int index, int value) {
        ensureParamListIsMutable();
        paramList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 7;</code>
       * @param value The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addParamList(int value) {
        ensureParamListIsMutable();
        paramList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 7;</code>
       * @param values The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int playId_ ;
      /**
       * <code>uint32 play_id = 13;</code>
       * @return The playId.
       */
      @java.lang.Override
      public int getPlayId() {
        return playId_;
      }
      /**
       * <code>uint32 play_id = 13;</code>
       * @param value The playId to set.
       * @return This builder for chaining.
       */
      public Builder setPlayId(int value) {
        
        playId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayId() {
        
        playId_ = 0;
        onChanged();
        return this;
      }

      private boolean isSkipMatch_ ;
      /**
       * <code>bool is_skip_match = 5;</code>
       * @return The isSkipMatch.
       */
      @java.lang.Override
      public boolean getIsSkipMatch() {
        return isSkipMatch_;
      }
      /**
       * <code>bool is_skip_match = 5;</code>
       * @param value The isSkipMatch to set.
       * @return This builder for chaining.
       */
      public Builder setIsSkipMatch(boolean value) {
        
        isSkipMatch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_skip_match = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSkipMatch() {
        
        isSkipMatch_ = false;
        onChanged();
        return this;
      }

      private int wrongUid_ ;
      /**
       * <code>uint32 wrong_uid = 8;</code>
       * @return The wrongUid.
       */
      @java.lang.Override
      public int getWrongUid() {
        return wrongUid_;
      }
      /**
       * <code>uint32 wrong_uid = 8;</code>
       * @param value The wrongUid to set.
       * @return This builder for chaining.
       */
      public Builder setWrongUid(int value) {
        
        wrongUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wrong_uid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearWrongUid() {
        
        wrongUid_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayOwnerCheckRsp)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayOwnerCheckRsp)
    private static final emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp();
    }

    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayOwnerCheckRsp>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayOwnerCheckRsp>() {
      @java.lang.Override
      public ScenePlayOwnerCheckRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayOwnerCheckRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayOwnerCheckRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayOwnerCheckRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayOwnerCheckRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayOwnerCheckRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ScenePlayOwnerCheckRsp.proto\"x\n\026SceneP" +
      "layOwnerCheckRsp\022\022\n\nparam_list\030\007 \003(\r\022\017\n\007" +
      "play_id\030\r \001(\r\022\025\n\ris_skip_match\030\005 \001(\010\022\021\n\t" +
      "wrong_uid\030\010 \001(\r\022\017\n\007retcode\030\006 \001(\005B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScenePlayOwnerCheckRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayOwnerCheckRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayOwnerCheckRsp_descriptor,
        new java.lang.String[] { "ParamList", "PlayId", "IsSkipMatch", "WrongUid", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
