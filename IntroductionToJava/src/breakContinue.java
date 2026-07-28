import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
//        int sayi;
//        while(true){
//            System.out.println("Bir sayi giriniz.");
//
//            sayi = input.nextInt();
//
//            if(sayi == 0) {
//                System.out.println("Dongu bitti.");
//                break;
//            }
//            System.out.println(sayi);

        for(int i = 1; i<=10; i++){
            if(i == 4 || i == 9){
                System.out.println("Atlandi = " + i);
                continue;
            }
            System.out.println("i : " + i);
        }

        }
    }
