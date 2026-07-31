import java.util.Scanner;

public class Player {

    private int damage, healthy, money, rHealthy;
    private String name, cName;
    private Inventory inv;

    Scanner scan = new Scanner(System.in);

    // su anlik sadece player icin constructor olusturuyorum
    public Player(String name){
        this.name = name;
    }

    public void selectChar(){

        switch (charMenu()){
            case 1 :
                initPlayer("Samuray",5,21,15);
            case 2 :
                initPlayer("Okcu", 7,18,20);
            case 3 :
                initPlayer("Sovalye", 8,24,5);
                break;
            default:
                initPlayer("Samuray",5,21,15);
                break;
        }
        System.out.println("Karakter : " + getcName() + " ,Hasar : " + getDamage() + " ,Saglik : " + getHealthy() + " ,Para : " + getMoney());

    }
    public int charMenu() {
        System.out.println("Lutfen karakterinizi seciniz :");
        System.out.println(" 1- Samuray ->\t Hasar : 5,\t  Sağlik : 21,\t  Para : 15");
        System.out.println(" 2- Okcu ->\t  Hasar : 7,\t  Sağlik : 18,\t  Para : 20");
        System.out.println(" 3- Sovalye->\t  Hasar : 8,\t  Sağlik : 24,\t  Para : 5");
        System.out.println("Karakter Seciminiz : ");
        int charID = scan.nextInt();

        while (charID < 1 || charID > 3){
            System.out.println("Lutfen gecerli bir karakter seciniz !");
            charID = scan.nextInt();
        }

        return charID;
    }

    public void initPlayer(String cName, int dmg, int hlthy, int mny){
        setcName(cName);
        setDamage(dmg);
        setHealthy(hlthy);
        setMoney(mny);
        setrHealthy(hlthy);
    }

    // encapsulation yapacagiz getter ve setterla

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getHealthy(){
        return healthy;
    }

    public void setHealthy(int healthy){
        this.healthy = healthy;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getcName(){
        return cName;
    }

    public void setcName(String cName){
        this.cName = cName;
    }
    public Inventory getInv(){
        return inv;
    }

    public void setInv(Inventory inv){
        this.inv = inv;
    }

    public int getrHealthy(){
        return rHealthy;
    }

    public void setrHealthy(int rHealthy){
        this.rHealthy = rHealthy;
    }
}
