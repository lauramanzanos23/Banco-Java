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
import javax.swing.JComboBox;
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
import practicafinal.io.IOUsuario;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.io.*;

public class JVentanaCrearUsuario extends JFrame
{
    JLabel lblNombre;
    JComboBox combobox;
    JTextField txtNombre;
    JTextField txtNif;
    JPasswordField txtContrasena;
    JLabel lblNif;
    JLabel lblContrasena;
    ImageIcon icnCrearCuenta;
    JButton btnCrearCuenta;
    JButton btnAtras;
    ImageIcon icnAtras;
    Collection usuarios;
    GestorBanco  gestor;
    public JVentanaCrearUsuario()
    {
      this.setSize(400,500);
      this.getContentPane().setBackground(Color.BLACK);
      this.setLayout(new GridLayout(9,1));
      lblNif = new JLabel("Introduzca su DNI:",SwingConstants.CENTER);
      lblNif.setForeground(Color.WHITE);
      lblNif.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
      this.add(lblNif);
      txtNif = new JTextField(20);
      //txtNif.setSize(2,2);
      this.add(txtNif);
      txtNombre = new JTextField(20);
      lblNombre = new JLabel("Introduzca su nombre:",SwingConstants.CENTER);
      lblNombre.setForeground(Color.WHITE);
      lblNombre.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
      this.add(lblNombre);
      this.add(txtNombre);
      lblContrasena = new JLabel("Introduzca su contraseña:",SwingConstants.CENTER);
      lblContrasena.setForeground(Color.WHITE);
      lblContrasena.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
      this.add(lblContrasena);
      txtContrasena = new JPasswordField(20);
      this.add(txtContrasena);
      icnCrearCuenta = new ImageIcon("practicafinal/recursos/BotonCrearCuenta.png");
      btnCrearCuenta = new JButton("Crear cuenta");
      btnCrearCuenta.setIcon(icnCrearCuenta);
      btnCrearCuenta.setBorder(BorderFactory.createEmptyBorder());
      btnCrearCuenta.setContentAreaFilled(false);
      this.add(btnCrearCuenta);
      combobox = new JComboBox();
      combobox.addItem("Cuenta Estándar");
      combobox.addItem("Cuenta Premium");
      this.add(combobox);
      icnAtras = new ImageIcon("practicafinal/recursos/BotonAtras.png");
      btnAtras = new JButton("Atrás");
      btnAtras.setIcon(icnAtras);
      btnAtras.setBorder(BorderFactory.createEmptyBorder());
      btnAtras.setContentAreaFilled(false);
      this.add(btnAtras);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.repaint();
      this.setVisible(false);

      btnAtras.addActionListener(new ActionListener()
     {
       @Override
       public void actionPerformed(ActionEvent e)
       {
         JVentanaCrearUsuario.this.setVisible(false);
         Constantes.ventanaInicio.setVisible(true);
       }
       });

          usuarios = new ArrayList();
          usuarios = IOUsuario.leerUsuarios();

        btnCrearCuenta.addActionListener(new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent e)
          {
            try
            {
              String nombreAux = txtNombre.getText();
              String nifAux = txtNif.getText();
              String contrasenaAux = txtContrasena.getText();
              String tipoUsuario = (String) combobox.getSelectedItem();
              if(tipoUsuario == "Cuenta Estándar")
              {
                Usuario usuarioAux = new Usuario(nombreAux, nifAux, contrasenaAux);
                usuarios.add(usuarioAux);
                gestor.anadirUsuario(usuarioAux);

              }
              else
              {
                UsuarioPremium usuarioAux = new UsuarioPremium(nombreAux, nifAux, contrasenaAux);
                usuarios.add(usuarioAux);
                gestor.anadirUsuario(usuarioAux);
              }
              IOUsuario.escribirUsuarios(usuarios);
              JVentanaCrearUsuario.this.setVisible(false);
              Constantes.ventanaMenu.setVisible(true);
            }
            catch(NullPointerException npe)
            {
              npe.printStackTrace();
            }
          }
        });
    }
}
