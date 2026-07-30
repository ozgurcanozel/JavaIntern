package Interface;

public class Akademisyen implements ICalisan{

    private String adSoyad, bolum, gorevler; // private dedigimde encapsulation

    // Constructor

    public Akademisyen(String adSoyad, String bolum, String gorevler){
        this.gorevler = gorevler;
        this.bolum = bolum;
        this.adSoyad = adSoyad;

    }
    // getter and setter methods

    public String getAdSoyad(){
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad){
        this.adSoyad = adSoyad;
    }

    public String getBolum(){
        return bolum;
    }

    public void setBolum(String bolum){
        this.bolum = bolum;
    }

    public String getGorevler(){
        return gorevler;
    }

    public void setGorevler(String gorevler){
        this.gorevler = gorevler;
    }

    // override demesinin nedeni ust classtan override edilmesi
    @Override
    public void giris() {
        System.out.println("Giris yapildi !");
    }

    @Override
    public void cikis() {
        System.out.println("Cikis yapildi !");

    }

    @Override
    public boolean yemek(int saat) {
        System.out.println("Yemek yendi !");

        return false;
    }
}
