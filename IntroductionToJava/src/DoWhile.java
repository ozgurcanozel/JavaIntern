public class DoWhile {
    public static void main(String[] args){

        int i = 10;
        System.out.println("Loops is started");

        /*
        while(i <= 5){
            System.out.print(i + ",");
            i++;
        }

         */

        do{
            System.out.println(i + ",");
            i++;

        }while(i <= 5);

        System.out.println("\nLoops is end");
    }
}
