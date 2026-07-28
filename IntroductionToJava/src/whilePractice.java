import java.util.Scanner;

public class whilePractice {
    public static void main(String[] args){
//        for(int i = 1; i<= 100; i++){
//            if(i % 2 ==0){
//                System.out.println(i);
//            }
//        }

//        int sayi, toplam =0;
        Scanner input = new Scanner(System.in);
//
//        while(true){
//            System.out.println("Lutfen bir sayi giriniz : ");
//            sayi = input.nextInt();
//
//            if(sayi < 0){
//                System.out.println("Program sona erdi negatif sayi girdiniz !");
//                break;
//            }
//            if(sayi % 2 == 1){
//                toplam += sayi;
//            }
//
//        }
//        System.out.println("Girilen tek sayilarin toplami : " + toplam);

        System.out.println("Sayi girin : ");
        int sayi = input.nextInt();
        int k =1;
        while(k <= sayi){
            System.out.println(k);
            k = k * 2;
        }
    }
}
