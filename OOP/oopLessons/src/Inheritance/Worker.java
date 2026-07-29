package Inheritance;

public class Worker {
    protected String adSoyad, eposta, telefon;

    public Worker(String adSoyad, String eposta, String telefon){
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }
    protected void giris(){
        System.out.println(this.adSoyad + " Calisan Girisi Yapildi ! ");
    }

    public String getAdSoyad(){
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad){
        this.adSoyad = adSoyad;
    }
    public String getEposta(){
        return eposta;
    }
    public void setEposta(String eposta){
        this.eposta = eposta;
    }
    public String getTelefon(){
        return telefon;
    }
    public void setTelefon(String telefon){
        this.telefon = telefon;
    }


}


