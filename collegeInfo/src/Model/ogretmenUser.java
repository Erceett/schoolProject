package Model;

import java.sql.SQLException;
import java.util.ArrayList;
import collegeinfo.Helper.*;
import java.sql.*;

public class ogretmenUser 
{
    int id;
    private String adSoyad, brans, kullaniciAdi, sifre;
    
    dbConnection conn = new dbConnection();

    public ogretmenUser(int id, String adSoyad, String brans, String kullaniciAdi, String sifre)
{
    this.id = id;
    this.adSoyad = adSoyad;
    this.brans = brans;
    this.kullaniciAdi = kullaniciAdi;
    this.sifre = sifre;
}

    public ogretmenUser(){}
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getadSoyad(){
        return adSoyad;
    }
    public void setadSoyad(String adSoyad){
        this.adSoyad = adSoyad;
    }
    public String getBrans(){
        return brans;
    }
    public void setBrans(String brans){
        this.brans = brans;
    }
    public String getkullaniciAdi(){
        return kullaniciAdi;
    }
    public void setkullaniciAdi(String kullaniciAdi){
        this.kullaniciAdi = kullaniciAdi;
    }
    public String getSifre(){
        return sifre;
    }
    public void setSifre(String sifre){
        this.sifre = sifre;
    }
}


