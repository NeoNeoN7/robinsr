// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV2DungeonInfoNotify.proto

package emu.grasscutter.net.proto;

public final class EffigyChallengeV2DungeonInfoNotifyOuterClass {
  private EffigyChallengeV2DungeonInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeV2DungeonInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeV2DungeonInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 challenge_mode_difficulty = 12;</code>
     * @return The challengeModeDifficulty.
     */
    int getChallengeModeDifficulty();

    /**
     * <code>uint32 skill_no = 2;</code>
     * @return The skillNo.
     */
    int getSkillNo();
  }
  /**
   * <pre>
   * CmdId: 25353
   * Obf: KLKEPODPBIL
   * </pre>
   *
   * Protobuf type {@code EffigyChallengeV2DungeonInfoNotify}
   */
  public static final class EffigyChallengeV2DungeonInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeV2DungeonInfoNotify)
      EffigyChallengeV2DungeonInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeV2DungeonInfoNotify.newBuilder() to construct.
    private EffigyChallengeV2DungeonInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeV2DungeonInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeV2DungeonInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EffigyChallengeV2DungeonInfoNotify(
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

              skillNo_ = input.readUInt32();
              break;
            }
            case 40: {

              levelId_ = input.readUInt32();
              break;
            }
            case 96: {

              challengeModeDifficulty_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.class, emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 5;
    private int levelId_;
    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER = 12;
    private int challengeModeDifficulty_;
    /**
     * <code>uint32 challenge_mode_difficulty = 12;</code>
     * @return The challengeModeDifficulty.
     */
    @java.lang.Override
    public int getChallengeModeDifficulty() {
      return challengeModeDifficulty_;
    }

    public static final int SKILL_NO_FIELD_NUMBER = 2;
    private int skillNo_;
    /**
     * <code>uint32 skill_no = 2;</code>
     * @return The skillNo.
     */
    @java.lang.Override
    public int getSkillNo() {
      return skillNo_;
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
      if (skillNo_ != 0) {
        output.writeUInt32(2, skillNo_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(5, levelId_);
      }
      if (challengeModeDifficulty_ != 0) {
        output.writeUInt32(12, challengeModeDifficulty_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, skillNo_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, levelId_);
      }
      if (challengeModeDifficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, challengeModeDifficulty_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify other = (emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getChallengeModeDifficulty()
          != other.getChallengeModeDifficulty()) return false;
      if (getSkillNo()
          != other.getSkillNo()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeModeDifficulty();
      hash = (37 * hash) + SKILL_NO_FIELD_NUMBER;
      hash = (53 * hash) + getSkillNo();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify prototype) {
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
     * CmdId: 25353
     * Obf: KLKEPODPBIL
     * </pre>
     *
     * Protobuf type {@code EffigyChallengeV2DungeonInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeV2DungeonInfoNotify)
        emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.class, emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.newBuilder()
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
        levelId_ = 0;

        challengeModeDifficulty_ = 0;

        skillNo_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify build() {
        emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify buildPartial() {
        emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify result = new emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify(this);
        result.levelId_ = levelId_;
        result.challengeModeDifficulty_ = challengeModeDifficulty_;
        result.skillNo_ = skillNo_;
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
        if (other instanceof emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify other) {
        if (other == emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getChallengeModeDifficulty() != 0) {
          setChallengeModeDifficulty(other.getChallengeModeDifficulty());
        }
        if (other.getSkillNo() != 0) {
          setSkillNo(other.getSkillNo());
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
        emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 5;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int challengeModeDifficulty_ ;
      /**
       * <code>uint32 challenge_mode_difficulty = 12;</code>
       * @return The challengeModeDifficulty.
       */
      @java.lang.Override
      public int getChallengeModeDifficulty() {
        return challengeModeDifficulty_;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 12;</code>
       * @param value The challengeModeDifficulty to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeModeDifficulty(int value) {
        
        challengeModeDifficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeModeDifficulty() {
        
        challengeModeDifficulty_ = 0;
        onChanged();
        return this;
      }

      private int skillNo_ ;
      /**
       * <code>uint32 skill_no = 2;</code>
       * @return The skillNo.
       */
      @java.lang.Override
      public int getSkillNo() {
        return skillNo_;
      }
      /**
       * <code>uint32 skill_no = 2;</code>
       * @param value The skillNo to set.
       * @return This builder for chaining.
       */
      public Builder setSkillNo(int value) {
        
        skillNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_no = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillNo() {
        
        skillNo_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeV2DungeonInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeV2DungeonInfoNotify)
    private static final emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify();
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeV2DungeonInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeV2DungeonInfoNotify>() {
      @java.lang.Override
      public EffigyChallengeV2DungeonInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EffigyChallengeV2DungeonInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EffigyChallengeV2DungeonInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeV2DungeonInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeV2DungeonInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(EffigyChallengeV2DungeonInfoNotify.pro" +
      "to\"k\n\"EffigyChallengeV2DungeonInfoNotify" +
      "\022\020\n\010level_id\030\005 \001(\r\022!\n\031challenge_mode_dif" +
      "ficulty\030\014 \001(\r\022\020\n\010skill_no\030\002 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeV2DungeonInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor,
        new java.lang.String[] { "LevelId", "ChallengeModeDifficulty", "SkillNo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
