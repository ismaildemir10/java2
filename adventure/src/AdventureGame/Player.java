package AdventureGame;

import java.util.Scanner;

public class Player {
    private String charname;
    private int damage ;
    private int orgiHealty;


    private int healthy;
    private int money;
    private String name;
    Scanner inp = new Scanner(System.in);
    public Player(String name){
        this.name=name;
        this.orgiHealty=healthy;
    }
    public String getName(){
        return name;
    }
    public String getCharname() {return charname;}

    public void setCharname(String charname) {this.charname = charname;}
    public void setName(String name){
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }
    public int getHealthy(){
        return healthy;
    }
    public void setHealthy(int healthy){
        this.healthy=healthy;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money=money;
    }

    public int getOrgiHealty() {
        return orgiHealty;
    }

    public void setOrgiHealty(int orgiHealty) {
        this.orgiHealty = orgiHealty;
    }

    public Scanner getInp() {
        return inp;
    }

    public void setInp(Scanner inp) {
        this.inp = inp;
    }

    public void selectChar(int select) {
        switch (select){
            case 1:
                this.charname="Samuray";
                this.damage = 5;
                this.healthy = 21;
                this.money = 115;
                break;
            case 2:
                this.charname="Okçu";
                this.damage=7;
                this.healthy=18;
                this.money=20;
                break;
            case 3:
                this.charname="Şovalye";
                this.damage=8;
                this.healthy=24;
                this.money=5;
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
        }
        System.out.println("Karakter ismi:"+getCharname()+
                "\tHasar:"+getDamage()+
                "\tSağlık:"+ getHealthy()+
                "\tPara:" + getMoney());
    }
    public void selectLoc(){
            int bottom;
            boolean as=true;
            while (as) {
                Location location = null;
                System.out.println("Gitmek istediğiniz bölgeyi belirleyiniz");
                System.out.println("1 Güvenli ev\n" +
                        "2 Eşya dükkanı\n"+
                        "3 Mağara\n"+
                        "4 Orman\n" +
                        "5 Nehir\n" +
                        "6 Çıkış");
                bottom = inp.nextInt();
                switch (bottom) {
                    case 1:
                        location = new SafeHouse(this, "Güvenli ev");
                        break;
                    case 2:
                        location = new Toolstore(this, "Mağaza");
                        break;
                    case 3:
                        location = new Cave(this);
                        break;
                    case 4:
                        location = new Forest(this);
                        break;
                    case 5:
                        location = new River(this);
                        break;
                    case 6:
                        as=false;
                    default:
                        System.out.println("Böyle bir bölge yoktur");
                }
                if(!location.onLocation()){
                    System.out.println("---------------------");
                    System.out.println("GAME OVER");
                    System.out.println("----------------------");
                    break;
                }
            }
    }
}
