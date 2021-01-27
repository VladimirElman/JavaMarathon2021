package day7;

public class Player {
    private int stamina;
    private final int maxStamina = 100;
    private final int minStamina = 0;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;

    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные, есть еще " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("Больше мест нет");
        }

    }

    public int getStamina() {
        return stamina;
    }


    public void setStamina(int stamina) {
        this.stamina = stamina;
    }


}
