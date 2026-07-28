import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Islem yapmak istediginiz ilk sayiyi giriniz : ");
        int a = input.nextInt();

        System.out.print("Islem yapmak istediginiz ikinci sayiyi giriniz : ");
        int b = input.nextInt();

        System.out.print("Yapmak istediginiz islemi seciniz (+, -, *, /) : ");
        String islem = input.next();

        switch (islem) {
            case "+":
                System.out.println("Sonuc : " + (a + b));
                break;
            case "-":
                System.out.println("Sonuc : " + (a - b));
                break;
            case "*":
                System.out.println("Sonuc : " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("Sonuc : " + ((double) a / b));
                } else {
                    System.out.println("Hata: Bir sayi 0'a bolunemez!");
                }
                break;
            default:
                System.out.println("Gecersiz bir islem girdiniz!");
                break;
        }

        input.close();
    }
}