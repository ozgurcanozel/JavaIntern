import java.util.Locale;

public abstract class BattleLoc extends Location{

    protected Obstacle obstacle;

    BattleLoc(Player player, String name, Obstacle obstacle){
        super(player);
        this.name = name;
        this.obstacle = obstacle;

    }

    public boolean getLocation() {

        int obsCount = obstacle.count();
        System.out.println("Suan Buradasiniz : " + this.getName());
        System.out.println("Dikkatli ol !! Burada " + obsCount + " tane " + obstacle.getName() + " bulunuyor.");
        System.out.println("<S>avas veya <K>ac ");
        String selCase = scan.next();
        selCase = selCase.toUpperCase();
        if (selCase.equals("S")){
            if(combat(obsCount)){
                System.out.println(this.getName() + " Bolgesindeki Tum Dusmanlari Temizlediniz ! ");
            }else{
                System.out.println("öldunuz !!");
                return false;
            }
        }
        return true;
    }

   public boolean combat(int obsCount){
        for (int i = 0; i < obsCount; i++){
            playerStats();
            enemyStats();
        }
        return true;
   }
   public void playerStats(){
        System.out.println("Oyuncu Degerleri \n----------------");
        System.out.println("Can : " + player.getHealthy());
        System.out.println("Hasar : " + player.gettotalDamage());
        System.out.println("Money : " + player.getMoney());
        if(player.getInv().getDamage() > 0){
            System.out.println("Silah : " + player.getInv().getwName());
        }
       if(player.getInv().getArmor() > 0){
           System.out.println("Zirh : " + player.getInv().getaName());
       }
   }
   public void enemyStats(){
       System.out.println("\n" + obstacle.getName() + " Degerleri \n----------------");
       System.out.println("Can : " + obstacle.getHealth());
       System.out.println("Hasar : " + obstacle.getDamage());
       System.out.println("Odul : " + obstacle.getAward());
   }
}
