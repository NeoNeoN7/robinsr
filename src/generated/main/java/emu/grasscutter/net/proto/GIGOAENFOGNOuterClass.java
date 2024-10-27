// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GIGOAENFOGN.proto

package emu.grasscutter.net.proto;

public final class GIGOAENFOGNOuterClass {
  private GIGOAENFOGNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GIGOAENFOGNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GIGOAENFOGN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string attack_tag = 5;</code>
     * @return The attackTag.
     */
    java.lang.String getAttackTag();
    /**
     * <code>string attack_tag = 5;</code>
     * @return The bytes for attackTag.
     */
    com.google.protobuf.ByteString
        getAttackTagBytes();

    /**
     * <code>int32 HDDNCAOOFEL = 14;</code>
     * @return The hDDNCAOOFEL.
     */
    int getHDDNCAOOFEL();

    /**
     * <code>.AbilityString ability_name = 10;</code>
     * @return Whether the abilityName field is set.
     */
    boolean hasAbilityName();
    /**
     * <code>.AbilityString ability_name = 10;</code>
     * @return The abilityName.
     */
    emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getAbilityName();
    /**
     * <code>.AbilityString ability_name = 10;</code>
     */
    emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder();

    /**
     * <code>int32 PEKOBOEODCF = 15;</code>
     * @return The pEKOBOEODCF.
     */
    int getPEKOBOEODCF();

    /**
     * <code>int32 KCLGEKJLKNM = 9;</code>
     * @return The kCLGEKJLKNM.
     */
    int getKCLGEKJLKNM();

    /**
     * <code>uint32 JDPELIFFANG = 6;</code>
     * @return The jDPELIFFANG.
     */
    int getJDPELIFFANG();

