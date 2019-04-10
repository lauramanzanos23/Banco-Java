package practicafinal.negocio;
import practicafinal.dominio.Usuario;
import practicafinal.dominio.UsuarioPremium;
import practicafinal.dominio.Persona;
import practicafinal.dominio.Administrador;
import java.util.Date;
import practicafinal.util.LeerFecha;
public class Transaccion extends Operacion
{
  Usuario emisor;
  Usuario receptor;
  public Transaccion(double cantidad,Date fecha, Usuario emisor, Usuario receptor, String concepto)
  {
    super(cantidad, fecha);
    this.concepto=concepto;
    this.emisor=emisor;
    this.receptor=receptor;
    this.setCodOp(3+fecha.getDay()+fecha.getHours() + fecha.getMinutes()+ fecha.getSeconds());

  }

  //Metodos
  public void realizarTransaccion(double cantidad,Usuario emisor, Usuario receptor)
  {
    emisor.setSaldo((emisor.getSaldo()- cantidad)-(cantidad*emisor.getComisionOperacion()));
    receptor.setSaldo(receptor.getSaldo()+cantidad); //No hay comision para el receptor
  }
  public void setEmisor(Usuario emisor)
  {
    this.emisor=emisor;
  }
  public Usuario getEmisor()
  {
    return emisor;
  }
  public void setReceptor(Usuario receptor)
  {
    this.receptor=receptor;
  }
  public Usuario getReceptor()
  {
    return receptor;
  }
}
