import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double turkce, matematik, fen, sosyal, beden, averageScore;

        System.out.println("Turkce dersinin puanini giriniz : ");
        turkce = input.nextDouble();
        System.out.println("Matematik dersinin puanini giriniz : ");
        matematik = input.nextDouble();
        System.out.println("Fen dersinin puanini giriniz : ");
        fen = input.nextDouble();
        System.out.println("Sosyal dersinin puanini giriniz : ");
        sosyal = input.nextDouble();
        System.out.println("Beden dersinin puanini giriniz : ");
        beden = input.nextDouble();

        averageScore = (turkce + matematik + sosyal + fen + beden) / 5;

        if(averageScore >= 50){
            System.out.println("Sinifi gectiniz!");
        }else{
            System.out.println("Sinifi gecemediniz!");
        }
    }
}
