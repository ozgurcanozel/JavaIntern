package Inheritance;

public class Assistan extends Academicien{
    protected String yuksekLisans;

    public Assistan(String adSoyad, String eposta, String telefon,String bolum, String gorevler, String ders, String yuksekLisans){
        super( adSoyad,  eposta,  telefon, bolum,  gorevler,  ders);
        this.yuksekLisans = yuksekLisans;
    }
    public String getYuksekLisans(){
        return getYuksekLisans();
    }

    public void setYuksekLisans(String yuksekLisans){
        this.yuksekLisans = yuksekLisans;
    }
}
