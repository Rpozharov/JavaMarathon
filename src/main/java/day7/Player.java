package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        final int teamSize = 6;
        int seatsCount = teamSize - countPlayers;
        if (countPlayers < teamSize) {
            if (seatsCount == 1) {
                System.out.printf("Команды неполные. На поле еще есть %d свободное место%n", seatsCount);
            } else if (seatsCount > 1 && seatsCount < 5) {
                System.out.printf("Команды неполные. На поле еще есть %d свободных места%n", seatsCount);
            } else {
                System.out.printf("Команды неполные. На поле еще есть %d свободных мест%n", seatsCount);
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}