// ORM class for table 'cliente'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri May 15 03:46:23 PDT 2015
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

public class cliente extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id_cliente;
  public Integer get_id_cliente() {
    return id_cliente;
  }
  public void set_id_cliente(Integer id_cliente) {
    this.id_cliente = id_cliente;
  }
  public cliente with_id_cliente(Integer id_cliente) {
    this.id_cliente = id_cliente;
    return this;
  }
  private String nombre;
  public String get_nombre() {
    return nombre;
  }
  public void set_nombre(String nombre) {
    this.nombre = nombre;
  }
  public cliente with_nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }
  private String apellidos;
  public String get_apellidos() {
    return apellidos;
  }
  public void set_apellidos(String apellidos) {
    this.apellidos = apellidos;
  }
  public cliente with_apellidos(String apellidos) {
    this.apellidos = apellidos;
    return this;
  }
  private Integer numero_id;
  public Integer get_numero_id() {
    return numero_id;
  }
  public void set_numero_id(Integer numero_id) {
    this.numero_id = numero_id;
  }
  public cliente with_numero_id(Integer numero_id) {
    this.numero_id = numero_id;
    return this;
  }
  private String email;
  public String get_email() {
    return email;
  }
  public void set_email(String email) {
    this.email = email;
  }
  public cliente with_email(String email) {
    this.email = email;
    return this;
  }
  private String telefono;
  public String get_telefono() {
    return telefono;
  }
  public void set_telefono(String telefono) {
    this.telefono = telefono;
  }
  public cliente with_telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }
  private String direccion1;
  public String get_direccion1() {
    return direccion1;
  }
  public void set_direccion1(String direccion1) {
    this.direccion1 = direccion1;
  }
  public cliente with_direccion1(String direccion1) {
    this.direccion1 = direccion1;
    return this;
  }
  private String direccion2;
  public String get_direccion2() {
    return direccion2;
  }
  public void set_direccion2(String direccion2) {
    this.direccion2 = direccion2;
  }
  public cliente with_direccion2(String direccion2) {
    this.direccion2 = direccion2;
    return this;
  }
  private String cp;
  public String get_cp() {
    return cp;
  }
  public void set_cp(String cp) {
    this.cp = cp;
  }
  public cliente with_cp(String cp) {
    this.cp = cp;
    return this;
  }
  private String pais;
  public String get_pais() {
    return pais;
  }
  public void set_pais(String pais) {
    this.pais = pais;
  }
  public cliente with_pais(String pais) {
    this.pais = pais;
    return this;
  }
  private String estado;
  public String get_estado() {
    return estado;
  }
  public void set_estado(String estado) {
    this.estado = estado;
  }
  public cliente with_estado(String estado) {
    this.estado = estado;
    return this;
  }
  private String ciudad;
  public String get_ciudad() {
    return ciudad;
  }
  public void set_ciudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public cliente with_ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
  private java.sql.Timestamp fecha_union;
  public java.sql.Timestamp get_fecha_union() {
    return fecha_union;
  }
  public void set_fecha_union(java.sql.Timestamp fecha_union) {
    this.fecha_union = fecha_union;
  }
  public cliente with_fecha_union(java.sql.Timestamp fecha_union) {
    this.fecha_union = fecha_union;
    return this;
  }
  private java.sql.Timestamp fecha_baja;
  public java.sql.Timestamp get_fecha_baja() {
    return fecha_baja;
  }
  public void set_fecha_baja(java.sql.Timestamp fecha_baja) {
    this.fecha_baja = fecha_baja;
  }
  public cliente with_fecha_baja(java.sql.Timestamp fecha_baja) {
    this.fecha_baja = fecha_baja;
    return this;
  }
  private String tile;
  public String get_tile() {
    return tile;
  }
  public void set_tile(String tile) {
    this.tile = tile;
  }
  public cliente with_tile(String tile) {
    this.tile = tile;
    return this;
  }
  private java.sql.Date fecha__nacimiento;
  public java.sql.Date get_fecha__nacimiento() {
    return fecha__nacimiento;
  }
  public void set_fecha__nacimiento(java.sql.Date fecha__nacimiento) {
    this.fecha__nacimiento = fecha__nacimiento;
  }
  public cliente with_fecha__nacimiento(java.sql.Date fecha__nacimiento) {
    this.fecha__nacimiento = fecha__nacimiento;
    return this;
  }
  private Integer id_miembro_prog;
  public Integer get_id_miembro_prog() {
    return id_miembro_prog;
  }
  public void set_id_miembro_prog(Integer id_miembro_prog) {
    this.id_miembro_prog = id_miembro_prog;
  }
  public cliente with_id_miembro_prog(Integer id_miembro_prog) {
    this.id_miembro_prog = id_miembro_prog;
    return this;
  }
  private Integer id_pos;
  public Integer get_id_pos() {
    return id_pos;
  }
  public void set_id_pos(Integer id_pos) {
    this.id_pos = id_pos;
  }
  public cliente with_id_pos(Integer id_pos) {
    this.id_pos = id_pos;
    return this;
  }
  private String robbinson;
  public String get_robbinson() {
    return robbinson;
  }
  public void set_robbinson(String robbinson) {
    this.robbinson = robbinson;
  }
  public cliente with_robbinson(String robbinson) {
    this.robbinson = robbinson;
    return this;
  }
  private String opt_in;
  public String get_opt_in() {
    return opt_in;
  }
  public void set_opt_in(String opt_in) {
    this.opt_in = opt_in;
  }
  public cliente with_opt_in(String opt_in) {
    this.opt_in = opt_in;
    return this;
  }
  private String genero;
  public String get_genero() {
    return genero;
  }
  public void set_genero(String genero) {
    this.genero = genero;
  }
  public cliente with_genero(String genero) {
    this.genero = genero;
    return this;
  }
  private String estado_marital;
  public String get_estado_marital() {
    return estado_marital;
  }
  public void set_estado_marital(String estado_marital) {
    this.estado_marital = estado_marital;
  }
  public cliente with_estado_marital(String estado_marital) {
    this.estado_marital = estado_marital;
    return this;
  }
  private Integer num_hijos;
  public Integer get_num_hijos() {
    return num_hijos;
  }
  public void set_num_hijos(Integer num_hijos) {
    this.num_hijos = num_hijos;
  }
  public cliente with_num_hijos(Integer num_hijos) {
    this.num_hijos = num_hijos;
    return this;
  }
  private String tipo_vivienda;
  public String get_tipo_vivienda() {
    return tipo_vivienda;
  }
  public void set_tipo_vivienda(String tipo_vivienda) {
    this.tipo_vivienda = tipo_vivienda;
  }
  public cliente with_tipo_vivienda(String tipo_vivienda) {
    this.tipo_vivienda = tipo_vivienda;
    return this;
  }
  private String personalizado1;
  public String get_personalizado1() {
    return personalizado1;
  }
  public void set_personalizado1(String personalizado1) {
    this.personalizado1 = personalizado1;
  }
  public cliente with_personalizado1(String personalizado1) {
    this.personalizado1 = personalizado1;
    return this;
  }
  private String personalizado2;
  public String get_personalizado2() {
    return personalizado2;
  }
  public void set_personalizado2(String personalizado2) {
    this.personalizado2 = personalizado2;
  }
  public cliente with_personalizado2(String personalizado2) {
    this.personalizado2 = personalizado2;
    return this;
  }
  private String personalizado3;
  public String get_personalizado3() {
    return personalizado3;
  }
  public void set_personalizado3(String personalizado3) {
    this.personalizado3 = personalizado3;
  }
  public cliente with_personalizado3(String personalizado3) {
    this.personalizado3 = personalizado3;
    return this;
  }
  private String personalizado4;
  public String get_personalizado4() {
    return personalizado4;
  }
  public void set_personalizado4(String personalizado4) {
    this.personalizado4 = personalizado4;
  }
  public cliente with_personalizado4(String personalizado4) {
    this.personalizado4 = personalizado4;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof cliente)) {
      return false;
    }
    cliente that = (cliente) o;
    boolean equal = true;
    equal = equal && (this.id_cliente == null ? that.id_cliente == null : this.id_cliente.equals(that.id_cliente));
    equal = equal && (this.nombre == null ? that.nombre == null : this.nombre.equals(that.nombre));
    equal = equal && (this.apellidos == null ? that.apellidos == null : this.apellidos.equals(that.apellidos));
    equal = equal && (this.numero_id == null ? that.numero_id == null : this.numero_id.equals(that.numero_id));
    equal = equal && (this.email == null ? that.email == null : this.email.equals(that.email));
    equal = equal && (this.telefono == null ? that.telefono == null : this.telefono.equals(that.telefono));
    equal = equal && (this.direccion1 == null ? that.direccion1 == null : this.direccion1.equals(that.direccion1));
    equal = equal && (this.direccion2 == null ? that.direccion2 == null : this.direccion2.equals(that.direccion2));
    equal = equal && (this.cp == null ? that.cp == null : this.cp.equals(that.cp));
    equal = equal && (this.pais == null ? that.pais == null : this.pais.equals(that.pais));
    equal = equal && (this.estado == null ? that.estado == null : this.estado.equals(that.estado));
    equal = equal && (this.ciudad == null ? that.ciudad == null : this.ciudad.equals(that.ciudad));
    equal = equal && (this.fecha_union == null ? that.fecha_union == null : this.fecha_union.equals(that.fecha_union));
    equal = equal && (this.fecha_baja == null ? that.fecha_baja == null : this.fecha_baja.equals(that.fecha_baja));
    equal = equal && (this.tile == null ? that.tile == null : this.tile.equals(that.tile));
    equal = equal && (this.fecha__nacimiento == null ? that.fecha__nacimiento == null : this.fecha__nacimiento.equals(that.fecha__nacimiento));
    equal = equal && (this.id_miembro_prog == null ? that.id_miembro_prog == null : this.id_miembro_prog.equals(that.id_miembro_prog));
    equal = equal && (this.id_pos == null ? that.id_pos == null : this.id_pos.equals(that.id_pos));
    equal = equal && (this.robbinson == null ? that.robbinson == null : this.robbinson.equals(that.robbinson));
    equal = equal && (this.opt_in == null ? that.opt_in == null : this.opt_in.equals(that.opt_in));
    equal = equal && (this.genero == null ? that.genero == null : this.genero.equals(that.genero));
    equal = equal && (this.estado_marital == null ? that.estado_marital == null : this.estado_marital.equals(that.estado_marital));
    equal = equal && (this.num_hijos == null ? that.num_hijos == null : this.num_hijos.equals(that.num_hijos));
    equal = equal && (this.tipo_vivienda == null ? that.tipo_vivienda == null : this.tipo_vivienda.equals(that.tipo_vivienda));
    equal = equal && (this.personalizado1 == null ? that.personalizado1 == null : this.personalizado1.equals(that.personalizado1));
    equal = equal && (this.personalizado2 == null ? that.personalizado2 == null : this.personalizado2.equals(that.personalizado2));
    equal = equal && (this.personalizado3 == null ? that.personalizado3 == null : this.personalizado3.equals(that.personalizado3));
    equal = equal && (this.personalizado4 == null ? that.personalizado4 == null : this.personalizado4.equals(that.personalizado4));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof cliente)) {
      return false;
    }
    cliente that = (cliente) o;
    boolean equal = true;
    equal = equal && (this.id_cliente == null ? that.id_cliente == null : this.id_cliente.equals(that.id_cliente));
    equal = equal && (this.nombre == null ? that.nombre == null : this.nombre.equals(that.nombre));
    equal = equal && (this.apellidos == null ? that.apellidos == null : this.apellidos.equals(that.apellidos));
    equal = equal && (this.numero_id == null ? that.numero_id == null : this.numero_id.equals(that.numero_id));
    equal = equal && (this.email == null ? that.email == null : this.email.equals(that.email));
    equal = equal && (this.telefono == null ? that.telefono == null : this.telefono.equals(that.telefono));
    equal = equal && (this.direccion1 == null ? that.direccion1 == null : this.direccion1.equals(that.direccion1));
    equal = equal && (this.direccion2 == null ? that.direccion2 == null : this.direccion2.equals(that.direccion2));
    equal = equal && (this.cp == null ? that.cp == null : this.cp.equals(that.cp));
    equal = equal && (this.pais == null ? that.pais == null : this.pais.equals(that.pais));
    equal = equal && (this.estado == null ? that.estado == null : this.estado.equals(that.estado));
    equal = equal && (this.ciudad == null ? that.ciudad == null : this.ciudad.equals(that.ciudad));
    equal = equal && (this.fecha_union == null ? that.fecha_union == null : this.fecha_union.equals(that.fecha_union));
    equal = equal && (this.fecha_baja == null ? that.fecha_baja == null : this.fecha_baja.equals(that.fecha_baja));
    equal = equal && (this.tile == null ? that.tile == null : this.tile.equals(that.tile));
    equal = equal && (this.fecha__nacimiento == null ? that.fecha__nacimiento == null : this.fecha__nacimiento.equals(that.fecha__nacimiento));
    equal = equal && (this.id_miembro_prog == null ? that.id_miembro_prog == null : this.id_miembro_prog.equals(that.id_miembro_prog));
    equal = equal && (this.id_pos == null ? that.id_pos == null : this.id_pos.equals(that.id_pos));
    equal = equal && (this.robbinson == null ? that.robbinson == null : this.robbinson.equals(that.robbinson));
    equal = equal && (this.opt_in == null ? that.opt_in == null : this.opt_in.equals(that.opt_in));
    equal = equal && (this.genero == null ? that.genero == null : this.genero.equals(that.genero));
    equal = equal && (this.estado_marital == null ? that.estado_marital == null : this.estado_marital.equals(that.estado_marital));
    equal = equal && (this.num_hijos == null ? that.num_hijos == null : this.num_hijos.equals(that.num_hijos));
    equal = equal && (this.tipo_vivienda == null ? that.tipo_vivienda == null : this.tipo_vivienda.equals(that.tipo_vivienda));
    equal = equal && (this.personalizado1 == null ? that.personalizado1 == null : this.personalizado1.equals(that.personalizado1));
    equal = equal && (this.personalizado2 == null ? that.personalizado2 == null : this.personalizado2.equals(that.personalizado2));
    equal = equal && (this.personalizado3 == null ? that.personalizado3 == null : this.personalizado3.equals(that.personalizado3));
    equal = equal && (this.personalizado4 == null ? that.personalizado4 == null : this.personalizado4.equals(that.personalizado4));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id_cliente = JdbcWritableBridge.readInteger(1, __dbResults);
    this.nombre = JdbcWritableBridge.readString(2, __dbResults);
    this.apellidos = JdbcWritableBridge.readString(3, __dbResults);
    this.numero_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.email = JdbcWritableBridge.readString(5, __dbResults);
    this.telefono = JdbcWritableBridge.readString(6, __dbResults);
    this.direccion1 = JdbcWritableBridge.readString(7, __dbResults);
    this.direccion2 = JdbcWritableBridge.readString(8, __dbResults);
    this.cp = JdbcWritableBridge.readString(9, __dbResults);
    this.pais = JdbcWritableBridge.readString(10, __dbResults);
    this.estado = JdbcWritableBridge.readString(11, __dbResults);
    this.ciudad = JdbcWritableBridge.readString(12, __dbResults);
    this.fecha_union = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fecha_baja = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.tile = JdbcWritableBridge.readString(15, __dbResults);
    this.fecha__nacimiento = JdbcWritableBridge.readDate(16, __dbResults);
    this.id_miembro_prog = JdbcWritableBridge.readInteger(17, __dbResults);
    this.id_pos = JdbcWritableBridge.readInteger(18, __dbResults);
    this.robbinson = JdbcWritableBridge.readString(19, __dbResults);
    this.opt_in = JdbcWritableBridge.readString(20, __dbResults);
    this.genero = JdbcWritableBridge.readString(21, __dbResults);
    this.estado_marital = JdbcWritableBridge.readString(22, __dbResults);
    this.num_hijos = JdbcWritableBridge.readInteger(23, __dbResults);
    this.tipo_vivienda = JdbcWritableBridge.readString(24, __dbResults);
    this.personalizado1 = JdbcWritableBridge.readString(25, __dbResults);
    this.personalizado2 = JdbcWritableBridge.readString(26, __dbResults);
    this.personalizado3 = JdbcWritableBridge.readString(27, __dbResults);
    this.personalizado4 = JdbcWritableBridge.readString(28, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id_cliente = JdbcWritableBridge.readInteger(1, __dbResults);
    this.nombre = JdbcWritableBridge.readString(2, __dbResults);
    this.apellidos = JdbcWritableBridge.readString(3, __dbResults);
    this.numero_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.email = JdbcWritableBridge.readString(5, __dbResults);
    this.telefono = JdbcWritableBridge.readString(6, __dbResults);
    this.direccion1 = JdbcWritableBridge.readString(7, __dbResults);
    this.direccion2 = JdbcWritableBridge.readString(8, __dbResults);
    this.cp = JdbcWritableBridge.readString(9, __dbResults);
    this.pais = JdbcWritableBridge.readString(10, __dbResults);
    this.estado = JdbcWritableBridge.readString(11, __dbResults);
    this.ciudad = JdbcWritableBridge.readString(12, __dbResults);
    this.fecha_union = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fecha_baja = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.tile = JdbcWritableBridge.readString(15, __dbResults);
    this.fecha__nacimiento = JdbcWritableBridge.readDate(16, __dbResults);
    this.id_miembro_prog = JdbcWritableBridge.readInteger(17, __dbResults);
    this.id_pos = JdbcWritableBridge.readInteger(18, __dbResults);
    this.robbinson = JdbcWritableBridge.readString(19, __dbResults);
    this.opt_in = JdbcWritableBridge.readString(20, __dbResults);
    this.genero = JdbcWritableBridge.readString(21, __dbResults);
    this.estado_marital = JdbcWritableBridge.readString(22, __dbResults);
    this.num_hijos = JdbcWritableBridge.readInteger(23, __dbResults);
    this.tipo_vivienda = JdbcWritableBridge.readString(24, __dbResults);
    this.personalizado1 = JdbcWritableBridge.readString(25, __dbResults);
    this.personalizado2 = JdbcWritableBridge.readString(26, __dbResults);
    this.personalizado3 = JdbcWritableBridge.readString(27, __dbResults);
    this.personalizado4 = JdbcWritableBridge.readString(28, __dbResults);
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
    JdbcWritableBridge.writeInteger(id_cliente, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nombre, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(apellidos, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(numero_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(email, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(telefono, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(direccion1, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(direccion2, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cp, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pais, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(estado, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ciudad, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fecha_union, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fecha_baja, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(tile, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(fecha__nacimiento, 16 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(id_miembro_prog, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_pos, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(robbinson, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(opt_in, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(genero, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(estado_marital, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(num_hijos, 23 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(tipo_vivienda, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personalizado1, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personalizado2, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personalizado3, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personalizado4, 28 + __off, 12, __dbStmt);
    return 28;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id_cliente, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nombre, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(apellidos, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(numero_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(email, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(telefono, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(direccion1, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(direccion2, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cp, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pais, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(estado, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ciudad, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fecha_union, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fecha_baja, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(tile, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(fecha__nacimiento, 16 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(id_miembro_prog, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_pos, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(robbinson, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(opt_in, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(genero, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(estado_marital, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(num_hijos, 23 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(tipo_vivienda, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personalizado1, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personalizado2, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personalizado3, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personalizado4, 28 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id_cliente = null;
    } else {
    this.id_cliente = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.nombre = null;
    } else {
    this.nombre = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.apellidos = null;
    } else {
    this.apellidos = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.numero_id = null;
    } else {
    this.numero_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.email = null;
    } else {
    this.email = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.telefono = null;
    } else {
    this.telefono = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.direccion1 = null;
    } else {
    this.direccion1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.direccion2 = null;
    } else {
    this.direccion2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cp = null;
    } else {
    this.cp = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pais = null;
    } else {
    this.pais = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.estado = null;
    } else {
    this.estado = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ciudad = null;
    } else {
    this.ciudad = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fecha_union = null;
    } else {
    this.fecha_union = new Timestamp(__dataIn.readLong());
    this.fecha_union.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fecha_baja = null;
    } else {
    this.fecha_baja = new Timestamp(__dataIn.readLong());
    this.fecha_baja.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tile = null;
    } else {
    this.tile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fecha__nacimiento = null;
    } else {
    this.fecha__nacimiento = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.id_miembro_prog = null;
    } else {
    this.id_miembro_prog = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_pos = null;
    } else {
    this.id_pos = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.robbinson = null;
    } else {
    this.robbinson = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.opt_in = null;
    } else {
    this.opt_in = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.genero = null;
    } else {
    this.genero = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.estado_marital = null;
    } else {
    this.estado_marital = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.num_hijos = null;
    } else {
    this.num_hijos = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tipo_vivienda = null;
    } else {
    this.tipo_vivienda = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.personalizado1 = null;
    } else {
    this.personalizado1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.personalizado2 = null;
    } else {
    this.personalizado2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.personalizado3 = null;
    } else {
    this.personalizado3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.personalizado4 = null;
    } else {
    this.personalizado4 = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id_cliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_cliente);
    }
    if (null == this.nombre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nombre);
    }
    if (null == this.apellidos) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, apellidos);
    }
    if (null == this.numero_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.numero_id);
    }
    if (null == this.email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, email);
    }
    if (null == this.telefono) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, telefono);
    }
    if (null == this.direccion1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, direccion1);
    }
    if (null == this.direccion2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, direccion2);
    }
    if (null == this.cp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cp);
    }
    if (null == this.pais) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pais);
    }
    if (null == this.estado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, estado);
    }
    if (null == this.ciudad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ciudad);
    }
    if (null == this.fecha_union) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_union.getTime());
    __dataOut.writeInt(this.fecha_union.getNanos());
    }
    if (null == this.fecha_baja) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_baja.getTime());
    __dataOut.writeInt(this.fecha_baja.getNanos());
    }
    if (null == this.tile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tile);
    }
    if (null == this.fecha__nacimiento) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha__nacimiento.getTime());
    }
    if (null == this.id_miembro_prog) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_miembro_prog);
    }
    if (null == this.id_pos) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_pos);
    }
    if (null == this.robbinson) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, robbinson);
    }
    if (null == this.opt_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, opt_in);
    }
    if (null == this.genero) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, genero);
    }
    if (null == this.estado_marital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, estado_marital);
    }
    if (null == this.num_hijos) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.num_hijos);
    }
    if (null == this.tipo_vivienda) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tipo_vivienda);
    }
    if (null == this.personalizado1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personalizado1);
    }
    if (null == this.personalizado2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personalizado2);
    }
    if (null == this.personalizado3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personalizado3);
    }
    if (null == this.personalizado4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personalizado4);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id_cliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_cliente);
    }
    if (null == this.nombre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nombre);
    }
    if (null == this.apellidos) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, apellidos);
    }
    if (null == this.numero_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.numero_id);
    }
    if (null == this.email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, email);
    }
    if (null == this.telefono) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, telefono);
    }
    if (null == this.direccion1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, direccion1);
    }
    if (null == this.direccion2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, direccion2);
    }
    if (null == this.cp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cp);
    }
    if (null == this.pais) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pais);
    }
    if (null == this.estado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, estado);
    }
    if (null == this.ciudad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ciudad);
    }
    if (null == this.fecha_union) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_union.getTime());
    __dataOut.writeInt(this.fecha_union.getNanos());
    }
    if (null == this.fecha_baja) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_baja.getTime());
    __dataOut.writeInt(this.fecha_baja.getNanos());
    }
    if (null == this.tile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tile);
    }
    if (null == this.fecha__nacimiento) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha__nacimiento.getTime());
    }
    if (null == this.id_miembro_prog) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_miembro_prog);
    }
    if (null == this.id_pos) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_pos);
    }
    if (null == this.robbinson) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, robbinson);
    }
    if (null == this.opt_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, opt_in);
    }
    if (null == this.genero) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, genero);
    }
    if (null == this.estado_marital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, estado_marital);
    }
    if (null == this.num_hijos) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.num_hijos);
    }
    if (null == this.tipo_vivienda) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tipo_vivienda);
    }
    if (null == this.personalizado1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personalizado1);
    }
    if (null == this.personalizado2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personalizado2);
    }
    if (null == this.personalizado3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personalizado3);
    }
    if (null == this.personalizado4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personalizado4);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id_cliente==null?"null":"" + id_cliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nombre==null?"null":nombre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(apellidos==null?"null":apellidos, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(numero_id==null?"null":"" + numero_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(email==null?"null":email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(telefono==null?"null":telefono, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(direccion1==null?"null":direccion1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(direccion2==null?"null":direccion2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cp==null?"null":cp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pais==null?"null":pais, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado==null?"null":estado, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ciudad==null?"null":ciudad, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_union==null?"null":"" + fecha_union, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_baja==null?"null":"" + fecha_baja, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tile==null?"null":tile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha__nacimiento==null?"null":"" + fecha__nacimiento, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_miembro_prog==null?"null":"" + id_miembro_prog, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_pos==null?"null":"" + id_pos, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(robbinson==null?"null":robbinson, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(opt_in==null?"null":opt_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genero==null?"null":genero, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado_marital==null?"null":estado_marital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(num_hijos==null?"null":"" + num_hijos, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tipo_vivienda==null?"null":tipo_vivienda, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personalizado1==null?"null":personalizado1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personalizado2==null?"null":personalizado2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personalizado3==null?"null":personalizado3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personalizado4==null?"null":personalizado4, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id_cliente==null?"null":"" + id_cliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nombre==null?"null":nombre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(apellidos==null?"null":apellidos, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(numero_id==null?"null":"" + numero_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(email==null?"null":email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(telefono==null?"null":telefono, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(direccion1==null?"null":direccion1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(direccion2==null?"null":direccion2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cp==null?"null":cp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pais==null?"null":pais, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado==null?"null":estado, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ciudad==null?"null":ciudad, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_union==null?"null":"" + fecha_union, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_baja==null?"null":"" + fecha_baja, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tile==null?"null":tile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha__nacimiento==null?"null":"" + fecha__nacimiento, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_miembro_prog==null?"null":"" + id_miembro_prog, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_pos==null?"null":"" + id_pos, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(robbinson==null?"null":robbinson, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(opt_in==null?"null":opt_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genero==null?"null":genero, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado_marital==null?"null":estado_marital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(num_hijos==null?"null":"" + num_hijos, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tipo_vivienda==null?"null":tipo_vivienda, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personalizado1==null?"null":personalizado1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personalizado2==null?"null":personalizado2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personalizado3==null?"null":personalizado3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personalizado4==null?"null":personalizado4, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_cliente = null; } else {
      this.id_cliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nombre = null; } else {
      this.nombre = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.apellidos = null; } else {
      this.apellidos = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.numero_id = null; } else {
      this.numero_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.email = null; } else {
      this.email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.telefono = null; } else {
      this.telefono = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.direccion1 = null; } else {
      this.direccion1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.direccion2 = null; } else {
      this.direccion2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cp = null; } else {
      this.cp = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pais = null; } else {
      this.pais = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.estado = null; } else {
      this.estado = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ciudad = null; } else {
      this.ciudad = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_union = null; } else {
      this.fecha_union = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_baja = null; } else {
      this.fecha_baja = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tile = null; } else {
      this.tile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha__nacimiento = null; } else {
      this.fecha__nacimiento = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_miembro_prog = null; } else {
      this.id_miembro_prog = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_pos = null; } else {
      this.id_pos = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.robbinson = null; } else {
      this.robbinson = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.opt_in = null; } else {
      this.opt_in = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.genero = null; } else {
      this.genero = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.estado_marital = null; } else {
      this.estado_marital = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.num_hijos = null; } else {
      this.num_hijos = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tipo_vivienda = null; } else {
      this.tipo_vivienda = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.personalizado1 = null; } else {
      this.personalizado1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.personalizado2 = null; } else {
      this.personalizado2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.personalizado3 = null; } else {
      this.personalizado3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.personalizado4 = null; } else {
      this.personalizado4 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_cliente = null; } else {
      this.id_cliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nombre = null; } else {
      this.nombre = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.apellidos = null; } else {
      this.apellidos = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.numero_id = null; } else {
      this.numero_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.email = null; } else {
      this.email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.telefono = null; } else {
      this.telefono = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.direccion1 = null; } else {
      this.direccion1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.direccion2 = null; } else {
      this.direccion2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cp = null; } else {
      this.cp = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pais = null; } else {
      this.pais = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.estado = null; } else {
      this.estado = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ciudad = null; } else {
      this.ciudad = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_union = null; } else {
      this.fecha_union = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_baja = null; } else {
      this.fecha_baja = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tile = null; } else {
      this.tile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha__nacimiento = null; } else {
      this.fecha__nacimiento = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_miembro_prog = null; } else {
      this.id_miembro_prog = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_pos = null; } else {
      this.id_pos = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.robbinson = null; } else {
      this.robbinson = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.opt_in = null; } else {
      this.opt_in = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.genero = null; } else {
      this.genero = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.estado_marital = null; } else {
      this.estado_marital = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.num_hijos = null; } else {
      this.num_hijos = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tipo_vivienda = null; } else {
      this.tipo_vivienda = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.personalizado1 = null; } else {
      this.personalizado1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.personalizado2 = null; } else {
      this.personalizado2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.personalizado3 = null; } else {
      this.personalizado3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.personalizado4 = null; } else {
      this.personalizado4 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    cliente o = (cliente) super.clone();
    o.fecha_union = (o.fecha_union != null) ? (java.sql.Timestamp) o.fecha_union.clone() : null;
    o.fecha_baja = (o.fecha_baja != null) ? (java.sql.Timestamp) o.fecha_baja.clone() : null;
    o.fecha__nacimiento = (o.fecha__nacimiento != null) ? (java.sql.Date) o.fecha__nacimiento.clone() : null;
    return o;
  }

  public void clone0(cliente o) throws CloneNotSupportedException {
    o.fecha_union = (o.fecha_union != null) ? (java.sql.Timestamp) o.fecha_union.clone() : null;
    o.fecha_baja = (o.fecha_baja != null) ? (java.sql.Timestamp) o.fecha_baja.clone() : null;
    o.fecha__nacimiento = (o.fecha__nacimiento != null) ? (java.sql.Date) o.fecha__nacimiento.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id_cliente", this.id_cliente);
    __sqoop$field_map.put("nombre", this.nombre);
    __sqoop$field_map.put("apellidos", this.apellidos);
    __sqoop$field_map.put("numero_id", this.numero_id);
    __sqoop$field_map.put("email", this.email);
    __sqoop$field_map.put("telefono", this.telefono);
    __sqoop$field_map.put("direccion1", this.direccion1);
    __sqoop$field_map.put("direccion2", this.direccion2);
    __sqoop$field_map.put("cp", this.cp);
    __sqoop$field_map.put("pais", this.pais);
    __sqoop$field_map.put("estado", this.estado);
    __sqoop$field_map.put("ciudad", this.ciudad);
    __sqoop$field_map.put("fecha_union", this.fecha_union);
    __sqoop$field_map.put("fecha_baja", this.fecha_baja);
    __sqoop$field_map.put("tile", this.tile);
    __sqoop$field_map.put("fecha__nacimiento", this.fecha__nacimiento);
    __sqoop$field_map.put("id_miembro_prog", this.id_miembro_prog);
    __sqoop$field_map.put("id_pos", this.id_pos);
    __sqoop$field_map.put("robbinson", this.robbinson);
    __sqoop$field_map.put("opt_in", this.opt_in);
    __sqoop$field_map.put("genero", this.genero);
    __sqoop$field_map.put("estado_marital", this.estado_marital);
    __sqoop$field_map.put("num_hijos", this.num_hijos);
    __sqoop$field_map.put("tipo_vivienda", this.tipo_vivienda);
    __sqoop$field_map.put("personalizado1", this.personalizado1);
    __sqoop$field_map.put("personalizado2", this.personalizado2);
    __sqoop$field_map.put("personalizado3", this.personalizado3);
    __sqoop$field_map.put("personalizado4", this.personalizado4);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id_cliente", this.id_cliente);
    __sqoop$field_map.put("nombre", this.nombre);
    __sqoop$field_map.put("apellidos", this.apellidos);
    __sqoop$field_map.put("numero_id", this.numero_id);
    __sqoop$field_map.put("email", this.email);
    __sqoop$field_map.put("telefono", this.telefono);
    __sqoop$field_map.put("direccion1", this.direccion1);
    __sqoop$field_map.put("direccion2", this.direccion2);
    __sqoop$field_map.put("cp", this.cp);
    __sqoop$field_map.put("pais", this.pais);
    __sqoop$field_map.put("estado", this.estado);
    __sqoop$field_map.put("ciudad", this.ciudad);
    __sqoop$field_map.put("fecha_union", this.fecha_union);
    __sqoop$field_map.put("fecha_baja", this.fecha_baja);
    __sqoop$field_map.put("tile", this.tile);
    __sqoop$field_map.put("fecha__nacimiento", this.fecha__nacimiento);
    __sqoop$field_map.put("id_miembro_prog", this.id_miembro_prog);
    __sqoop$field_map.put("id_pos", this.id_pos);
    __sqoop$field_map.put("robbinson", this.robbinson);
    __sqoop$field_map.put("opt_in", this.opt_in);
    __sqoop$field_map.put("genero", this.genero);
    __sqoop$field_map.put("estado_marital", this.estado_marital);
    __sqoop$field_map.put("num_hijos", this.num_hijos);
    __sqoop$field_map.put("tipo_vivienda", this.tipo_vivienda);
    __sqoop$field_map.put("personalizado1", this.personalizado1);
    __sqoop$field_map.put("personalizado2", this.personalizado2);
    __sqoop$field_map.put("personalizado3", this.personalizado3);
    __sqoop$field_map.put("personalizado4", this.personalizado4);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id_cliente".equals(__fieldName)) {
      this.id_cliente = (Integer) __fieldVal;
    }
    else    if ("nombre".equals(__fieldName)) {
      this.nombre = (String) __fieldVal;
    }
    else    if ("apellidos".equals(__fieldName)) {
      this.apellidos = (String) __fieldVal;
    }
    else    if ("numero_id".equals(__fieldName)) {
      this.numero_id = (Integer) __fieldVal;
    }
    else    if ("email".equals(__fieldName)) {
      this.email = (String) __fieldVal;
    }
    else    if ("telefono".equals(__fieldName)) {
      this.telefono = (String) __fieldVal;
    }
    else    if ("direccion1".equals(__fieldName)) {
      this.direccion1 = (String) __fieldVal;
    }
    else    if ("direccion2".equals(__fieldName)) {
      this.direccion2 = (String) __fieldVal;
    }
    else    if ("cp".equals(__fieldName)) {
      this.cp = (String) __fieldVal;
    }
    else    if ("pais".equals(__fieldName)) {
      this.pais = (String) __fieldVal;
    }
    else    if ("estado".equals(__fieldName)) {
      this.estado = (String) __fieldVal;
    }
    else    if ("ciudad".equals(__fieldName)) {
      this.ciudad = (String) __fieldVal;
    }
    else    if ("fecha_union".equals(__fieldName)) {
      this.fecha_union = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("fecha_baja".equals(__fieldName)) {
      this.fecha_baja = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("tile".equals(__fieldName)) {
      this.tile = (String) __fieldVal;
    }
    else    if ("fecha__nacimiento".equals(__fieldName)) {
      this.fecha__nacimiento = (java.sql.Date) __fieldVal;
    }
    else    if ("id_miembro_prog".equals(__fieldName)) {
      this.id_miembro_prog = (Integer) __fieldVal;
    }
    else    if ("id_pos".equals(__fieldName)) {
      this.id_pos = (Integer) __fieldVal;
    }
    else    if ("robbinson".equals(__fieldName)) {
      this.robbinson = (String) __fieldVal;
    }
    else    if ("opt_in".equals(__fieldName)) {
      this.opt_in = (String) __fieldVal;
    }
    else    if ("genero".equals(__fieldName)) {
      this.genero = (String) __fieldVal;
    }
    else    if ("estado_marital".equals(__fieldName)) {
      this.estado_marital = (String) __fieldVal;
    }
    else    if ("num_hijos".equals(__fieldName)) {
      this.num_hijos = (Integer) __fieldVal;
    }
    else    if ("tipo_vivienda".equals(__fieldName)) {
      this.tipo_vivienda = (String) __fieldVal;
    }
    else    if ("personalizado1".equals(__fieldName)) {
      this.personalizado1 = (String) __fieldVal;
    }
    else    if ("personalizado2".equals(__fieldName)) {
      this.personalizado2 = (String) __fieldVal;
    }
    else    if ("personalizado3".equals(__fieldName)) {
      this.personalizado3 = (String) __fieldVal;
    }
    else    if ("personalizado4".equals(__fieldName)) {
      this.personalizado4 = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id_cliente".equals(__fieldName)) {
      this.id_cliente = (Integer) __fieldVal;
      return true;
    }
    else    if ("nombre".equals(__fieldName)) {
      this.nombre = (String) __fieldVal;
      return true;
    }
    else    if ("apellidos".equals(__fieldName)) {
      this.apellidos = (String) __fieldVal;
      return true;
    }
    else    if ("numero_id".equals(__fieldName)) {
      this.numero_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("email".equals(__fieldName)) {
      this.email = (String) __fieldVal;
      return true;
    }
    else    if ("telefono".equals(__fieldName)) {
      this.telefono = (String) __fieldVal;
      return true;
    }
    else    if ("direccion1".equals(__fieldName)) {
      this.direccion1 = (String) __fieldVal;
      return true;
    }
    else    if ("direccion2".equals(__fieldName)) {
      this.direccion2 = (String) __fieldVal;
      return true;
    }
    else    if ("cp".equals(__fieldName)) {
      this.cp = (String) __fieldVal;
      return true;
    }
    else    if ("pais".equals(__fieldName)) {
      this.pais = (String) __fieldVal;
      return true;
    }
    else    if ("estado".equals(__fieldName)) {
      this.estado = (String) __fieldVal;
      return true;
    }
    else    if ("ciudad".equals(__fieldName)) {
      this.ciudad = (String) __fieldVal;
      return true;
    }
    else    if ("fecha_union".equals(__fieldName)) {
      this.fecha_union = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("fecha_baja".equals(__fieldName)) {
      this.fecha_baja = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("tile".equals(__fieldName)) {
      this.tile = (String) __fieldVal;
      return true;
    }
    else    if ("fecha__nacimiento".equals(__fieldName)) {
      this.fecha__nacimiento = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("id_miembro_prog".equals(__fieldName)) {
      this.id_miembro_prog = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_pos".equals(__fieldName)) {
      this.id_pos = (Integer) __fieldVal;
      return true;
    }
    else    if ("robbinson".equals(__fieldName)) {
      this.robbinson = (String) __fieldVal;
      return true;
    }
    else    if ("opt_in".equals(__fieldName)) {
      this.opt_in = (String) __fieldVal;
      return true;
    }
    else    if ("genero".equals(__fieldName)) {
      this.genero = (String) __fieldVal;
      return true;
    }
    else    if ("estado_marital".equals(__fieldName)) {
      this.estado_marital = (String) __fieldVal;
      return true;
    }
    else    if ("num_hijos".equals(__fieldName)) {
      this.num_hijos = (Integer) __fieldVal;
      return true;
    }
    else    if ("tipo_vivienda".equals(__fieldName)) {
      this.tipo_vivienda = (String) __fieldVal;
      return true;
    }
    else    if ("personalizado1".equals(__fieldName)) {
      this.personalizado1 = (String) __fieldVal;
      return true;
    }
    else    if ("personalizado2".equals(__fieldName)) {
      this.personalizado2 = (String) __fieldVal;
      return true;
    }
    else    if ("personalizado3".equals(__fieldName)) {
      this.personalizado3 = (String) __fieldVal;
      return true;
    }
    else    if ("personalizado4".equals(__fieldName)) {
      this.personalizado4 = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
