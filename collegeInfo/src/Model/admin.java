package Model;

import collegeinfo.Helper.dbConnection;
import java.sql.*;
import java.util.*;
import collegeinfo.Helper.*;

public class admin  extends ogretmenUser{
    
    Connection admCon = dbConnection.connectDb();
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
            Connection con1 = dbConnection.connectDb();
            st = admCon.createStatement();
            rs = st.executeQuery("SELECT * FROM ogretmentablosu WHERE tur = 'ogrt'");
            while(rs.next()){
                obj = new ogretmenUser(rs.getInt("id"), rs.getString("adSoyad"), rs.getString("brans"), rs.getString("kullaniciAdi"), rs.getString("sifre"));
                list.add(obj);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
    public ArrayList<ogretmenSube> getOgrtSubeList() throws SQLException{
        ArrayList <ogretmenSube> list = new ArrayList<>();
        ogretmenSube obj;
        try {
            Connection con2 = dbConnection.connectDb();
            st = admCon.createStatement();
            rs = st.executeQuery("SELECT * FROM subeler");
            while(rs.next()){
                obj = new ogretmenSube(rs.getInt("id"), rs.getInt("ogretmenID"),rs.getString("adsoyad"), rs.getString("sinif"), rs.getString("sube"));
                list.add(obj);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
    
    
    public ArrayList<ogrenciUser> getOgrcList()throws SQLException{ // muhtemel hata burada 
        ArrayList<ogrenciUser> list = new ArrayList<>();
        ogrenciUser obj;
        try{
            Connection con3 = dbConnection.connectDb();
        st = admCon.createStatement();
        rs = st.executeQuery("SELECT * FROM ogrencitablosu");
        while(rs.next()){
            obj = new ogrenciUser(rs.getInt("id"),rs.getInt("ozurlu"), rs.getInt("ozursuz"), rs.getString("adSoyad"), rs.getString("sinif"), rs.getString("sube"), rs.getString("sifre"),
            rs.getInt("turk1"),rs.getInt("turk2"),rs.getInt("mat1"),rs.getInt("mat2"),rs.getInt("fen1"),rs.getInt("fen2"),rs.getInt("sos1"),rs.getInt("sos2")
            ,rs.getInt("ing1"),rs.getInt("ing2"));
            list.add(obj);
        }
        }catch(SQLException e){
        }
        return list;
    }

    
    public boolean updateOgrc(String adSoyad, String sinif, String sube, int ozurlu, int ozursuz) throws SQLException{
        String query = "UPDATE ogrencitablosu SET adSoyad = ?, sinif = ?, sube = ?, ozurlu = ?, ozursuz = ? WHERE id = ?";
        boolean key = false;
        try{
            Connection con4 = dbConnection.connectDb();
            st = admCon.createStatement();
            prepareStatement = con4.prepareStatement(query);
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
    
    @SuppressWarnings("empty-statement")
    public boolean updateDevam(int ozurlu, int ozursuz, int id) throws SQLException{
        String query = "UPDATE ogrencitablosu SET ozurlu = ?, ozursuz = ? WHERE id = ?";
        boolean key = false;
        try{
            st = admCon.createStatement();
            prepareStatement = admCon.prepareStatement(query);
            prepareStatement.setInt(1, ozurlu);
            prepareStatement.setInt(2, ozursuz);
            prepareStatement.setInt(3, id);
            
            prepareStatement.executeUpdate();
            
            key = true;
            
        }
        catch(SQLException e){
        }
;
        if (key) {
            return true;
        }
        else return false;
        
    }
}
