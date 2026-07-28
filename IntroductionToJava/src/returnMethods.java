public class returnMethods {

    static int power(int a, int b){ // void methods can't to turn a value
        int result = 1;

        for(int i = 1; i <= b; i++){
            result *= a;
        }
        return result; //dondurulecek verinin turunu belirliyoruz yukarida void olarak donmez o yuzden
    }

    static void power2(int a, int b){ // void methods can't to turn a value
        int result = 1;

        for(int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("result : " + result);
    }

    public static void main(String[] args){
        int r = power(2,3);
        System.out.println("r : " + r);
    }
}
