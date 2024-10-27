// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamEnterSceneInfo.proto

package emu.grasscutter.net.proto;

public final class TeamEnterSceneInfoOuterClass {
  private TeamEnterSceneInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamEnterSceneInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamEnterSceneInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 team_entity_id = 5;</code>
     * @return The teamEntityId.
     */
    int getTeamEntityId();

    /**
     * <code>.AbilityControlBlock ability_control_block = 7;</code>
     * @return Whether the abilityControlBlock field is set.
     */
    boolean hasAbilityControlBlock();
    /**
     * <code>.AbilityControlBlock ability_control_block = 7;</code>
     * @return The abilityControlBlock.
     */
    emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock();
    /**
     * <code>.AbilityControlBlock ability_control_block = 7;</code>
     */
    emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder();

    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
     * @return Whether the teamAbilityInfo field is set.
     */
    boolean hasTeamAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
     * @return The teamAbilityInfo.
     */
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
     */
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder();
  }
  /**
   * <pre>
   * Obf: PMLNKMHJPKI
   * </pre>
   *
   * Protobuf type {@code TeamEnterSceneInfo}
   */
  public static final class TeamEnterSceneInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamEnterSceneInfo)
      TeamEnterSceneInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamEnterSceneInfo.newBuilder() to construct.
    private TeamEnterSceneInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamEnterSceneInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamEnterSceneInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TeamEnterSceneInfo(
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
            case 40: {

              teamEntityId_ = input.readUInt32();
              break;
            }
            case 58: {
              emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder subBuilder = null;
              if (abilityControlBlock_ != null) {
                subBuilder = abilityControlBlock_.toBuilder();
              }
              abilityControlBlock_ = input.readMessage(emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(abilityControlBlock_);
                abilityControlBlock_ = subBuilder.buildPartial();
              }

              break;
            }
            case 66: {
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
              if (teamAbilityInfo_ != null) {
                subBuilder = teamAbilityInfo_.toBuilder();
              }
              teamAbilityInfo_ = input.readMessage(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(teamAbilityInfo_);
                teamAbilityInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.class, emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder.class);
    }

    public static final int TEAM_ENTITY_ID_FIELD_NUMBER = 5;
    private int teamEntityId_;
    /**
     * <code>uint32 team_entity_id = 5;</code>
     * @return The teamEntityId.
     */
    @java.lang.Override
    public int getTeamEntityId() {
      return teamEntityId_;
    }

    public static final int ABILITY_CONTROL_BLOCK_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
    /**
     * <code>.AbilityControlBlock ability_control_block = 7;</code>
     * @return Whether the abilityControlBlock field is set.
     */
    @java.lang.Override
    public boolean hasAbilityControlBlock() {
      return abilityControlBlock_ != null;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 7;</code>
     * @return The abilityControlBlock.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
      return abilityControlBlock_ == null ? emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
      return getAbilityControlBlock();
    }

    public static final int TEAM_ABILITY_INFO_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
     * @return Whether the teamAbilityInfo field is set.
     */
    @java.lang.Override
    public boolean hasTeamAbilityInfo() {
      return teamAbilityInfo_ != null;
    }
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
     * @return The teamAbilityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo() {
      return teamAbilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : teamAbilityInfo_;
    }
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder() {
      return getTeamAbilityInfo();
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
      if (teamEntityId_ != 0) {
        output.writeUInt32(5, teamEntityId_);
      }
      if (abilityControlBlock_ != null) {
        output.writeMessage(7, getAbilityControlBlock());
      }
      if (teamAbilityInfo_ != null) {
        output.writeMessage(8, getTeamAbilityInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (teamEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, teamEntityId_);
      }
      if (abilityControlBlock_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getAbilityControlBlock());
      }
      if (teamAbilityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getTeamAbilityInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo other = (emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo) obj;

      if (getTeamEntityId()
          != other.getTeamEntityId()) return false;
      if (hasAbilityControlBlock() != other.hasAbilityControlBlock()) return false;
      if (hasAbilityControlBlock()) {
        if (!getAbilityControlBlock()
            .equals(other.getAbilityControlBlock())) return false;
      }
      if (hasTeamAbilityInfo() != other.hasTeamAbilityInfo()) return false;
      if (hasTeamAbilityInfo()) {
        if (!getTeamAbilityInfo()
            .equals(other.getTeamAbilityInfo())) return false;
      }
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
      hash = (37 * hash) + TEAM_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamEntityId();
      if (hasAbilityControlBlock()) {
        hash = (37 * hash) + ABILITY_CONTROL_BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityControlBlock().hashCode();
      }
      if (hasTeamAbilityInfo()) {
        hash = (37 * hash) + TEAM_ABILITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getTeamAbilityInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo prototype) {
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
     * Obf: PMLNKMHJPKI
     * </pre>
     *
     * Protobuf type {@code TeamEnterSceneInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamEnterSceneInfo)
        emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.class, emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.newBuilder()
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
        teamEntityId_ = 0;

        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = null;
        } else {
          abilityControlBlock_ = null;
          abilityControlBlockBuilder_ = null;
        }
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfo_ = null;
        } else {
          teamAbilityInfo_ = null;
          teamAbilityInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo build() {
        emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo buildPartial() {
        emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo result = new emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo(this);
        result.teamEntityId_ = teamEntityId_;
        if (abilityControlBlockBuilder_ == null) {
          result.abilityControlBlock_ = abilityControlBlock_;
        } else {
          result.abilityControlBlock_ = abilityControlBlockBuilder_.build();
        }
        if (teamAbilityInfoBuilder_ == null) {
          result.teamAbilityInfo_ = teamAbilityInfo_;
        } else {
          result.teamAbilityInfo_ = teamAbilityInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo) {
          return mergeFrom((emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo other) {
        if (other == emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.getDefaultInstance()) return this;
        if (other.getTeamEntityId() != 0) {
          setTeamEntityId(other.getTeamEntityId());
        }
        if (other.hasAbilityControlBlock()) {
          mergeAbilityControlBlock(other.getAbilityControlBlock());
        }
        if (other.hasTeamAbilityInfo()) {
          mergeTeamAbilityInfo(other.getTeamAbilityInfo());
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
        emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int teamEntityId_ ;
      /**
       * <code>uint32 team_entity_id = 5;</code>
       * @return The teamEntityId.
       */
      @java.lang.Override
      public int getTeamEntityId() {
        return teamEntityId_;
      }
      /**
       * <code>uint32 team_entity_id = 5;</code>
       * @param value The teamEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamEntityId(int value) {
        
        teamEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 team_entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamEntityId() {
        
        teamEntityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> abilityControlBlockBuilder_;
      /**
       * <code>.AbilityControlBlock ability_control_block = 7;</code>
       * @return Whether the abilityControlBlock field is set.
       */
      public boolean hasAbilityControlBlock() {
        return abilityControlBlockBuilder_ != null || abilityControlBlock_ != null;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 7;</code>
       * @return The abilityControlBlock.
       */
      public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
        if (abilityControlBlockBuilder_ == null) {
          return abilityControlBlock_ == null ? emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
        } else {
          return abilityControlBlockBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 7;</code>
       */
      public Builder setAbilityControlBlock(emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock value) {
        if (abilityControlBlockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityControlBlock_ = value;
          onChanged();
        } else {
          abilityControlBlockBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 7;</code>
       */
      public Builder setAbilityControlBlock(
          emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder builderForValue) {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = builderForValue.build();
          onChanged();
        } else {
          abilityControlBlockBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 7;</code>
       */
      public Builder mergeAbilityControlBlock(emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock value) {
        if (abilityControlBlockBuilder_ == null) {
          if (abilityControlBlock_ != null) {
            abilityControlBlock_ =
              emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.newBuilder(abilityControlBlock_).mergeFrom(value).buildPartial();
          } else {
            abilityControlBlock_ = value;
          }
          onChanged();
        } else {
          abilityControlBlockBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 7;</code>
       */
      public Builder clearAbilityControlBlock() {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = null;
          onChanged();
        } else {
          abilityControlBlock_ = null;
          abilityControlBlockBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 7;</code>
       */
      public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder getAbilityControlBlockBuilder() {
        
        onChanged();
        return getAbilityControlBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 7;</code>
       */
      public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
        if (abilityControlBlockBuilder_ != null) {
          return abilityControlBlockBuilder_.getMessageOrBuilder();
        } else {
          return abilityControlBlock_ == null ?
              emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
        }
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> 
          getAbilityControlBlockFieldBuilder() {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder>(
                  getAbilityControlBlock(),
                  getParentForChildren(),
                  isClean());
          abilityControlBlock_ = null;
        }
        return abilityControlBlockBuilder_;
      }

      private emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> teamAbilityInfoBuilder_;
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
       * @return Whether the teamAbilityInfo field is set.
       */
      public boolean hasTeamAbilityInfo() {
        return teamAbilityInfoBuilder_ != null || teamAbilityInfo_ != null;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
       * @return The teamAbilityInfo.
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo() {
        if (teamAbilityInfoBuilder_ == null) {
          return teamAbilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : teamAbilityInfo_;
        } else {
          return teamAbilityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
       */
      public Builder setTeamAbilityInfo(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (teamAbilityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          teamAbilityInfo_ = value;
          onChanged();
        } else {
          teamAbilityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
       */
      public Builder setTeamAbilityInfo(
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfo_ = builderForValue.build();
          onChanged();
        } else {
          teamAbilityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
       */
      public Builder mergeTeamAbilityInfo(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (teamAbilityInfoBuilder_ == null) {
          if (teamAbilityInfo_ != null) {
            teamAbilityInfo_ =
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(teamAbilityInfo_).mergeFrom(value).buildPartial();
          } else {
            teamAbilityInfo_ = value;
          }
          onChanged();
        } else {
          teamAbilityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
       */
      public Builder clearTeamAbilityInfo() {
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfo_ = null;
          onChanged();
        } else {
          teamAbilityInfo_ = null;
          teamAbilityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getTeamAbilityInfoBuilder() {
        
        onChanged();
        return getTeamAbilityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder() {
        if (teamAbilityInfoBuilder_ != null) {
          return teamAbilityInfoBuilder_.getMessageOrBuilder();
        } else {
          return teamAbilityInfo_ == null ?
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : teamAbilityInfo_;
        }
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> 
          getTeamAbilityInfoFieldBuilder() {
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(
                  getTeamAbilityInfo(),
                  getParentForChildren(),
                  isClean());
          teamAbilityInfo_ = null;
        }
        return teamAbilityInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TeamEnterSceneInfo)
    }

    // @@protoc_insertion_point(class_scope:TeamEnterSceneInfo)
    private static final emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo();
    }

    public static emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamEnterSceneInfo>
        PARSER = new com.google.protobuf.AbstractParser<TeamEnterSceneInfo>() {
      @java.lang.Override
      public TeamEnterSceneInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamEnterSceneInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TeamEnterSceneInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamEnterSceneInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamEnterSceneInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamEnterSceneInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030TeamEnterSceneInfo.proto\032\031AbilityContr" +
      "olBlock.proto\032\032AbilitySyncStateInfo.prot" +
      "o\"\223\001\n\022TeamEnterSceneInfo\022\026\n\016team_entity_" +
      "id\030\005 \001(\r\0223\n\025ability_control_block\030\007 \001(\0132" +
      "\024.AbilityControlBlock\0220\n\021team_ability_in" +
      "fo\030\010 \001(\0132\025.AbilitySyncStateInfoB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilityControlBlockOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.getDescriptor(),
        });
    internal_static_TeamEnterSceneInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamEnterSceneInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamEnterSceneInfo_descriptor,
        new java.lang.String[] { "TeamEntityId", "AbilityControlBlock", "TeamAbilityInfo", });
    emu.grasscutter.net.proto.AbilityControlBlockOuterClass.getDescriptor();
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
