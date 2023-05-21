package Model;

public class ogrenciUser {
    private int id, ozurlu, ozursuz;
    private String adSoyad, sinif, sube,  sifre;
    
    public ogrenciUser(int id, int ozurlu, int ozursuz, String adSoyad, String sinif, String sube, String sifre)
    {
        this.id = id;
        this.ozurlu = ozurlu;
        this.ozursuz = ozursuz;
        this.adSoyad = adSoyad;
        this.sinif = sinif;
        this.sube = sube;
        this.sifre = sifre;
    }
    
    public ogrenciUser(){};
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getOzurlu(){
        return ozurlu;
    }
    public void setOzurlu(int ozurlu){
        this.ozurlu = ozurlu;
    }
    public int getOzursuz(){
        return ozursuz;
    }
    public void setOzursuz(int ozursuz){
        this.ozursuz = ozursuz;
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
    public String getSifre(){
        return sifre;
    }
    public void setSifre(String sifre){
        this.sifre = sifre;
    }
}
