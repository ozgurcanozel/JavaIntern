package Inheritance;

public class Researcher extends Academicien{

    String unvan;

    public Researcher(String adSoyad, String eposta, String telefon,String bolum, String gorevler, String ders,String unvan){
        super( adSoyad,  eposta,  telefon, bolum,  gorevler,  ders);
        this.unvan = unvan;

    }
    public String getUnvan(){
        return getUnvan();
    }

    public void setUnvan(String unvan){
        this.unvan = unvan;
    }
}
