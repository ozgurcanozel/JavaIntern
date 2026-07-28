import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");

        int sayi = input.nextInt();

        int s1,s2,toplam;

        s1=1;
        s2=1;
        toplam = 0;

        for(int i = 1; i <= sayi ; i ++){
            System.out.print(s1 + " , ");

            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;

        }
    }
}
