import java.util.Scanner;

public class arrays {
    public static void main(String[] args){

        int[] liste = new int[5];
        for (int i = 0; i < liste.length; i++){
            Scanner scan = new Scanner(System.in);
            liste[i] = scan.nextInt();
        }
        for (int i = 0; i < liste.length; i++){
            System.out.println(liste[i]);
        }

    }
}