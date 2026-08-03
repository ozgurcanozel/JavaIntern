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
                SelItemID = armorMenu();
                buyArmor(SelItemID);
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

    public void buyWeapon(int itemID) {
        int damage = 0, price = 0;
        String wName = null;

        switch (itemID) {
            case 1:
                wName = "Tabanca";
                price = 25;
                damage = 2;
                break;
            case 2:
                wName = "Kilic";
                price = 35;
                damage = 3;
                break;
            case 3:
                wName = "Tufek";
                price = 45;
                damage = 7;
                break;
            case 4:
                System.out.println("Cikis yapiliyor !");
                return;
            default:
                System.out.println("Gecersiz islem !!");
                return;
        }

        if (player.getMoney() >= price) {
            player.getInv().setDamage(damage);
            player.getInv().setwName(wName);
            player.setMoney(player.getMoney() - price);
            System.out.println(wName + " satin aldiniz, Onceki hasar : " + player.getDamage() + " Yeni hasar : " + player.gettotalDamage());
        } else {
            System.out.println("Bakiye Yetersiz !!!");
        }
    }

    public int armorMenu(){
        System.out.println("1. Hafif ->\t Para : 15, Hasar : 1");
        System.out.println("2. Orta ->\t Para : 25, Hasar : 3");
        System.out.println("3. Agir ->\t Para : 40, Hasar : 5");
        System.out.println("4. Iptal");
        System.out.println("Zirh Secimini Yapiniz : ");
        int SelArmorID = scan.nextInt();
        return SelArmorID;
    }

    public void buyArmor(int itemID) {
        int avoid = 0, price = 0;
        String aName = null;

        switch (itemID) {
            case 1:
                aName = "Hafif zirh";
                price = 15;
                avoid = 1;
                break;
            case 2:
                aName = "Orta Zirh";
                price = 25;
                avoid = 3;
                break;
            case 3:
                aName = "Agir Zirh";
                price = 40;
                avoid = 5;
                break;
            case 4:
                System.out.println("Cikis yapiliyor !");
                return;
            default:
                System.out.println("Gecersiz islem !!");
                return;
        }
        if (player.getMoney() >= price) {
            player.getInv().setArmor(avoid);
            player.getInv().setaName(aName);
            player.setMoney(player.getMoney() - price);
            System.out.println(aName + " satin aldiniz, Engellenen Hasar : " + player.getInv().getArmor());
            System.out.println("Kalan Para : " + player.getMoney());
        } else {
            System.out.println("Bakiye Yetersiz !!!");
        }
    }
}
