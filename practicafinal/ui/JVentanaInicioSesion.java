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
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.*;

public class JVentanaInicioSesion extends JFrame
{
  JLabel lblNif;
  JTextField txtNif;
  JPasswordField txtContrasena;
  JLabel lblContrasena;
  ImageIcon icnIniciarSesion;
  JButton btnIniciarSesion;
  JButton btnAtras;
  GestorBanco banco;
  ImageIcon icnAtras;
  Collection usuarios;
  public JVentanaInicioSesion()
  {
    this.setSize(400,400);
    this.getContentPane().setBackground(Color.BLACK);
    this.setLayout(new GridLayout(6,1));
    lblNif = new JLabel("Introduzca su DNI:",SwingConstants.CENTER);
    lblNif.setForeground(Color.WHITE);
    lblNif.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
    this.add(lblNif);
    txtNif = new JTextField(20);
    //txtNif.setSize(2,2);
    this.add(txtNif);
    lblContrasena = new JLabel("Introduzca su contraseña:",SwingConstants.CENTER);
    lblContrasena.setForeground(Color.WHITE);
    lblContrasena.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
    this.add(lblContrasena);
    txtContrasena = new JPasswordField(20);
    this.add(txtContrasena);
    icnIniciarSesion = new ImageIcon("practicafinal/recursos/BotonIniciarSesion.png");
    btnIniciarSesion = new JButton("Iniciar Sesion");
    btnIniciarSesion.setIcon(icnIniciarSesion);
    btnIniciarSesion.setBorder(BorderFactory.createEmptyBorder());
    btnIniciarSesion.setContentAreaFilled(false);
    this.add(btnIniciarSesion);
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
       JVentanaInicioSesion.this.setVisible(false);
       Constantes.ventanaInicio.setVisible(true);
     }
     });

     btnIniciarSesion.addActionListener(new ActionListener()
     {
      /@Override
        public void actionPerformed(ActionEvent e)
         {
           String nifAux = txtNif.getText();
           String contrasenaAux = txtContrasena.getText();
           usuarios = new ArrayList();
           usuarios = IOUsuario.leerUsuarios();
           banco.a
          JVentanaInicio.this.setVisible(false);
          jvnInicio1.setVisible(true);
       }
     //});
   }
  }
