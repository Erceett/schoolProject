package collegeinfo;
import collegeinfo.Admin.*;
import Model.*;
import java.sql.*;
import collegeinfo.Helper.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class collegeIndex extends javax.swing.JFrame {

    private dbConnection conn = new dbConnection();
    
    public static int adminId = 0;
    
    public collegeIndex() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome = new javax.swing.JLabel();
        adminPane = new javax.swing.JTabbedPane();
        adminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin_ad = new javax.swing.JTextField();
        admin_password = new javax.swing.JPasswordField();
        admin_login = new javax.swing.JButton();
        ogrcPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ogrcAd = new javax.swing.JTextField();
        ogrcPassword = new javax.swing.JPasswordField();
        ogrcLogin = new javax.swing.JButton();
        ogrtPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ogrtAd = new javax.swing.JTextField();
        ogrtPassword = new javax.swing.JPasswordField();
        ogrtLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        welcome.setText("AAA LİSESİ BİLGİ SİSTEMİNE HOŞGELDİNİZ");
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Şifre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Kullanıcı Adı");

        admin_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_adActionPerformed(evt);
            }
        });

        admin_login.setText("GİRİŞ ");
        admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admin_login, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(admin_ad)
                        .addComponent(admin_password, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(admin_ad)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admin_password))
                .addGap(34, 34, 34)
                .addComponent(admin_login, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        adminPane.addTab("Admin", adminPanel);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Şifre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Öğrenci No");

        ogrcAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrcAdActionPerformed(evt);
            }
        });

        ogrcLogin.setText("GİRİŞ ");
        ogrcLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrcLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ogrcPanelLayout = new javax.swing.GroupLayout(ogrcPanel);
        ogrcPanel.setLayout(ogrcPanelLayout);
        ogrcPanelLayout.setHorizontalGroup(
            ogrcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ogrcPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ogrcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(ogrcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ogrcLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ogrcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ogrcAd)
                        .addComponent(ogrcPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        ogrcPanelLayout.setVerticalGroup(
            ogrcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ogrcPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ogrcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ogrcAd)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ogrcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ogrcPassword))
                .addGap(34, 34, 34)
                .addComponent(ogrcLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        adminPane.addTab("Öğrenci Giriş", ogrcPanel);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Şifre");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Kullanıcı Adı");

        ogrtAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrtAdActionPerformed(evt);
            }
        });

        ogrtLogin.setText("GİRİŞ ");
        ogrtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrtLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ogrtPanelLayout = new javax.swing.GroupLayout(ogrtPanel);
        ogrtPanel.setLayout(ogrtPanelLayout);
        ogrtPanelLayout.setHorizontalGroup(
            ogrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ogrtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ogrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(ogrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ogrtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ogrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ogrtAd)
                        .addComponent(ogrtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        ogrtPanelLayout.setVerticalGroup(
            ogrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ogrtPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ogrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ogrtAd)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ogrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ogrtPassword))
                .addGap(34, 34, 34)
                .addComponent(ogrtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        adminPane.addTab("Öğretmen Girişi", ogrtPanel);

        getContentPane().add(adminPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 111, 810, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_adActionPerformed

    private void admin_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_loginActionPerformed
        //kullanıcı girişi yapıldı.
        if (admin_ad.getText().length() == 0 || admin_password.getText().length() == 0) {
            JOptionPane.showMessageDialog(null,"Kullanıcı adı veya şifre boş olamaz","Hata",JOptionPane.WARNING_MESSAGE); 
        }
        else{
            try {
                Connection con = conn.connectDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM ogretmentablosu");
                while(rs.next()){
                    if (admin_ad.getText().equals(rs.getString("kullaniciAdi")) && admin_password.getText().equals(rs.getString("sifre")) && "admin".equals(rs.getString("tur"))) {
                        adminPanel frame = new adminPanel();
                        frame.setVisible(true);
                        frame.setSize(825,435);
                        admin_ad.setText(null);
                        admin_password.setText(null);
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Kullanıcı adı veya şifre yanlış","Hata",JOptionPane.WARNING_MESSAGE);
                        break;
                    } 
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_admin_loginActionPerformed

    private void ogrcAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrcAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ogrcAdActionPerformed

    private void ogrcLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrcLoginActionPerformed
        //kullanıcı girişi yapıldı.
        String ad = ogrcAd.getText();
        int id = Integer.parseInt(ad);
        int isLogIn = 0; // girişin yapılıp yapılmadığınının kontrolü
        if (ogrcAd.getText().length() == 0 || ogrcPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null,"Kullanıcı adı veya şifre boş olamaz","Hata",JOptionPane.WARNING_MESSAGE); 
        }
        else{
            try {
                Connection con = conn.connectDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM ogrencitablosu");
                while(rs.next()){
                    if (id == rs.getInt("id") && ogrcPassword.getText().equals(rs.getString("sifre"))) {
                        isLogIn = 1;
                        ogrenci frame = new ogrenci();
                        frame.setVisible(true);
                        frame.setSize(825,435);
                        break;
                    }
                }
                if (isLogIn == 0) {
                    JOptionPane.showMessageDialog(null,"Kullanıcı adı veya şifre yanlış","Hata",JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_ogrcLoginActionPerformed

    private void ogrtAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrtAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ogrtAdActionPerformed

    private void ogrtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrtLoginActionPerformed
        //kullanıcı girişi yapıldı.
        int isLogIn = 0; // girişin yapılıp yapılmadığınının kontrolü
        if (ogrtAd.getText().length() == 0 || ogrtPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null,"Kullanıcı adı veya şifre boş olamaz","Hata",JOptionPane.WARNING_MESSAGE); 
        }
        else{
            try {
                Connection con = conn.connectDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM ogretmentablosu");
                while(rs.next()){
                    if (ogrtAd.getText().equals(rs.getString("kullaniciAdi")) && ogrtPassword.getText().equals(rs.getString("sifre")) && "ogrt".equals(rs.getString("tur"))) {
                        isLogIn = 1;
                        ogretmen frame = new ogretmen();
                        frame.setVisible(true);
                        frame.setSize(825,435);  
                        break;   
                    }
                }
                if (isLogIn == 0) {
                    JOptionPane.showMessageDialog(null,"Kullanıcı adı veya şifre yanlış","Hata",JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_ogrtLoginActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new collegeIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane adminPane;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JTextField admin_ad;
    private javax.swing.JButton admin_login;
    private javax.swing.JPasswordField admin_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField ogrcAd;
    private javax.swing.JButton ogrcLogin;
    private javax.swing.JPanel ogrcPanel;
    private javax.swing.JPasswordField ogrcPassword;
    private javax.swing.JTextField ogrtAd;
    private javax.swing.JButton ogrtLogin;
    private javax.swing.JPanel ogrtPanel;
    private javax.swing.JPasswordField ogrtPassword;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
