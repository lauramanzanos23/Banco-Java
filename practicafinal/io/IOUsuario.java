package practicafinal.io;
import practicafinal.util.Constantes;
import practicafinal.dominio.Usuario;
import practicafinal.dominio.UsuarioPremium;
import practicafinal.dominio.Persona;
import practicafinal.dominio.Administrador;
import java.io.*;
import java.util.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
public class IOUsuario
{
  public static void escribirUsuarios(Collection usuarios)
  {
    try
    {
      FileOutputStream fos = new FileOutputStream("practicafinal/informacion/usuarios.obj");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      Iterator it = usuarios.iterator();
      while(it.hasNext())
      {
        oos.writeObject(it.next());
      }
      oos.close();
      fos.close();
    }
    catch(FileNotFoundException fne)
    {
      fne.printStackTrace();
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }

  }
  public static Collection leerUsuarios()
  {
    Collection usuarios = new ArrayList();
    ObjectInputStream ois=null;
    try
    {
      ois = new ObjectInputStream(new FileInputStream("practicafinal/informacion/usuarios.obj"));
      try
      {
        while(true)
        {
          usuarios.add((Usuario) ois.readObject());
        }

      }
    catch(EOFException eofe)
    {

    }
    catch(ClassNotFoundException cnfe)
    {
      cnfe.printStackTrace();
    }
    ois.close();
    }

    catch(FileNotFoundException fnfe)
    {
      fnfe.printStackTrace();
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }

    return usuarios;
  }
}
