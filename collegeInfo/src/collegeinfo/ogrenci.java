package collegeinfo;

import Model.admin;
import Model.ogrenciUser;
import Model.ogretmenSube;
import collegeinfo.*;
import collegeinfo.Helper.dbConnection;
import static collegeinfo.collegeIndex.*;
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
import javax.swing.table.DefaultTableModel;


public class ogrenci extends javax.swing.JFrame {

    private DefaultTableModel ogrcModel = null;
    private Object[] ogrcData = null;
    public String name = collegeIndex.ogrcName;
    
    private dbConnection conn = new dbConnection();
    
    Connection con = conn.connectDb();
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement prepareStatement = null;
    
    private int selectedId = collegeIndex.ogrenciId;
    
    public ArrayList<ogrenciUser> getOgrcList(int id)throws SQLException{
        ArrayList<ogrenciUser> list = new ArrayList<>();
        ogrenciUser obj;
        String sql = "SELECT * FROM ogrencitablosu WHERE id = ?";
        try(PreparedStatement statement = con.prepareStatement(sql)){
            statement.setInt(1, id);
            
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

    public ogrenci() throws SQLException {
        ogrcModel = new DefaultTableModel();
                            Object[] colOgrcName = new Object[10];
                            colOgrcName[0] = "Türkçe 1";
                            colOgrcName[1] = "Türkçe 2";
                            colOgrcName[2] = "Matematik 1";
                            colOgrcName[3] = "Matematik 2";
                            colOgrcName[4] = "Fen Bilgisi 1";
                            colOgrcName[5] = "Fen Bilgisi 2";
                            colOgrcName[6] = "Sosyal Bilgiler 1";
                            colOgrcName[7] = "Sosyal Bilgiler 2";
                            colOgrcName[8] = "İngilizce 1";
                            colOgrcName[9] = "İngilizce 2";
                            ogrcModel.setColumnIdentifiers(colOgrcName);
                            ogrcData = new Object[10];
                            
        for (int i = 0; i < getOgrcList(selectedId).size(); i++) {
            ogrcData[0] = getOgrcList(selectedId).get(i).getTurk1();
            ogrcData[1] = getOgrcList(selectedId).get(i).getTurk2();
            ogrcData[2] = getOgrcList(selectedId).get(i).getMat1();
            ogrcData[3] = getOgrcList(selectedId).get(i).getMat2();
            ogrcData[4] = getOgrcList(selectedId).get(i).getFen1();
            ogrcData[5] = getOgrcList(selectedId).get(i).getFen2();
            ogrcData[6] = getOgrcList(selectedId).get(i).getSos1();
            ogrcData[7] = getOgrcList(selectedId).get(i).getSos2();
            ogrcData[8] = getOgrcList(selectedId).get(i).getIng1();
            ogrcData[9] = getOgrcList(selectedId).get(i).getIng2();
            ogrcModel.addRow(ogrcData);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(ogrcModel);
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelOzrl = new javax.swing.JLabel();
        labelOzrsz = new javax.swing.JLabel();
        labelTurkce = new javax.swing.JLabel();
        labelMat = new javax.swing.JLabel();
        labelFen = new javax.swing.JLabel();
        labelSos = new javax.swing.JLabel();
        labelIng = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        belge = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("ÇIKIŞ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Not Bilgisi", jPanel1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DERSLER");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Türkçe");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Matematik");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Sosyal Bilgiler");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Fen Bilgisi");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("İngilizce");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("NOT ORTALAMASI");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("BELGE DURUMU");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Özürlü Devamsızlık");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Özürsüz Devamsızlık");

        labelOzrl.setBackground(new java.awt.Color(102, 102, 255));
        labelOzrl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelOzrl.setForeground(new java.awt.Color(255, 0, 102));
        labelOzrl.setText("0");

        labelOzrsz.setBackground(new java.awt.Color(102, 102, 255));
        labelOzrsz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelOzrsz.setForeground(new java.awt.Color(255, 0, 102));
        labelOzrsz.setText("0");

        labelTurkce.setBackground(new java.awt.Color(102, 102, 255));
        labelTurkce.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTurkce.setForeground(new java.awt.Color(255, 0, 102));
        labelTurkce.setText("0");

        labelMat.setBackground(new java.awt.Color(102, 102, 255));
        labelMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMat.setForeground(new java.awt.Color(255, 0, 102));
        labelMat.setText("0");

        labelFen.setBackground(new java.awt.Color(102, 102, 255));
        labelFen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelFen.setForeground(new java.awt.Color(255, 0, 102));
        labelFen.setText("0");

        labelSos.setBackground(new java.awt.Color(102, 102, 255));
        labelSos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSos.setForeground(new java.awt.Color(255, 0, 102));
        labelSos.setText("0");

        labelIng.setBackground(new java.awt.Color(102, 102, 255));
        labelIng.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelIng.setForeground(new java.awt.Color(255, 0, 102));
        labelIng.setText("0");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("DEVAMSIZLIK DURUMU");

        belge.setBackground(new java.awt.Color(102, 102, 255));
        belge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        belge.setForeground(new java.awt.Color(255, 0, 102));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("HESAPLA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(labelFen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIng, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTurkce, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel10))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelOzrsz, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelOzrl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel11)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(belge, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(labelOzrl)
                    .addComponent(labelTurkce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(labelOzrsz)
                    .addComponent(labelMat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelFen))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelSos)
                    .addComponent(jLabel9))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelIng)
                    .addComponent(belge, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Yıl Sonu Senaryosu", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            float ortTurk = getOgrcList(selectedId).get(0).getTurk1() + getOgrcList(selectedId).get(0).getTurk2();
            float ortMat = getOgrcList(selectedId).get(0).getMat1() + getOgrcList(selectedId).get(0).getMat2();
            float ortFen = getOgrcList(selectedId).get(0).getFen1() + getOgrcList(selectedId).get(0).getFen2();
            float ortSos = getOgrcList(selectedId).get(0).getSos1() + getOgrcList(selectedId).get(0).getSos2();
            float ortIng = getOgrcList(selectedId).get(0).getIng1() + getOgrcList(selectedId).get(0).getIng2();
            String ozrl = Integer.toString( getOgrcList(selectedId).get(0).getOzurlu());
            String ozrsz = Integer.toString( getOgrcList(selectedId).get(0).getOzursuz());
            
            float genelOrt = ((ortTurk/2) + (ortMat/2) + (ortFen/2) + (ortSos/2) + (ortIng/2))/5;
            String ortTurkce = Float.toString(ortTurk/2);
            String ortMatematik = Float.toString(ortMat/2);
            String ortFenB = Float.toString(ortFen/2);
            String ortSosyal = Float.toString(ortSos/2);
            String ortIngl = Float.toString(ortIng/2);
            
            labelTurkce.setText(ortTurkce);
            labelMat.setText(ortMatematik);
            labelFen.setText(ortFenB);
            labelSos.setText(ortSosyal);
            labelIng.setText(ortIngl);
            
            labelOzrl.setText(ozrl);
            labelOzrsz.setText(ozrsz); 

            if (ortTurk/2 < 45 || ortMat/2 < 45 ||ortFen/2 < 45 ||ortSos/2 < 45 || ortIng/2 < 45 || getOgrcList(selectedId).get(0).getOzursuz() > 20) {
                belge.setText("Ortalamanız = " + genelOrt +"Sınıfta Kaldınız");
                System.out.println("sınıfta kaldınız");
            }
            else if(genelOrt<70){
                belge.setText("Ortalamanız = " + genelOrt +"Belge Kazanamadınız");
                System.out.println("belge kazanamadınız");
            }
            else if(genelOrt<85 && getOgrcList(selectedId).get(0).getOzursuz() <= 5){
                belge.setText("Ortalamanız = " + genelOrt +"Teşekkür Belgesi Almaya Hak Kazandınız");
                System.out.println("teşekkür");
            }
            else if(genelOrt<100 && getOgrcList(selectedId).get(0).getOzursuz() <= 5){
                belge.setText("Ortalamanız = " + genelOrt +"Takdir Belgesi Almaya Hak Kazandınız");
                System.out.println("takdir");
            }
                
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ogrenci().setVisible(true);
                } catch (SQLException ex) {
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel belge;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelFen;
    private javax.swing.JLabel labelIng;
    private javax.swing.JLabel labelMat;
    private javax.swing.JLabel labelOzrl;
    private javax.swing.JLabel labelOzrsz;
    private javax.swing.JLabel labelSos;
    private javax.swing.JLabel labelTurkce;
    // End of variables declaration//GEN-END:variables
}
