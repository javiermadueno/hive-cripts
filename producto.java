// ORM class for table 'producto'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri May 15 03:33:18 PDT 2015
// For connector: org.apache.sqoop.manager.MySQLManager
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

public class producto extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id_producto;
  public Integer get_id_producto() {
    return id_producto;
  }
  public void set_id_producto(Integer id_producto) {
    this.id_producto = id_producto;
  }
  public producto with_id_producto(Integer id_producto) {
    this.id_producto = id_producto;
    return this;
  }
  private Integer id_categoria;
  public Integer get_id_categoria() {
    return id_categoria;
  }
  public void set_id_categoria(Integer id_categoria) {
    this.id_categoria = id_categoria;
  }
  public producto with_id_categoria(Integer id_categoria) {
    this.id_categoria = id_categoria;
    return this;
  }
  private Integer id_marca;
  public Integer get_id_marca() {
    return id_marca;
  }
  public void set_id_marca(Integer id_marca) {
    this.id_marca = id_marca;
  }
  public producto with_id_marca(Integer id_marca) {
    this.id_marca = id_marca;
    return this;
  }
  private Integer id_proveedor;
  public Integer get_id_proveedor() {
    return id_proveedor;
  }
  public void set_id_proveedor(Integer id_proveedor) {
    this.id_proveedor = id_proveedor;
  }
  public producto with_id_proveedor(Integer id_proveedor) {
    this.id_proveedor = id_proveedor;
    return this;
  }
  private String nombre;
  public String get_nombre() {
    return nombre;
  }
  public void set_nombre(String nombre) {
    this.nombre = nombre;
  }
  public producto with_nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }
  private String cod_sku;
  public String get_cod_sku() {
    return cod_sku;
  }
  public void set_cod_sku(String cod_sku) {
    this.cod_sku = cod_sku;
  }
  public producto with_cod_sku(String cod_sku) {
    this.cod_sku = cod_sku;
    return this;
  }
  private java.sql.Timestamp fecha_lanzamiento;
  public java.sql.Timestamp get_fecha_lanzamiento() {
    return fecha_lanzamiento;
  }
  public void set_fecha_lanzamiento(java.sql.Timestamp fecha_lanzamiento) {
    this.fecha_lanzamiento = fecha_lanzamiento;
  }
  public producto with_fecha_lanzamiento(java.sql.Timestamp fecha_lanzamiento) {
    this.fecha_lanzamiento = fecha_lanzamiento;
    return this;
  }
  private Double precio_venta;
  public Double get_precio_venta() {
    return precio_venta;
  }
  public void set_precio_venta(Double precio_venta) {
    this.precio_venta = precio_venta;
  }
  public producto with_precio_venta(Double precio_venta) {
    this.precio_venta = precio_venta;
    return this;
  }
  private Double precio_estandar;
  public Double get_precio_estandar() {
    return precio_estandar;
  }
  public void set_precio_estandar(Double precio_estandar) {
    this.precio_estandar = precio_estandar;
  }
  public producto with_precio_estandar(Double precio_estandar) {
    this.precio_estandar = precio_estandar;
    return this;
  }
  private Double precio_unitario;
  public Double get_precio_unitario() {
    return precio_unitario;
  }
  public void set_precio_unitario(Double precio_unitario) {
    this.precio_unitario = precio_unitario;
  }
  public producto with_precio_unitario(Double precio_unitario) {
    this.precio_unitario = precio_unitario;
    return this;
  }
  private String volumen;
  public String get_volumen() {
    return volumen;
  }
  public void set_volumen(String volumen) {
    this.volumen = volumen;
  }
  public producto with_volumen(String volumen) {
    this.volumen = volumen;
    return this;
  }
  private Integer activo;
  public Integer get_activo() {
    return activo;
  }
  public void set_activo(Integer activo) {
    this.activo = activo;
  }
  public producto with_activo(Integer activo) {
    this.activo = activo;
    return this;
  }
  private Integer id_categoria2;
  public Integer get_id_categoria2() {
    return id_categoria2;
  }
  public void set_id_categoria2(Integer id_categoria2) {
    this.id_categoria2 = id_categoria2;
  }
  public producto with_id_categoria2(Integer id_categoria2) {
    this.id_categoria2 = id_categoria2;
    return this;
  }
  private Integer id_categoria3;
  public Integer get_id_categoria3() {
    return id_categoria3;
  }
  public void set_id_categoria3(Integer id_categoria3) {
    this.id_categoria3 = id_categoria3;
  }
  public producto with_id_categoria3(Integer id_categoria3) {
    this.id_categoria3 = id_categoria3;
    return this;
  }
  private Integer id_categoria4;
  public Integer get_id_categoria4() {
    return id_categoria4;
  }
  public void set_id_categoria4(Integer id_categoria4) {
    this.id_categoria4 = id_categoria4;
  }
  public producto with_id_categoria4(Integer id_categoria4) {
    this.id_categoria4 = id_categoria4;
    return this;
  }
  private Integer id_categoria5;
  public Integer get_id_categoria5() {
    return id_categoria5;
  }
  public void set_id_categoria5(Integer id_categoria5) {
    this.id_categoria5 = id_categoria5;
  }
  public producto with_id_categoria5(Integer id_categoria5) {
    this.id_categoria5 = id_categoria5;
    return this;
  }
  private Integer id_categoria6;
  public Integer get_id_categoria6() {
    return id_categoria6;
  }
  public void set_id_categoria6(Integer id_categoria6) {
    this.id_categoria6 = id_categoria6;
  }
  public producto with_id_categoria6(Integer id_categoria6) {
    this.id_categoria6 = id_categoria6;
    return this;
  }
  private Integer id_categoria7;
  public Integer get_id_categoria7() {
    return id_categoria7;
  }
  public void set_id_categoria7(Integer id_categoria7) {
    this.id_categoria7 = id_categoria7;
  }
  public producto with_id_categoria7(Integer id_categoria7) {
    this.id_categoria7 = id_categoria7;
    return this;
  }
  private Integer id_categoria8;
  public Integer get_id_categoria8() {
    return id_categoria8;
  }
  public void set_id_categoria8(Integer id_categoria8) {
    this.id_categoria8 = id_categoria8;
  }
  public producto with_id_categoria8(Integer id_categoria8) {
    this.id_categoria8 = id_categoria8;
    return this;
  }
  private Integer id_categoria9;
  public Integer get_id_categoria9() {
    return id_categoria9;
  }
  public void set_id_categoria9(Integer id_categoria9) {
    this.id_categoria9 = id_categoria9;
  }
  public producto with_id_categoria9(Integer id_categoria9) {
    this.id_categoria9 = id_categoria9;
    return this;
  }
  private Integer id_categoria10;
  public Integer get_id_categoria10() {
    return id_categoria10;
  }
  public void set_id_categoria10(Integer id_categoria10) {
    this.id_categoria10 = id_categoria10;
  }
  public producto with_id_categoria10(Integer id_categoria10) {
    this.id_categoria10 = id_categoria10;
    return this;
  }
  private Integer id_categoria11;
  public Integer get_id_categoria11() {
    return id_categoria11;
  }
  public void set_id_categoria11(Integer id_categoria11) {
    this.id_categoria11 = id_categoria11;
  }
  public producto with_id_categoria11(Integer id_categoria11) {
    this.id_categoria11 = id_categoria11;
    return this;
  }
  private Double gama;
  public Double get_gama() {
    return gama;
  }
  public void set_gama(Double gama) {
    this.gama = gama;
  }
  public producto with_gama(Double gama) {
    this.gama = gama;
    return this;
  }
  private String campo2;
  public String get_campo2() {
    return campo2;
  }
  public void set_campo2(String campo2) {
    this.campo2 = campo2;
  }
  public producto with_campo2(String campo2) {
    this.campo2 = campo2;
    return this;
  }
  private String campo3;
  public String get_campo3() {
    return campo3;
  }
  public void set_campo3(String campo3) {
    this.campo3 = campo3;
  }
  public producto with_campo3(String campo3) {
    this.campo3 = campo3;
    return this;
  }
  private String campo4;
  public String get_campo4() {
    return campo4;
  }
  public void set_campo4(String campo4) {
    this.campo4 = campo4;
  }
  public producto with_campo4(String campo4) {
    this.campo4 = campo4;
    return this;
  }
  private String campo5;
  public String get_campo5() {
    return campo5;
  }
  public void set_campo5(String campo5) {
    this.campo5 = campo5;
  }
  public producto with_campo5(String campo5) {
    this.campo5 = campo5;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof producto)) {
      return false;
    }
    producto that = (producto) o;
    boolean equal = true;
    equal = equal && (this.id_producto == null ? that.id_producto == null : this.id_producto.equals(that.id_producto));
    equal = equal && (this.id_categoria == null ? that.id_categoria == null : this.id_categoria.equals(that.id_categoria));
    equal = equal && (this.id_marca == null ? that.id_marca == null : this.id_marca.equals(that.id_marca));
    equal = equal && (this.id_proveedor == null ? that.id_proveedor == null : this.id_proveedor.equals(that.id_proveedor));
    equal = equal && (this.nombre == null ? that.nombre == null : this.nombre.equals(that.nombre));
    equal = equal && (this.cod_sku == null ? that.cod_sku == null : this.cod_sku.equals(that.cod_sku));
    equal = equal && (this.fecha_lanzamiento == null ? that.fecha_lanzamiento == null : this.fecha_lanzamiento.equals(that.fecha_lanzamiento));
    equal = equal && (this.precio_venta == null ? that.precio_venta == null : this.precio_venta.equals(that.precio_venta));
    equal = equal && (this.precio_estandar == null ? that.precio_estandar == null : this.precio_estandar.equals(that.precio_estandar));
    equal = equal && (this.precio_unitario == null ? that.precio_unitario == null : this.precio_unitario.equals(that.precio_unitario));
    equal = equal && (this.volumen == null ? that.volumen == null : this.volumen.equals(that.volumen));
    equal = equal && (this.activo == null ? that.activo == null : this.activo.equals(that.activo));
    equal = equal && (this.id_categoria2 == null ? that.id_categoria2 == null : this.id_categoria2.equals(that.id_categoria2));
    equal = equal && (this.id_categoria3 == null ? that.id_categoria3 == null : this.id_categoria3.equals(that.id_categoria3));
    equal = equal && (this.id_categoria4 == null ? that.id_categoria4 == null : this.id_categoria4.equals(that.id_categoria4));
    equal = equal && (this.id_categoria5 == null ? that.id_categoria5 == null : this.id_categoria5.equals(that.id_categoria5));
    equal = equal && (this.id_categoria6 == null ? that.id_categoria6 == null : this.id_categoria6.equals(that.id_categoria6));
    equal = equal && (this.id_categoria7 == null ? that.id_categoria7 == null : this.id_categoria7.equals(that.id_categoria7));
    equal = equal && (this.id_categoria8 == null ? that.id_categoria8 == null : this.id_categoria8.equals(that.id_categoria8));
    equal = equal && (this.id_categoria9 == null ? that.id_categoria9 == null : this.id_categoria9.equals(that.id_categoria9));
    equal = equal && (this.id_categoria10 == null ? that.id_categoria10 == null : this.id_categoria10.equals(that.id_categoria10));
    equal = equal && (this.id_categoria11 == null ? that.id_categoria11 == null : this.id_categoria11.equals(that.id_categoria11));
    equal = equal && (this.gama == null ? that.gama == null : this.gama.equals(that.gama));
    equal = equal && (this.campo2 == null ? that.campo2 == null : this.campo2.equals(that.campo2));
    equal = equal && (this.campo3 == null ? that.campo3 == null : this.campo3.equals(that.campo3));
    equal = equal && (this.campo4 == null ? that.campo4 == null : this.campo4.equals(that.campo4));
    equal = equal && (this.campo5 == null ? that.campo5 == null : this.campo5.equals(that.campo5));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof producto)) {
      return false;
    }
    producto that = (producto) o;
    boolean equal = true;
    equal = equal && (this.id_producto == null ? that.id_producto == null : this.id_producto.equals(that.id_producto));
    equal = equal && (this.id_categoria == null ? that.id_categoria == null : this.id_categoria.equals(that.id_categoria));
    equal = equal && (this.id_marca == null ? that.id_marca == null : this.id_marca.equals(that.id_marca));
    equal = equal && (this.id_proveedor == null ? that.id_proveedor == null : this.id_proveedor.equals(that.id_proveedor));
    equal = equal && (this.nombre == null ? that.nombre == null : this.nombre.equals(that.nombre));
    equal = equal && (this.cod_sku == null ? that.cod_sku == null : this.cod_sku.equals(that.cod_sku));
    equal = equal && (this.fecha_lanzamiento == null ? that.fecha_lanzamiento == null : this.fecha_lanzamiento.equals(that.fecha_lanzamiento));
    equal = equal && (this.precio_venta == null ? that.precio_venta == null : this.precio_venta.equals(that.precio_venta));
    equal = equal && (this.precio_estandar == null ? that.precio_estandar == null : this.precio_estandar.equals(that.precio_estandar));
    equal = equal && (this.precio_unitario == null ? that.precio_unitario == null : this.precio_unitario.equals(that.precio_unitario));
    equal = equal && (this.volumen == null ? that.volumen == null : this.volumen.equals(that.volumen));
    equal = equal && (this.activo == null ? that.activo == null : this.activo.equals(that.activo));
    equal = equal && (this.id_categoria2 == null ? that.id_categoria2 == null : this.id_categoria2.equals(that.id_categoria2));
    equal = equal && (this.id_categoria3 == null ? that.id_categoria3 == null : this.id_categoria3.equals(that.id_categoria3));
    equal = equal && (this.id_categoria4 == null ? that.id_categoria4 == null : this.id_categoria4.equals(that.id_categoria4));
    equal = equal && (this.id_categoria5 == null ? that.id_categoria5 == null : this.id_categoria5.equals(that.id_categoria5));
    equal = equal && (this.id_categoria6 == null ? that.id_categoria6 == null : this.id_categoria6.equals(that.id_categoria6));
    equal = equal && (this.id_categoria7 == null ? that.id_categoria7 == null : this.id_categoria7.equals(that.id_categoria7));
    equal = equal && (this.id_categoria8 == null ? that.id_categoria8 == null : this.id_categoria8.equals(that.id_categoria8));
    equal = equal && (this.id_categoria9 == null ? that.id_categoria9 == null : this.id_categoria9.equals(that.id_categoria9));
    equal = equal && (this.id_categoria10 == null ? that.id_categoria10 == null : this.id_categoria10.equals(that.id_categoria10));
    equal = equal && (this.id_categoria11 == null ? that.id_categoria11 == null : this.id_categoria11.equals(that.id_categoria11));
    equal = equal && (this.gama == null ? that.gama == null : this.gama.equals(that.gama));
    equal = equal && (this.campo2 == null ? that.campo2 == null : this.campo2.equals(that.campo2));
    equal = equal && (this.campo3 == null ? that.campo3 == null : this.campo3.equals(that.campo3));
    equal = equal && (this.campo4 == null ? that.campo4 == null : this.campo4.equals(that.campo4));
    equal = equal && (this.campo5 == null ? that.campo5 == null : this.campo5.equals(that.campo5));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id_producto = JdbcWritableBridge.readInteger(1, __dbResults);
    this.id_categoria = JdbcWritableBridge.readInteger(2, __dbResults);
    this.id_marca = JdbcWritableBridge.readInteger(3, __dbResults);
    this.id_proveedor = JdbcWritableBridge.readInteger(4, __dbResults);
    this.nombre = JdbcWritableBridge.readString(5, __dbResults);
    this.cod_sku = JdbcWritableBridge.readString(6, __dbResults);
    this.fecha_lanzamiento = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.precio_venta = JdbcWritableBridge.readDouble(8, __dbResults);
    this.precio_estandar = JdbcWritableBridge.readDouble(9, __dbResults);
    this.precio_unitario = JdbcWritableBridge.readDouble(10, __dbResults);
    this.volumen = JdbcWritableBridge.readString(11, __dbResults);
    this.activo = JdbcWritableBridge.readInteger(12, __dbResults);
    this.id_categoria2 = JdbcWritableBridge.readInteger(13, __dbResults);
    this.id_categoria3 = JdbcWritableBridge.readInteger(14, __dbResults);
    this.id_categoria4 = JdbcWritableBridge.readInteger(15, __dbResults);
    this.id_categoria5 = JdbcWritableBridge.readInteger(16, __dbResults);
    this.id_categoria6 = JdbcWritableBridge.readInteger(17, __dbResults);
    this.id_categoria7 = JdbcWritableBridge.readInteger(18, __dbResults);
    this.id_categoria8 = JdbcWritableBridge.readInteger(19, __dbResults);
    this.id_categoria9 = JdbcWritableBridge.readInteger(20, __dbResults);
    this.id_categoria10 = JdbcWritableBridge.readInteger(21, __dbResults);
    this.id_categoria11 = JdbcWritableBridge.readInteger(22, __dbResults);
    this.gama = JdbcWritableBridge.readDouble(23, __dbResults);
    this.campo2 = JdbcWritableBridge.readString(24, __dbResults);
    this.campo3 = JdbcWritableBridge.readString(25, __dbResults);
    this.campo4 = JdbcWritableBridge.readString(26, __dbResults);
    this.campo5 = JdbcWritableBridge.readString(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id_producto = JdbcWritableBridge.readInteger(1, __dbResults);
    this.id_categoria = JdbcWritableBridge.readInteger(2, __dbResults);
    this.id_marca = JdbcWritableBridge.readInteger(3, __dbResults);
    this.id_proveedor = JdbcWritableBridge.readInteger(4, __dbResults);
    this.nombre = JdbcWritableBridge.readString(5, __dbResults);
    this.cod_sku = JdbcWritableBridge.readString(6, __dbResults);
    this.fecha_lanzamiento = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.precio_venta = JdbcWritableBridge.readDouble(8, __dbResults);
    this.precio_estandar = JdbcWritableBridge.readDouble(9, __dbResults);
    this.precio_unitario = JdbcWritableBridge.readDouble(10, __dbResults);
    this.volumen = JdbcWritableBridge.readString(11, __dbResults);
    this.activo = JdbcWritableBridge.readInteger(12, __dbResults);
    this.id_categoria2 = JdbcWritableBridge.readInteger(13, __dbResults);
    this.id_categoria3 = JdbcWritableBridge.readInteger(14, __dbResults);
    this.id_categoria4 = JdbcWritableBridge.readInteger(15, __dbResults);
    this.id_categoria5 = JdbcWritableBridge.readInteger(16, __dbResults);
    this.id_categoria6 = JdbcWritableBridge.readInteger(17, __dbResults);
    this.id_categoria7 = JdbcWritableBridge.readInteger(18, __dbResults);
    this.id_categoria8 = JdbcWritableBridge.readInteger(19, __dbResults);
    this.id_categoria9 = JdbcWritableBridge.readInteger(20, __dbResults);
    this.id_categoria10 = JdbcWritableBridge.readInteger(21, __dbResults);
    this.id_categoria11 = JdbcWritableBridge.readInteger(22, __dbResults);
    this.gama = JdbcWritableBridge.readDouble(23, __dbResults);
    this.campo2 = JdbcWritableBridge.readString(24, __dbResults);
    this.campo3 = JdbcWritableBridge.readString(25, __dbResults);
    this.campo4 = JdbcWritableBridge.readString(26, __dbResults);
    this.campo5 = JdbcWritableBridge.readString(27, __dbResults);
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
    JdbcWritableBridge.writeInteger(id_producto, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_marca, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_proveedor, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nombre, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cod_sku, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fecha_lanzamiento, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(precio_venta, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(precio_estandar, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(precio_unitario, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(volumen, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(activo, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria2, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria3, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria4, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria5, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria6, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria7, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria8, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria9, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria10, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria11, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(gama, 23 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(campo2, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(campo3, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(campo4, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(campo5, 27 + __off, 12, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id_producto, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_marca, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_proveedor, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nombre, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cod_sku, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fecha_lanzamiento, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(precio_venta, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(precio_estandar, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(precio_unitario, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(volumen, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(activo, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria2, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria3, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria4, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria5, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria6, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria7, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria8, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria9, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria10, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_categoria11, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(gama, 23 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(campo2, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(campo3, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(campo4, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(campo5, 27 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id_producto = null;
    } else {
    this.id_producto = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria = null;
    } else {
    this.id_categoria = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_marca = null;
    } else {
    this.id_marca = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_proveedor = null;
    } else {
    this.id_proveedor = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.nombre = null;
    } else {
    this.nombre = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cod_sku = null;
    } else {
    this.cod_sku = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fecha_lanzamiento = null;
    } else {
    this.fecha_lanzamiento = new Timestamp(__dataIn.readLong());
    this.fecha_lanzamiento.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.precio_venta = null;
    } else {
    this.precio_venta = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.precio_estandar = null;
    } else {
    this.precio_estandar = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.precio_unitario = null;
    } else {
    this.precio_unitario = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.volumen = null;
    } else {
    this.volumen = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.activo = null;
    } else {
    this.activo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria2 = null;
    } else {
    this.id_categoria2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria3 = null;
    } else {
    this.id_categoria3 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria4 = null;
    } else {
    this.id_categoria4 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria5 = null;
    } else {
    this.id_categoria5 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria6 = null;
    } else {
    this.id_categoria6 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria7 = null;
    } else {
    this.id_categoria7 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria8 = null;
    } else {
    this.id_categoria8 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria9 = null;
    } else {
    this.id_categoria9 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria10 = null;
    } else {
    this.id_categoria10 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_categoria11 = null;
    } else {
    this.id_categoria11 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.gama = null;
    } else {
    this.gama = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.campo2 = null;
    } else {
    this.campo2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.campo3 = null;
    } else {
    this.campo3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.campo4 = null;
    } else {
    this.campo4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.campo5 = null;
    } else {
    this.campo5 = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id_producto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_producto);
    }
    if (null == this.id_categoria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria);
    }
    if (null == this.id_marca) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_marca);
    }
    if (null == this.id_proveedor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_proveedor);
    }
    if (null == this.nombre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nombre);
    }
    if (null == this.cod_sku) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cod_sku);
    }
    if (null == this.fecha_lanzamiento) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_lanzamiento.getTime());
    __dataOut.writeInt(this.fecha_lanzamiento.getNanos());
    }
    if (null == this.precio_venta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precio_venta);
    }
    if (null == this.precio_estandar) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precio_estandar);
    }
    if (null == this.precio_unitario) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precio_unitario);
    }
    if (null == this.volumen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, volumen);
    }
    if (null == this.activo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.activo);
    }
    if (null == this.id_categoria2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria2);
    }
    if (null == this.id_categoria3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria3);
    }
    if (null == this.id_categoria4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria4);
    }
    if (null == this.id_categoria5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria5);
    }
    if (null == this.id_categoria6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria6);
    }
    if (null == this.id_categoria7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria7);
    }
    if (null == this.id_categoria8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria8);
    }
    if (null == this.id_categoria9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria9);
    }
    if (null == this.id_categoria10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria10);
    }
    if (null == this.id_categoria11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria11);
    }
    if (null == this.gama) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.gama);
    }
    if (null == this.campo2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, campo2);
    }
    if (null == this.campo3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, campo3);
    }
    if (null == this.campo4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, campo4);
    }
    if (null == this.campo5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, campo5);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id_producto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_producto);
    }
    if (null == this.id_categoria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria);
    }
    if (null == this.id_marca) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_marca);
    }
    if (null == this.id_proveedor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_proveedor);
    }
    if (null == this.nombre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nombre);
    }
    if (null == this.cod_sku) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cod_sku);
    }
    if (null == this.fecha_lanzamiento) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_lanzamiento.getTime());
    __dataOut.writeInt(this.fecha_lanzamiento.getNanos());
    }
    if (null == this.precio_venta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precio_venta);
    }
    if (null == this.precio_estandar) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precio_estandar);
    }
    if (null == this.precio_unitario) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precio_unitario);
    }
    if (null == this.volumen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, volumen);
    }
    if (null == this.activo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.activo);
    }
    if (null == this.id_categoria2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria2);
    }
    if (null == this.id_categoria3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria3);
    }
    if (null == this.id_categoria4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria4);
    }
    if (null == this.id_categoria5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria5);
    }
    if (null == this.id_categoria6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria6);
    }
    if (null == this.id_categoria7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria7);
    }
    if (null == this.id_categoria8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria8);
    }
    if (null == this.id_categoria9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria9);
    }
    if (null == this.id_categoria10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria10);
    }
    if (null == this.id_categoria11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_categoria11);
    }
    if (null == this.gama) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.gama);
    }
    if (null == this.campo2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, campo2);
    }
    if (null == this.campo3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, campo3);
    }
    if (null == this.campo4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, campo4);
    }
    if (null == this.campo5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, campo5);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id_producto==null?"null":"" + id_producto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria==null?"null":"" + id_categoria, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_marca==null?"null":"" + id_marca, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_proveedor==null?"null":"" + id_proveedor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nombre==null?"null":nombre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cod_sku==null?"null":cod_sku, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_lanzamiento==null?"null":"" + fecha_lanzamiento, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precio_venta==null?"null":"" + precio_venta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precio_estandar==null?"null":"" + precio_estandar, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precio_unitario==null?"null":"" + precio_unitario, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(volumen==null?"null":volumen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(activo==null?"null":"" + activo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria2==null?"null":"" + id_categoria2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria3==null?"null":"" + id_categoria3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria4==null?"null":"" + id_categoria4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria5==null?"null":"" + id_categoria5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria6==null?"null":"" + id_categoria6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria7==null?"null":"" + id_categoria7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria8==null?"null":"" + id_categoria8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria9==null?"null":"" + id_categoria9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria10==null?"null":"" + id_categoria10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria11==null?"null":"" + id_categoria11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gama==null?"null":"" + gama, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(campo2==null?"null":campo2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(campo3==null?"null":campo3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(campo4==null?"null":campo4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(campo5==null?"null":campo5, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id_producto==null?"null":"" + id_producto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria==null?"null":"" + id_categoria, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_marca==null?"null":"" + id_marca, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_proveedor==null?"null":"" + id_proveedor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nombre==null?"null":nombre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cod_sku==null?"null":cod_sku, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_lanzamiento==null?"null":"" + fecha_lanzamiento, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precio_venta==null?"null":"" + precio_venta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precio_estandar==null?"null":"" + precio_estandar, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precio_unitario==null?"null":"" + precio_unitario, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(volumen==null?"null":volumen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(activo==null?"null":"" + activo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria2==null?"null":"" + id_categoria2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria3==null?"null":"" + id_categoria3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria4==null?"null":"" + id_categoria4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria5==null?"null":"" + id_categoria5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria6==null?"null":"" + id_categoria6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria7==null?"null":"" + id_categoria7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria8==null?"null":"" + id_categoria8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria9==null?"null":"" + id_categoria9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria10==null?"null":"" + id_categoria10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_categoria11==null?"null":"" + id_categoria11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gama==null?"null":"" + gama, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(campo2==null?"null":campo2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(campo3==null?"null":campo3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(campo4==null?"null":campo4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(campo5==null?"null":campo5, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_producto = null; } else {
      this.id_producto = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria = null; } else {
      this.id_categoria = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_marca = null; } else {
      this.id_marca = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_proveedor = null; } else {
      this.id_proveedor = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nombre = null; } else {
      this.nombre = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cod_sku = null; } else {
      this.cod_sku = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_lanzamiento = null; } else {
      this.fecha_lanzamiento = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precio_venta = null; } else {
      this.precio_venta = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precio_estandar = null; } else {
      this.precio_estandar = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precio_unitario = null; } else {
      this.precio_unitario = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.volumen = null; } else {
      this.volumen = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.activo = null; } else {
      this.activo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria2 = null; } else {
      this.id_categoria2 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria3 = null; } else {
      this.id_categoria3 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria4 = null; } else {
      this.id_categoria4 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria5 = null; } else {
      this.id_categoria5 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria6 = null; } else {
      this.id_categoria6 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria7 = null; } else {
      this.id_categoria7 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria8 = null; } else {
      this.id_categoria8 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria9 = null; } else {
      this.id_categoria9 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria10 = null; } else {
      this.id_categoria10 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria11 = null; } else {
      this.id_categoria11 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gama = null; } else {
      this.gama = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.campo2 = null; } else {
      this.campo2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.campo3 = null; } else {
      this.campo3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.campo4 = null; } else {
      this.campo4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.campo5 = null; } else {
      this.campo5 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_producto = null; } else {
      this.id_producto = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria = null; } else {
      this.id_categoria = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_marca = null; } else {
      this.id_marca = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_proveedor = null; } else {
      this.id_proveedor = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nombre = null; } else {
      this.nombre = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cod_sku = null; } else {
      this.cod_sku = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_lanzamiento = null; } else {
      this.fecha_lanzamiento = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precio_venta = null; } else {
      this.precio_venta = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precio_estandar = null; } else {
      this.precio_estandar = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precio_unitario = null; } else {
      this.precio_unitario = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.volumen = null; } else {
      this.volumen = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.activo = null; } else {
      this.activo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria2 = null; } else {
      this.id_categoria2 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria3 = null; } else {
      this.id_categoria3 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria4 = null; } else {
      this.id_categoria4 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria5 = null; } else {
      this.id_categoria5 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria6 = null; } else {
      this.id_categoria6 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria7 = null; } else {
      this.id_categoria7 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria8 = null; } else {
      this.id_categoria8 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria9 = null; } else {
      this.id_categoria9 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria10 = null; } else {
      this.id_categoria10 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_categoria11 = null; } else {
      this.id_categoria11 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gama = null; } else {
      this.gama = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.campo2 = null; } else {
      this.campo2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.campo3 = null; } else {
      this.campo3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.campo4 = null; } else {
      this.campo4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.campo5 = null; } else {
      this.campo5 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    producto o = (producto) super.clone();
    o.fecha_lanzamiento = (o.fecha_lanzamiento != null) ? (java.sql.Timestamp) o.fecha_lanzamiento.clone() : null;
    return o;
  }

  public void clone0(producto o) throws CloneNotSupportedException {
    o.fecha_lanzamiento = (o.fecha_lanzamiento != null) ? (java.sql.Timestamp) o.fecha_lanzamiento.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id_producto", this.id_producto);
    __sqoop$field_map.put("id_categoria", this.id_categoria);
    __sqoop$field_map.put("id_marca", this.id_marca);
    __sqoop$field_map.put("id_proveedor", this.id_proveedor);
    __sqoop$field_map.put("nombre", this.nombre);
    __sqoop$field_map.put("cod_sku", this.cod_sku);
    __sqoop$field_map.put("fecha_lanzamiento", this.fecha_lanzamiento);
    __sqoop$field_map.put("precio_venta", this.precio_venta);
    __sqoop$field_map.put("precio_estandar", this.precio_estandar);
    __sqoop$field_map.put("precio_unitario", this.precio_unitario);
    __sqoop$field_map.put("volumen", this.volumen);
    __sqoop$field_map.put("activo", this.activo);
    __sqoop$field_map.put("id_categoria2", this.id_categoria2);
    __sqoop$field_map.put("id_categoria3", this.id_categoria3);
    __sqoop$field_map.put("id_categoria4", this.id_categoria4);
    __sqoop$field_map.put("id_categoria5", this.id_categoria5);
    __sqoop$field_map.put("id_categoria6", this.id_categoria6);
    __sqoop$field_map.put("id_categoria7", this.id_categoria7);
    __sqoop$field_map.put("id_categoria8", this.id_categoria8);
    __sqoop$field_map.put("id_categoria9", this.id_categoria9);
    __sqoop$field_map.put("id_categoria10", this.id_categoria10);
    __sqoop$field_map.put("id_categoria11", this.id_categoria11);
    __sqoop$field_map.put("gama", this.gama);
    __sqoop$field_map.put("campo2", this.campo2);
    __sqoop$field_map.put("campo3", this.campo3);
    __sqoop$field_map.put("campo4", this.campo4);
    __sqoop$field_map.put("campo5", this.campo5);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id_producto", this.id_producto);
    __sqoop$field_map.put("id_categoria", this.id_categoria);
    __sqoop$field_map.put("id_marca", this.id_marca);
    __sqoop$field_map.put("id_proveedor", this.id_proveedor);
    __sqoop$field_map.put("nombre", this.nombre);
    __sqoop$field_map.put("cod_sku", this.cod_sku);
    __sqoop$field_map.put("fecha_lanzamiento", this.fecha_lanzamiento);
    __sqoop$field_map.put("precio_venta", this.precio_venta);
    __sqoop$field_map.put("precio_estandar", this.precio_estandar);
    __sqoop$field_map.put("precio_unitario", this.precio_unitario);
    __sqoop$field_map.put("volumen", this.volumen);
    __sqoop$field_map.put("activo", this.activo);
    __sqoop$field_map.put("id_categoria2", this.id_categoria2);
    __sqoop$field_map.put("id_categoria3", this.id_categoria3);
    __sqoop$field_map.put("id_categoria4", this.id_categoria4);
    __sqoop$field_map.put("id_categoria5", this.id_categoria5);
    __sqoop$field_map.put("id_categoria6", this.id_categoria6);
    __sqoop$field_map.put("id_categoria7", this.id_categoria7);
    __sqoop$field_map.put("id_categoria8", this.id_categoria8);
    __sqoop$field_map.put("id_categoria9", this.id_categoria9);
    __sqoop$field_map.put("id_categoria10", this.id_categoria10);
    __sqoop$field_map.put("id_categoria11", this.id_categoria11);
    __sqoop$field_map.put("gama", this.gama);
    __sqoop$field_map.put("campo2", this.campo2);
    __sqoop$field_map.put("campo3", this.campo3);
    __sqoop$field_map.put("campo4", this.campo4);
    __sqoop$field_map.put("campo5", this.campo5);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id_producto".equals(__fieldName)) {
      this.id_producto = (Integer) __fieldVal;
    }
    else    if ("id_categoria".equals(__fieldName)) {
      this.id_categoria = (Integer) __fieldVal;
    }
    else    if ("id_marca".equals(__fieldName)) {
      this.id_marca = (Integer) __fieldVal;
    }
    else    if ("id_proveedor".equals(__fieldName)) {
      this.id_proveedor = (Integer) __fieldVal;
    }
    else    if ("nombre".equals(__fieldName)) {
      this.nombre = (String) __fieldVal;
    }
    else    if ("cod_sku".equals(__fieldName)) {
      this.cod_sku = (String) __fieldVal;
    }
    else    if ("fecha_lanzamiento".equals(__fieldName)) {
      this.fecha_lanzamiento = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("precio_venta".equals(__fieldName)) {
      this.precio_venta = (Double) __fieldVal;
    }
    else    if ("precio_estandar".equals(__fieldName)) {
      this.precio_estandar = (Double) __fieldVal;
    }
    else    if ("precio_unitario".equals(__fieldName)) {
      this.precio_unitario = (Double) __fieldVal;
    }
    else    if ("volumen".equals(__fieldName)) {
      this.volumen = (String) __fieldVal;
    }
    else    if ("activo".equals(__fieldName)) {
      this.activo = (Integer) __fieldVal;
    }
    else    if ("id_categoria2".equals(__fieldName)) {
      this.id_categoria2 = (Integer) __fieldVal;
    }
    else    if ("id_categoria3".equals(__fieldName)) {
      this.id_categoria3 = (Integer) __fieldVal;
    }
    else    if ("id_categoria4".equals(__fieldName)) {
      this.id_categoria4 = (Integer) __fieldVal;
    }
    else    if ("id_categoria5".equals(__fieldName)) {
      this.id_categoria5 = (Integer) __fieldVal;
    }
    else    if ("id_categoria6".equals(__fieldName)) {
      this.id_categoria6 = (Integer) __fieldVal;
    }
    else    if ("id_categoria7".equals(__fieldName)) {
      this.id_categoria7 = (Integer) __fieldVal;
    }
    else    if ("id_categoria8".equals(__fieldName)) {
      this.id_categoria8 = (Integer) __fieldVal;
    }
    else    if ("id_categoria9".equals(__fieldName)) {
      this.id_categoria9 = (Integer) __fieldVal;
    }
    else    if ("id_categoria10".equals(__fieldName)) {
      this.id_categoria10 = (Integer) __fieldVal;
    }
    else    if ("id_categoria11".equals(__fieldName)) {
      this.id_categoria11 = (Integer) __fieldVal;
    }
    else    if ("gama".equals(__fieldName)) {
      this.gama = (Double) __fieldVal;
    }
    else    if ("campo2".equals(__fieldName)) {
      this.campo2 = (String) __fieldVal;
    }
    else    if ("campo3".equals(__fieldName)) {
      this.campo3 = (String) __fieldVal;
    }
    else    if ("campo4".equals(__fieldName)) {
      this.campo4 = (String) __fieldVal;
    }
    else    if ("campo5".equals(__fieldName)) {
      this.campo5 = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id_producto".equals(__fieldName)) {
      this.id_producto = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria".equals(__fieldName)) {
      this.id_categoria = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_marca".equals(__fieldName)) {
      this.id_marca = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_proveedor".equals(__fieldName)) {
      this.id_proveedor = (Integer) __fieldVal;
      return true;
    }
    else    if ("nombre".equals(__fieldName)) {
      this.nombre = (String) __fieldVal;
      return true;
    }
    else    if ("cod_sku".equals(__fieldName)) {
      this.cod_sku = (String) __fieldVal;
      return true;
    }
    else    if ("fecha_lanzamiento".equals(__fieldName)) {
      this.fecha_lanzamiento = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("precio_venta".equals(__fieldName)) {
      this.precio_venta = (Double) __fieldVal;
      return true;
    }
    else    if ("precio_estandar".equals(__fieldName)) {
      this.precio_estandar = (Double) __fieldVal;
      return true;
    }
    else    if ("precio_unitario".equals(__fieldName)) {
      this.precio_unitario = (Double) __fieldVal;
      return true;
    }
    else    if ("volumen".equals(__fieldName)) {
      this.volumen = (String) __fieldVal;
      return true;
    }
    else    if ("activo".equals(__fieldName)) {
      this.activo = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria2".equals(__fieldName)) {
      this.id_categoria2 = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria3".equals(__fieldName)) {
      this.id_categoria3 = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria4".equals(__fieldName)) {
      this.id_categoria4 = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria5".equals(__fieldName)) {
      this.id_categoria5 = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria6".equals(__fieldName)) {
      this.id_categoria6 = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria7".equals(__fieldName)) {
      this.id_categoria7 = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria8".equals(__fieldName)) {
      this.id_categoria8 = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria9".equals(__fieldName)) {
      this.id_categoria9 = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria10".equals(__fieldName)) {
      this.id_categoria10 = (Integer) __fieldVal;
      return true;
    }
    else    if ("id_categoria11".equals(__fieldName)) {
      this.id_categoria11 = (Integer) __fieldVal;
      return true;
    }
    else    if ("gama".equals(__fieldName)) {
      this.gama = (Double) __fieldVal;
      return true;
    }
    else    if ("campo2".equals(__fieldName)) {
      this.campo2 = (String) __fieldVal;
      return true;
    }
    else    if ("campo3".equals(__fieldName)) {
      this.campo3 = (String) __fieldVal;
      return true;
    }
    else    if ("campo4".equals(__fieldName)) {
      this.campo4 = (String) __fieldVal;
      return true;
    }
    else    if ("campo5".equals(__fieldName)) {
      this.campo5 = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
