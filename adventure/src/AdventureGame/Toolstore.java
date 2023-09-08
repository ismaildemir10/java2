package AdventureGame;

import java.util.Scanner;

public class Toolstore extends NormalLocation{
    Scanner inp = new Scanner(System.in);
    Toolstore(Player player,String name){
        super(player,"Mağaza");
    }
    public void buyWeapon(int damage,int money){
        if(getPlayer().getMoney()>money){
            getPlayer().setDamage( getPlayer().getDamage()+damage);
            getPlayer().setMoney(getPlayer().getMoney()-money);
            System.out.println("yeni hasar değeri: "+getPlayer().getDamage()+
                    "\nyeni para miktarı: "+getPlayer().getMoney());
        }else{
            System.out.println("Paranız "+money+" coinden düşük tabancayı alamazsınız ");
        }
    }
    public void buyArmour(int block,int money){
        if(getPlayer().getMoney()>money){
            getPlayer().setHealthy( getPlayer().getHealthy()+block);
            getPlayer().setMoney(getPlayer().getMoney()-money);
            System.out.println("yeni canınızın değeri: "+getPlayer().getHealthy()+
                    "\nyeni para miktarı: "+getPlayer().getMoney());
        }else{
            System.out.println("Paranız "+money+" coinden düşük tabancayı alamazsınız ");
        }
    }
    @Override
    public boolean onLocation(){
        boolean as=true;
        while (as) {
            System.out.println("Mağazaya girdiniz istediğiniz malzemeyi alabilirsiniz!");
            System.out.println("1-Silahlar\n2-Zırhlar\n3-Çıkış");
            int bottom = inp.nextInt();
            switch (bottom) {
                case 1:
                    System.out.println("Seçmek istediğiniz silahı belirtiniz\n" +
                            "1- Tabanca\t hasar=2\t para=25\n" +
                            "2- Kılıç\t hasar=3\t para=35\n" +
                            "3- Tüfek\t hasar=7\t para=45");
                    int sWeaponArmour = inp.nextInt();
                    switch (sWeaponArmour) {
                        case 1:
                            buyWeapon(2, 25);
                            break;
                        case 2:
                            buyWeapon(3, 35);
                            break;
                        case 3:
                            buyWeapon(7, 45);
                            break;
                        default:
                    }
                    break;
                case 2:
                    System.out.println("Seçmek istediğiniz silahı belirtiniz\n" +
                            "1- Hafif \t engelleme=1\t para=25\n" +
                            "2- Orta \t engelleme=3\t para=35\n" +
                            "3- Ağır \t engelleme=5\t para=45");
                    sWeaponArmour = inp.nextInt();
                    switch (sWeaponArmour) {
                        case 1:
                            buyArmour(1, 15);
                            break;
                        case 2:
                            buyArmour(3, 25);
                            break;
                        case 3:
                            buyArmour(5, 40);
                            break;
                        default:
                    }
                    break;
                case 3:
                    as=false;
                    break;
                default:
                    System.out.println("Yanlış işlem seçtiniz");
            }
        }
        return true;
    }

}
