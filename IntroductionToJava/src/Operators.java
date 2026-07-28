import java.net.StandardSocketOptions;

public class Operators{
    public static void main(String []args){
        int a =10;
        int b =5;

        int toplam = a + b ;
        int carpma = a * b ;
        int cikarma = a - b ;
        int bolme = a / b ;
        int mod = a % b ;

        System.out.println("Toplam : " + toplam);
        System.out.println("Carpma : " + carpma);
        System.out.println("Cikarma : " + cikarma);
        System.out.println("Bolme : " + bolme);
        System.out.println("mod : " + mod);

        boolean kosul = (a / b) == 2;
        System.out.println(kosul);

        boolean kosul1 = (a > b);
        System.out.println(kosul1);

        boolean kosul2 = (a < b);
        System.out.println(kosul2);

        boolean kosul3 = (kosul && kosul1); // kosul1 ve kosul
        System.out.println(kosul3);

        boolean kosul4 = (kosul || kosul1); // kosul1 ya da kosul
        System.out.println(kosul4);

        String sonuc3 = (kosul1) ? "Dogru" : "Yanlis";
        System.out.println(sonuc3);
    }

}