package collegeinfo;

import Model.admin;
import Model.ogrenciUser;
import Model.ogretmenSube;
import collegeinfo.*;
import collegeinfo.Helper.dbConnection;
import static collegeinfo.collegeIndex.ogretmenId;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class ogretmen extends javax.swing.JFrame {
    
    private dbConnection conn = new dbConnection();
    
    Connection con = conn.connectDb();
    Statement st = null;
    ResultSet rs = null;
    
    private DefaultTableModel ogrcModel = null;
    private Object[] ogrcData = null;
    
    PreparedStatement prepareStatement = null;
    
    int ogretmenId = collegeIndex.ogretmenId;
    String sinif = null;
    String sube = null;
    String selectedSnf = null;
    String selectedSb = null;
    
    String brans = collegeIndex.brans;
    
    

    public ogretmen() throws SQLException {
        ogrcModel = new DefaultTableModel();
                            Object[] colOgrcName = new Object[4];
                            colOgrcName[0] = "Numara";
                            colOgrcName[1] = "Ad Soyad";
                            colOgrcName[2] = "Sınav 1";
                            colOgrcName[3] = "Sınav 2";
                            ogrcModel.setColumnIdentifiers(colOgrcName);
                            ogrcData = new Object[4];
        initComponents();
        if (ogrtSnfSb().get(0).getSinif().equals(ogrtSnfSb().get(1).getSinif())) {
            comboSinif.addItem(ogrtSnfSb().get(0).getSinif());
        }
        else{
            comboSinif.addItem(ogrtSnfSb().get(0).getSinif());
            comboSinif.addItem(ogrtSnfSb().get(1).getSinif());
        }
        if (ogrtSnfSb().get(0).getSube().equals(ogrtSnfSb().get(1).getSube())) {
            comboSube.addItem(ogrtSnfSb().get(0).getSube());
        }else {
            comboSube.addItem(ogrtSnfSb().get(0).getSube());
            comboSube.addItem(ogrtSnfSb().get(1).getSube());
        }

        jTable1.getModel().addTableModelListener(new TableModelListener(){
            @Override
            switch(brans){
                case "matematik":
                    public void tableChanged(TableModelEvent e){
                if (e.getType() == TableModelEvent.UPDATE) {
                    int selectedID = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                    String selectedAd = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
                    int selectedNot1 = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                    int selectedNot2 = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                    
                    ogrenciUser user = new ogrenciUser();
                    try {
                        user.updateMat(selectedID, selectedNot1,selectedNot2);
                    } catch (SQLException ex) {  
                    }
                }
            }
                    break;
                case "turkce":
                public void tableChanged(TableModelEvent e){
                if (e.getType() == TableModelEvent.UPDATE) {
                    int selectedID = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                    String selectedAd = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
                    int selectedNot1 = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                    int selectedNot2 = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                    
                    ogrenciUser user = new ogrenciUser();
                    try {
                        user.updateTurkce(selectedID, selectedNot1,selectedNot2);
                    } catch (SQLException ex) {  
                    }
                }
            }
                    break;
                case "fen":
                    break;
                case "sosyal":
                    break;
                case "ingilizce":
                    break;
            }
        });
    }
    
    public ArrayList<ogretmenSube> ogrtSnfSb()throws SQLException{
        ArrayList<ogretmenSube> list = new ArrayList<>();
        ogretmenSube obj;
        String sql = "SELECT * FROM subeler WHERE ogretmenID = ?";
        try(PreparedStatement statement = con.prepareStatement(sql)){
            statement.setInt(1, ogretmenId);
            try(ResultSet rs = statement.executeQuery()){
                while(rs.next()){
                    obj = new ogretmenSube(rs.getInt("id"), rs.getInt("ogretmenID"),rs.getString("adSoyad"), rs.getString("sinif"),rs.getString("sube"));
                    list.add(obj); 
                }
            }
        }
        return list;
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
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboSinif = new javax.swing.JComboBox<>();
        comboSube = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(ogrcModel);
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("SINIF");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ŞUBE");

        comboSinif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        comboSube.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("LİSTELE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("ÇIKIŞ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSinif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            updateOgrcModel();
        } catch (SQLException ex) {
        }
        
        try {
            System.out.println(ogrtSnfSb().get(0).getSinif());
            System.out.println(ogrtSnfSb().get(0).getSube());
            System.out.println(ogrtSnfSb().get(1).getSinif());
            System.out.println(ogrtSnfSb().get(1).getSube());
        } catch (SQLException ex) {
        }

        selectedSnf = comboSinif.getSelectedItem().toString();
        selectedSb = comboSube.getSelectedItem().toString();

        System.out.println(selectedSnf);
        System.out.println(selectedSb);
        System.out.println(brans);
        
        switch(brans){
            case "matematik":
                for (int i = 0; i < 2; i++) 
                {
                    try {
                        if (selectedSnf.equals(ogrtSnfSb().get(i).getSinif()) && selectedSb.equals(ogrtSnfSb().get(i).getSube())) {
                            for (int k = 0; k < getOgrcList(selectedSnf, selectedSb).size(); k++) {
                                ogrcData[0] = getOgrcList(selectedSnf, selectedSb).get(k).getId();
                                ogrcData[1] = getOgrcList(selectedSnf, selectedSb).get(k).getadSoyad();
                                ogrcData[2] = getOgrcList(selectedSnf, selectedSb).get(k).getMat1();
                                ogrcData[3] = getOgrcList(selectedSnf, selectedSb).get(k).getMat2();
                                ogrcModel.addRow(ogrcData);
                            }
                            break;
                        }
                        else {
                            
                           
                        }
                    } catch (SQLException ex) {}
                }
                break;
            case "turkce":
                for (int i = 0; i < 2; i++) 
                {
                    try {
                        if (selectedSnf.equals(ogrtSnfSb().get(i).getSinif()) && selectedSb.equals(ogrtSnfSb().get(i).getSube())) { // şubeyi eklediğinde tamamdır
                            for (int k = 0; k < getOgrcList(selectedSnf, selectedSb).size(); k++) {
                                ogrcData[0] = getOgrcList(selectedSnf, selectedSb).get(k).getId();
                                ogrcData[1] = getOgrcList(selectedSnf, selectedSb).get(k).getadSoyad();
                                ogrcData[2] = getOgrcList(selectedSnf, selectedSb).get(k).getTur1();
                                ogrcData[3] = getOgrcList(selectedSnf, selectedSb).get(k).getTur2();
                                ogrcModel.addRow(ogrcData);
                            }
                            break;
                        }
                        else {
                            
                        }
                    } catch (SQLException ex) {}
                }
                break;
            case "fen":
                for (int i = 0; i < 2; i++) 
                {
                    try {
                        if (selectedSnf.equals(ogrtSnfSb().get(i).getSinif()) && selectedSb.equals(ogrtSnfSb().get(i).getSube())) { // şubeyi eklediğinde tamamdır
                            for (int k = 0; k < getOgrcList(selectedSnf, selectedSb).size(); k++) {
                                ogrcData[0] = getOgrcList(selectedSnf, selectedSb).get(k).getId();
                                ogrcData[1] = getOgrcList(selectedSnf, selectedSb).get(k).getadSoyad();
                                ogrcData[2] = getOgrcList(selectedSnf, selectedSb).get(k).getFen1();
                                ogrcData[3] = getOgrcList(selectedSnf, selectedSb).get(k).getFen2();
                                ogrcModel.addRow(ogrcData);
                            }
                            break;
                        }
                        else {
                            
                        }
                    } catch (SQLException ex) {}
                }
                break;
            case "sosyal":
                for (int i = 0; i < 2; i++) 
                {
                    try {
                        if (selectedSnf.equals(ogrtSnfSb().get(i).getSinif()) && selectedSb.equals(ogrtSnfSb().get(i).getSube())) { // şubeyi eklediğinde tamamdır
                            for (int k = 0; k < getOgrcList(selectedSnf, selectedSb).size(); k++) {
                                ogrcData[0] = getOgrcList(selectedSnf, selectedSb).get(k).getId();
                                ogrcData[1] = getOgrcList(selectedSnf, selectedSb).get(k).getadSoyad();
                                ogrcData[2] = getOgrcList(selectedSnf, selectedSb).get(k).getSos1();
                                ogrcData[3] = getOgrcList(selectedSnf, selectedSb).get(k).getSos2();
                                ogrcModel.addRow(ogrcData);
                            }
                            break;
                        }
                        else {
                            
                        }
                    } catch (SQLException ex) {}
                }
                break;
            case "ingilizce":
                for (int i = 0; i < 2; i++) 
                {
                    try {
                        if (selectedSnf.equals(ogrtSnfSb().get(i).getSinif()) && selectedSb.equals(ogrtSnfSb().get(i).getSube())) { // şubeyi eklediğinde tamamdır
                            for (int k = 0; k < getOgrcList(selectedSnf, selectedSb).size(); k++) {
                                ogrcData[0] = getOgrcList(selectedSnf, selectedSb).get(k).getId();
                                ogrcData[1] = getOgrcList(selectedSnf, selectedSb).get(k).getadSoyad();
                                ogrcData[2] = getOgrcList(selectedSnf, selectedSb).get(k).getIng1();
                                ogrcData[3] = getOgrcList(selectedSnf, selectedSb).get(k).getIng2();
                                ogrcModel.addRow(ogrcData);
                            }
                            break;
                        }
                        else {
                            
                        }
                    } catch (SQLException ex) {}
                }
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
