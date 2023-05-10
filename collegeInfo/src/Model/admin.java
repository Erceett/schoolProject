package Model;

import java.sql.*;
import java.util.*;
import collegeinfo.Helper.*;

public class admin  extends ogretmenUser{
    
    Connection con = conn.connectDb();
    Statement st = null;
    ResultSet rs = null;
    
    public admin(int id, String adSoyad, String brans, String kullaniciAdi, String sifre){
        super(id, adSoyad, brans, kullaniciAdi, sifre);
    }
    
    public admin(){};
    
    public ArrayList<ogretmenUser> getOgrtList() throws SQLException{
        ArrayList <ogretmenUser> list = new ArrayList<>();
        ogretmenUser obj;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM ogretmentablosu WHERE tur = 'ogrt'");
            while(rs.next()){
                obj = new ogretmenUser(rs.getInt("id"), rs.getString("adSoyad"), rs.getString("brans"), rs.getString("kullaniciAdi"), rs.getString("sifre"));
                list.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<ogrenciUser> getOgrcList()throws SQLException{
        ArrayList<ogrenciUser> list = new ArrayList<>();
        ogrenciUser obj;
        try{
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM ogrencitablosu");
        while(rs.next()){
            obj = new ogrenciUser(rs.getInt("id"), rs.getString("adSoyad"), rs.getString("sinif"), rs.getString("sube"), rs.getString("ogrenciNo"), rs.getString("sifre"));
            list.add(obj);
        }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
