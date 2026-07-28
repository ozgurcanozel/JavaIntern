public class RecursiveMethods {


    static int add(int a, int b){
        int toplam = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Toplam : " + toplam );
            toplam +=i;
        }
        return toplam;
    }

    static int r(int x){
        if(x == 1){
            return 1;
        }
        return  x + r(x - 1);
    }

    public static void main(String[] args){
        // recursive(ozyinelemeli)
        // f(1) = 1
        // f(2) = f(1) + 2
        // f(3) = f(2) + 3
        // f(4) = f(3) + 4
        // f(5) = f(4) + 5

        System.out.println(r(10));
    }
}
