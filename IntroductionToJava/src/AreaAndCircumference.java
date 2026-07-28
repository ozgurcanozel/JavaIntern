import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args){

        int r;
        double area, V, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yaricapini(r) giriniz : ");
        r = input.nextInt();

        area = 2*pi*r;
        V = pi * r *r;

        System.out.println("Daire alani : " + area);
        System.out.println("Daire hacmi : " + V);
    }
}
