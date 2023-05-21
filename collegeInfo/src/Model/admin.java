package Model;

import java.sql.*;
import java.util.*;
import collegeinfo.Helper.*;

public class admin  extends ogretmenUser{
    
    Connection con = conn.connectDb();
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement prepareStatement = null;
    
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
    
    public ArrayList<ogretmenSube> getOgrtSubeList() throws SQLException{
        ArrayList <ogretmenSube> list = new ArrayList<>();
        ogretmenSube obj;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM subeler");
            while(rs.next()){
                obj = new ogretmenSube(rs.getInt("id"), rs.getInt("ogretmenID"),rs.getString("adsoyad"), rs.getString("sinif"), rs.getString("sube"));
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
            obj = new ogrenciUser(rs.getInt("id"),rs.getInt("ozurlu"), rs.getInt("ozursuz"), rs.getString("adSoyad"), rs.getString("sinif"), rs.getString("sube"), rs.getString("sifre"));
            list.add(obj);
        }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean updateOgrc(String adSoyad, String sinif, String sube, int ozurlu, int ozursuz){
        String query = "UPDATE ogrencitablosu SET adSoyad = ?, sinif = ?, sube = ?, ozurlu = ?, ozursuz = ? WHERE id = ?";
        boolean key = false;
        try{
            st = con.createStatement();
            prepareStatement = con.prepareStatement(query);
            prepareStatement.setString(1, adSoyad);
            prepareStatement.setString(2, sinif);
            prepareStatement.setString(3, sube);
            prepareStatement.setInt(4, ozurlu);
            prepareStatement.setInt(5, ozursuz);
            prepareStatement.setInt(6, id);
            
            prepareStatement.executeUpdate();
            
            key = true;
        }
        catch(Exception e){
            e.printStackTrace();
        };
        if (key) {
            return true;
        }
        else return false;
        
    }
    
    public boolean updateDevam(int ozurlu, int ozursuz, int id){
        String query = "UPDATE ogrencitablosu SET ozurlu = ?, ozursuz = ? WHERE id = ?";
        boolean key = false;
        try{
            st = con.createStatement();
            prepareStatement = con.prepareStatement(query);
            prepareStatement.setInt(1, ozurlu);
            prepareStatement.setInt(2, ozursuz);
            prepareStatement.setInt(3, id);
            
            prepareStatement.executeUpdate();
            
            key = true;
        }
        catch(Exception e){
            e.printStackTrace();
        };
        if (key) {
            return true;
        }
        else return false;
        
    }
}
