import java.util.Scanner;
import java.util.TreeMap;

class Player {
    private String name;
    private String team;
    private String skill;

    public Player(String name, String team, String skill) {
        this.name = name;
        this.team = team;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getSkill() {
        return skill;
    }

    public String toString() {
        return name + "--" + team + "--" + skill;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        TreeMap<String, Player> playerMap = new TreeMap<>();

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter the details of the player " + (i + 1));
            String capNumber = scanner.nextLine();
            String name = scanner.nextLine();
            String team = scanner.nextLine();
            String skill = scanner.nextLine();

            Player player = new Player(name, team, skill);
            playerMap.put(capNumber, player);
        }

        System.out.println("Player Details");
        for (String capNumber : playerMap.keySet()) {
            Player player = playerMap.get(capNumber);
            System.out.println(capNumber + "--" + player.toString());
        }
    }
}
