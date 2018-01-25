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

public class SnsFriends implements org.apache.thrift.TBase<SnsFriends, SnsFriends._Fields>, java.io.Serializable, Cloneable, Comparable<SnsFriends> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SnsFriends");

  private static final org.apache.thrift.protocol.TField SNS_FRIENDS_FIELD_DESC = new org.apache.thrift.protocol.TField("snsFriends", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_MORE_FIELD_DESC = new org.apache.thrift.protocol.TField("hasMore", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SnsFriendsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SnsFriendsTupleSchemeFactory());
  }

  public List<SnsFriend> snsFriends; // required
  public boolean hasMore; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SNS_FRIENDS((short)1, "snsFriends"),
    HAS_MORE((short)2, "hasMore");

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
        case 1: // SNS_FRIENDS
          return SNS_FRIENDS;
        case 2: // HAS_MORE
          return HAS_MORE;
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
  private static final int __HASMORE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SNS_FRIENDS, new org.apache.thrift.meta_data.FieldMetaData("snsFriends", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SnsFriend.class))));
    tmpMap.put(_Fields.HAS_MORE, new org.apache.thrift.meta_data.FieldMetaData("hasMore", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SnsFriends.class, metaDataMap);
  }

  public SnsFriends() {
  }

  public SnsFriends(
    List<SnsFriend> snsFriends,
    boolean hasMore)
  {
    this();
    this.snsFriends = snsFriends;
    this.hasMore = hasMore;
    setHasMoreIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SnsFriends(SnsFriends other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSnsFriends()) {
      List<SnsFriend> __this__snsFriends = new ArrayList<SnsFriend>(other.snsFriends.size());
      for (SnsFriend other_element : other.snsFriends) {
        __this__snsFriends.add(new SnsFriend(other_element));
      }
      this.snsFriends = __this__snsFriends;
    }
    this.hasMore = other.hasMore;
  }

  public SnsFriends deepCopy() {
    return new SnsFriends(this);
  }

  @Override
  public void clear() {
    this.snsFriends = null;
    setHasMoreIsSet(false);
    this.hasMore = false;
  }

  public int getSnsFriendsSize() {
    return (this.snsFriends == null) ? 0 : this.snsFriends.size();
  }

  public java.util.Iterator<SnsFriend> getSnsFriendsIterator() {
    return (this.snsFriends == null) ? null : this.snsFriends.iterator();
  }

  public void addToSnsFriends(SnsFriend elem) {
    if (this.snsFriends == null) {
      this.snsFriends = new ArrayList<SnsFriend>();
    }
    this.snsFriends.add(elem);
  }

  public List<SnsFriend> getSnsFriends() {
    return this.snsFriends;
  }

  public SnsFriends setSnsFriends(List<SnsFriend> snsFriends) {
    this.snsFriends = snsFriends;
    return this;
  }

  public void unsetSnsFriends() {
    this.snsFriends = null;
  }

  /** Returns true if field snsFriends is set (has been assigned a value) and false otherwise */
  public boolean isSetSnsFriends() {
    return this.snsFriends != null;
  }

  public void setSnsFriendsIsSet(boolean value) {
    if (!value) {
      this.snsFriends = null;
    }
  }

  public boolean isHasMore() {
    return this.hasMore;
  }

  public SnsFriends setHasMore(boolean hasMore) {
    this.hasMore = hasMore;
    setHasMoreIsSet(true);
    return this;
  }

  public void unsetHasMore() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HASMORE_ISSET_ID);
  }

  /** Returns true if field hasMore is set (has been assigned a value) and false otherwise */
  public boolean isSetHasMore() {
    return EncodingUtils.testBit(__isset_bitfield, __HASMORE_ISSET_ID);
  }

  public void setHasMoreIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HASMORE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SNS_FRIENDS:
      if (value == null) {
        unsetSnsFriends();
      } else {
        setSnsFriends((List<SnsFriend>)value);
      }
      break;

    case HAS_MORE:
      if (value == null) {
        unsetHasMore();
      } else {
        setHasMore((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SNS_FRIENDS:
      return getSnsFriends();

    case HAS_MORE:
      return Boolean.valueOf(isHasMore());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SNS_FRIENDS:
      return isSetSnsFriends();
    case HAS_MORE:
      return isSetHasMore();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SnsFriends)
      return this.equals((SnsFriends)that);
    return false;
  }

  public boolean equals(SnsFriends that) {
    if (that == null)
      return false;

    boolean this_present_snsFriends = true && this.isSetSnsFriends();
    boolean that_present_snsFriends = true && that.isSetSnsFriends();
    if (this_present_snsFriends || that_present_snsFriends) {
      if (!(this_present_snsFriends && that_present_snsFriends))
        return false;
      if (!this.snsFriends.equals(that.snsFriends))
        return false;
    }

    boolean this_present_hasMore = true;
    boolean that_present_hasMore = true;
    if (this_present_hasMore || that_present_hasMore) {
      if (!(this_present_hasMore && that_present_hasMore))
        return false;
      if (this.hasMore != that.hasMore)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SnsFriends other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSnsFriends()).compareTo(other.isSetSnsFriends());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnsFriends()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.snsFriends, other.snsFriends);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHasMore()).compareTo(other.isSetHasMore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasMore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasMore, other.hasMore);
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
    StringBuilder sb = new StringBuilder("SnsFriends(");
    boolean first = true;

    sb.append("snsFriends:");
    if (this.snsFriends == null) {
      sb.append("null");
    } else {
      sb.append(this.snsFriends);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasMore:");
    sb.append(this.hasMore);
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

  private static class SnsFriendsStandardSchemeFactory implements SchemeFactory {
    public SnsFriendsStandardScheme getScheme() {
      return new SnsFriendsStandardScheme();
    }
  }

  private static class SnsFriendsStandardScheme extends StandardScheme<SnsFriends> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SnsFriends struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SNS_FRIENDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list316 = iprot.readListBegin();
                struct.snsFriends = new ArrayList<SnsFriend>(_list316.size);
                for (int _i317 = 0; _i317 < _list316.size; ++_i317)
                {
                  SnsFriend _elem318;
                  _elem318 = new SnsFriend();
                  _elem318.read(iprot);
                  struct.snsFriends.add(_elem318);
                }
                iprot.readListEnd();
              }
              struct.setSnsFriendsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_MORE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasMore = iprot.readBool();
              struct.setHasMoreIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SnsFriends struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.snsFriends != null) {
        oprot.writeFieldBegin(SNS_FRIENDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.snsFriends.size()));
          for (SnsFriend _iter319 : struct.snsFriends)
          {
            _iter319.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_MORE_FIELD_DESC);
      oprot.writeBool(struct.hasMore);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SnsFriendsTupleSchemeFactory implements SchemeFactory {
    public SnsFriendsTupleScheme getScheme() {
      return new SnsFriendsTupleScheme();
    }
  }

  private static class SnsFriendsTupleScheme extends TupleScheme<SnsFriends> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SnsFriends struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSnsFriends()) {
        optionals.set(0);
      }
      if (struct.isSetHasMore()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSnsFriends()) {
        {
          oprot.writeI32(struct.snsFriends.size());
          for (SnsFriend _iter320 : struct.snsFriends)
          {
            _iter320.write(oprot);
          }
        }
      }
      if (struct.isSetHasMore()) {
        oprot.writeBool(struct.hasMore);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SnsFriends struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list321 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.snsFriends = new ArrayList<SnsFriend>(_list321.size);
          for (int _i322 = 0; _i322 < _list321.size; ++_i322)
          {
            SnsFriend _elem323;
            _elem323 = new SnsFriend();
            _elem323.read(iprot);
            struct.snsFriends.add(_elem323);
          }
        }
        struct.setSnsFriendsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hasMore = iprot.readBool();
        struct.setHasMoreIsSet(true);
      }
    }
  }

}

