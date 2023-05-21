package Model;

import java.sql.SQLException;
import java.util.ArrayList;
import collegeinfo.Helper.*;
import java.sql.*;

public class ogretmenSube {
    int id, ogretmenID;
    private String adSoyad, sinif, sube;
    
    dbConnection conn = new dbConnection();
    
    public ogretmenSube(int id, int ogretmenID, String adSoyad, String sinif, String sube)
{
    this.id = id;
    this.ogretmenID = ogretmenID;
    this.adSoyad = adSoyad;
    this.sinif = sinif;
    this.sube = sube;
}
    
    public ogretmenSube(){}
    
     public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getOgretmenID(){
        return ogretmenID;
    }
    public void setOgretmenID(int ogretmenID){
        this.ogretmenID = ogretmenID;
    }
    public String getadSoyad(){
        return adSoyad;
    }
    public void setadSoyad(String adSoyad){
        this.adSoyad = adSoyad;
    }
    public String getSinif(){
        return sinif;
    }
    public void setSinif(String sinif){
        this.sinif = sinif;
    }
    public String getSube(){
        return sube;
    }
    public void setSube(String sube){
        this.sube = sube;
    }
}
