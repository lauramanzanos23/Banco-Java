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

public class JVentanaInicio extends JFrame
{
    JLabel lblVacio;
    JLabel lblLogo;
    JPanel pnlInicio;
    JButton btnIniciarSesion;
    JButton btnCrearUsuario;
    ImageIcon icono;
    ImageIcon icnIniciarSesion;
    ImageIcon icnCrearCuenta;
    JLabel lblVacio2;

    public JVentanaInicio()
    {

      this.setLayout(new GridLayout(4,1));
      lblVacio = new JLabel("");
      lblVacio.setForeground(Color.white);
      this.add(lblVacio);
      icono = new ImageIcon("practicafinal/recursos/LogoDefinitivo.png");
      lblLogo = new JLabel("Logo", SwingConstants.CENTER);
      lblLogo.setIcon(icono);
      lblLogo.setBackground(Color.BLACK);
      this.add(lblLogo);
      pnlInicio = new JPanel();
      pnlInicio.setLayout(new FlowLayout());
      icnIniciarSesion = new ImageIcon("practicafinal/recursos/BotonIniciarSesion.png");
      icnCrearCuenta = new ImageIcon("practicafinal/recursos/BotonCrearCuenta.png");
      btnIniciarSesion = new JButton("Iniciar sesión");
      btnIniciarSesion.setIcon(icnIniciarSesion);
      btnIniciarSesion.setBorder(BorderFactory.createEmptyBorder());
      btnIniciarSesion.setContentAreaFilled(false);
      btnCrearUsuario = new JButton("Crear usuario");
      btnCrearUsuario.setIcon(icnCrearCuenta);
      btnCrearUsuario.setBorder(BorderFactory.createEmptyBorder());
      btnCrearUsuario.setContentAreaFilled(false);
      pnlInicio.add(btnIniciarSesion);
      pnlInicio.add(btnCrearUsuario);
      this.add(pnlInicio);
      lblVacio2 = new JLabel("");
      this.add(lblVacio2);
      //this.add(pnlInicio,BorderLayout.SOUTH);
      this.setSize(800,800);
      this.setTitle("AppBanco");
      this.getContentPane().setBackground(Color.BLACK);
      pnlInicio.setBackground(Color.BLACK);

      //this.add(lblLogo, BorderLayout.CENTER);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.repaint();
      this.setVisible(true);

       btnIniciarSesion.addActionListener(new ActionListener()
      {
        @Override
        public void actionPerformed(ActionEvent e)
        {
          JVentanaInicio.this.setVisible(false);
          Constantes.ventanaInicioSesion.setVisible(true);
        }
        });

        btnCrearUsuario.addActionListener(new ActionListener()
        {
          @Override

            public void actionPerformed(ActionEvent e)
            {
              JVentanaInicio.this.setVisible(false);
              Constantes.ventanaCrearUsuario.setVisible(true);
            }
        });
      }


}
