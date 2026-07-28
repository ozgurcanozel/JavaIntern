import java.util.Scanner;

public class myClass {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int row, column;

        System.out.println("Mayin tarlasina hos geldiniz !");
        System.out.println("Lutfen oynamak istediginiz boyutlari giriniz !");

        System.out.print("Satir sayisi : ");
        row = scan.nextInt();

        System.out.print("Sutun sayisi : ");
        column = scan.nextInt();

        MineSweeper mayin = new MineSweeper(row, column);
        mayin.run();

        scan.close(); // İşlem bitince Scanner'ı kapatmak iyi bir alışkanlıktır.
    }
}