// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IJAAEEIIHEG.proto

package emu.grasscutter.net.proto;

public final class IJAAEEIIHEGOuterClass {
  private IJAAEEIIHEGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IJAAEEIIHEGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IJAAEEIIHEG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
     * @return Whether the oGOLNFKNLKD field is set.
     */
    boolean hasOGOLNFKNLKD();
    /**
     * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
     * @return The oGOLNFKNLKD.
     */
    emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN getOGOLNFKNLKD();
    /**
     * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
     */
    emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLNOrBuilder getOGOLNFKNLKDOrBuilder();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 20869
   * </pre>
   *
   * Protobuf type {@code IJAAEEIIHEG}
   */
  public static final class IJAAEEIIHEG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IJAAEEIIHEG)
      IJAAEEIIHEGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IJAAEEIIHEG.newBuilder() to construct.
    private IJAAEEIIHEG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IJAAEEIIHEG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IJAAEEIIHEG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IJAAEEIIHEG(
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
            case 16: {

              retcode_ = input.readInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.Builder subBuilder = null;
              if (oGOLNFKNLKD_ != null) {
                subBuilder = oGOLNFKNLKD_.toBuilder();
              }
              oGOLNFKNLKD_ = input.readMessage(emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(oGOLNFKNLKD_);
                oGOLNFKNLKD_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.internal_static_IJAAEEIIHEG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.internal_static_IJAAEEIIHEG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG.class, emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG.Builder.class);
    }

    public static final int OGOLNFKNLKD_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN oGOLNFKNLKD_;
    /**
     * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
     * @return Whether the oGOLNFKNLKD field is set.
     */
    @java.lang.Override
    public boolean hasOGOLNFKNLKD() {
      return oGOLNFKNLKD_ != null;
    }
    /**
     * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
     * @return The oGOLNFKNLKD.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN getOGOLNFKNLKD() {
      return oGOLNFKNLKD_ == null ? emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.getDefaultInstance() : oGOLNFKNLKD_;
    }
    /**
     * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLNOrBuilder getOGOLNFKNLKDOrBuilder() {
      return getOGOLNFKNLKD();
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (oGOLNFKNLKD_ != null) {
        output.writeMessage(13, getOGOLNFKNLKD());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (oGOLNFKNLKD_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getOGOLNFKNLKD());
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
      if (!(obj instanceof emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG other = (emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG) obj;

      if (hasOGOLNFKNLKD() != other.hasOGOLNFKNLKD()) return false;
      if (hasOGOLNFKNLKD()) {
        if (!getOGOLNFKNLKD()
            .equals(other.getOGOLNFKNLKD())) return false;
      }
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
      if (hasOGOLNFKNLKD()) {
        hash = (37 * hash) + OGOLNFKNLKD_FIELD_NUMBER;
        hash = (53 * hash) + getOGOLNFKNLKD().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG prototype) {
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
     * CmdId: 20869
     * </pre>
     *
     * Protobuf type {@code IJAAEEIIHEG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IJAAEEIIHEG)
        emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.internal_static_IJAAEEIIHEG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.internal_static_IJAAEEIIHEG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG.class, emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG.newBuilder()
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
        if (oGOLNFKNLKDBuilder_ == null) {
          oGOLNFKNLKD_ = null;
        } else {
          oGOLNFKNLKD_ = null;
          oGOLNFKNLKDBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.internal_static_IJAAEEIIHEG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG build() {
        emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG buildPartial() {
        emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG result = new emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG(this);
        if (oGOLNFKNLKDBuilder_ == null) {
          result.oGOLNFKNLKD_ = oGOLNFKNLKD_;
        } else {
          result.oGOLNFKNLKD_ = oGOLNFKNLKDBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG) {
          return mergeFrom((emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG other) {
        if (other == emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG.getDefaultInstance()) return this;
        if (other.hasOGOLNFKNLKD()) {
          mergeOGOLNFKNLKD(other.getOGOLNFKNLKD());
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
        emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN oGOLNFKNLKD_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN, emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.Builder, emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLNOrBuilder> oGOLNFKNLKDBuilder_;
      /**
       * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
       * @return Whether the oGOLNFKNLKD field is set.
       */
      public boolean hasOGOLNFKNLKD() {
        return oGOLNFKNLKDBuilder_ != null || oGOLNFKNLKD_ != null;
      }
      /**
       * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
       * @return The oGOLNFKNLKD.
       */
      public emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN getOGOLNFKNLKD() {
        if (oGOLNFKNLKDBuilder_ == null) {
          return oGOLNFKNLKD_ == null ? emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.getDefaultInstance() : oGOLNFKNLKD_;
        } else {
          return oGOLNFKNLKDBuilder_.getMessage();
        }
      }
      /**
       * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
       */
      public Builder setOGOLNFKNLKD(emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN value) {
        if (oGOLNFKNLKDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oGOLNFKNLKD_ = value;
          onChanged();
        } else {
          oGOLNFKNLKDBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
       */
      public Builder setOGOLNFKNLKD(
          emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.Builder builderForValue) {
        if (oGOLNFKNLKDBuilder_ == null) {
          oGOLNFKNLKD_ = builderForValue.build();
          onChanged();
        } else {
          oGOLNFKNLKDBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
       */
      public Builder mergeOGOLNFKNLKD(emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN value) {
        if (oGOLNFKNLKDBuilder_ == null) {
          if (oGOLNFKNLKD_ != null) {
            oGOLNFKNLKD_ =
              emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.newBuilder(oGOLNFKNLKD_).mergeFrom(value).buildPartial();
          } else {
            oGOLNFKNLKD_ = value;
          }
          onChanged();
        } else {
          oGOLNFKNLKDBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
       */
      public Builder clearOGOLNFKNLKD() {
        if (oGOLNFKNLKDBuilder_ == null) {
          oGOLNFKNLKD_ = null;
          onChanged();
        } else {
          oGOLNFKNLKD_ = null;
          oGOLNFKNLKDBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
       */
      public emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.Builder getOGOLNFKNLKDBuilder() {
        
        onChanged();
        return getOGOLNFKNLKDFieldBuilder().getBuilder();
      }
      /**
       * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
       */
      public emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLNOrBuilder getOGOLNFKNLKDOrBuilder() {
        if (oGOLNFKNLKDBuilder_ != null) {
          return oGOLNFKNLKDBuilder_.getMessageOrBuilder();
        } else {
          return oGOLNFKNLKD_ == null ?
              emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.getDefaultInstance() : oGOLNFKNLKD_;
        }
      }
      /**
       * <code>.BOJBLBJOLLN OGOLNFKNLKD = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN, emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.Builder, emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLNOrBuilder> 
          getOGOLNFKNLKDFieldBuilder() {
        if (oGOLNFKNLKDBuilder_ == null) {
          oGOLNFKNLKDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN, emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLN.Builder, emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.BOJBLBJOLLNOrBuilder>(
                  getOGOLNFKNLKD(),
                  getParentForChildren(),
                  isClean());
          oGOLNFKNLKD_ = null;
        }
        return oGOLNFKNLKDBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:IJAAEEIIHEG)
    }

    // @@protoc_insertion_point(class_scope:IJAAEEIIHEG)
    private static final emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG();
    }

    public static emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IJAAEEIIHEG>
        PARSER = new com.google.protobuf.AbstractParser<IJAAEEIIHEG>() {
      @java.lang.Override
      public IJAAEEIIHEG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IJAAEEIIHEG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IJAAEEIIHEG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IJAAEEIIHEG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IJAAEEIIHEGOuterClass.IJAAEEIIHEG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IJAAEEIIHEG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IJAAEEIIHEG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IJAAEEIIHEG.proto\032\021BOJBLBJOLLN.proto\"A" +
      "\n\013IJAAEEIIHEG\022!\n\013OGOLNFKNLKD\030\r \001(\0132\014.BOJ" +
      "BLBJOLLN\022\017\n\007retcode\030\002 \001(\005B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.getDescriptor(),
        });
    internal_static_IJAAEEIIHEG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IJAAEEIIHEG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IJAAEEIIHEG_descriptor,
        new java.lang.String[] { "OGOLNFKNLKD", "Retcode", });
    emu.grasscutter.net.proto.BOJBLBJOLLNOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
