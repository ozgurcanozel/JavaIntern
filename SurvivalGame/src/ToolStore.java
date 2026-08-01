public class ToolStore extends NormalLoc{

    ToolStore(Player player){
        super(player,"Magaza");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Para : " + player.getMoney());
        System.out.println("1. Silahlar ");
        System.out.println("2. Zirhlar ");
        System.out.println("3. Cikis ");
        System.out.println("Seciminiz : ");
        int selectTool = scan.nextInt();
        int SelItemID;

        switch (selectTool){
            case 1:
                SelItemID = weaponMenu();
                buyWeapon(SelItemID);
                break ;
            case 2:
                break;
            default:
                break;
        }
        return true;
    }

    public int weaponMenu(){
        System.out.println("1. Tabanca ->\t Para : 25, Hasar : 2");
        System.out.println("2. Kilic ->\t Para : 35, Hasar : 3");
        System.out.println("3. Tufek ->\t Para : 45, Hasar : 7");
        System.out.println("4. Iptal");
        System.out.println("Silah Secimini Yapiniz : ");
        int SelWeaponID = scan.nextInt();
        return SelWeaponID;
    }

    public void buyWeapon(int itemID){
        int damage= 0 ,price = 0;
        String wName = null;

        switch (itemID){
            case 1 :
                wName = "Tabanca";
                price = 25;
                damage = 2;
                break;
            case 2 :
                wName = "Kilic";
                price = 35;
                damage = 3;
                break;
            case 3 :
                wName = "Tufek";
                price = 45;
                damage = 7;
                break;
            default:
                System.out.println("Gecersiz islem !!");
        }
        if(player.getMoney() >= price){
            player.getInv().setDamage(damage);
            player.getInv().setwName(wName);
            player.setMoney(player.getMoney() - price);
            System.out.println( wName + " satin aldiniz, Onceki hasar : " + player.getDamage() + " Yeni hasar : " + (player.getDamage() + player.getInv().getDamage()));

        }else{
            System.out.println("Bakiye Yetersiz !!!");
        }
    }
}
