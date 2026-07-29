package Inheritance;

public class InformationTech extends Officer{

    String gorev;
    public InformationTech(String gorev,String adSoyad, String eposta, String telefon,String departman, String mesai){
        super( adSoyad,  eposta,  telefon, departman,  mesai);
        this.gorev = gorev;
    }
    public String getGorev(){
        return getGorev();
    }

    public void setGorev(String gorev){
        this.gorev = gorev;
    }
}
