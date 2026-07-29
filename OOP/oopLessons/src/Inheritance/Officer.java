package Inheritance;

public class Officer extends Worker{

    String departman, mesai;

    public Officer(String adSoyad, String eposta, String telefon,String departman, String mesai){

        super(adSoyad,eposta,telefon);
        this.departman = departman;
        this.mesai = mesai;
    }
    public String getDepartman(){
        return getDepartman();
    }

    public void setDepartman(String departman){
        this.departman = departman;
    }
    public String getMesai(){
        return getMesai();
    }

    public void setMesai(String mesai){
        this.mesai = mesai;
    }

}
