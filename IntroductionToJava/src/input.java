import java.util.Scanner;

public class input{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str;
        str = input.nextLine(); // next line ile next arasindaki fark : nextte arada bosluk(space varsa) oraya kadar aliyor
        System.out.println(str);

        int a,b;

        System.out.println("A sayisinin giriniz :");
        a = input.nextInt();
        System.out.println("B sayisini giriniz :");
        b = input.nextInt();
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("A X B : " + a*b);

        double c;

        System.out.println("Double turunde sayi giriniz  : ");
        c = input.nextDouble();
        System.out.println("c : " + c);


    }
}