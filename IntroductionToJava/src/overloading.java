public class overloading {

    // add(int, int)
    static int add(int a, int b){
        System.out.println("Method1");
        return a + b;
    }

    // add(int, int, int)
    static int add(int a, int b,int c){
        System.out.println("Method2");
        return a + b + c;
    }

    // add(int, int, double)
    static double add(int a, int b,double c){
        System.out.println("Method3");
        return a + b + c;
    }

    static double add(int a, double b,int c){
        System.out.println("Method4");
        return a + b + c;
    }

    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(1,2, 5));
        System.out.println(add(1,2, 9.0));
        System.out.println(add(1,2.0, 9));

    }
}

