import java.util.Scanner;

public class atm {
    public static void main(String[] args){
        int bakiye = 1000, input, miktar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Atmye hos geldiniz !");
        System.out.println("Guncel bakiyeniz : " + bakiye + " TL");

        while(bakiye > 0) {
            System.out.println();
            System.out.println("1-) Para yatir");
            System.out.println("2-) Para cek");
            System.out.println("3-) Bakiye sorgula");
            System.out.println("4-) Cikis yap");
            System.out.print("Yapmak istediginiz islemi seciniz -> ");
            input = scan.nextInt();

            if (input == 1) {
                System.out.println("yatirmak istediginz tutari giriniz : ");
                miktar = scan.nextInt();
                bakiye += miktar;
                System.out.println("Para yatirma islemi basariyla gerceklesti ! Guncel bakiyeniz : " + bakiye);
            }
            if (input == 2) {
                System.out.println("Cekmek istediginz tutari giriniz : ");
                miktar = scan.nextInt();

                if (miktar < bakiye) {
                    bakiye -= miktar;
                    System.out.println("Para cekme islemi basariyla gerceklesti ! Guncel bakiyeniz : " + bakiye);
                } else {
                    System.out.println("Yetersiz bakiye !");
                }
            }
            if (input == 3) {
                System.out.println("Guncel bakiyeniz : " + bakiye);
            } else if (input == 4) {
                System.out.println("Cikis yapiliyor.");
                break;
            }
        }
        }
    }

