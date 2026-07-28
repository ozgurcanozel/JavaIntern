import java.util.Scanner;

public class AverageArrays {
    public static void main(String[] args){

        int[] notlar = new int[7];
        Scanner scan = new Scanner(System.in);

        double sonuc = 0;


        System.out.println("Notlarinizi sirayla giriniz : ");

        System.out.println("Matematik : ");
        notlar[0] = scan.nextInt();

        System.out.println("Turkce : ");
        notlar[1] = scan.nextInt();

        System.out.println("Fizik : ");
        notlar[2] = scan.nextInt();

        System.out.println("Tarih : ");
        notlar[3] = scan.nextInt();

        System.out.println("Kimya : ");
        notlar[4] = scan.nextInt();

        System.out.println("Beden : ");
        notlar[5] = scan.nextInt();

        System.out.println("Muzik : ");
        notlar[6] = scan.nextInt();

        for (int not : notlar){
            sonuc += not;
        }
        System.out.println("Donem ortalamaniz : " + sonuc/notlar.length);
    }
}
