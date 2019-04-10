package practicafinal.dominio;
import practicafinal.util.LeerFecha;

public class Administrador extends Persona
{
  public Administrador(String nombre, String nif, String contrasena)
  {
    super(nombre,nif, contrasena);
    this.setPermiso(Persona.PERMISO_TOTAL);
  }
  public Administrador(String nif)
  {
    super(nif);
    this.setPermiso(Persona.PERMISO_TOTAL);
  }
  //Metodos
  public void realizarCambios(Usuario usuario, String nombre, String contrasena)
  {
    usuario.setNombre(nombre);
    usuario.setContrasena(contrasena);
    usuario.setNif(usuario.getNif());
  }

}
