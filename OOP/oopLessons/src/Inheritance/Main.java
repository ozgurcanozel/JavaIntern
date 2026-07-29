package Inheritance;

import SiniflarArasi.A;

public class Main {
    public static void main(String[] args){

        Academicien a = new Academicien("Ahmet", "a@gmail.com", "05550000000","CENG","Hoca", "CENG-101");
        System.out.println(a.getAdSoyad());

        Researcher r = new Researcher("Ozgurcan Ozel", "o@gmail.com", "05072434321", "Computer Science", "Hoca","java", "Proffesor");
        r.giris();
        a.giris();

        Worker w = new Worker("Derya Alan", "derya@gmail.com", "05032434321");
        w.giris();
    }
}
