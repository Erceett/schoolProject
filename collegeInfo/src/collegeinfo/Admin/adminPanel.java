package collegeinfo.Admin;
import Model.*;
import collegeinfo.*;
import collegeinfo.Admin.*;
import collegeinfo.Helper.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adminPanel extends javax.swing.JFrame {
    
    Connection con = dbConnection.connectDb();
    PreparedStatement prepareStatement = null;
    ResultSet rs;
    Statement st;
    
    String sinif = null;

    public adminPanel() {
        initComponents();
    }
    
    private static void updateSinif(Connection con, String tablo, String yeniSinif, int id) throws SQLException
    {
        String sql = "UPDATE " + tablo + " SET sinif = ?, ozurlu = ?, ozursuz = ?, turk1 = ?, turk2 = ?, mat1 = ?, mat2 = ?, fen1 = ?, fen2 = ?, sos1 = ?, sos2 = ?, ing1 = ?, ing2 = ? WHERE id = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, yeniSinif);
        statement.setInt(2,0);
        statement.setInt(3,0);
        statement.setInt(4,0);
        statement.setInt(5,0);
        statement.setInt(6,0);
        statement.setInt(7,0);
        statement.setInt(8,0);
        statement.setInt(9,0);
        statement.setInt(10,0);
        statement.setInt(11,0);
        statement.setInt(12,0);
        statement.setInt(13,0);
        statement.setInt(14, id);
        statement.executeUpdate();
    }
    
    private static void deleteSinif(Connection con, String tabloAdi, int id) throws SQLException {
        String sql = "DELETE FROM " + tabloAdi + " WHERE id = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        subelendirme = new javax.swing.JButton();
        ogrtList = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ogrcList1 = new javax.swing.JButton();
        yılSonu = new javax.swing.JButton();
        ogrcList2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(825, 287));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("ADMİN PANELE HOŞGELDİNİZ");

        subelendirme.setText("ÖĞRETMEN SINIF ATAMASI");
        subelendirme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subelendirmeActionPerformed(evt);
            }
        });

        ogrtList.setText("ÖĞRETMEN İŞLEMLERİ");
        ogrtList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrtListActionPerformed(evt);
            }
        });

        jButton1.setText("ÇIKIŞ YAP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ogrcList1.setText("DEVAMSIZLIK İŞLEMLERİ");
        ogrcList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrcList1ActionPerformed(evt);
            }
        });

        yılSonu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        yılSonu.setText("YIL SONU");
        yılSonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yılSonuActionPerformed(evt);
            }
        });

        ogrcList2.setText("ÖĞRENCİ İŞLEMLERİ");
        ogrcList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrcList2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ogrtList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subelendirme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ogrcList1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ogrcList2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(322, 322, 322))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(yılSonu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrtList)
                    .addComponent(ogrcList2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subelendirme)
                    .addComponent(ogrcList1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(yılSonu)
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subelendirmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subelendirmeActionPerformed
        adminSiniflandirma frame;
        try {
            frame = new adminSiniflandirma();
            frame.setVisible(true);
            frame.setSize(825,435);
        } catch (SQLException ex) {
        }
        
    }//GEN-LAST:event_subelendirmeActionPerformed

    private void ogrtListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrtListActionPerformed
        adminOgrt frame;
        try {
            frame = new adminOgrt();
            frame.setVisible(true);
            frame.setSize(825, 435);
        } catch (SQLException ex) { 
        }
            

        
    }//GEN-LAST:event_ogrtListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ogrcList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrcList1ActionPerformed
        adminDay frame;
        try {
            frame = new adminDay();
            frame.setVisible(true);
            frame.setSize(825,435);
        } catch (SQLException ex) {
           
        }
        
    }//GEN-LAST:event_ogrcList1ActionPerformed

    private void yılSonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yılSonuActionPerformed
        try {
            String sql = "SELECT * FROM ogrencitablosu";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id");
                String sinif = rs.getString("sinif");
                int a = Integer.parseInt(rs.getString("sinif")) + 1;
                String yeniSinif = Integer.toString(a);
                System.out.println(yeniSinif);
                if (sinif.equals("8")) 
                {
                    deleteSinif(con, "ogrencitablosu", id);
                }
                else
                updateSinif(con, "ogrencitablosu", yeniSinif, id);
            }
            
            
            
            /*String query4 = "UPDATE ogrencitablosu SET sinif = '5' WHERE sinif = 4";
            PreparedStatement stmt4 = con.prepareStatement(query4);
            stmt4.executeUpdate();
            String query5 = "UPDATE ogrencitablosu SET sinif = '6' WHERE sinif = '5'";
            PreparedStatement stmt5 = con.prepareStatement(query5);
            stmt5.executeUpdate();*/
            
            
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_yılSonuActionPerformed

    private void ogrcList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrcList2ActionPerformed
        try {
            adminOgrc frame = new adminOgrc();
            frame.setVisible(true);
            frame.setSize(825,435);
        } catch (SQLException ex) {
            Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ogrcList2ActionPerformed

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
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPanel().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton ogrcList1;
    private javax.swing.JButton ogrcList2;
    private javax.swing.JButton ogrtList;
    private javax.swing.JButton subelendirme;
    private javax.swing.JButton yılSonu;
    // End of variables declaration//GEN-END:variables
}
