package practicafinal.aplicacion;
import practicafinal.ui.JVentanaInicio;
import practicafinal.ui.JVentanaInicioSesion;
import practicafinal.ui.JVentanaCrearUsuario;
import practicafinal.util.Constantes;
import practicafinal.ui.JVentanaMenu;

public class Banco
{
  public static void main(String[] args)
  {
    Constantes.ventanaInicio       = new JVentanaInicio();
    Constantes.ventanaInicioSesion = new JVentanaInicioSesion();
    Constantes.ventanaCrearUsuario = new JVentanaCrearUsuario();
    Constantes.ventanaMenu = new JVentanaMenu();
  }


}
