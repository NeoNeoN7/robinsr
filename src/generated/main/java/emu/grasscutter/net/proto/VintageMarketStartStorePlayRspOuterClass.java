// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketStartStorePlayRsp.proto

package emu.grasscutter.net.proto;

public final class VintageMarketStartStorePlayRspOuterClass {
  private VintageMarketStartStorePlayRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketStartStorePlayRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketStartStorePlayRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 store_round = 4;</code>
     * @return The storeRound.
     */
    int getStoreRound();

    /**
     * <code>uint32 NDKCCHHJMCG = 14;</code>
     * @return The nDKCCHHJMCG.
     */
    int getNDKCCHHJMCG();

    /**
     * <code>uint32 ACGCAGDFOCM = 1;</code>
     * @return The aCGCAGDFOCM.
     */
    int getACGCAGDFOCM();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 6794
   * Obf: CKCAFGJGOIL
   * </pre>
   *
   * Protobuf type {@code VintageMarketStartStorePlayRsp}
   */
  public static final class VintageMarketStartStorePlayRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketStartStorePlayRsp)
      VintageMarketStartStorePlayRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketStartStorePlayRsp.newBuilder() to construct.
    private VintageMarketStartStorePlayRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketStartStorePlayRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketStartStorePlayRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageMarketStartStorePlayRsp(
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

              aCGCAGDFOCM_ = input.readUInt32();
              break;
            }
            case 32: {

              storeRound_ = input.readUInt32();
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {

              nDKCCHHJMCG_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.internal_static_VintageMarketStartStorePlayRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.internal_static_VintageMarketStartStorePlayRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp.class, emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp.Builder.class);
    }

    public static final int STORE_ROUND_FIELD_NUMBER = 4;
    private int storeRound_;
    /**
     * <code>uint32 store_round = 4;</code>
     * @return The storeRound.
     */
    @java.lang.Override
    public int getStoreRound() {
      return storeRound_;
    }

    public static final int NDKCCHHJMCG_FIELD_NUMBER = 14;
    private int nDKCCHHJMCG_;
    /**
     * <code>uint32 NDKCCHHJMCG = 14;</code>
     * @return The nDKCCHHJMCG.
     */
    @java.lang.Override
    public int getNDKCCHHJMCG() {
      return nDKCCHHJMCG_;
    }

    public static final int ACGCAGDFOCM_FIELD_NUMBER = 1;
    private int aCGCAGDFOCM_;
    /**
     * <code>uint32 ACGCAGDFOCM = 1;</code>
     * @return The aCGCAGDFOCM.
     */
    @java.lang.Override
    public int getACGCAGDFOCM() {
      return aCGCAGDFOCM_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
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
      if (aCGCAGDFOCM_ != 0) {
        output.writeUInt32(1, aCGCAGDFOCM_);
      }
      if (storeRound_ != 0) {
        output.writeUInt32(4, storeRound_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (nDKCCHHJMCG_ != 0) {
        output.writeUInt32(14, nDKCCHHJMCG_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aCGCAGDFOCM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, aCGCAGDFOCM_);
      }
      if (storeRound_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, storeRound_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      if (nDKCCHHJMCG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, nDKCCHHJMCG_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp other = (emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp) obj;

      if (getStoreRound()
          != other.getStoreRound()) return false;
      if (getNDKCCHHJMCG()
          != other.getNDKCCHHJMCG()) return false;
      if (getACGCAGDFOCM()
          != other.getACGCAGDFOCM()) return false;
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
      hash = (37 * hash) + STORE_ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getStoreRound();
      hash = (37 * hash) + NDKCCHHJMCG_FIELD_NUMBER;
      hash = (53 * hash) + getNDKCCHHJMCG();
      hash = (37 * hash) + ACGCAGDFOCM_FIELD_NUMBER;
      hash = (53 * hash) + getACGCAGDFOCM();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp prototype) {
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
     * CmdId: 6794
     * Obf: CKCAFGJGOIL
     * </pre>
     *
     * Protobuf type {@code VintageMarketStartStorePlayRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketStartStorePlayRsp)
        emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.internal_static_VintageMarketStartStorePlayRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.internal_static_VintageMarketStartStorePlayRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp.class, emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp.newBuilder()
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
        storeRound_ = 0;

        nDKCCHHJMCG_ = 0;

        aCGCAGDFOCM_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.internal_static_VintageMarketStartStorePlayRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp build() {
        emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp buildPartial() {
        emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp result = new emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp(this);
        result.storeRound_ = storeRound_;
        result.nDKCCHHJMCG_ = nDKCCHHJMCG_;
        result.aCGCAGDFOCM_ = aCGCAGDFOCM_;
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
        if (other instanceof emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp) {
          return mergeFrom((emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp other) {
        if (other == emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp.getDefaultInstance()) return this;
        if (other.getStoreRound() != 0) {
          setStoreRound(other.getStoreRound());
        }
        if (other.getNDKCCHHJMCG() != 0) {
          setNDKCCHHJMCG(other.getNDKCCHHJMCG());
        }
        if (other.getACGCAGDFOCM() != 0) {
          setACGCAGDFOCM(other.getACGCAGDFOCM());
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
        emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int storeRound_ ;
      /**
       * <code>uint32 store_round = 4;</code>
       * @return The storeRound.
       */
      @java.lang.Override
      public int getStoreRound() {
        return storeRound_;
      }
      /**
       * <code>uint32 store_round = 4;</code>
       * @param value The storeRound to set.
       * @return This builder for chaining.
       */
      public Builder setStoreRound(int value) {
        
        storeRound_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 store_round = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreRound() {
        
        storeRound_ = 0;
        onChanged();
        return this;
      }

      private int nDKCCHHJMCG_ ;
      /**
       * <code>uint32 NDKCCHHJMCG = 14;</code>
       * @return The nDKCCHHJMCG.
       */
      @java.lang.Override
      public int getNDKCCHHJMCG() {
        return nDKCCHHJMCG_;
      }
      /**
       * <code>uint32 NDKCCHHJMCG = 14;</code>
       * @param value The nDKCCHHJMCG to set.
       * @return This builder for chaining.
       */
      public Builder setNDKCCHHJMCG(int value) {
        
        nDKCCHHJMCG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NDKCCHHJMCG = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearNDKCCHHJMCG() {
        
        nDKCCHHJMCG_ = 0;
        onChanged();
        return this;
      }

      private int aCGCAGDFOCM_ ;
      /**
       * <code>uint32 ACGCAGDFOCM = 1;</code>
       * @return The aCGCAGDFOCM.
       */
      @java.lang.Override
      public int getACGCAGDFOCM() {
        return aCGCAGDFOCM_;
      }
      /**
       * <code>uint32 ACGCAGDFOCM = 1;</code>
       * @param value The aCGCAGDFOCM to set.
       * @return This builder for chaining.
       */
      public Builder setACGCAGDFOCM(int value) {
        
        aCGCAGDFOCM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ACGCAGDFOCM = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearACGCAGDFOCM() {
        
        aCGCAGDFOCM_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
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


      // @@protoc_insertion_point(builder_scope:VintageMarketStartStorePlayRsp)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketStartStorePlayRsp)
    private static final emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp();
    }

    public static emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketStartStorePlayRsp>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketStartStorePlayRsp>() {
      @java.lang.Override
      public VintageMarketStartStorePlayRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageMarketStartStorePlayRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageMarketStartStorePlayRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketStartStorePlayRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketStartStorePlayRspOuterClass.VintageMarketStartStorePlayRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketStartStorePlayRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketStartStorePlayRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$VintageMarketStartStorePlayRsp.proto\"p" +
      "\n\036VintageMarketStartStorePlayRsp\022\023\n\013stor" +
      "e_round\030\004 \001(\r\022\023\n\013NDKCCHHJMCG\030\016 \001(\r\022\023\n\013AC" +
      "GCAGDFOCM\030\001 \001(\r\022\017\n\007retcode\030\014 \001(\005B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageMarketStartStorePlayRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketStartStorePlayRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketStartStorePlayRsp_descriptor,
        new java.lang.String[] { "StoreRound", "NDKCCHHJMCG", "ACGCAGDFOCM", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
