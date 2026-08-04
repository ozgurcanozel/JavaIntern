import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void LogIn(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Macera oyununa hos geldiniz !");
        System.out.print("Oyuna baslamadan once isminizi giriniz : ");
        String playerName = scan.nextLine();

        player = new Player(playerName);
        player.selectChar();

        start();
    }

    public void start(){
        while(true){
            System.out.println();
            System.out.println("=====================");
            System.out.println("Eylem Gerceklestirmek Icin Bir Yer Seciniz : ");
            System.out.println("1. Guvenli Ev --> Size ait guvenli bir yer, dusman yok.");
            System.out.println("2. Magara --> Karsiniza belki zombi cikabilir.");
            System.out.println("3. Orman --> Karsiniza belki Vampir cikabilir.");
            System.out.println("4. Nehir --> Karsiniza belki Ayı cikabilir.");
            System.out.println("5. Magaza --> Silah ya da zirh alabilirsiniz.");
            System.out.print("Gitmek istediginiz yer : ");
            int selLocation = scan.nextInt();

            if (selLocation < 0 || selLocation > 5) {
                System.out.println("Lutfen gecerli bir yer seciniz :");
                selLocation = scan.nextInt();
            }


            while(selLocation<0 || selLocation>5){
                System.out.print("Lutfen gecerli bir yer seciniz : ");
                selLocation = scan.nextInt();
            }
            switch (selLocation){
                case 1:
                    location = new SafeHouse(player);

                    break;
                case 2:
                    location = new Cave(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new River(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (location.getClass().getName().equals("SafeHouse")){
                if (player.getInv().isFood() && player.getInv().isFirewood() && player.getInv().isWater()){
                    System.out.println("Tebrikler oyunu kazandiniz !!!");
                    break;
                }
            }
            if(! location.getLocation()){
                System.out.println("Oyun Bitti !");
                break;
            }
        }
    }
}
