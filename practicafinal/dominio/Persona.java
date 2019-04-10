package practicafinal.dominio;
import practicafinal.util.LeerFecha;
public abstract class Persona implements java.io.Serializable
{
  //Atributos
  private String nif;
  private String nombre;
  private String contrasena;
  private int permisoModificar;
  public static final int PERMISO_BASICO = 0;
  public static final int PERMISO_MEDIO = 1;
  public static final int PERMISO_TOTAL = 2;
  //Constructor
  public Persona(String nombre, String nif,String contrasena)
  {
    this.nombre=nombre;
    this.nif=nif;
    this.contrasena=contrasena;
  }
  public Persona(String nif)
  {
    this.nif=nif;
  }
  //Metodos
  public String getNombre()
  {
    return nombre;
  }
  public void setNombre(String nombre)
  {
    this.nombre=nombre;
  }
  public void setNif(String nif)
  {
    this.nif=nif;
  }
  public String getNif()
 {
   return nif;
 }
 public String getContrasena()
 {
   return contrasena;
 }
 public void setContrasena(String contrasena)
 {
   this.contrasena=contrasena;
 }
 public void setPermiso(int permiso)
 {
   this.permisoModificar=permiso;
 }
 public int getPermiso()
 {
   return permisoModificar;
 }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("\nNombre:\t")
    .append(nombre)
    .append("\nNif:\t")
    .append(nif);
    return sb.toString();
  }
  @Override
  public boolean equals(Object obj)
  {
    if(obj instanceof Persona)
    {
      Persona p = (Persona) obj;
      if(nif.equals(p.getNif()))
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    else
    {
      return false;
    }
  }
}
