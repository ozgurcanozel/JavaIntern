import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args) {

        int tahmin, can = 5, i = 0;
        int hataSayisi = 0; // Sınır dışı (0-99 olmayan) hatalı girişleri sayacak

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int sayi = rand.nextInt(100);
        boolean oyunDurum = false;

        int[] tahminler = new int[5];

        System.out.println("Sayi tahmin oyunu !");
        System.out.println("(0 - 99) arasinda bir sayi tuttum");
        System.out.println("Sayi : " + sayi); // Test için ekranda görünüyor

        while (can > 0) {
            System.out.print("Tahmininiz : ");
            tahmin = scan.nextInt();

            // Sınır kontrolü (0'dan küçük veya 99'dan büyük girilirse)
            if (tahmin < 0 || tahmin > 99) {
                hataSayisi++;

                // 3. hata ve sonrasındaki her hatada can düşer
                if (hataSayisi >= 3) {
                    System.out.println("Cok fazla hatali tahmin yaptiniz bir can kaybettiniz.");
                    System.out.println("Kalan Can : " + --can);
                } else {
                    // 1. ve 2. hatada sadece uyarır
                    System.out.println("Lutfen 0 ile 99 arasinda bir sayi giriniz.");
                }
                continue;
            }

            // Sayı geçerliyse diziye eklenir
            tahminler[i++] = tahmin;

            // Doğru tahmin kontrolü
            if (tahmin == sayi) {
                oyunDurum = true;
                break;
            } else {
                System.out.println("Yanlis !, tekrar deneyiniz kalan can :  " + --can);
            }
        }

        // Oyun sonu mesajları
        if (oyunDurum) {
            System.out.println("Tebrikler, dogru tahmin !");
            System.out.println("Sayimiz : " + sayi);
            System.out.println("Kalan Can : " + can);
        } else {
            System.out.println("Basaramadiniz ! Sayi: " + sayi);
        }

        // Girilen tahminleri yazdırma kısmı
        System.out.print("Tahmin ettiginiz degerler: ");
        for (int j = 0; j < i; j++) {
            System.out.print(tahminler[j]);
            if (j < i - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}