    /**
     * <code>uint32 EJOIOADINHE = 2;</code>
     * @return The eJOIOADINHE.
     */
    int getEJOIOADINHE();
  }
  /**
   * Protobuf type {@code GIGOAENFOGN}
   */
  public static final class GIGOAENFOGN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GIGOAENFOGN)
      GIGOAENFOGNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GIGOAENFOGN.newBuilder() to construct.
    private GIGOAENFOGN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GIGOAENFOGN() {
      attackTag_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GIGOAENFOGN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GIGOAENFOGN(
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

              eJOIOADINHE_ = input.readUInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              attackTag_ = s;
              break;
            }
            case 48: {

              jDPELIFFANG_ = input.readUInt32();
              break;
            }
            case 72: {

              kCLGEKJLKNM_ = input.readInt32();
              break;
            }
            case 82: {
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder subBuilder = null;
              if (abilityName_ != null) {
                subBuilder = abilityName_.toBuilder();
              }
              abilityName_ = input.readMessage(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(abilityName_);
                abilityName_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              hDDNCAOOFEL_ = input.readInt32();
              break;
            }
            case 120: {

              pEKOBOEODCF_ = input.readInt32();
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
      return emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.internal_static_GIGOAENFOGN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.internal_static_GIGOAENFOGN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN.class, emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN.Builder.class);
    }

    public static final int ATTACK_TAG_FIELD_NUMBER = 5;
    private volatile java.lang.Object attackTag_;
    /**
     * <code>string attack_tag = 5;</code>
     * @return The attackTag.
     */
    @java.lang.Override
    public java.lang.String getAttackTag() {
      java.lang.Object ref = attackTag_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attackTag_ = s;
        return s;
      }
    }
    /**
     * <code>string attack_tag = 5;</code>
     * @return The bytes for attackTag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAttackTagBytes() {
      java.lang.Object ref = attackTag_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attackTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HDDNCAOOFEL_FIELD_NUMBER = 14;
    private int hDDNCAOOFEL_;
    /**
     * <code>int32 HDDNCAOOFEL = 14;</code>
     * @return The hDDNCAOOFEL.
     */
    @java.lang.Override
    public int getHDDNCAOOFEL() {
      return hDDNCAOOFEL_;
    }

    public static final int ABILITY_NAME_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString abilityName_;
    /**
     * <code>.AbilityString ability_name = 10;</code>
     * @return Whether the abilityName field is set.
     */
    @java.lang.Override
    public boolean hasAbilityName() {
      return abilityName_ != null;
    }
    /**
     * <code>.AbilityString ability_name = 10;</code>
     * @return The abilityName.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getAbilityName() {
      return abilityName_ == null ? emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityName_;
    }
    /**
     * <code>.AbilityString ability_name = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder() {
      return getAbilityName();
    }

    public static final int PEKOBOEODCF_FIELD_NUMBER = 15;
    private int pEKOBOEODCF_;
    /**
     * <code>int32 PEKOBOEODCF = 15;</code>
     * @return The pEKOBOEODCF.
     */
    @java.lang.Override
    public int getPEKOBOEODCF() {
      return pEKOBOEODCF_;
    }

    public static final int KCLGEKJLKNM_FIELD_NUMBER = 9;
    private int kCLGEKJLKNM_;
    /**
     * <code>int32 KCLGEKJLKNM = 9;</code>
     * @return The kCLGEKJLKNM.
     */
    @java.lang.Override
    public int getKCLGEKJLKNM() {
      return kCLGEKJLKNM_;
    }

    public static final int JDPELIFFANG_FIELD_NUMBER = 6;
    private int jDPELIFFANG_;
    /**
     * <code>uint32 JDPELIFFANG = 6;</code>
     * @return The jDPELIFFANG.
     */
    @java.lang.Override
    public int getJDPELIFFANG() {
      return jDPELIFFANG_;
    }

    public static final int EJOIOADINHE_FIELD_NUMBER = 2;
    private int eJOIOADINHE_;
    /**
     * <code>uint32 EJOIOADINHE = 2;</code>
     * @return The eJOIOADINHE.
     */
    @java.lang.Override
    public int getEJOIOADINHE() {
      return eJOIOADINHE_;
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
      if (eJOIOADINHE_ != 0) {
        output.writeUInt32(2, eJOIOADINHE_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attackTag_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, attackTag_);
      }
      if (jDPELIFFANG_ != 0) {
        output.writeUInt32(6, jDPELIFFANG_);
      }
      if (kCLGEKJLKNM_ != 0) {
        output.writeInt32(9, kCLGEKJLKNM_);
      }
      if (abilityName_ != null) {
        output.writeMessage(10, getAbilityName());
      }
      if (hDDNCAOOFEL_ != 0) {
        output.writeInt32(14, hDDNCAOOFEL_);
      }
      if (pEKOBOEODCF_ != 0) {
        output.writeInt32(15, pEKOBOEODCF_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eJOIOADINHE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, eJOIOADINHE_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attackTag_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, attackTag_);
      }
      if (jDPELIFFANG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, jDPELIFFANG_);
      }
      if (kCLGEKJLKNM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, kCLGEKJLKNM_);
      }
      if (abilityName_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getAbilityName());
      }
      if (hDDNCAOOFEL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, hDDNCAOOFEL_);
      }
      if (pEKOBOEODCF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, pEKOBOEODCF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN other = (emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN) obj;

      if (!getAttackTag()
          .equals(other.getAttackTag())) return false;
      if (getHDDNCAOOFEL()
          != other.getHDDNCAOOFEL()) return false;
      if (hasAbilityName() != other.hasAbilityName()) return false;
      if (hasAbilityName()) {
        if (!getAbilityName()
            .equals(other.getAbilityName())) return false;
      }
      if (getPEKOBOEODCF()
          != other.getPEKOBOEODCF()) return false;
      if (getKCLGEKJLKNM()
          != other.getKCLGEKJLKNM()) return false;
      if (getJDPELIFFANG()
          != other.getJDPELIFFANG()) return false;
      if (getEJOIOADINHE()
          != other.getEJOIOADINHE()) return false;
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
      hash = (37 * hash) + ATTACK_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getAttackTag().hashCode();
      hash = (37 * hash) + HDDNCAOOFEL_FIELD_NUMBER;
      hash = (53 * hash) + getHDDNCAOOFEL();
      if (hasAbilityName()) {
        hash = (37 * hash) + ABILITY_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityName().hashCode();
      }
      hash = (37 * hash) + PEKOBOEODCF_FIELD_NUMBER;
      hash = (53 * hash) + getPEKOBOEODCF();
      hash = (37 * hash) + KCLGEKJLKNM_FIELD_NUMBER;
      hash = (53 * hash) + getKCLGEKJLKNM();
      hash = (37 * hash) + JDPELIFFANG_FIELD_NUMBER;
      hash = (53 * hash) + getJDPELIFFANG();
      hash = (37 * hash) + EJOIOADINHE_FIELD_NUMBER;
      hash = (53 * hash) + getEJOIOADINHE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN prototype) {
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
     * Protobuf type {@code GIGOAENFOGN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GIGOAENFOGN)
        emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.internal_static_GIGOAENFOGN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.internal_static_GIGOAENFOGN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN.class, emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN.newBuilder()
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
        attackTag_ = "";

        hDDNCAOOFEL_ = 0;

        if (abilityNameBuilder_ == null) {
          abilityName_ = null;
        } else {
          abilityName_ = null;
          abilityNameBuilder_ = null;
        }
        pEKOBOEODCF_ = 0;

        kCLGEKJLKNM_ = 0;

        jDPELIFFANG_ = 0;

        eJOIOADINHE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.internal_static_GIGOAENFOGN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN build() {
        emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN buildPartial() {
        emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN result = new emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN(this);
        result.attackTag_ = attackTag_;
        result.hDDNCAOOFEL_ = hDDNCAOOFEL_;
        if (abilityNameBuilder_ == null) {
          result.abilityName_ = abilityName_;
        } else {
          result.abilityName_ = abilityNameBuilder_.build();
        }
        result.pEKOBOEODCF_ = pEKOBOEODCF_;
        result.kCLGEKJLKNM_ = kCLGEKJLKNM_;
        result.jDPELIFFANG_ = jDPELIFFANG_;
        result.eJOIOADINHE_ = eJOIOADINHE_;
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
        if (other instanceof emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN) {
          return mergeFrom((emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN other) {
        if (other == emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN.getDefaultInstance()) return this;
        if (!other.getAttackTag().isEmpty()) {
          attackTag_ = other.attackTag_;
          onChanged();
        }
        if (other.getHDDNCAOOFEL() != 0) {
          setHDDNCAOOFEL(other.getHDDNCAOOFEL());
        }
        if (other.hasAbilityName()) {
          mergeAbilityName(other.getAbilityName());
        }
        if (other.getPEKOBOEODCF() != 0) {
          setPEKOBOEODCF(other.getPEKOBOEODCF());
        }
        if (other.getKCLGEKJLKNM() != 0) {
          setKCLGEKJLKNM(other.getKCLGEKJLKNM());
        }
        if (other.getJDPELIFFANG() != 0) {
          setJDPELIFFANG(other.getJDPELIFFANG());
        }
        if (other.getEJOIOADINHE() != 0) {
          setEJOIOADINHE(other.getEJOIOADINHE());
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
        emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object attackTag_ = "";
      /**
       * <code>string attack_tag = 5;</code>
       * @return The attackTag.
       */
      public java.lang.String getAttackTag() {
        java.lang.Object ref = attackTag_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          attackTag_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string attack_tag = 5;</code>
       * @return The bytes for attackTag.
       */
      public com.google.protobuf.ByteString
          getAttackTagBytes() {
        java.lang.Object ref = attackTag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          attackTag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string attack_tag = 5;</code>
       * @param value The attackTag to set.
       * @return This builder for chaining.
       */
      public Builder setAttackTag(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        attackTag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string attack_tag = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAttackTag() {
        
        attackTag_ = getDefaultInstance().getAttackTag();
        onChanged();
        return this;
      }
      /**
       * <code>string attack_tag = 5;</code>
       * @param value The bytes for attackTag to set.
       * @return This builder for chaining.
       */
      public Builder setAttackTagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        attackTag_ = value;
        onChanged();
        return this;
      }

      private int hDDNCAOOFEL_ ;
      /**
       * <code>int32 HDDNCAOOFEL = 14;</code>
       * @return The hDDNCAOOFEL.
       */
      @java.lang.Override
      public int getHDDNCAOOFEL() {
        return hDDNCAOOFEL_;
      }
      /**
       * <code>int32 HDDNCAOOFEL = 14;</code>
       * @param value The hDDNCAOOFEL to set.
       * @return This builder for chaining.
       */
      public Builder setHDDNCAOOFEL(int value) {
        
        hDDNCAOOFEL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 HDDNCAOOFEL = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearHDDNCAOOFEL() {
        
        hDDNCAOOFEL_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString abilityName_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder> abilityNameBuilder_;
      /**
       * <code>.AbilityString ability_name = 10;</code>
       * @return Whether the abilityName field is set.
       */
      public boolean hasAbilityName() {
        return abilityNameBuilder_ != null || abilityName_ != null;
      }
      /**
       * <code>.AbilityString ability_name = 10;</code>
       * @return The abilityName.
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getAbilityName() {
        if (abilityNameBuilder_ == null) {
          return abilityName_ == null ? emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityName_;
        } else {
          return abilityNameBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityString ability_name = 10;</code>
       */
      public Builder setAbilityName(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString value) {
        if (abilityNameBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityName_ = value;
          onChanged();
        } else {
          abilityNameBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 10;</code>
       */
      public Builder setAbilityName(
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder builderForValue) {
        if (abilityNameBuilder_ == null) {
          abilityName_ = builderForValue.build();
          onChanged();
        } else {
          abilityNameBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 10;</code>
       */
      public Builder mergeAbilityName(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString value) {
        if (abilityNameBuilder_ == null) {
          if (abilityName_ != null) {
            abilityName_ =
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.newBuilder(abilityName_).mergeFrom(value).buildPartial();
          } else {
            abilityName_ = value;
          }
          onChanged();
        } else {
          abilityNameBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 10;</code>
       */
      public Builder clearAbilityName() {
        if (abilityNameBuilder_ == null) {
          abilityName_ = null;
          onChanged();
        } else {
          abilityName_ = null;
          abilityNameBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 10;</code>
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder getAbilityNameBuilder() {
        
        onChanged();
        return getAbilityNameFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityString ability_name = 10;</code>
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder() {
        if (abilityNameBuilder_ != null) {
          return abilityNameBuilder_.getMessageOrBuilder();
        } else {
          return abilityName_ == null ?
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityName_;
        }
      }
      /**
       * <code>.AbilityString ability_name = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder> 
          getAbilityNameFieldBuilder() {
        if (abilityNameBuilder_ == null) {
          abilityNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder>(
                  getAbilityName(),
                  getParentForChildren(),
                  isClean());
          abilityName_ = null;
        }
        return abilityNameBuilder_;
      }

      private int pEKOBOEODCF_ ;
      /**
       * <code>int32 PEKOBOEODCF = 15;</code>
       * @return The pEKOBOEODCF.
       */
      @java.lang.Override
      public int getPEKOBOEODCF() {
        return pEKOBOEODCF_;
      }
      /**
       * <code>int32 PEKOBOEODCF = 15;</code>
       * @param value The pEKOBOEODCF to set.
       * @return This builder for chaining.
       */
      public Builder setPEKOBOEODCF(int value) {
        
        pEKOBOEODCF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 PEKOBOEODCF = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearPEKOBOEODCF() {
        
        pEKOBOEODCF_ = 0;
        onChanged();
        return this;
      }

      private int kCLGEKJLKNM_ ;
      /**
       * <code>int32 KCLGEKJLKNM = 9;</code>
       * @return The kCLGEKJLKNM.
       */
      @java.lang.Override
      public int getKCLGEKJLKNM() {
        return kCLGEKJLKNM_;
      }
      /**
       * <code>int32 KCLGEKJLKNM = 9;</code>
       * @param value The kCLGEKJLKNM to set.
       * @return This builder for chaining.
       */
      public Builder setKCLGEKJLKNM(int value) {
        
        kCLGEKJLKNM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 KCLGEKJLKNM = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearKCLGEKJLKNM() {
        
        kCLGEKJLKNM_ = 0;
        onChanged();
        return this;
      }

      private int jDPELIFFANG_ ;
      /**
       * <code>uint32 JDPELIFFANG = 6;</code>
       * @return The jDPELIFFANG.
       */
      @java.lang.Override
      public int getJDPELIFFANG() {
        return jDPELIFFANG_;
      }
      /**
       * <code>uint32 JDPELIFFANG = 6;</code>
       * @param value The jDPELIFFANG to set.
       * @return This builder for chaining.
       */
      public Builder setJDPELIFFANG(int value) {
        
        jDPELIFFANG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JDPELIFFANG = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearJDPELIFFANG() {
        
        jDPELIFFANG_ = 0;
        onChanged();
        return this;
      }

      private int eJOIOADINHE_ ;
      /**
       * <code>uint32 EJOIOADINHE = 2;</code>
       * @return The eJOIOADINHE.
       */
      @java.lang.Override
      public int getEJOIOADINHE() {
        return eJOIOADINHE_;
      }
      /**
       * <code>uint32 EJOIOADINHE = 2;</code>
       * @param value The eJOIOADINHE to set.
       * @return This builder for chaining.
       */
      public Builder setEJOIOADINHE(int value) {
        
        eJOIOADINHE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EJOIOADINHE = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEJOIOADINHE() {
        
        eJOIOADINHE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GIGOAENFOGN)
    }

    // @@protoc_insertion_point(class_scope:GIGOAENFOGN)
    private static final emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN();
    }

    public static emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GIGOAENFOGN>
        PARSER = new com.google.protobuf.AbstractParser<GIGOAENFOGN>() {
      @java.lang.Override
      public GIGOAENFOGN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GIGOAENFOGN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GIGOAENFOGN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GIGOAENFOGN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GIGOAENFOGNOuterClass.GIGOAENFOGN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GIGOAENFOGN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GIGOAENFOGN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GIGOAENFOGN.proto\032\023AbilityString.proto" +
      "\"\260\001\n\013GIGOAENFOGN\022\022\n\nattack_tag\030\005 \001(\t\022\023\n\013" +
      "HDDNCAOOFEL\030\016 \001(\005\022$\n\014ability_name\030\n \001(\0132" +
      "\016.AbilityString\022\023\n\013PEKOBOEODCF\030\017 \001(\005\022\023\n\013" +
      "KCLGEKJLKNM\030\t \001(\005\022\023\n\013JDPELIFFANG\030\006 \001(\r\022\023" +
      "\n\013EJOIOADINHE\030\002 \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilityStringOuterClass.getDescriptor(),
        });
    internal_static_GIGOAENFOGN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GIGOAENFOGN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GIGOAENFOGN_descriptor,
        new java.lang.String[] { "AttackTag", "HDDNCAOOFEL", "AbilityName", "PEKOBOEODCF", "KCLGEKJLKNM", "JDPELIFFANG", "EJOIOADINHE", });
    emu.grasscutter.net.proto.AbilityStringOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
