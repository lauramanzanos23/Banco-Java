package practicafinal.ui;
import practicafinal.dominio.Usuario;
import practicafinal.dominio.UsuarioPremium;
import practicafinal.dominio.Persona;
import practicafinal.dominio.Administrador;
import practicafinal.negocio.Extraccion;
import practicafinal.negocio.GestorBanco;
import practicafinal.negocio.Ingreso;
import practicafinal.negocio.Operacion;
import practicafinal.negocio.Transaccion;
import practicafinal.util.LeerFecha;
import practicafinal.util.Constantes;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JVentanaMenu extends JFrame
{
  public JVentanaMenu()
  {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.repaint();
    this.setVisible(false);
  }
}
