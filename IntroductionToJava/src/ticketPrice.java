import java.util.Scanner;

public class ticketPrice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double km,yas,normalFiyat,yasIndirimi,tipIndirimi;
        int tip;

        System.out.println("Gidilecek mesafeyi giriniz :");
        km = input.nextDouble();

        System.out.println("Yasinizi giriniz :");
        yas =  input.nextDouble();

        System.out.println("\nYolculuk tipini seciniz : 1-Tek gidis 2-Gidis/Donus");
        tip = input.nextInt();


        if(km > 0 && yas > 0 && (tip == 1 || tip == 2)){
            normalFiyat =  km * 0.10;
            if(yas <= 12){
                yasIndirimi = normalFiyat * 0.50;

            }else if(yas > 12 && yas <= 24){
                yasIndirimi = normalFiyat * 0.10;

            }else if (yas >=65){
                yasIndirimi = normalFiyat * 0.30;

            }else{
                yasIndirimi=0;
            }
            normalFiyat -= yasIndirimi;

            if(tip == 2){
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2;
            }
            System.out.println("Bilet icin odenecek tutar : " + normalFiyat + "$");
        }else{
            System.out.println("Girdiler yanlis tekrardan giriniz !");
        }



    }
}
