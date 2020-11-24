package ventanas;

import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class MenuActividades extends javax.swing.JFrame {
    //INSTANCIAMOS EN NUESTRO PANEL DE ACTIVIDADES EL PANEL EJEMPLO1
    PnEj1 ej1 = new PnEj1();
    //INSTANCIAMOS EN NUESTRO PANEL DE ACTIVIDADES EL PANEL ACTIVIDAD1.
    PnAct1 act1 = new PnAct1();
    
    //diseño para un contenedor. Trata cada componente del contenedor como una tarjeta. Solo una carta es visible a la vez.
    CardLayout vista;

    public MenuActividades() {
        initComponents();
        //COMANDO PARA HACER GRANDE LA GUI.
        setExtendedState(MAXIMIZED_BOTH);
        //PARA QUE EL USUARIO NO PUEDA MANIPULAR EL TAMAÑO DE LA GUI.
        setResizable(false);
        //PARA MOSTRAR EL TITULO DE LA VENTANA.
        setTitle("Menú De Actividades");
        
        //PARA AGREGAR IMAGENES A LOS BOTONES.
        ImageIcon imgAct1 = new ImageIcon("src/img/iconoAct.png");
        btnAct1.setIcon(imgAct1);
        ImageIcon imgEj1 = new ImageIcon("src/img/iconoLeccion.png");
        btnEj1.setIcon(imgEj1);
        ImageIcon imgAct2 = new ImageIcon("src/img/iconoAct.png");
        btnAct2.setIcon(imgAct2);
        ImageIcon imgEj2 = new ImageIcon("src/img/iconoLeccion.png");
        btnEj2.setIcon(imgEj2);
        ImageIcon imgAct3 = new ImageIcon("src/img/iconoAct.png");
        btnAct3.setIcon(imgAct3);
        ImageIcon imgEj3 = new ImageIcon("src/img/iconoLeccion.png");
        btnEj3.setIcon(imgEj3);
        ImageIcon imgAct4 = new ImageIcon("src/img/iconoAct.png");
        btnAct4.setIcon(imgAct4);
        ImageIcon imgEj4 = new ImageIcon("src/img/iconoLeccion.png");
        btnEj4.setIcon(imgEj4);
          
        //A NUESTRO PANEL QUE NOS MUESTRARA TODAS LAS ACTIVIDADES ESTAMOS HACIENDO CASTEO PARA HACERLO TIPO CARDLAYOUT
        vista = (CardLayout) panelActividades.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        btnEj1 = new javax.swing.JToggleButton();
        btnAct1 = new javax.swing.JToggleButton();
        btnAct2 = new javax.swing.JToggleButton();
        btnEj3 = new javax.swing.JToggleButton();
        btnAct3 = new javax.swing.JToggleButton();
        btnEj4 = new javax.swing.JToggleButton();
        btnAct4 = new javax.swing.JToggleButton();
        btnEj2 = new javax.swing.JToggleButton();
        panelActividades = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        menu.setBackground(new java.awt.Color(255, 153, 102));

        btnEj1.setText("EJEMPLO 1");
        btnEj1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEj1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj1ActionPerformed(evt);
            }
        });

        btnAct1.setText("ACTIVIDAD 1");
        btnAct1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAct1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAct1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAct1ActionPerformed(evt);
            }
        });

        btnAct2.setText("ACTIVIDAD 2");
        btnAct2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAct2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAct2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnEj3.setText("EJEMPLO 3");
        btnEj3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEj3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAct3.setText("ACTIVIDAD 3");
        btnAct3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAct3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAct3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnEj4.setText("EJEMPLO 4");
        btnEj4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEj4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAct4.setText("ACTIVIDAD 4");
        btnAct4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAct4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAct4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnEj2.setText("EJEMPLO 2");
        btnEj2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEj2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEj2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEj1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAct2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEj3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEj4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAct4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAct3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEj1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnAct1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEj2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAct2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEj3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAct3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAct4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnEj4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        panelActividades.setBackground(new java.awt.Color(255, 153, 102));
        panelActividades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENÚ DE APRENDIZAJE.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 18))); // NOI18N
        panelActividades.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelActividades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj1ActionPerformed
        //ESTAMOS AÑADIENDO UN PANEL EXTERNO HACIA NUESTRA INTERFAZ DE ACTIVIDADES.
        panelActividades.add(ej1, "Ejemplo1");
        //CON EL METODO SHOW ESTAMOS DICIENDO QUE NOS MUESTRE EL PANEL DEL EJEMPLO 1.
        vista.show(panelActividades, "Ejemplo1");
        //Un cambio de apariencia simple: pida a cada nodo del árbol que actualiceUI (),con la apriencia actual.
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint(); //PARA ACTUALIZAR CAMBIOS.
    }//GEN-LAST:event_btnEj1ActionPerformed

    private void btnAct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAct1ActionPerformed
        //ESTAMOS AÑADIENDO UN PANEL EXTERNO HACIA NUESTRA INTERFAZ DE ACTIVIDADES.
        panelActividades.add(act1, "Actividad1");
        //CON EL METODO SHOW ESTAMOS DICIENDO QUE NOS MUESTRE EL PANEL DEL EJEMPLO 1.
        vista.show(panelActividades, "Actividad1");
        //Un cambio de apariencia simple: pida a cada nodo del árbol que actualiceUI (),con la apriencia actual.
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint(); //PARA ACTUALIZAR CAMBIOS.
    }//GEN-LAST:event_btnAct1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuActividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAct1;
    private javax.swing.JToggleButton btnAct2;
    private javax.swing.JToggleButton btnAct3;
    private javax.swing.JToggleButton btnAct4;
    private javax.swing.JToggleButton btnEj1;
    private javax.swing.JToggleButton btnEj2;
    private javax.swing.JToggleButton btnEj3;
    private javax.swing.JToggleButton btnEj4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelActividades;
    // End of variables declaration//GEN-END:variables
}
