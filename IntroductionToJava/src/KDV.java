import java.util.Scanner;

public class KDV{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double total, kdvFiyat ;
        System.out.println("Satin aldiginiz urunlerin toplam fiyatinin giriniz : ");
        total = input.nextDouble();

        kdvFiyat = total + (total * 0.20);

        System.out.println("Satin aldiginiz urunlerin kdv'li fiyati : " + kdvFiyat);
    }
}