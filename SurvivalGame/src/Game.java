import java.util.Scanner;

public class Game {
    Player player;
    Location location;

    public void LogIn(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Macera oyununa hos geldiniz !");
        System.out.print("Oyuna baslamadan once isminizi giriniz : ");
        String playerName = scan.nextLine();

        Player player = new Player(playerName);
        player.selectChar();
    }
}
