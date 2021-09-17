package edu.mintic.forms;

import edu.mintic.configuration.Dominios;
import java.awt.Component;
import java.awt.Container;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        cambiarIcono();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablero = new javax.swing.JPanel();
        menuSuperior = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        subMenuAcercaDe = new javax.swing.JMenuItem();
        subMenuSalir = new javax.swing.JMenuItem();
        menuPerfiles = new javax.swing.JMenu();
        subMenuPerfCrear = new javax.swing.JMenuItem();
        subMenuPerfListar = new javax.swing.JMenuItem();
        subMenuPerfAdmin = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        subMenuUsuCrear = new javax.swing.JMenuItem();
        subMenuUsuListar = new javax.swing.JMenuItem();
        subMenuUsuAdmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablero.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        menuSuperior.setBackground(new java.awt.Color(255, 255, 255));
        menuSuperior.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N

        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N

        subMenuAcercaDe.setText("Acerca De");
        subMenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAcercaDeActionPerformed(evt);
            }
        });
        menuArchivo.add(subMenuAcercaDe);

        subMenuSalir.setText("Salir");
        subMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(subMenuSalir);

        menuSuperior.add(menuArchivo);

        menuPerfiles.setText("Perfiles");
        menuPerfiles.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N

        subMenuPerfCrear.setText("Crear");
        subMenuPerfCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuPerfCrearActionPerformed(evt);
            }
        });
        menuPerfiles.add(subMenuPerfCrear);

        subMenuPerfListar.setText("Listar");
        subMenuPerfListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuPerfListarActionPerformed(evt);
            }
        });
        menuPerfiles.add(subMenuPerfListar);

        subMenuPerfAdmin.setText("Administrar");
        subMenuPerfAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuPerfAdminActionPerformed(evt);
            }
        });
        menuPerfiles.add(subMenuPerfAdmin);

        menuSuperior.add(menuPerfiles);

        menuUsuarios.setText("Usuarios");
        menuUsuarios.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N

        subMenuUsuCrear.setText("Crear");
        subMenuUsuCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuUsuCrearActionPerformed(evt);
            }
        });
        menuUsuarios.add(subMenuUsuCrear);

        subMenuUsuListar.setText("Listar");
        subMenuUsuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuUsuListarActionPerformed(evt);
            }
        });
        menuUsuarios.add(subMenuUsuListar);

        subMenuUsuAdmin.setText("Administrar");
        menuUsuarios.add(subMenuUsuAdmin);

        menuSuperior.add(menuUsuarios);

        setJMenuBar(menuSuperior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAcercaDeActionPerformed

        try {
            AcercaDe ventanaAcercaDe = new AcercaDe();
            agregarVentanaPanel(ventanaAcercaDe);
            ventanaAcercaDe.show();
            ventanaAcercaDe.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subMenuAcercaDeActionPerformed

    private void quitarCuadroIzquierdo(JInternalFrame ventanita) {
        BasicInternalFrameUI interfaceUsuario = (BasicInternalFrameUI) ventanita.getUI();
        Container panelSuperiorVentana = interfaceUsuario.getNorthPane();
        panelSuperiorVentana.remove(0);
        panelSuperiorVentana.revalidate();
        panelSuperiorVentana.repaint();
    }

    private void subMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSalirActionPerformed
        int opcion;
        String textbutt[] = {"Aceptar", "Cancelar"};
        opcion = JOptionPane.showOptionDialog(tablero, "Estas Seguro De Salir",
                "Advertencia", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, textbutt, textbutt[0]);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_subMenuSalirActionPerformed
    private void cambiarIcono() {
        String rutaIcono = getClass()
                .getResource(Dominios.RUTA_IMAGENES + "/" + Dominios.ICONO_PROYECTO)
                .getPath();
        ImageIcon miIcono = new ImageIcon(rutaIcono);
        this.setIconImage(miIcono.getImage());
    }
    private void subMenuPerfAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuPerfAdminActionPerformed
     try {
            PerfilAdmin ventanaAdmin = new PerfilAdmin();
            agregarVentanaPanel(ventanaAdmin);
            ventanaAdmin.show();
            ventanaAdmin.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_subMenuPerfAdminActionPerformed

    private void subMenuPerfCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuPerfCrearActionPerformed

        try {
            PerfilCrear ventanaCrear = new PerfilCrear();
            agregarVentanaPanel(ventanaCrear);
            ventanaCrear.show();
            ventanaCrear.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subMenuPerfCrearActionPerformed

    private void subMenuPerfListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuPerfListarActionPerformed
        try {
            perfilListar ventanaListar = new perfilListar();
            agregarVentanaPanel(ventanaListar);
            ventanaListar.show();
            ventanaListar.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);

        }
     }//GEN-LAST:event_subMenuPerfListarActionPerformed

    private void agregarVentanaPanel(JInternalFrame ventanita) {

        if (tablero.getComponentCount() > 0) {
            tablero.removeAll();
        }
        tablero.add(ventanita);
        quitarCuadroIzquierdo(ventanita);
        //  for (Component miComponente : tablero.getComponents()) {
        //     System.out.println(miComponente);
        // }
    }

    private void subMenuUsuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuUsuListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuUsuListarActionPerformed

    private void subMenuUsuCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuUsuCrearActionPerformed
        try {
            UsuarioCrear ventanaUsuarioCrear=new UsuarioCrear();
            agregarVentanaPanel(ventanaUsuarioCrear);
            ventanaUsuarioCrear.show();
            ventanaUsuarioCrear.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_subMenuUsuCrearActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuPerfiles;
    private javax.swing.JMenuBar menuSuperior;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenuItem subMenuAcercaDe;
    private javax.swing.JMenuItem subMenuPerfAdmin;
    private javax.swing.JMenuItem subMenuPerfCrear;
    private javax.swing.JMenuItem subMenuPerfListar;
    private javax.swing.JMenuItem subMenuSalir;
    private javax.swing.JMenuItem subMenuUsuAdmin;
    private javax.swing.JMenuItem subMenuUsuCrear;
    private javax.swing.JMenuItem subMenuUsuListar;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
}
