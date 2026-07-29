package Inheritance;

// akademisyen bu calisanin alt sinif oldugunu belirtmek icin extend

public class Academicien extends Worker{

        String bolum, gorevler, ders;

       public Academicien(String adSoyad, String eposta, String telefon,String bolum, String gorevler, String ders){

                super(adSoyad, eposta, telefon); // bu kodun calismasi demek academicien kimden extends edildiyse onu calistirir yani Worker'in calismasi demektir.
                this.bolum = bolum;
                this.gorevler = gorevler;
                this.ders = ders;
        }

        public void giris(){
                System.out.println(this.adSoyad + " kisisi A kapisindan giris yapti ! ");
        }

        public String getBolum(){
               return getBolum();
        }
        public void setBolum(String bolum){
                this.bolum = bolum;
        }

        public String getGorevler(){
                return getGorevler();
        }
        public void setGorevler(String gorevler){
                this.gorevler = gorevler;
        }

        public String getDers(){
                return getDers();
        }
        public void setDers(String ders){
                this.ders = ders;
        }
}
