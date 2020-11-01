package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class PerfilUsuario extends JFrame {
    //VARIABLE QUE IDENTIFICA AL USUARIO
    String user = InicioDeSesion.usuario;
   
    public PerfilUsuario(){
    this.setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Perfil del Usuario" +this.user);
//    setBounds(500, 200, 500, 500); //SE ESTABLECE LA POSICIÓN Y TAMAÑO DE LA VENTANA
    setLocationRelativeTo(null); //ESTABLECEMOS LA VENTANA EN EL CENTRO
    setMinimumSize(new Dimension(200,200));
    iniciarComponentes();
}
    
   private void iniciarComponentes(){
       JPanel panel = new JPanel(); //Creación de un panel
//       panel.setBackground(Color.GREEN);
       panel.setLayout(null); //Desactivar diseño 
       this.getContentPane().add(panel); //Agregamos el panel a la ventana
       
       JLabel etiqueta = new JLabel();
       etiqueta.setOpaque(true); //Establecemos pintar el fondo de la label
       etiqueta.setText("Usuario: " +user);
       etiqueta.setBounds(10, 10, 100, 20);
       etiqueta.setForeground(Color.WHITE);
       etiqueta.setBackground(Color.BLACK);
       panel.add(etiqueta);
       
       JLabel nombreUsuario = new JLabel();
       nombreUsuario.setOpaque(true); //Establecemos pintar el fondo de la label
       nombreUsuario.setText("Nombre: ");
       nombreUsuario.setBounds(10, 10, 100, 20);
       nombreUsuario.setForeground(Color.WHITE);
       nombreUsuario.setBackground(Color.BLACK);
       panel.add(nombreUsuario);
   }
    public static void main(String[] args) {
        PerfilUsuario v1 = new PerfilUsuario();
        v1.setVisible(true);
    } 

}
