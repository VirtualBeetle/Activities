import java.util.*;

class Bowler {
    private String name;

    public Bowler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Wicket {
    private String playerName;
    private Bowler bowler;

    public Wicket(String description, Bowler bowler) {
        this.playerName = description;
        this.bowler = bowler;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Bowler getBowler() {
        return bowler;
    }

    public void setBowler(Bowler bowler) {
        this.bowler = bowler;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Wicket>> wicketsMap = new HashMap<>();
        String choice = "yes";

        while (choice.equals("yes")) {
            System.out.println("Enter the player name");
            String playerName = sc.nextLine();

            System.out.println("Enter wickets - seperated by \"|\" symbol");
            String wicketsStr = sc.nextLine();

            String[] wicketsArr = wicketsStr.split("\\|");
            List<Wicket> wicketsList = new ArrayList<>();

            for (String wicket : wicketsArr) {
                Bowler bowler = new Bowler(playerName);
                Wicket wicketObj = new Wicket(wicket.trim(), bowler);
                wicketsList.add(wicketObj);
            }

            wicketsMap.put(playerName, wicketsList);

            System.out.println("Do you want to add another player (yes/no)");
            choice = sc.nextLine();
        }

        choice = "yes";

        while (choice.equals("yes")) {
            System.out.println("Enter the player name to search");
            String searchName = sc.nextLine();

            if (!wicketsMap.containsKey(searchName)) {
                System.out.println("No player found with the name " + searchName);
            } else {
                List<Wicket> wicketsList = wicketsMap.get(searchName);

                System.out.println("Player Name : " + searchName);
                System.out.println("Wickets :");

                for (Wicket wicket : wicketsList) {
                    System.out.println(wicket.getPlayerName());
                }
            }

            System.out.println("Do you want to search another player (yes/no)");
            choice = sc.nextLine();
        }
    }
}
