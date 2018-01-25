/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompactContact implements org.apache.thrift.TBase<CompactContact, CompactContact._Fields>, java.io.Serializable, Cloneable, Comparable<CompactContact> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CompactContact");

  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField MODIFIED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("modifiedTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("settings", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_OVERRIDDEN_FIELD_DESC = new org.apache.thrift.protocol.TField("displayNameOverridden", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CompactContactStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CompactContactTupleSchemeFactory());
  }

  public String mid; // required
  public long createdTime; // required
  public long modifiedTime; // required
  /**
   * 
   * @see ContactStatus
   */
  public ContactStatus status; // required
  public long settings; // required
  public String displayNameOverridden; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MID((short)1, "mid"),
    CREATED_TIME((short)2, "createdTime"),
    MODIFIED_TIME((short)3, "modifiedTime"),
    /**
     * 
     * @see ContactStatus
     */
    STATUS((short)4, "status"),
    SETTINGS((short)5, "settings"),
    DISPLAY_NAME_OVERRIDDEN((short)6, "displayNameOverridden");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MID
          return MID;
        case 2: // CREATED_TIME
          return CREATED_TIME;
        case 3: // MODIFIED_TIME
          return MODIFIED_TIME;
        case 4: // STATUS
          return STATUS;
        case 5: // SETTINGS
          return SETTINGS;
        case 6: // DISPLAY_NAME_OVERRIDDEN
          return DISPLAY_NAME_OVERRIDDEN;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __MODIFIEDTIME_ISSET_ID = 1;
  private static final int __SETTINGS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MODIFIED_TIME, new org.apache.thrift.meta_data.FieldMetaData("modifiedTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ContactStatus.class)));
    tmpMap.put(_Fields.SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("settings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DISPLAY_NAME_OVERRIDDEN, new org.apache.thrift.meta_data.FieldMetaData("displayNameOverridden", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CompactContact.class, metaDataMap);
  }

  public CompactContact() {
  }

  public CompactContact(
    String mid,
    long createdTime,
    long modifiedTime,
    ContactStatus status,
    long settings,
    String displayNameOverridden)
  {
    this();
    this.mid = mid;
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.modifiedTime = modifiedTime;
    setModifiedTimeIsSet(true);
    this.status = status;
    this.settings = settings;
    setSettingsIsSet(true);
    this.displayNameOverridden = displayNameOverridden;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CompactContact(CompactContact other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    this.createdTime = other.createdTime;
    this.modifiedTime = other.modifiedTime;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    this.settings = other.settings;
    if (other.isSetDisplayNameOverridden()) {
      this.displayNameOverridden = other.displayNameOverridden;
    }
  }

  public CompactContact deepCopy() {
    return new CompactContact(this);
  }

  @Override
  public void clear() {
    this.mid = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    setModifiedTimeIsSet(false);
    this.modifiedTime = 0;
    this.status = null;
    setSettingsIsSet(false);
    this.settings = 0;
    this.displayNameOverridden = null;
  }

  public String getMid() {
    return this.mid;
  }

  public CompactContact setMid(String mid) {
    this.mid = mid;
    return this;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public CompactContact setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  public long getModifiedTime() {
    return this.modifiedTime;
  }

  public CompactContact setModifiedTime(long modifiedTime) {
    this.modifiedTime = modifiedTime;
    setModifiedTimeIsSet(true);
    return this;
  }

  public void unsetModifiedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MODIFIEDTIME_ISSET_ID);
  }

  /** Returns true if field modifiedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetModifiedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __MODIFIEDTIME_ISSET_ID);
  }

  public void setModifiedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MODIFIEDTIME_ISSET_ID, value);
  }

  /**
   * 
   * @see ContactStatus
   */
  public ContactStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see ContactStatus
   */
  public CompactContact setStatus(ContactStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public long getSettings() {
    return this.settings;
  }

  public CompactContact setSettings(long settings) {
    this.settings = settings;
    setSettingsIsSet(true);
    return this;
  }

  public void unsetSettings() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SETTINGS_ISSET_ID);
  }

  /** Returns true if field settings is set (has been assigned a value) and false otherwise */
  public boolean isSetSettings() {
    return EncodingUtils.testBit(__isset_bitfield, __SETTINGS_ISSET_ID);
  }

  public void setSettingsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SETTINGS_ISSET_ID, value);
  }

  public String getDisplayNameOverridden() {
    return this.displayNameOverridden;
  }

  public CompactContact setDisplayNameOverridden(String displayNameOverridden) {
    this.displayNameOverridden = displayNameOverridden;
    return this;
  }

  public void unsetDisplayNameOverridden() {
    this.displayNameOverridden = null;
  }

  /** Returns true if field displayNameOverridden is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayNameOverridden() {
    return this.displayNameOverridden != null;
  }

  public void setDisplayNameOverriddenIsSet(boolean value) {
    if (!value) {
      this.displayNameOverridden = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MID:
      if (value == null) {
        unsetMid();
      } else {
        setMid((String)value);
      }
      break;

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((Long)value);
      }
      break;

    case MODIFIED_TIME:
      if (value == null) {
        unsetModifiedTime();
      } else {
        setModifiedTime((Long)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((ContactStatus)value);
      }
      break;

    case SETTINGS:
      if (value == null) {
        unsetSettings();
      } else {
        setSettings((Long)value);
      }
      break;

    case DISPLAY_NAME_OVERRIDDEN:
      if (value == null) {
        unsetDisplayNameOverridden();
      } else {
        setDisplayNameOverridden((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MID:
      return getMid();

    case CREATED_TIME:
      return Long.valueOf(getCreatedTime());

    case MODIFIED_TIME:
      return Long.valueOf(getModifiedTime());

    case STATUS:
      return getStatus();

    case SETTINGS:
      return Long.valueOf(getSettings());

    case DISPLAY_NAME_OVERRIDDEN:
      return getDisplayNameOverridden();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MID:
      return isSetMid();
    case CREATED_TIME:
      return isSetCreatedTime();
    case MODIFIED_TIME:
      return isSetModifiedTime();
    case STATUS:
      return isSetStatus();
    case SETTINGS:
      return isSetSettings();
    case DISPLAY_NAME_OVERRIDDEN:
      return isSetDisplayNameOverridden();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CompactContact)
      return this.equals((CompactContact)that);
    return false;
  }

  public boolean equals(CompactContact that) {
    if (that == null)
      return false;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_modifiedTime = true;
    boolean that_present_modifiedTime = true;
    if (this_present_modifiedTime || that_present_modifiedTime) {
      if (!(this_present_modifiedTime && that_present_modifiedTime))
        return false;
      if (this.modifiedTime != that.modifiedTime)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_settings = true;
    boolean that_present_settings = true;
    if (this_present_settings || that_present_settings) {
      if (!(this_present_settings && that_present_settings))
        return false;
      if (this.settings != that.settings)
        return false;
    }

    boolean this_present_displayNameOverridden = true && this.isSetDisplayNameOverridden();
    boolean that_present_displayNameOverridden = true && that.isSetDisplayNameOverridden();
    if (this_present_displayNameOverridden || that_present_displayNameOverridden) {
      if (!(this_present_displayNameOverridden && that_present_displayNameOverridden))
        return false;
      if (!this.displayNameOverridden.equals(that.displayNameOverridden))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CompactContact other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMid()).compareTo(other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetModifiedTime()).compareTo(other.isSetModifiedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetModifiedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.modifiedTime, other.modifiedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSettings()).compareTo(other.isSetSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSettings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.settings, other.settings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayNameOverridden()).compareTo(other.isSetDisplayNameOverridden());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayNameOverridden()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayNameOverridden, other.displayNameOverridden);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CompactContact(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("modifiedTime:");
    sb.append(this.modifiedTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("settings:");
    sb.append(this.settings);
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayNameOverridden:");
    if (this.displayNameOverridden == null) {
      sb.append("null");
    } else {
      sb.append(this.displayNameOverridden);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CompactContactStandardSchemeFactory implements SchemeFactory {
    public CompactContactStandardScheme getScheme() {
      return new CompactContactStandardScheme();
    }
  }

  private static class CompactContactStandardScheme extends StandardScheme<CompactContact> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CompactContact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mid = iprot.readString();
              struct.setMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MODIFIED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.modifiedTime = iprot.readI64();
              struct.setModifiedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = ContactStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SETTINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.settings = iprot.readI64();
              struct.setSettingsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DISPLAY_NAME_OVERRIDDEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayNameOverridden = iprot.readString();
              struct.setDisplayNameOverriddenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CompactContact struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(struct.createdTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MODIFIED_TIME_FIELD_DESC);
      oprot.writeI64(struct.modifiedTime);
      oprot.writeFieldEnd();
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SETTINGS_FIELD_DESC);
      oprot.writeI64(struct.settings);
      oprot.writeFieldEnd();
      if (struct.displayNameOverridden != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_OVERRIDDEN_FIELD_DESC);
        oprot.writeString(struct.displayNameOverridden);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CompactContactTupleSchemeFactory implements SchemeFactory {
    public CompactContactTupleScheme getScheme() {
      return new CompactContactTupleScheme();
    }
  }

  private static class CompactContactTupleScheme extends TupleScheme<CompactContact> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CompactContact struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMid()) {
        optionals.set(0);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(1);
      }
      if (struct.isSetModifiedTime()) {
        optionals.set(2);
      }
      if (struct.isSetStatus()) {
        optionals.set(3);
      }
      if (struct.isSetSettings()) {
        optionals.set(4);
      }
      if (struct.isSetDisplayNameOverridden()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetModifiedTime()) {
        oprot.writeI64(struct.modifiedTime);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetSettings()) {
        oprot.writeI64(struct.settings);
      }
      if (struct.isSetDisplayNameOverridden()) {
        oprot.writeString(struct.displayNameOverridden);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CompactContact struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.modifiedTime = iprot.readI64();
        struct.setModifiedTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.status = ContactStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(4)) {
        struct.settings = iprot.readI64();
        struct.setSettingsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.displayNameOverridden = iprot.readString();
        struct.setDisplayNameOverriddenIsSet(true);
      }
    }
  }

}

