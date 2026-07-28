public class Student {

    public String name;
    public int id;
    int point;
    private static int counter = 0; // static ve private oldugu icin sadaece bu package icin kullanilir



    // Constructor yazalim

    Student(String name, int id, int point){
        this.name = name;
        this.id = id; // ogrenci nesnesine ait olduklari icin this. yapiyorum
        this.point = point;

        // her student olustugunda

        Student.counter++; // this. yapmadik cnuku bu nesneye ait degil komple sinifa ait bir variable
    }

    public void exit(){
        Student.counter--;
    }

    public static int howStudent(){
        return Student.counter;
    }

    public static double calculateOverall(int[] arr){

            double overall = 0;
            for(int i = 0; i < arr.length; i++){
                overall = +arr[i];
            }
        return overall / arr.length;

    }
}
