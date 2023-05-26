package Model;

public class ogrenciUser {
    private int id, ozurlu, ozursuz, turk1, turk2, mat1, mat2, fen1, fen2, sos1, sos2, ing1, ing2;
    private String adSoyad, sinif, sube,  sifre;
    
    public ogrenciUser(int id, int ozurlu, int ozursuz, String adSoyad, String sinif, String sube, String sifre, int turk1, int turk2, int mat1, int mat2, int fen1, int fen2, int sos1, int sos2, int ing1, int ing2)
    {
        this.id = id;
        this.ozurlu = ozurlu;
        this.ozursuz = ozursuz;
        this.turk1 = turk1;
        this.turk2 = turk2;
        this.mat1 = mat1;
        this.mat2 = mat2;
        this.fen1 = fen1;
        this.fen2 = fen2;
        this.sos1 = sos1;
        this.sos2 = sos2;
        this.ing1 = ing1;
        this.ing2 = ing2;
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
    public int getTurk1(){
        return turk1;
    }
    public void setTurk1(int turk1){
        this.turk1 = turk1;
    }
    public int getTurk2(){
        return turk2;
    }
    public void setTur2(int turk2){
        this.turk2 = turk2;
    }
    public void setMat1(int mat1) {
        this.mat1 = mat1;
    }
    public int getMat1() {
        return mat1;
    }
    public void setMat2(int mat2) {
        this.mat2 = mat2;
    }
    public int getMat2() {
        return mat2;
    }
    public void setFen1(int fen1) {
        this.fen1 = fen1;
    }
    public int getFen1() {
        return fen1;
    }
    public void setFen2(int fen2) {
        this.fen2 = fen2;
    }
    public int getFen2() {
        return fen2;
    }
    public void setSos1(int sos1) {
        this.sos1 = sos1;
    }
    public int getSos1() {
        return sos1;
    }
    public void setSos2(int sos2) {
        this.sos2 = sos2;
    }
    public int getSos2() {
        return sos2;
    }
    public void setIng1(int ing1) {
        this.ing1 = ing1;
    }
    public int getIng1() {
        return ing1;
    }
    public void setIng2(int ing2) {
        this.ing2 = ing2;
    }
    public int getIng2() {
        return ing2;
    }
}
