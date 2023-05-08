package Model;

public class ogrenciUser {
    private int id;
    private String adSoyad, sinif, sube, ogrenciNo, kullaniciAdi, sifre;
    
    public ogrenciUser(int id, String adSoyad, String sinif, String sube, String ogrenciNo, String kullaniciAdi, String sifre)
    {
        this.id = id;
        this.adSoyad = adSoyad;
        this.sinif = sinif;
        this.sube = sube;
        this.ogrenciNo = ogrenciNo;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }
    
    public ogrenciUser(){};
    
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
    public String getogrenciNo(){
        return ogrenciNo;
    }
    public void setogrenciNo(String ogrenciNo){
        this.ogrenciNo = ogrenciNo;
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
