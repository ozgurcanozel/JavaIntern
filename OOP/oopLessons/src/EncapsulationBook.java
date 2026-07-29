public class EncapsulationBook {

    public String name, author, publisher;
    private int numberOfPage; // sayfa sayisi disaridan degisitirilmesin diye private alacagiz ama private aldigimda ise ekrana yazdiramiyorum simdi bu sorunu cozecegiz

    EncapsulationBook(String name, String author, String publisher, int numberOfPage){
        this.name = name;
        this.author = author;
        this.publisher = publisher;

        if(numberOfPage < 1){
            this.numberOfPage = 10;
        }else{
            this.numberOfPage = numberOfPage;

        }
    }

    public void pageSize(){
        System.out.println(numberOfPage);
    }


}

