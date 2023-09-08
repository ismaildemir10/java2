import AdventureGame.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Oyuna hoşgeldiniz girmek istediğiniz ismi giriniz");
        //String name = inp.nextLine();
        Player player = new Player("icd");
        System.out.println(player.getName()+ " hoşgeldiniz");
        System.out.println("Macera oyununa hoşgeldiniz\n" +
                "Seçmek istediğiniz karakteri belirtininz\n" +
                "1- Samuray\n" +
                "2- Okçu\n" +
                "3- Şovalye\n");
        int select = inp.nextInt();
        player.selectChar(select);
        player.selectLoc();




    }
}