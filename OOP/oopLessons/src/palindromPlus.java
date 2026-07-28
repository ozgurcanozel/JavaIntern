import java.util.Scanner;

public class palindromPlus {
    public static void main(String[] args){

    String str = "kapak", temp ="";

    for (int i = str.length() - 1 ; i >= 0 ; i--){
        temp += str.charAt(i);
    }
    if (temp.equals(str)){
        System.out.println("Polindromik");
    }
    }
}
