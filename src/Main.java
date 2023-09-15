import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player1 player = new Player1();
        Player1 player2 = new Player1();

        System.out.println("Attack " +player.attackRan);



        while(player.hp >= 0) {

            Scanner myScanner = new Scanner(System.in);
            System.out.println("press a to attack" );
            String svar = myScanner.nextLine();

            if (svar.equals("a")) {
                player.hp-=player.attackRan;
                System.out.println("HP: " +player.hp);
                System.out.println("do you want to hit again");
            }
        }

        System.out.println("You won!!!!");

    }
}