package practicafinal.negocio;
import practicafinal.dominio.Usuario;
import practicafinal.dominio.UsuarioPremium;
import practicafinal.dominio.Persona;
import practicafinal.dominio.Administrador;
import practicafinal.util.LeerFecha;
import java.util.Date;
public class Extraccion extends Operacion
{
  public Extraccion(double cantidad, Date fecha)
  {
    super(cantidad, fecha);
    this.setConcepto("Extraccion de dinero");
    this.setCodOp(2+fecha.getDay()+fecha.getHours() + fecha.getMinutes()+ fecha.getSeconds());
  }
  public void realizarExtraccion(double cantidad,Usuario usuario)
  {
    usuario.setSaldo((usuario.getSaldo() - cantidad) - (usuario.getComisionOperacion()*cantidad));

  }
}
