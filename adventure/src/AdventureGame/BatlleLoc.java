package AdventureGame;

import java.util.Random;
import java.util.Scanner;

public abstract class BatlleLoc extends Location{
    Scanner inp = new Scanner(System.in);
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    BatlleLoc(Player player,String name, Obstacle obstacle, String award,int maxObstacle){
        super(player,name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacle();
        boolean sas=true;
        while(getPlayer().getHealthy()>0) {
        System.out.println("Şuan buradasınız " + this.getName());
        System.out.println("Dikkatli olunuz burada "+ obsNumber+" tane "+this.getObstacle().getName());
            System.out.println("<S>avaş veya <K>aç");
            String seleckCase = inp.nextLine();
            seleckCase = seleckCase.toUpperCase();
            if (seleckCase.equals("S") && combat(obsNumber) && getPlayer().getHealthy() > 0) {
                System.out.println(this.getName() + " tüm düşmanları yendiniz");
                return sas;
            }
            else if (!combat(obsNumber)&&seleckCase.equals("K")&&getPlayer().getHealthy() > 0) {
                System.out.println("Kaçtınız");
                return sas;
            }else {

                sas = false;
            }
        }
        return sas;
    }
    public void playerStat(){
        System.out.println("Oyuncu değerleri");
        System.out.println("Sağlık:" + this.getPlayer().getHealthy());
        System.out.println("Darbe: "+ this.getPlayer().getDamage());
        System.out.println("Para"+this.getPlayer().getMoney());
    }
    public void obstacleStat(){
        System.out.println("Canavarın değerleri");
        System.out.println("Sağlık:" + this.getObstacle().getHealty());
        System.out.println("Darbe: "+ this.getObstacle().getDamage());
        System.out.println("Ödül: "+this.getObstacle().getAward());
    }
    public void afterHit(){
        System.out.println("--------------------------------------");
        System.out.println("Canınız: "+ this.getPlayer().getHealthy());
        System.out.println(this.getObstacle().getName()+" canı:"+this.getObstacle().getHealty());
    }
    public boolean deadPlayer(){
        if(this.getPlayer().getHealthy()<=0){
            this.getPlayer().setHealthy(0);

        }
            return false;
    }

    public boolean combat(int obsNumber){
        for(int i=0;i<obsNumber;i++) {
            this.getObstacle().setHealty(this.getObstacle().getOrgiHealty());
            playerStat();
            obstacleStat();
            while(getPlayer().getHealthy()>0&&getObstacle().getHealty()>0){
                System.out.println("<V>ur veya <K>aç");
                String select = inp.nextLine();
                select =select.toUpperCase();
                if(select.equals("V")&&getPlayer().getHealthy()>0){
                    System.out.println("Siz vurdunuz ");
                    this.getObstacle().setHealty((this.getObstacle().getHealty()-this.getPlayer().getDamage()));
                    afterHit();
                    if(this.getObstacle().getHealty()>0){
                        System.out.println("Canavar size vurdu");
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy()-this.getObstacle().getDamage());
                        afterHit();
                        if(this.getPlayer().getHealthy()<=0){
                            System.out.println("-------------");
                            System.out.println("Öldünüz");
                            System.out.println("-------------");
                            return false;
                        }
                    }
                } if (select.equals("K")&&getPlayer().getHealthy()>0) {
                    return false;
                }
            }if(getObstacle().getHealty()<getPlayer().getHealthy()){
                System.out.println("Düşmanı yendiniz.");
            }


        }
        return true;
    }
    public int randomObstacle(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }

}
