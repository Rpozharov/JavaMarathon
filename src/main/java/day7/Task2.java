package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player player1 = new Player(random.nextInt(11) + 90);
        Player player2 = new Player(random.nextInt(11) + 90);
        Player player3 = new Player(random.nextInt(11) + 90);
        Player player4 = new Player(random.nextInt(11) + 90);
        Player player5 = new Player(random.nextInt(11) + 90);
        Player player6 = new Player(random.nextInt(11) + 90);

        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());

        while (player6.getStamina() != 0) {
            player6.run();
        }

        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());

        Player.info();
    }
}