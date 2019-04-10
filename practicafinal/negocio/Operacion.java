package practicafinal.negocio;
import practicafinal.dominio.Usuario;
import practicafinal.dominio.UsuarioPremium;
import practicafinal.dominio.Persona;
import practicafinal.dominio.Administrador;
import practicafinal.util.LeerFecha;
import java.util.Date;
public class Operacion
{
  //Atributos
  int codOP;
  String concepto;
  double cantidad;
  Date fecha;
  //Constructor
  public Operacion(String concepto, double cantidad, Date fecha) //CAMBIAR POR FECHA
  {
    this.concepto=concepto;
    this.cantidad=cantidad;
    this.fecha= fecha;
  }
  public Operacion(double cantidad, Date fecha)
  {
    this.cantidad=cantidad;
    this.fecha=fecha;
  }
  public void setConcepto(String concepto)
  {
    this.concepto=concepto;
  }
  public String getConcepto()
  {
    return concepto;
  }
  public void setCantidad(double Cantidad)
  {
    this.cantidad=cantidad;
  }
  public double getCantidad()
  {
    return cantidad;
  }
  public void setFecha(Date fecha)
  {
    this.fecha=fecha;
  }
  public Date getFecha()
  {
    return fecha;
  }
  public void setCodOp(int codOP)
  {
    this.codOP=codOP;
  }
  public int getCodOP()
  {
    return codOP;
  }
  public String toString()
  {
      StringBuilder sb = new StringBuilder();
      sb.append("\nCodigo:\t")
      .append(codOP)
      .append("\nConcepto:\t")
      .append(concepto)
      .append("\nCantidad:\t")
      .append(cantidad)
      .append("\nFecha:\t")
      .append(fecha);
      return sb.toString();
  }

}
