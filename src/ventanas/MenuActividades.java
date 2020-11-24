package ventanas;

import java.awt.CardLayout;
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
        //A NUESTRO PANEL QUE NOS MUESTRARA TODAS LAS ACTIVIDADES ESTAMOS HACIENDO CASTEO PARA HACERLO TIPO CARDLAYOUT
        vista = (CardLayout) panelActividades.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEj1 = new javax.swing.JToggleButton();
        btnAct1 = new javax.swing.JToggleButton();
        btnEj2 = new javax.swing.JToggleButton();
        btnAct2 = new javax.swing.JToggleButton();
        btnEj3 = new javax.swing.JToggleButton();
        btnAct3 = new javax.swing.JToggleButton();
        btnEj4 = new javax.swing.JToggleButton();
        btnAct4 = new javax.swing.JToggleButton();
        panelActividades = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENÚ ACTIVIDADES");

        btnEj1.setText("EJEMPLO 1");
        btnEj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj1ActionPerformed(evt);
            }
        });

        btnAct1.setText("ACTIVIDAD 1");
        btnAct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAct1ActionPerformed(evt);
            }
        });

        btnEj2.setText("EJEMPLO 2");

        btnAct2.setText("ACTIVIDAD 2");

        btnEj3.setText("EJEMPLO 3");

        btnAct3.setText("ACTIVIDAD 3");

        btnEj4.setText("EJEMPLO 4");

        btnAct4.setText("ACTIVIDAD 4");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(btnAct1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEj2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAct2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEj3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAct3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAct4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEj4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEj1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnEj1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEj2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAct2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEj3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAct3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEj4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAct4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelActividades.setBackground(new java.awt.Color(255, 255, 255));
        panelActividades.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            @Override
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelActividades;
    // End of variables declaration//GEN-END:variables
}
