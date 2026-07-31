public class SafeHouse extends NormalLoc{

    SafeHouse(Player player){
        super(player, "Guvenli Ev");
        this.player = player;
    }

    public boolean getLocation() {
        player.setHealthy(player.getrHealthy());
        System.out.println("Iyilestiniz !");
        System.out.println("Su an Guvenli Evdesiniz !");
        return true;
    }
}
