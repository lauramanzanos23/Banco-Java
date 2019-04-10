package practicafinal.negocio;
import practicafinal.dominio.Usuario;
import practicafinal.dominio.UsuarioPremium;
import practicafinal.dominio.Persona;
import practicafinal.dominio.Administrador;
import practicafinal.util.LeerFecha;
import java.util.Collection;
import java.util.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import practicafinal.io.IOUsuario;
import java.io.*;
public class GestorBanco
{

    Map banco = new HashMap();
    ArrayList administradores = new ArrayList();
    Collection usuarios;
    public int ingresarDinero(Usuario usuario, double cantidad, Date d1)
    {
      int res;
      res=0;
      if (banco.containsKey(usuario.getNif()))
      {
        String dni =usuario.getNif();
        Usuario u = (Usuario) banco.get(dni);
        Ingreso ing = new Ingreso(cantidad,d1);
        ing.realizarIngreso(cantidad, u);
        banco.put(u.getNif(), u);
        u.nuevaOperacion(ing);
        res=1;
      }
      return res;
    }
    public int extraerDinero(Usuario usuario, double cantidad,Date d1)
    {
      int res;
      res=0;
      if (banco.containsKey(usuario.getNif()))
      {
        String dni = usuario.getNif();
        Usuario u = (Usuario) banco.get(dni);
        Extraccion ext = new Extraccion(cantidad, d1);
        ext.realizarExtraccion(cantidad, u);
        banco.put(u.getNif(), u);
        u.nuevaOperacion(ext);
        res=1;
      }
      return res;
    }

    public int transferencia(Usuario emisor, Usuario receptor, double cantidad, Date d1, String concepto)
    {
      int res;
      res=0;
      if(banco.containsKey(emisor.getNif()))
      {
        if(banco.containsKey(receptor.getNif()))
        {
          Usuario u1 = (Usuario) banco.get(emisor.getNif());
          Usuario u2 = (Usuario) banco.get(receptor.getNif());
          Transaccion trans = new Transaccion(cantidad, d1, u1, u2, concepto);
          trans.realizarTransaccion(cantidad, u1, u2);
          banco.put(u1.getNif(), u1);
          banco.put(u2.getNif(), u2);
          u1.nuevaOperacion(trans);
          u2.nuevaOperacion(trans);
          res=1;
        }
      }
      return res;
    }
    public int modificarDatos(Usuario usuario, Administrador admin, String nombre, String contrasena)
    {
      int res;
      res=0;
      if(administradores.contains(admin))
      {
        if(banco.containsKey(usuario.getNif()))
        {
          Usuario u1 = (Usuario) banco.get(usuario.getNif());
          admin.realizarCambios(u1,nombre, contrasena);
          banco.put(u1.getNif(), u1);
        }
        res=1;
      }
      return res;
    }
    public void anadirUsuario(Usuario usuario)
    {
      banco.put(usuario.getNif(), usuario);
    }

    public void eliminarUsuario(Usuario usuario)
    {
      if(banco.containsKey(usuario.getNif()))
      {
        banco.remove(usuario.getNif());
        usuarios = new ArrayList();
        usuarios=IOUsuario.leerUsuarios();
        Iterator it = usuarios.iterator();
        while(it.hasNext())
        {
          Usuario usuarioAux = (Usuario) it.next();
          if(usuario.equals(usuarioAux))
          {
            usuarios.remove(usuarioAux);
          }
        }
        IOUsuario.escribirUsuarios(usuarios);
      }
    }
    public double devolverSaldo(Usuario usuario)
    {
      double saldo;
      saldo=999; //SOLO PARA PROBAR
      if(banco.containsKey(usuario.getNif()))
      {
        Usuario u1 = (Usuario) banco.get(usuario.getNif());
        saldo = u1.getSaldo();
      }
      return saldo;
    }
    public Usuario devolverDatos(Usuario usuario)
    {
      Usuario res;
      res = null;
      if(banco.containsKey(usuario.getNif()))
      {
        Usuario u1 = (Usuario) banco.get(usuario.getNif());
        res=u1;
      }
      return res;
    }
    public Map devuelveBanco()
    {
      return banco;
    }
    public voidActualizarFichero(Usuario usuario)
    {

    }

}

  //ArrayList dnis = mapa.getKeyList();
  //Iterator it = dnis.iterator();
  //Persona p;
    //p.nuevaOperacion(op);
