package collegeinfo.Admin;
import javax.swing.*;
import java.sql.*;
import Model.*;
import collegeinfo.Helper.dbConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class adminDay extends javax.swing.JFrame {
    
    private DefaultTableModel ogrcModel = null;
    private Object[] ogrcData = null;
    private dbConnection conn = new dbConnection();
    
    Connection con = conn.connectDb();
    Statement st = null;
    ResultSet rs = null;

    public adminDay() throws SQLException {
        ogrcModel = new DefaultTableModel();
        Object[] colOgrcName = new Object[4];
        colOgrcName[0] = "Ad Soyad";
        colOgrcName[1] = "Numara";
        colOgrcName[2] = "Özürlü Devamsızlık";
        colOgrcName[3] = "Özürsüz Devamsızlık";
        ogrcModel.setColumnIdentifiers(colOgrcName);
        ogrcData = new Object[4];
        initComponents();
    }
     
    public void refreshOgrcModel(String sinif, String sube) throws SQLException{
        DefaultTableModel clearModel = (DefaultTableModel) jTable1.getModel();
        clearModel.setRowCount(0);
    }
    
    public ArrayList<ogrenciUser> getOgrcList(String sinif, String sube)throws SQLException{
        ArrayList<ogrenciUser> list = new ArrayList<>();
        ogrenciUser obj;
        String sql = "SELECT * FROM ogrencitablosu WHERE sinif = ? AND sube = ?";
        try(PreparedStatement statement = con.prepareStatement(sql)){
            statement.setString(1, sinif);
            statement.setString(2, sube);
            
            try(ResultSet rs = statement.executeQuery()){
                while(rs.next()){
                    obj = new ogrenciUser(rs.getInt("id"),rs.getInt("ozurlu"), rs.getInt("ozursuz"), rs.getString("adSoyad"), rs.getString("sinif"), rs.getString("sube"), rs.getString("sifre"),
            rs.getInt("turk1"),rs.getInt("turk2"),rs.getInt("mat1"),rs.getInt("mat2"),rs.getInt("fen1"),rs.getInt("fen2"),rs.getInt("sos1"),rs.getInt("sos2")
            ,rs.getInt("ing1"),rs.getInt("ing2"));list.add(obj);
                }
            }
        }
        return list;
    }
    
    
    
    public void updateOgrcModel() throws SQLException{
        DefaultTableModel clearModel = (DefaultTableModel) jTable1.getModel();
        clearModel.setRowCount(0);
        admin admin = new admin();
        for (int i = 0; i < admin.getOgrcList().size(); i++) {
            ogrcData[0] = admin.getOgrcList().get(i).getId();
            ogrcData[1] = admin.getOgrcList().get(i).getadSoyad();
            ogrcData[2] = admin.getOgrcList().get(i).getSinif();
            ogrcData[3] = admin.getOgrcList().get(i).getSube();
            ogrcData[4] = admin.getOgrcList().get(i).getSifre();
            ogrcModel.addRow(ogrcData);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(ogrcModel);
        jLabel2 = new javax.swing.JLabel();
        comboSinif = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboSube = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numField = new javax.swing.JTextField();
        ozurlu = new javax.swing.JTextField();
        ozursuz = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("DEVAMSIZLIK BİLGİLERİ");

        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("SINIF");

        comboSinif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboSinif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", " " }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ŞUBE");

        comboSube.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboSube.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("LİSTELE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("ÖNCEKİ SAYFA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("GÜNCELLE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("NUMARA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("ÖZÜRLÜ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("ÖZÜRSÜZ");

        numField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ozurlu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ozursuz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSinif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(numField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ozurlu, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ozursuz, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSinif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ozurlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ozursuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int snf = comboSinif.getSelectedIndex();
        int sb = comboSube.getSelectedIndex();
        String sinif = null;
        String sube = null;

        switch(snf){
            case 0:
                switch(sb){
                    case 0:
                        sinif = "5";
                        sube = "A";
                        try {
                            refreshOgrcModel(sinif, sube);
                            for (int i = 0; i < getOgrcList(sinif, sube).size(); i++) {
                            ogrcData[0] = getOgrcList(sinif, sube).get(i).getadSoyad();
                            ogrcData[1] = getOgrcList(sinif, sube).get(i).getId();
                            ogrcData[2] = getOgrcList(sinif, sube).get(i).getOzurlu();
                            ogrcData[3] = getOgrcList(sinif, sube).get(i).getOzursuz();
                            ogrcModel.addRow(ogrcData);} 
                        } 
                        catch (SQLException ex) {}
                        break;
                    case 1:
                        sinif = "5";
                        sube = "B";
                        try {
                            refreshOgrcModel(sinif, sube);
                            for (int i = 0; i < getOgrcList(sinif, sube).size(); i++) {
                            ogrcData[0] = getOgrcList(sinif, sube).get(i).getadSoyad();
                            ogrcData[1] = getOgrcList(sinif, sube).get(i).getId();
                            ogrcData[2] = getOgrcList(sinif, sube).get(i).getOzurlu();
                            ogrcData[3] = getOgrcList(sinif, sube).get(i).getOzursuz();
                            ogrcModel.addRow(ogrcData);} 
                        } 
                        catch (SQLException ex) {}
                        break;
                }
                break;
            case 1:
                switch(sb){
                    case 0:
                        sinif = "6";
                        sube = "A";
                        try {
                            refreshOgrcModel(sinif, sube);
                            for (int i = 0; i < getOgrcList(sinif, sube).size(); i++) {
                            ogrcData[0] = getOgrcList(sinif, sube).get(i).getadSoyad();
                            ogrcData[1] = getOgrcList(sinif, sube).get(i).getId();
                            ogrcData[2] = getOgrcList(sinif, sube).get(i).getOzurlu();
                            ogrcData[3] = getOgrcList(sinif, sube).get(i).getOzursuz();
                            ogrcModel.addRow(ogrcData);} 
                        } 
                        catch (SQLException ex) {}
                        break;
                    case 1:
                        sinif = "6";
                        sube = "B";
                        try {
                            refreshOgrcModel(sinif, sube);
                            for (int i = 0; i < getOgrcList(sinif, sube).size(); i++) {
                            ogrcData[0] = getOgrcList(sinif, sube).get(i).getadSoyad();
                            ogrcData[1] = getOgrcList(sinif, sube).get(i).getId();
                            ogrcData[2] = getOgrcList(sinif, sube).get(i).getOzurlu();
                            ogrcData[3] = getOgrcList(sinif, sube).get(i).getOzursuz();
                            ogrcModel.addRow(ogrcData);} 
                        } 
                        catch (SQLException ex) {}
                        break;   
                }
                break;
            case 2:
                switch(sb){
                    case 0:
                        sinif = "7";
                        sube = "A";
                        try {
                            refreshOgrcModel(sinif, sube);
                            for (int i = 0; i < getOgrcList(sinif, sube).size(); i++) {
                            ogrcData[0] = getOgrcList(sinif, sube).get(i).getadSoyad();
                            ogrcData[1] = getOgrcList(sinif, sube).get(i).getId();
                            ogrcData[2] = getOgrcList(sinif, sube).get(i).getOzurlu();
                            ogrcData[3] = getOgrcList(sinif, sube).get(i).getOzursuz();
                            ogrcModel.addRow(ogrcData);} 
                        } 
                        catch (SQLException ex) {}
                        break;
                    case 1:
                        sinif = "7";
                        sube = "B";
                        try {
                            refreshOgrcModel(sinif, sube);
                            for (int i = 0; i < getOgrcList(sinif, sube).size(); i++) {
                            ogrcData[0] = getOgrcList(sinif, sube).get(i).getadSoyad();
                            ogrcData[1] = getOgrcList(sinif, sube).get(i).getId();
                            ogrcData[2] = getOgrcList(sinif, sube).get(i).getOzurlu();
                            ogrcData[3] = getOgrcList(sinif, sube).get(i).getOzursuz();
                            ogrcModel.addRow(ogrcData);} 
                        } 
                        catch (SQLException ex) {}
                        break;
                }
                break;
            case 3:
                switch(sb){
                    case 0:
                        sinif = "8";
                        sube = "A";
                        try {
                            refreshOgrcModel(sinif, sube);
                            for (int i = 0; i < getOgrcList(sinif, sube).size(); i++) {
                            ogrcData[0] = getOgrcList(sinif, sube).get(i).getadSoyad();
                            ogrcData[1] = getOgrcList(sinif, sube).get(i).getId();
                            ogrcData[2] = getOgrcList(sinif, sube).get(i).getOzurlu();
                            ogrcData[3] = getOgrcList(sinif, sube).get(i).getOzursuz();
                            ogrcModel.addRow(ogrcData);} 
                        } 
                        catch (SQLException ex) {}
                        break;
                    case 1:
                        sinif = "8";
                        sube = "B";
                        try {
                            refreshOgrcModel(sinif, sube);
                            for (int i = 0; i < getOgrcList(sinif, sube).size(); i++) {
                            ogrcData[0] = getOgrcList(sinif, sube).get(i).getadSoyad();
                            ogrcData[1] = getOgrcList(sinif, sube).get(i).getId();
                            ogrcData[2] = getOgrcList(sinif, sube).get(i).getOzurlu();
                            ogrcData[3] = getOgrcList(sinif, sube).get(i).getOzursuz();
                            ogrcModel.addRow(ogrcData);} 
                        } 
                        catch (SQLException ex) {}
                        break;
                }
                break;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nm = numField.getText();
        String ozr = ozurlu.getText();
        String ozrsz = ozursuz.getText();
        int num = Integer.parseInt(nm);
        int ozur = Integer.parseInt(ozr);
        int ozursz = Integer.parseInt(ozrsz);
        admin admin = new admin();
        try { 
            admin.updateDevam(ozur, ozursz, num);
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new adminDay().setVisible(true);
                } catch (SQLException ex) {
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboSinif;
    private javax.swing.JComboBox<String> comboSube;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numField;
    private javax.swing.JTextField ozurlu;
    private javax.swing.JTextField ozursuz;
    // End of variables declaration//GEN-END:variables
}
