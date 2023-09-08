package AdventureGame;

public class Obstacle {
    int id;
    String name;
    int damage;
    int healty;
    int award;
    int orgiHealty;
    Obstacle(int id,String name,int damage,int healty,int award){
        this.id=id;
        this.name=name;
        this.damage=damage;
        this.healty=healty;
        this.award=award;
        this.orgiHealty=healty;
    }
    public int getOrgiHealty(){
        return orgiHealty;
    }
    public void setOrgiHealty(int orgiHealty){
        this.orgiHealty=orgiHealty;
    }
    public int getAward(){
        return award;
    }
    public void setAward(int award){
        this.award=award;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {

        if(healty<0){
            this.healty=0;
            System.out.println("Canavarı öldürdünüz: ");
        }else {
            this.healty = healty;
        }
    }
}
