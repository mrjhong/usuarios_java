package edu.mintic.forms;

import edu.mintic.dao.DAOUsuario;
import edu.mintic.dao.DAOperfil;
import edu.mintic.models.Perfil;
import edu.mintic.models.Usuario;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class UsuarioCrear extends javax.swing.JInternalFrame {

    private Map<Integer, Integer> codigosPerfiles = new HashMap<>();
    private DefaultComboBoxModel miModelo = new DefaultComboBoxModel();

    public UsuarioCrear() {
        initComponents();
        cargarPerfiles();
        grupoOpcEstado.add(opcionEstado1);
        grupoOpcEstado.add(opcionEstado2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOpcEstado = new javax.swing.ButtonGroup();
        panelTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBdy = new javax.swing.JPanel();
        lblNomUsu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        opcionEstado1 = new javax.swing.JRadioButton();
        opcionEstado2 = new javax.swing.JRadioButton();
        txtNomUsu = new javax.swing.JTextField();
        comboSelect = new javax.swing.JComboBox<>();
        pswdUsu = new javax.swing.JPasswordField();
        panelBtn = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        panelTitle.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Crear Usuarios");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBdy.setBackground(new java.awt.Color(204, 255, 255));

        lblNomUsu.setText("Nombre Usuario:");

        jLabel2.setText("Selecciona un Perfil:");
        jLabel2.setToolTipText("");

        jLabel3.setText("Contraseña:");

        jLabel4.setText("Estado Del Usuario:");

        opcionEstado1.setBackground(new java.awt.Color(204, 255, 255));
        opcionEstado1.setText("Activo");
        opcionEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionEstado1ActionPerformed(evt);
            }
        });

        opcionEstado2.setBackground(new java.awt.Color(204, 255, 255));
        opcionEstado2.setText("Inactiva");

        txtNomUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomUsuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBdyLayout = new javax.swing.GroupLayout(panelBdy);
        panelBdy.setLayout(panelBdyLayout);
        panelBdyLayout.setHorizontalGroup(
            panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBdyLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelBdyLayout.createSequentialGroup()
                        .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblNomUsu)
                            .addComponent(jLabel3))
                        .addGap(80, 80, 80)
                        .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBdyLayout.createSequentialGroup()
                                .addComponent(opcionEstado1)
                                .addGap(67, 67, 67)
                                .addComponent(opcionEstado2))
                            .addComponent(comboSelect, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomUsu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pswdUsu))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        panelBdyLayout.setVerticalGroup(
            panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBdyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomUsu)
                    .addComponent(txtNomUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pswdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(opcionEstado1)
                    .addComponent(opcionEstado2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelBtn.setBackground(new java.awt.Color(204, 255, 255));

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnLayout = new javax.swing.GroupLayout(panelBtn);
        panelBtn.setLayout(panelBtnLayout);
        panelBtnLayout.setHorizontalGroup(
            panelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        panelBtnLayout.setVerticalGroup(
            panelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBdy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBdy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPerfiles() {
        int indice;
        String cadena = "Seleccione un Perfil";
        List<Perfil> miArregloPerfiles;
        DAOperfil miDAOPerfil = new DAOperfil();
        indice = 0;
        miModelo.addElement(cadena);
        codigosPerfiles.put(0, 0);
        miArregloPerfiles = miDAOPerfil.consultar("nombre_perfil");
        for (Perfil miPerfil : miArregloPerfiles) {
            indice++;
            miModelo.addElement(miPerfil.getNombrePerfil());
            codigosPerfiles.put(indice, miPerfil.getCodPerfil());
        }
        comboSelect.setModel(miModelo);
    }

    private boolean datosValido() {
        String cadena = String.valueOf(pswdUsu.getPassword());
        if (txtNomUsu.getText().isEmpty()) {
            txtNomUsu.requestFocus();
            return false;
        }
        if (comboSelect.getSelectedIndex() == 0) {
            return false;
        }
        if (cadena.isEmpty()) {
            pswdUsu.requestFocus();
            return false;
        }
        if (!opcionEstado1.isSelected() && !opcionEstado2.isSelected()) {
            return false;
        }
        return true;
    }

    private void limpiarFormulario() {
        txtNomUsu.setText("");
        comboSelect.setSelectedItem(0);
        pswdUsu.setText("");
        grupoOpcEstado.clearSelection();
    }

    private String generarClave() {
        try {
            String cadena = String.valueOf(pswdUsu.getPassword());
            MessageDigest miHash = MessageDigest.getInstance("SHA-512");

            miHash.reset();
            miHash.update(cadena.getBytes("UTF8"));
            return String.format("%0128x", new BigInteger(1, miHash.digest()));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioCrear.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private void txtNomUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomUsuActionPerformed

    private void opcionEstado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionEstado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionEstado1ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        int indiceSelect, codPerfilFinal;
        indiceSelect = comboSelect.getSelectedIndex();
        codPerfilFinal = codigosPerfiles.get(indiceSelect);
        if (datosValido()) {
            Perfil objPerfil = new Perfil();
            Usuario objUsuario = new Usuario();
            DAOUsuario miDAOUsuario = new DAOUsuario();

            objPerfil.setCodPerfil(codPerfilFinal);

            objUsuario.setNombreUsuario(txtNomUsu.getText());

            objUsuario.setPerfilUsuario(objPerfil);

            objUsuario.setClaveUsuario(generarClave());

            if (opcionEstado1.isSelected()) {
                objUsuario.setEstadoUsuario(1);
            } else {
                objUsuario.setEstadoUsuario(2);
            }

            if (miDAOUsuario.agregar(objUsuario)) {
                limpiarFormulario();
                JOptionPane.showMessageDialog(panelBdy, "El Usuario Fue Creado");
            } else {
                JOptionPane.showMessageDialog(panelBdy, "El Usuario No Fue Creado");

            }
        } else {
            JOptionPane.showMessageDialog(panelBdy, "Error Al Validar Datos",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> comboSelect;
    private javax.swing.ButtonGroup grupoOpcEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNomUsu;
    private javax.swing.JRadioButton opcionEstado1;
    private javax.swing.JRadioButton opcionEstado2;
    private javax.swing.JPanel panelBdy;
    private javax.swing.JPanel panelBtn;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPasswordField pswdUsu;
    private javax.swing.JTextField txtNomUsu;
    // End of variables declaration//GEN-END:variables
}
