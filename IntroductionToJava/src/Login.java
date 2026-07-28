import java.util.Scanner;

public class Login {
    public static void main(String[] args){

        String k_adi, pass;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz : ");
        k_adi = input.next();

        System.out.println("Password giriniz : ");
        pass = input.next();

        if(k_adi.equals("ozgurcanozel") && pass.equals("1234")){
            System.out.println("Giris basarili!");
        }else{
            System.out.println("Kullanici adi veya parolaniz yanlis");
        }
    }
}
