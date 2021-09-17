/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mintic.forms;

import edu.mintic.dao.DAOperfil;
import edu.mintic.models.Perfil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhon
 */
public class PerfilAdmin extends javax.swing.JInternalFrame {

    private Integer idPerfilTemporal;
    private final String columnas[] = {"Codigo Perfil", "Nombre Perfil"};
    private final DefaultTableModel miModelo = new DefaultTableModel(columnas, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

    };

    public PerfilAdmin() {
        initComponents();
        idPerfilTemporal = null;
        cargarInformacion();

    }

    private void cargarInformacion() {
        List<Perfil> arregloPerfiles;
        DAOperfil miDAO = new DAOperfil();
        miModelo.setNumRows(0);
        arregloPerfiles = miDAO.consultar("");

        arregloPerfiles.forEach((miPerfil) -> {
            Object fila[] = new Object[2];
            fila[0] = miPerfil.getCodPerfil();
            fila[1] = miPerfil.getNombrePerfil();
            miModelo.addRow(fila);

        });
        tblaDatos.setModel(miModelo);
        tblaDatos.getColumnModel().getColumn(0).setPreferredWidth(140);
        tblaDatos.getColumnModel().getColumn(1).setPreferredWidth(560);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTltle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelBdy = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblSalidaCod = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblaDatos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        panelBtn = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();

        panelTltle.setBackground(new java.awt.Color(51, 204, 255));

        lblTitle.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblTitle.setText("Administracion De Perfiles");

        javax.swing.GroupLayout panelTltleLayout = new javax.swing.GroupLayout(panelTltle);
        panelTltle.setLayout(panelTltleLayout);
        panelTltleLayout.setHorizontalGroup(
            panelTltleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTltleLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTltleLayout.setVerticalGroup(
            panelTltleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTltleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBdy.setBackground(new java.awt.Color(204, 255, 255));

        lblCodigo.setText("Codigo De Perfil");

        lblNombre.setText("Nombre De Perfil");

        lblSalidaCod.setText("*");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        tblaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblaDatos);

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBdyLayout = new javax.swing.GroupLayout(panelBdy);
        panelBdy.setLayout(panelBdyLayout);
        panelBdyLayout.setHorizontalGroup(
            panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBdyLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo)
                    .addComponent(lblNombre))
                .addGap(35, 35, 35)
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalidaCod, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(panelBdyLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBdyLayout.setVerticalGroup(
            panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBdyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblSalidaCod)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelBdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn.setBackground(new java.awt.Color(204, 255, 255));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnLayout = new javax.swing.GroupLayout(panelBtn);
        panelBtn.setLayout(panelBtnLayout);
        panelBtnLayout.setHorizontalGroup(
            panelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(34, 34, 34))
        );
        panelBtnLayout.setVerticalGroup(
            panelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBdy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTltle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTltle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBdy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    private boolean seleccioneAceptar(String titulo, String mensaje) {
        int opcion;
        String textos[]={"aceptar","cancelar"};
        
        opcion=JOptionPane.showOptionDialog(panelBdy, mensaje,titulo,
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                 null, textos,textos[0]);
        return opcion==JOptionPane.YES_OPTION;
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (idPerfilTemporal != null) {
            if (seleccioneAceptar("Advertencia", "Estas Seguro "
                    + "De Eliminar El Perfil")) {
                Perfil objPerfil=new Perfil();
                DAOperfil miDAOPerfil = new DAOperfil();
                
                objPerfil.setCodPerfil(idPerfilTemporal);
                if (miDAOPerfil.borrar(objPerfil)) {
                    cargarInformacion();
                    
                    JOptionPane.showMessageDialog(panelBdy,"Perfil Eliminado Exitoxamente");
                } else {
                   JOptionPane.showMessageDialog(panelBdy,"Perfil NO Eliminado");

                }
                idPerfilTemporal=null;
                txtNombre.setText("");
                lblSalidaCod.setText("*");
            } else {
            }
        } else {
            JOptionPane.showMessageDialog(panelBdy,
                    "Debes Seleccionar Un Perifl", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblaDatosMouseClicked
        int fila = tblaDatos.getSelectedRow();
        String cadenaCodigo = tblaDatos.getValueAt(fila, 0).toString();
        String cadenaNombre = tblaDatos.getValueAt(fila, 1).toString();

        idPerfilTemporal = Integer.parseInt(cadenaCodigo);
        lblSalidaCod.setText(cadenaCodigo);
        txtNombre.setText(cadenaNombre);

    }//GEN-LAST:event_tblaDatosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (idPerfilTemporal != null) {
            Perfil objPerfil = new Perfil();
            objPerfil.setCodPerfil(idPerfilTemporal);
            objPerfil.setNombrePerfil(txtNombre.getText());

            DAOperfil miDAO = new DAOperfil();
            if (miDAO.actualizar(objPerfil)) {
                cargarInformacion();
                JOptionPane.showMessageDialog(panelBdy, "Actualizacion Exitosa");
            } else {
                JOptionPane.showMessageDialog(panelBdy, "No Se Pudo"
                        + " Actualizar La Base De Datos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(panelBdy, "debes seleccionar un perfil",
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
        idPerfilTemporal = null;
        lblSalidaCod.setText("*");
        lblNombre.setText("");
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalidaCod;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelBdy;
    private javax.swing.JPanel panelBtn;
    private javax.swing.JPanel panelTltle;
    private javax.swing.JTable tblaDatos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
