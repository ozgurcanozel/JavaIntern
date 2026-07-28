import java.util.Scanner;

public class suggestionSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double hava;

        System.out.println("Hava sicakliigni giriniz : ");
        hava = input.nextDouble();

        if(hava >= 30){
            System.out.println("Yuzmeye gitmelisin.");
        }else if(hava >= 5 && hava < 30){
            System.out.println("Sinemaya gitmelisin.");
        }else if (hava <= 4){
            System.out.println("Kayaga gitmelisin.");
        }else{
            System.out.println("Gecerli bir hava sicakligi giriniz.");
        }
    }
}
