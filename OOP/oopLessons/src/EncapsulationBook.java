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

    // private olan bir degiskeni baska bir sinifta cagirabilmek icin methodunu getter olarak yazmamiz lazim
    public int getNumberOfPage(){
        return this.numberOfPage;
    }

    public void setNumberOfPage(int Size){
        if (Size < 1){
            System.out.println("Sayfa sayisi negatif olamaz !");
            this.numberOfPage = 10;
        }else{
            this.numberOfPage = Size;

        }
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

}

