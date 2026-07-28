public class recursiveFibo {

    static int fibonacci(int input){
        if( input == 1 || input == 2)
            return 1;
        else
            return fibonacci(input-1) + fibonacci(input - 2);
    }


    public static void main(String[] args){
        System.out.println(fibonacci(7));
    }
}
