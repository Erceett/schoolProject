package collegeinfo;

import Model.admin;
import collegeinfo.Admin.adminPanel;
import collegeinfo.Helper.dbConnection;
import static collegeinfo.collegeIndex.ogretmenId;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ogretmen extends javax.swing.JFrame {
    
    private dbConnection conn = new dbConnection();
    
    int ogretmenId = collegeIndex.ogretmenId;
    String sinif = null;
    String sube = null;
    
    

    public ogretmen() throws SQLException {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboSinif = new javax.swing.JComboBox<>();
        comboSube = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("SINIF");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ŞUBE");

        comboSinif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboSinif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8" }));

        comboSube.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboSube.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("LİSTELE");
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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboSube, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboSinif, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(715, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSinif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (comboSinif.getSelectedIndex() == 0) {
            sinif = "5";
            if(comboSube.getSelectedIndex() == 0){
                sube = "A";
                try {
                Connection con = conn.connectDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM subeler");
                while(rs.next()){
                    if (ogretmenId == rs.getInt("ogretmenID") && sinif.equals(rs.getString("sinif")) && sube.equals(rs.getString("sube"))) {
                        
                    }
                    else{
                        break;
                    } 
                }
            } catch (SQLException ex) {
            }
            }
            else{
            
            }
        }
        else if(comboSinif.getSelectedIndex() == 1){
            if(comboSube.getSelectedIndex() == 0){
            
            }
            else {
            
            }
        }
        else if(comboSinif.getSelectedIndex() == 2){
            if(comboSube.getSelectedIndex() == 0){
            
            }
            else{
            
            }
        }
        else if (comboSinif.getSelectedIndex() == 3){
            if(comboSube.getSelectedIndex() == 0){
            
            }
            else{
            
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ogretmen().setVisible(true);
                } catch (SQLException ex) {
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboSinif;
    private javax.swing.JComboBox<String> comboSube;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
