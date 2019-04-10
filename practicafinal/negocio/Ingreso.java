package practicafinal.negocio;
import practicafinal.dominio.Usuario;
import practicafinal.dominio.UsuarioPremium;
import practicafinal.dominio.Persona;
import practicafinal.dominio.Administrador;
import practicafinal.util.LeerFecha;
import java.util.Date;
public class Ingreso extends Operacion
{
  public Ingreso(double cantidad, Date fecha)
  {
    super(cantidad, fecha);
    this.setConcepto("Ingreso de dinero");
    this.setCodOp(1+fecha.getDay()+fecha.getHours() + fecha.getMinutes()+ fecha.getSeconds());

  }
  public void realizarIngreso(double cantidad,Usuario usuario)
  {
    usuario.setSaldo((usuario.getSaldo() + cantidad) - (usuario.getComisionOperacion()*cantidad));

  }
}
