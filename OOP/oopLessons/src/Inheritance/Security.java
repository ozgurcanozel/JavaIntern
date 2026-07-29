package Inheritance;

public class Security  extends Officer{

    String belge;

    public Security(String belge,String adSoyad, String eposta, String telefon,String departman, String mesai ){
        super( adSoyad,  eposta,  telefon, departman,  mesai);
        this.belge = belge;
    }
    public String getBelge(){
        return getBelge();
    }

    public void setBelge(String belge){
        this.belge = belge;
    }
}
