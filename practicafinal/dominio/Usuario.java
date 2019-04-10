 package practicafinal.dominio;
 import java.util.ArrayList;
 import java.util.Iterator;
 import practicafinal.negocio.Extraccion;
 import practicafinal.negocio.GestorBanco;
 import practicafinal.negocio.Ingreso;
 import practicafinal.negocio.Operacion;
 import practicafinal.negocio.Transaccion;
 import practicafinal.util.LeerFecha;

public class Usuario extends Persona implements java.io.Serializable
{
  //Atributos
  double saldo;
  double comisionOperacion;
  public static final double COMISION_NORMAL=0.05;
  ArrayList operaciones = new ArrayList<Operacion>();
  //Constructor
  public Usuario(String nombre, String nif,String contrasena)
  {
    super(nombre, nif, contrasena);
    this.setPermiso(Persona.PERMISO_BASICO);
    this.setSaldo(0);
    this.setComisionOperacion(COMISION_NORMAL);
  }
  public Usuario(String nif)
  {
    super(nif);
    this.setPermiso(Persona.PERMISO_BASICO);
    this.setSaldo(0);
    this.setComisionOperacion(COMISION_NORMAL);
  }
  //Metodos
  public void setSaldo(double saldo)
  {
    this.saldo=saldo;
  }
  public double getSaldo()
  {
    return saldo;
  }
  @Override
  public String toString()
  {
    return super.toString() + "\nSaldo:\t" + this.saldo + "\nOperaciones:\t" + operaciones;
  }
  public void setComisionOperacion(double comisionOperacion)
  {
    this.comisionOperacion=comisionOperacion;
  }
  public double getComisionOperacion()
  {
    return comisionOperacion;
  }
  public void nuevaOperacion(Operacion op)
  {
    operaciones.add(op);
  }
  public Operacion infoOperacion(int codOP)
  {
    Iterator it = operaciones.iterator();
    Operacion o;
    Operacion opDevuelta = null;
    if(it.hasNext())
    {
      o = (Operacion) it.next();
      if (o.getCodOP() == codOP)
        opDevuelta = o;
    }
    return opDevuelta;
  }


}
