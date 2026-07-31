public abstract class NormalLoc extends Location{

    NormalLoc(Player player, String name){ // normalde hata veriyor ama classini olusturunca ve super parameter tanimlayinca hata gitti
        super(player);
        this.name = name;

    }

    public boolean getLocation() {
        return true;
    }
}
