package collegeinfo.Admin;
import javax.swing.*;
import java.sql.*;
import Model.*;
import collegeinfo.Helper.dbConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class adminOgrt extends javax.swing.JFrame {
    
    private DefaultTableModel ogrtModel = null;
    private Object[] ogrtData = null;
    private dbConnection conn = new dbConnection();
    
    PreparedStatement prepareStatement = null;

    public adminOgrt() throws SQLException {
        admin admin = new admin();
        ogrtModel = new DefaultTableModel();
        Object[] colOgrtName = new Object[5];
        colOgrtName[0] = "id";
        colOgrtName[1] = "Ad Soyad";
        colOgrtName[2] = "Branş";
        colOgrtName[3] = "Kullanıcı Adı";
        colOgrtName[4] = "Şifre";
        ogrtModel.setColumnIdentifiers(colOgrtName);
        ogrtData = new Object[5];
        
        for (int i = 0; i < admin.getOgrtList().size(); i++) {
            ogrtData[0] = admin.getOgrtList().get(i).getId();
            ogrtData[1] = admin.getOgrtList().get(i).getadSoyad();
            ogrtData[2] = admin.getOgrtList().get(i).getBrans();
            ogrtData[3] = admin.getOgrtList().get(i).getkullaniciAdi();
            ogrtData[4] = admin.getOgrtList().get(i).getSifre();
            ogrtModel.addRow(ogrtData);
        }
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        addOgrt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adSoyad = new javax.swing.JTextField();
        kullaniciAdi = new javax.swing.JTextField();
        sifre = new javax.swing.JTextField();
        ogrtEkle = new javax.swing.JButton();
        brans = new javax.swing.JTextField();
        listOgrt = new javax.swing.JPanel();
        scrollOgrtList = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable(ogrtModel);
        jButton1 = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        deleteID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Öğretmen İşlemleri");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Adı Soyadı *");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Branş *");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Sifre *");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Kullanıcı Adı *");

        ogrtEkle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ogrtEkle.setText("EKLE");
        ogrtEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrtEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addOgrtLayout = new javax.swing.GroupLayout(addOgrt);
        addOgrt.setLayout(addOgrtLayout);
        addOgrtLayout.setHorizontalGroup(
            addOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addOgrtLayout.createSequentialGroup()
                .addGroup(addOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addOgrtLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addOgrtLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(brans, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addOgrtLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addOgrtLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addOgrtLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addOgrtLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(ogrtEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        addOgrtLayout.setVerticalGroup(
            addOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addOgrtLayout.createSequentialGroup()
                .addGroup(addOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addOgrtLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addOgrtLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(addOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(brans, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(ogrtEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Öğretmen Ekle", addOgrt);

        scrollOgrtList.setViewportView(jTable2);

        javax.swing.GroupLayout listOgrtLayout = new javax.swing.GroupLayout(listOgrt);
        listOgrt.setLayout(listOgrtLayout);
        listOgrtLayout.setHorizontalGroup(
            listOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollOgrtList, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        listOgrtLayout.setVerticalGroup(
            listOgrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollOgrtList, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Öğretmen Listesi", listOgrt);

        jButton1.setText("ÖNCEKİ SAYFA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sil.setText("SİL");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Silincek ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteID)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ogrtEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrtEkleActionPerformed
        // BRANŞ KISMINI COMBOBOX OLARAK TEKRAR DENE COMBOBOX.İSSELECTED I DEĞİŞKENDE TUTUP SQL SORGUSUNA YAZMAYI DENE
        // KULLANICI ADI KISMI UNIQUE OLMALI YOKSA SİLERKEN SIKINTI ÇIKAR
        int key = 0;
        
        if (adSoyad.getText().length() == 0 || brans.getText().length() == 0 || kullaniciAdi.getText().length() == 0 || sifre.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null,"Lütfen '*' bulunan alanları doldurunuz ","Hata",JOptionPane.WARNING_MESSAGE);
        }else{
        ogretmenUser ogretmen = new ogretmenUser();
        ogretmen.setadSoyad(adSoyad.getText());
        ogretmen.setBrans(brans.getText());
        ogretmen.setkullaniciAdi(kullaniciAdi.getText());
        ogretmen.setSifre(sifre.getText());
       
        try {
            Connection con = conn.connectDb();
            String sql = "INSERT INTO ogretmentablosu" + "(adsoyad, brans, kullaniciAdi, sifre, tur) VALUES" + "(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ogretmen.getadSoyad());
            stmt.setString(2, ogretmen.getBrans());
            stmt.setString(3, ogretmen.getkullaniciAdi());
            stmt.setString(4, ogretmen.getSifre());
            stmt.setString(5, "ogrt");
            stmt.executeUpdate();
            key = 1;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (key == 1) {
                JOptionPane.showMessageDialog(null,"Öğretmen Eklendi");
                adSoyad.setText(null);
                brans.setText(null);
                kullaniciAdi.setText(null);
                sifre.setText(null) ;
            }
        
        }
        
        
    }//GEN-LAST:event_ogrtEkleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        try {
            String deleteId = deleteID.getText();
            Connection con = conn.connectDb();
            String sql = "DELETE FROM ogretmentablosu WHERE id = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, deleteId);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Silme işlemi başarılı");
        } catch (SQLException ex) {
        }
        
    }//GEN-LAST:event_silActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new adminOgrt().setVisible(true);
                } catch (SQLException ex) {
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adSoyad;
    private javax.swing.JPanel addOgrt;
    private javax.swing.JTextField brans;
    private javax.swing.JTextField deleteID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField kullaniciAdi;
    private javax.swing.JPanel listOgrt;
    private javax.swing.JButton ogrtEkle;
    private javax.swing.JScrollPane scrollOgrtList;
    private javax.swing.JTextField sifre;
    private javax.swing.JButton sil;
    // End of variables declaration//GEN-END:variables
}
