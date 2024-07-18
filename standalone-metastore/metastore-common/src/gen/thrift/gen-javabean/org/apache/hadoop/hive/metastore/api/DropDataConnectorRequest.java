/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class DropDataConnectorRequest implements org.apache.thrift.TBase<DropDataConnectorRequest, DropDataConnectorRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DropDataConnectorRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DropDataConnectorRequest");

  private static final org.apache.thrift.protocol.TField CONNECTOR_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("connectorName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IF_NOT_EXISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("ifNotExists", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField CHECK_REFERENCES_FIELD_DESC = new org.apache.thrift.protocol.TField("checkReferences", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DropDataConnectorRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DropDataConnectorRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String connectorName; // required
  private boolean ifNotExists; // optional
  private boolean checkReferences; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONNECTOR_NAME((short)1, "connectorName"),
    IF_NOT_EXISTS((short)2, "ifNotExists"),
    CHECK_REFERENCES((short)3, "checkReferences");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CONNECTOR_NAME
          return CONNECTOR_NAME;
        case 2: // IF_NOT_EXISTS
          return IF_NOT_EXISTS;
        case 3: // CHECK_REFERENCES
          return CHECK_REFERENCES;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IFNOTEXISTS_ISSET_ID = 0;
  private static final int __CHECKREFERENCES_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IF_NOT_EXISTS,_Fields.CHECK_REFERENCES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONNECTOR_NAME, new org.apache.thrift.meta_data.FieldMetaData("connectorName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IF_NOT_EXISTS, new org.apache.thrift.meta_data.FieldMetaData("ifNotExists", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CHECK_REFERENCES, new org.apache.thrift.meta_data.FieldMetaData("checkReferences", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DropDataConnectorRequest.class, metaDataMap);
  }

  public DropDataConnectorRequest() {
  }

  public DropDataConnectorRequest(
    java.lang.String connectorName)
  {
    this();
    this.connectorName = connectorName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DropDataConnectorRequest(DropDataConnectorRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetConnectorName()) {
      this.connectorName = other.connectorName;
    }
    this.ifNotExists = other.ifNotExists;
    this.checkReferences = other.checkReferences;
  }

  public DropDataConnectorRequest deepCopy() {
    return new DropDataConnectorRequest(this);
  }

  @Override
  public void clear() {
    this.connectorName = null;
    setIfNotExistsIsSet(false);
    this.ifNotExists = false;
    setCheckReferencesIsSet(false);
    this.checkReferences = false;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getConnectorName() {
    return this.connectorName;
  }

  public void setConnectorName(@org.apache.thrift.annotation.Nullable java.lang.String connectorName) {
    this.connectorName = connectorName;
  }

  public void unsetConnectorName() {
    this.connectorName = null;
  }

  /** Returns true if field connectorName is set (has been assigned a value) and false otherwise */
  public boolean isSetConnectorName() {
    return this.connectorName != null;
  }

  public void setConnectorNameIsSet(boolean value) {
    if (!value) {
      this.connectorName = null;
    }
  }

  public boolean isIfNotExists() {
    return this.ifNotExists;
  }

  public void setIfNotExists(boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
    setIfNotExistsIsSet(true);
  }

  public void unsetIfNotExists() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IFNOTEXISTS_ISSET_ID);
  }

  /** Returns true if field ifNotExists is set (has been assigned a value) and false otherwise */
  public boolean isSetIfNotExists() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IFNOTEXISTS_ISSET_ID);
  }

  public void setIfNotExistsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IFNOTEXISTS_ISSET_ID, value);
  }

  public boolean isCheckReferences() {
    return this.checkReferences;
  }

  public void setCheckReferences(boolean checkReferences) {
    this.checkReferences = checkReferences;
    setCheckReferencesIsSet(true);
  }

  public void unsetCheckReferences() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHECKREFERENCES_ISSET_ID);
  }

  /** Returns true if field checkReferences is set (has been assigned a value) and false otherwise */
  public boolean isSetCheckReferences() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHECKREFERENCES_ISSET_ID);
  }

  public void setCheckReferencesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHECKREFERENCES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CONNECTOR_NAME:
      if (value == null) {
        unsetConnectorName();
      } else {
        setConnectorName((java.lang.String)value);
      }
      break;

    case IF_NOT_EXISTS:
      if (value == null) {
        unsetIfNotExists();
      } else {
        setIfNotExists((java.lang.Boolean)value);
      }
      break;

    case CHECK_REFERENCES:
      if (value == null) {
        unsetCheckReferences();
      } else {
        setCheckReferences((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CONNECTOR_NAME:
      return getConnectorName();

    case IF_NOT_EXISTS:
      return isIfNotExists();

    case CHECK_REFERENCES:
      return isCheckReferences();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CONNECTOR_NAME:
      return isSetConnectorName();
    case IF_NOT_EXISTS:
      return isSetIfNotExists();
    case CHECK_REFERENCES:
      return isSetCheckReferences();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof DropDataConnectorRequest)
      return this.equals((DropDataConnectorRequest)that);
    return false;
  }

  public boolean equals(DropDataConnectorRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_connectorName = true && this.isSetConnectorName();
    boolean that_present_connectorName = true && that.isSetConnectorName();
    if (this_present_connectorName || that_present_connectorName) {
      if (!(this_present_connectorName && that_present_connectorName))
        return false;
      if (!this.connectorName.equals(that.connectorName))
        return false;
    }

    boolean this_present_ifNotExists = true && this.isSetIfNotExists();
    boolean that_present_ifNotExists = true && that.isSetIfNotExists();
    if (this_present_ifNotExists || that_present_ifNotExists) {
      if (!(this_present_ifNotExists && that_present_ifNotExists))
        return false;
      if (this.ifNotExists != that.ifNotExists)
        return false;
    }

    boolean this_present_checkReferences = true && this.isSetCheckReferences();
    boolean that_present_checkReferences = true && that.isSetCheckReferences();
    if (this_present_checkReferences || that_present_checkReferences) {
      if (!(this_present_checkReferences && that_present_checkReferences))
        return false;
      if (this.checkReferences != that.checkReferences)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetConnectorName()) ? 131071 : 524287);
    if (isSetConnectorName())
      hashCode = hashCode * 8191 + connectorName.hashCode();

    hashCode = hashCode * 8191 + ((isSetIfNotExists()) ? 131071 : 524287);
    if (isSetIfNotExists())
      hashCode = hashCode * 8191 + ((ifNotExists) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetCheckReferences()) ? 131071 : 524287);
    if (isSetCheckReferences())
      hashCode = hashCode * 8191 + ((checkReferences) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(DropDataConnectorRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetConnectorName(), other.isSetConnectorName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConnectorName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.connectorName, other.connectorName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIfNotExists(), other.isSetIfNotExists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIfNotExists()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ifNotExists, other.ifNotExists);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCheckReferences(), other.isSetCheckReferences());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheckReferences()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.checkReferences, other.checkReferences);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DropDataConnectorRequest(");
    boolean first = true;

    sb.append("connectorName:");
    if (this.connectorName == null) {
      sb.append("null");
    } else {
      sb.append(this.connectorName);
    }
    first = false;
    if (isSetIfNotExists()) {
      if (!first) sb.append(", ");
      sb.append("ifNotExists:");
      sb.append(this.ifNotExists);
      first = false;
    }
    if (isSetCheckReferences()) {
      if (!first) sb.append(", ");
      sb.append("checkReferences:");
      sb.append(this.checkReferences);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetConnectorName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'connectorName' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DropDataConnectorRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DropDataConnectorRequestStandardScheme getScheme() {
      return new DropDataConnectorRequestStandardScheme();
    }
  }

  private static class DropDataConnectorRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<DropDataConnectorRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DropDataConnectorRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONNECTOR_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.connectorName = iprot.readString();
              struct.setConnectorNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IF_NOT_EXISTS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.ifNotExists = iprot.readBool();
              struct.setIfNotExistsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CHECK_REFERENCES
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.checkReferences = iprot.readBool();
              struct.setCheckReferencesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DropDataConnectorRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.connectorName != null) {
        oprot.writeFieldBegin(CONNECTOR_NAME_FIELD_DESC);
        oprot.writeString(struct.connectorName);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIfNotExists()) {
        oprot.writeFieldBegin(IF_NOT_EXISTS_FIELD_DESC);
        oprot.writeBool(struct.ifNotExists);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCheckReferences()) {
        oprot.writeFieldBegin(CHECK_REFERENCES_FIELD_DESC);
        oprot.writeBool(struct.checkReferences);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DropDataConnectorRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DropDataConnectorRequestTupleScheme getScheme() {
      return new DropDataConnectorRequestTupleScheme();
    }
  }

  private static class DropDataConnectorRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<DropDataConnectorRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DropDataConnectorRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.connectorName);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIfNotExists()) {
        optionals.set(0);
      }
      if (struct.isSetCheckReferences()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetIfNotExists()) {
        oprot.writeBool(struct.ifNotExists);
      }
      if (struct.isSetCheckReferences()) {
        oprot.writeBool(struct.checkReferences);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DropDataConnectorRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.connectorName = iprot.readString();
      struct.setConnectorNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.ifNotExists = iprot.readBool();
        struct.setIfNotExistsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.checkReferences = iprot.readBool();
        struct.setCheckReferencesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

