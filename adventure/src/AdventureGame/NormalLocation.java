package AdventureGame;

public abstract class NormalLocation extends Location {
    NormalLocation(Player player, String name){
        super(player, name);
    }
    @Override
    public boolean onLocation(){
        return true;
    }
}
