package collegeinfo.Admin;

import javax.swing.*;
import java.sql.*;
import Model.*;
import collegeinfo.Helper.dbConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class adminSiniflandirma extends javax.swing.JFrame {

    private DefaultTableModel ogrtModel = null;
    private Object[] ogrtData = null;
    
    private dbConnection conn = new dbConnection();
    
    PreparedStatement prepareStatement = null;
    
    int key = 0;
    
    public adminSiniflandirma() throws SQLException {
        admin admin = new admin();
        ogrtModel = new DefaultTableModel();
        Object[] colOgrtName = new Object[3];
        colOgrtName[0] = "id";
        colOgrtName[1] = "Ad Soyad";
        colOgrtName[2] = "Branş";
        ogrtModel.setColumnIdentifiers(colOgrtName);
        ogrtData = new Object[3];
        
        for (int i = 0; i < admin.getOgrtList().size(); i++) {
            ogrtData[0] = admin.getOgrtList().get(i).getId();
            ogrtData[1] = admin.getOgrtList().get(i).getadSoyad();
            ogrtData[2] = admin.getOgrtList().get(i).getBrans();
            ogrtModel.addRow(ogrtData);
        }

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        num = new javax.swing.JTextField();
        comboSinif = new javax.swing.JComboBox<>();
        comboSube = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(ogrtModel);
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("geri dön");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Öğretmen ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Sınıf");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Şube");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("YETKİLENDİR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        num.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        comboSinif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboSinif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8" }));

        comboSube.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboSube.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));

        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("ŞUBELENDİRMEYİ GETİR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("(Her öğretmene 2 şube verilecek)");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("hata oluşmaması için şubelendirme ");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel6.setText("yapmadan önce listeye bakınız");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboSinif, 0, 91, Short.MAX_VALUE)
                            .addComponent(num)
                            .addComponent(comboSube, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboSube, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Şube Yetkilendirme", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int snf = comboSinif.getSelectedIndex();
        int sb = comboSube.getSelectedIndex();
        String str = num.getText();
        int ogrtID = Integer.parseInt(str);
        int prevID = 0;
        String name = null;
        try{
            Connection con = conn.connectDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM ogretmentablosu");
                while(rs.next()){
                    if (ogrtID == rs.getInt("id")) {
                        name = rs.getString("adSoyad");
                    }
                }
        }catch(SQLException ex){}
        
        String sinif = null;
        String sube = null;
        int count = 0;
        
        Connection con1 = conn.connectDb();
        String sql = "SELECT COUNT(*) FROM subeler WHERE id = ?";
        PreparedStatement statement;
        try {
            statement = con1.prepareStatement(sql);statement.setInt(1, ogrtID);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                count = count + 1;
            }
            System.out.println(count);
            if (count>=2) 
            {
                JOptionPane.showMessageDialog(null,"hata");
            }
            else
            {
                switch(snf){
            case 0:
                sinif = "5";
                switch(sb){
                    case 0:
                        sube = "A";
                        try {
                            Connection con = conn.connectDb();
                            String sql1 = "INSERT INTO subeler" + "(ogretmenID, adSoyad, sinif, sube) VALUES" + "(?,?,?,?)";
                            PreparedStatement stmt = con.prepareStatement(sql1);
                            stmt.setInt(1, ogrtID);
                            stmt.setString(2, name);
                            stmt.setString(3, sinif); 
                            stmt.setString(4, sube);
                            stmt.executeUpdate(); 
                            prevID = ogrtID;
                            key++;
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                            break;
                    case 1:
                        sube = "B";
                        try {
                            Connection con = conn.connectDb();
                            String sql1 = "INSERT INTO subeler" + "(ogretmenID, adSoyad, sinif, sube) VALUES" + "(?,?,?,?)";
                            PreparedStatement stmt = con.prepareStatement(sql1);
                            stmt.setInt(1, ogrtID);
                            stmt.setString(2, name);
                            stmt.setString(3, sinif); 
                            stmt.setString(4, sube);       
                            stmt.executeUpdate(); 
                            prevID = ogrtID;
                            key++;
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        break;
                }
                break;
            case 1:
                sinif = "6";
                switch(sb){
                    case 0:
                        sube = "A";
                        try {
                            Connection con = conn.connectDb();
                            String sql1 = "INSERT INTO subeler" + "(ogretmenID, adSoyad, sinif, sube) VALUES" + "(?,?,?,?)";
                            PreparedStatement stmt = con.prepareStatement(sql1);
                            stmt.setInt(1, ogrtID);
                            stmt.setString(2, name);
                            stmt.setString(3, sinif); 
                            stmt.setString(4, sube);       
                            stmt.executeUpdate(); 
                            prevID = ogrtID;
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        break;
                    case 1:
                        sube = "B";
                        try {
                            Connection con = conn.connectDb();
                            String sql1 = "INSERT INTO subeler" + "(ogretmenID, adSoyad, sinif, sube) VALUES" + "(?,?,?,?)";
                            PreparedStatement stmt = con.prepareStatement(sql1);
                            stmt.setInt(1, ogrtID);
                            stmt.setString(2, name);
                            stmt.setString(3, sinif); 
                            stmt.setString(4, sube);       
                            stmt.executeUpdate(); 
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        break;
                }
                break;
            case 2:
                sinif = "7";
                switch(sb){
                    case 0:
                        sube = "A";
                        try {
                            Connection con = conn.connectDb();
                            String sql1 = "INSERT INTO subeler" + "(ogretmenID, adSoyad, sinif, sube) VALUES" + "(?,?,?,?)";
                            PreparedStatement stmt = con.prepareStatement(sql1);
                            stmt.setInt(1, ogrtID);
                            stmt.setString(2, name);
                            stmt.setString(3, sinif); 
                            stmt.setString(4, sube);       
                            stmt.executeUpdate(); 
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        break;
                    case 1:
                        sube = "B";
                        try {
                            Connection con = conn.connectDb();
                            String sql1 = "INSERT INTO subeler" + "(ogretmenID, adSoyad, sinif, sube) VALUES" + "(?,?,?,?)";
                            PreparedStatement stmt = con.prepareStatement(sql1);
                            stmt.setInt(1, ogrtID);
                            stmt.setString(2, name);
                            stmt.setString(3, sinif); 
                            stmt.setString(4, sube);       
                            stmt.executeUpdate(); 
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        break;
                }
                break;
            case 3:
                sinif = "8";
                switch(sb){
                    case 0:
                        sube = "A";
                        try {
                            Connection con = conn.connectDb();
                            String sql1 = "INSERT INTO subeler" + "(ogretmenID, adSoyad, sinif, sube) VALUES" + "(?,?,?,?)";
                            PreparedStatement stmt = con.prepareStatement(sql1);
                            stmt.setInt(1, ogrtID);
                            stmt.setString(2, name);
                            stmt.setString(3, sinif); 
                            stmt.setString(4, sube);       
                            stmt.executeUpdate(); 
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        break;
                    case 1:
                        sube = "B";
                        try {
                            Connection con = conn.connectDb();
                            String sql1 = "INSERT INTO subeler" + "(ogretmenID, adSoyad, sinif, sube) VALUES" + "(?,?,?,?)";
                            PreparedStatement stmt = con.prepareStatement(sql1);
                            stmt.setInt(1, ogrtID);
                            stmt.setString(2, name);
                            stmt.setString(3, sinif); 
                            stmt.setString(4, sube);       
                            stmt.executeUpdate(); 
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        break;
                }
                break;
        }
            }
        } catch (SQLException ex) {}

            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminSubeler frame;
        try {
            frame = new adminSubeler();
            frame.setVisible(true);
            frame.setSize(825,435);
        } catch (SQLException ex) {
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new adminSiniflandirma().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField num;
    // End of variables declaration//GEN-END:variables
}
