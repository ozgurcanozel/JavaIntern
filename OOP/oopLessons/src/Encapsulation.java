import static java.lang.System.out;

public class Encapsulation{
    public static void main(String[] args){
        // encapsulation
        // inheritance
        // polymorphism
        // abstraction



        EncapsulationBook b1 = new EncapsulationBook("Harry Potter", "Kodlama vakti", "Rowling",-400 );

        // getter methodu
        // b1'in sayfa sayisini basmak isitiyorum ama bu private o yuzden fonksiyon yazacagiz

        // System.out.println(b1.getNumberOfPage()); // getter methodu sayesinde private bir variable'i baska sinifta kullandim

        b1.setNumberOfPage(7000);

        System.out.println(b1.getNumberOfPage());

        EncapsulationBook b2 = new EncapsulationBook("Lord Of The", "Peter Jackson", "Kodlama", 500);
        b2.setName("Lord Of The Rings");

        System.out.println(b2.getName());
    }
}
