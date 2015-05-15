// ORM class for table 'categoria'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri May 15 03:36:34 PDT 2015
// For connector: org.apache.sqoop.manager.DirectMySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class categoria extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id_categoria;
  public Integer get_id_categoria() {
    return id_categoria;
  }
  public void set_id_categoria(Integer id_categoria) {
    this.id_categoria = id_categoria;
  }
  public categoria with_id_categoria(Integer id_categoria) {
    this.id_categoria = id_categoria;
    return this;
  }
  private Integer id_nivel_categoria;
  public Integer get_id_nivel_categoria() {
    return id_nivel_categoria;
  }
  public void set_id_nivel_categoria(Integer id_nivel_categoria) {
    this.id_nivel_categoria = id_nivel_categoria;
  }
  public categoria with_id_nivel_categoria(Integer id_nivel_categoria) {
    this.id_nivel_categoria = id_nivel_categoria;
    return this;
  }
  private String nombre;
  public String get_nombre() {
    return nombre;
  }
  public void set_nombre(String nombre) {
    this.nombre = nombre;
  }
  public categoria with_nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }
  private Integer asociado;
  public Integer get_asociado() {
    return asociado;
  }
  public void set_asociado(Integer asociado) {
    this.asociado = asociado;
  }
  public categoria with_asociado(Integer asociado) {
    this.asociado = asociado;
    return this;
  }
  private Integer estado;
  public Integer get_estado() {
    return estado;
  }
  public void set_estado(Integer estado) {
    this.estado = estado;
  }
  public categoria with_estado(Integer estado) {
    this.estado = estado;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof categoria)) {
      return false;
    }
    categoria that = (categoria) o;
    boolean equal = true;
    equal = equal && (this.id_categoria == null ? that.id_categoria == null : this.id_categoria.equals(that.id_categoria));
    equal = equal && (this.id_nivel_categoria == null ? that.id_nivel_categoria == null : this.id_nivel_categoria.equals(that.id_nivel_categoria));
    equal = equal && (this.nombre == null ? that.nombre == null : this.nombre.equals(that.nombre));
    equal = equal && (this.asociado == null ? that.asociado == null : this.asociado.equals(that.asociado));
    equal = equal && (this.estado == null ? that.estado == null : this.estado.equals(that.estado));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof categoria)) {
      return false;
    }
    categoria that = (categoria) o;
    boolean equal = true;
    equal = equal && (this.id_categoria == null ? that.id_categoria == null : this.id_categoria.equals(that.id_categoria));
    equal = equal && (this.id_nivel_categoria == null ? that.id_nivel_categoria == null : this.id_nivel_categoria.equals(that.id_nivel_categoria));
    equal = equal && (this.nombre == null ? that.nombre == null : this.nombre.equals(that.nombre));
    equal = equal && (this.asociado == null ? that.asociado == null : this.asociado.equals(that.asociado));
    equal = equal && (this.estado == null ? that.estado == null : this.estado.equals(that.estado));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id_categoria = JdbcWritableBridge.readInteger(1, __dbResults);
    this.id_nivel_categoria = JdbcWritableBridge.readInteger(2, __dbResults);
    this.nombre = JdbcWritableBridge.readString(3, __dbResults);
    this.asociado = JdbcWritableBridge.readInteger(4, __dbResults);
    this.estado = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id_categoria = JdbcWritableBridge.readInteger(1, __dbResults);
    this.id_nivel_categoria = JdbcWritableBridge.readInteger(2, __dbResults);
    this.nombre = JdbcWritableBridge.readString(3, __dbResults);
    this.asociado = JdbcWritableBridge.readInteger(4, __dbResults);
    this.estado = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id_categoria, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_nivel_categoria, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nombre, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(asociado, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(estado, 5 + __off, -6, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id_categoria, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_nivel_categoria, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nombre, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(asociado, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(estado, 5 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id_categoria = null;
    } else {
    this.id_categoria = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_nivel_categoria = null;
    } else {
    this.id_nivel_categoria = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.nombre = null;
    } else {
    this.nombre = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.asociado = null;
    } else {
    this.asociado = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.estado = null;
    } else {
    this.estado = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id_categoria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria);
    }
    if (null == this.id_nivel_categoria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_nivel_categoria);
    }
    if (null == this.nombre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nombre);
    }
    if (null == this.asociado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.asociado);
    }
    if (null == this.estado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.estado);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id_categoria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria);
    }
    if (null == this.id_nivel_categoria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_nivel_categoria);
    }
    if (null == this.nombre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nombre);
    }
    if (null == this.asociado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.asociado);
    }
    if (null == this.estado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.estado);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria==null?"null":"" + id_categoria, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_nivel_categoria==null?"null":"" + id_nivel_categoria, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nombre==null?"null":nombre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(asociado==null?"null":"" + asociado, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado==null?"null":"" + estado, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria==null?"null":"" + id_categoria, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_nivel_categoria==null?"null":"" + id_nivel_categoria, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nombre==null?"null":nombre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(asociado==null?"null":"" + asociado, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado==null?"null":"" + estado, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria = null; } else {
      this.id_categoria = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_nivel_categoria = null; } else {
      this.id_nivel_categoria = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nombre = null; } else {
      this.nombre = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.asociado = null; } else {
      this.asociado = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estado = null; } else {
      this.estado = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria = null; } else {
      this.id_categoria = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_nivel_categoria = null; } else {
      this.id_nivel_categoria = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nombre = null; } else {
      this.nombre = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.asociado = null; } else {
      this.asociado = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estado = null; } else {
      this.estado = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    categoria o = (categoria) super.clone();
    return o;
  }

  public void clone0(categoria o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id_categoria", this.id_categoria);
    __sqoop$field_map.put("id_nivel_categoria", this.id_nivel_categoria);
    __sqoop$field_map.put("nombre", this.nombre);
    __sqoop$field_map.put("asociado", this.asociado);
    __sqoop$field_map.put("estado", this.estado);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id_categoria", this.id_categoria);
    __sqoop$field_map.put("id_nivel_categoria", this.id_nivel_categoria);
    __sqoop$field_map.put("nombre", this.nombre);
    __sqoop$field_map.put("asociado", this.asociado);
    __sqoop$field_map.put("estado", this.estado);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id_categoria".equals(__fieldName)) {
      this.id_categoria = (Integer) __fieldVal;
    }
    else    if ("id_nivel_categoria".equals(__fieldName)) {
      this.id_nivel_categoria = (Integer) __fieldVal;
    }
    else    if ("nombre".equals(__fieldName)) {
      this.nombre = (String) __fieldVal;
    }
    else    if ("asociado".equals(__fieldName)) {
      this.asociado = (Integer) __fieldVal;
    }
    else    if ("estado".equals(__fieldName)) {
      this.estado = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id_categoria".equals(__fieldName)) {
      this.id_categoria = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_nivel_categoria".equals(__fieldName)) {
      this.id_nivel_categoria = (Integer) __fieldVal;
      return true;
    }
    else    if ("nombre".equals(__fieldName)) {
      this.nombre = (String) __fieldVal;
      return true;
    }
    else    if ("asociado".equals(__fieldName)) {
      this.asociado = (Integer) __fieldVal;
      return true;
    }
    else    if ("estado".equals(__fieldName)) {
      this.estado = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
