package practicafinal.dominio;
import practicafinal.util.LeerFecha;
public class UsuarioPremium extends Usuario implements java.io.Serializable
{
  public static final double COMISION_PREMIUM=0.01;
  public UsuarioPremium(String nombre, String nif,String contrasena)
  {
    super(nombre, nif, contrasena);
    this.setPermiso(Persona.PERMISO_MEDIO);
    this.setSaldo(100);
    this.setComisionOperacion(COMISION_PREMIUM);
  }
  public UsuarioPremium(String nif)
  {
    super(nif);
    this.setPermiso(Persona.PERMISO_MEDIO);
    this.setSaldo(100);
    this.setComisionOperacion(COMISION_PREMIUM);
  }
}
