package AdventureGame;

public class SafeHouse extends NormalLocation {
    SafeHouse(Player player, String name){
        super(player,"Güvenli ev");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Güvenli evdesiniz:");
        if(getPlayer().getHealthy()<7){
        getPlayer().setHealthy(getPlayer().getHealthy()+18);
        System.out.println("Canınız yenilendi:" );
        }
        return true;
    }

}
