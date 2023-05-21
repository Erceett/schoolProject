package collegeinfo.Admin;

import javax.swing.*;
import java.sql.*;
import Model.*;
import collegeinfo.Helper.dbConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class adminSubeler extends javax.swing.JFrame {
    
    private DefaultTableModel ogrtModel = null;
    private Object[] ogrtData = null;
    
    private dbConnection conn = new dbConnection();
    
    PreparedStatement prepareStatement = null;

    public adminSubeler() throws SQLException{
        
        admin admin = new admin();
        ogrtModel = new DefaultTableModel();
        Object[] colOgrtName = new Object[4];
        colOgrtName[0] = "id";
        colOgrtName[1] = "Ad Soyad";
        colOgrtName[2] = "Sinif";
        colOgrtName[3] = "Sube";
        ogrtModel.setColumnIdentifiers(colOgrtName);
        ogrtData = new Object[4];
        
        for (int i = 0; i < admin.getOgrtSubeList().size(); i++) {
            ogrtData[0] = admin.getOgrtSubeList().get(i).getId();
            ogrtData[1] = admin.getOgrtSubeList().get(i).getadSoyad();
            ogrtData[2] = admin.getOgrtSubeList().get(i).getSinif();
            ogrtData[3] = admin.getOgrtSubeList().get(i).getSube();
            ogrtModel.addRow(ogrtData);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(ogrtModel);
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("GERİ DÖN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(351, 351, 351))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new adminSubeler().setVisible(true);
                } catch (SQLException ex) {             
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
