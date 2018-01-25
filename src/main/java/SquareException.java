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

public class SquareException extends TException implements org.apache.thrift.TBase<SquareException, SquareException._Fields>, java.io.Serializable, Cloneable, Comparable<SquareException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareException");

  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_EXTRA_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("errorExtraInfo", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField REASON_FIELD_DESC = new org.apache.thrift.protocol.TField("reason", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SquareExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SquareExceptionTupleSchemeFactory());
  }

  /**
   * 
   * @see SQErrorCode
   */
  public SQErrorCode errorCode; // required
  public ErrorExtraInfo errorExtraInfo; // required
  public String reason; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see SQErrorCode
     */
    ERROR_CODE((short)1, "errorCode"),
    ERROR_EXTRA_INFO((short)2, "errorExtraInfo"),
    REASON((short)3, "reason");

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
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // ERROR_EXTRA_INFO
          return ERROR_EXTRA_INFO;
        case 3: // REASON
          return REASON;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SQErrorCode.class)));
    tmpMap.put(_Fields.ERROR_EXTRA_INFO, new org.apache.thrift.meta_data.FieldMetaData("errorExtraInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ErrorExtraInfo.class)));
    tmpMap.put(_Fields.REASON, new org.apache.thrift.meta_data.FieldMetaData("reason", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareException.class, metaDataMap);
  }

  public SquareException() {
  }

  public SquareException(
    SQErrorCode errorCode,
    ErrorExtraInfo errorExtraInfo,
    String reason)
  {
    this();
    this.errorCode = errorCode;
    this.errorExtraInfo = errorExtraInfo;
    this.reason = reason;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareException(SquareException other) {
    if (other.isSetErrorCode()) {
      this.errorCode = other.errorCode;
    }
    if (other.isSetErrorExtraInfo()) {
      this.errorExtraInfo = new ErrorExtraInfo(other.errorExtraInfo);
    }
    if (other.isSetReason()) {
      this.reason = other.reason;
    }
  }

  public SquareException deepCopy() {
    return new SquareException(this);
  }

  @Override
  public void clear() {
    this.errorCode = null;
    this.errorExtraInfo = null;
    this.reason = null;
  }

  /**
   * 
   * @see SQErrorCode
   */
  public SQErrorCode getErrorCode() {
    return this.errorCode;
  }

  /**
   * 
   * @see SQErrorCode
   */
  public SquareException setErrorCode(SQErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public void unsetErrorCode() {
    this.errorCode = null;
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return this.errorCode != null;
  }

  public void setErrorCodeIsSet(boolean value) {
    if (!value) {
      this.errorCode = null;
    }
  }

  public ErrorExtraInfo getErrorExtraInfo() {
    return this.errorExtraInfo;
  }

  public SquareException setErrorExtraInfo(ErrorExtraInfo errorExtraInfo) {
    this.errorExtraInfo = errorExtraInfo;
    return this;
  }

  public void unsetErrorExtraInfo() {
    this.errorExtraInfo = null;
  }

  /** Returns true if field errorExtraInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorExtraInfo() {
    return this.errorExtraInfo != null;
  }

  public void setErrorExtraInfoIsSet(boolean value) {
    if (!value) {
      this.errorExtraInfo = null;
    }
  }

  public String getReason() {
    return this.reason;
  }

  public SquareException setReason(String reason) {
    this.reason = reason;
    return this;
  }

  public void unsetReason() {
    this.reason = null;
  }

  /** Returns true if field reason is set (has been assigned a value) and false otherwise */
  public boolean isSetReason() {
    return this.reason != null;
  }

  public void setReasonIsSet(boolean value) {
    if (!value) {
      this.reason = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((SQErrorCode)value);
      }
      break;

    case ERROR_EXTRA_INFO:
      if (value == null) {
        unsetErrorExtraInfo();
      } else {
        setErrorExtraInfo((ErrorExtraInfo)value);
      }
      break;

    case REASON:
      if (value == null) {
        unsetReason();
      } else {
        setReason((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return getErrorCode();

    case ERROR_EXTRA_INFO:
      return getErrorExtraInfo();

    case REASON:
      return getReason();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetErrorCode();
    case ERROR_EXTRA_INFO:
      return isSetErrorExtraInfo();
    case REASON:
      return isSetReason();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareException)
      return this.equals((SquareException)that);
    return false;
  }

  public boolean equals(SquareException that) {
    if (that == null)
      return false;

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (!this.errorCode.equals(that.errorCode))
        return false;
    }

    boolean this_present_errorExtraInfo = true && this.isSetErrorExtraInfo();
    boolean that_present_errorExtraInfo = true && that.isSetErrorExtraInfo();
    if (this_present_errorExtraInfo || that_present_errorExtraInfo) {
      if (!(this_present_errorExtraInfo && that_present_errorExtraInfo))
        return false;
      if (!this.errorExtraInfo.equals(that.errorExtraInfo))
        return false;
    }

    boolean this_present_reason = true && this.isSetReason();
    boolean that_present_reason = true && that.isSetReason();
    if (this_present_reason || that_present_reason) {
      if (!(this_present_reason && that_present_reason))
        return false;
      if (!this.reason.equals(that.reason))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SquareException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorExtraInfo()).compareTo(other.isSetErrorExtraInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorExtraInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorExtraInfo, other.errorExtraInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReason()).compareTo(other.isSetReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReason()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reason, other.reason);
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
    StringBuilder sb = new StringBuilder("SquareException(");
    boolean first = true;

    sb.append("errorCode:");
    if (this.errorCode == null) {
      sb.append("null");
    } else {
      sb.append(this.errorCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorExtraInfo:");
    if (this.errorExtraInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.errorExtraInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reason:");
    if (this.reason == null) {
      sb.append("null");
    } else {
      sb.append(this.reason);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (errorExtraInfo != null) {
      errorExtraInfo.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SquareExceptionStandardSchemeFactory implements SchemeFactory {
    public SquareExceptionStandardScheme getScheme() {
      return new SquareExceptionStandardScheme();
    }
  }

  private static class SquareExceptionStandardScheme extends StandardScheme<SquareException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errorCode = SQErrorCode.findByValue(iprot.readI32());
              struct.setErrorCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_EXTRA_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.errorExtraInfo = new ErrorExtraInfo();
              struct.errorExtraInfo.read(iprot);
              struct.setErrorExtraInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REASON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reason = iprot.readString();
              struct.setReasonIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.errorCode != null) {
        oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
        oprot.writeI32(struct.errorCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.errorExtraInfo != null) {
        oprot.writeFieldBegin(ERROR_EXTRA_INFO_FIELD_DESC);
        struct.errorExtraInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.reason != null) {
        oprot.writeFieldBegin(REASON_FIELD_DESC);
        oprot.writeString(struct.reason);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareExceptionTupleSchemeFactory implements SchemeFactory {
    public SquareExceptionTupleScheme getScheme() {
      return new SquareExceptionTupleScheme();
    }
  }

  private static class SquareExceptionTupleScheme extends TupleScheme<SquareException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetErrorCode()) {
        optionals.set(0);
      }
      if (struct.isSetErrorExtraInfo()) {
        optionals.set(1);
      }
      if (struct.isSetReason()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode.getValue());
      }
      if (struct.isSetErrorExtraInfo()) {
        struct.errorExtraInfo.write(oprot);
      }
      if (struct.isSetReason()) {
        oprot.writeString(struct.reason);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.errorCode = SQErrorCode.findByValue(iprot.readI32());
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.errorExtraInfo = new ErrorExtraInfo();
        struct.errorExtraInfo.read(iprot);
        struct.setErrorExtraInfoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.reason = iprot.readString();
        struct.setReasonIsSet(true);
      }
    }
  }

}

