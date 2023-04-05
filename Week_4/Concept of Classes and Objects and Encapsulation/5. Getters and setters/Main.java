import java.util.Scanner;

class Player {
    private String name;
    private Integer age;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("Enter Name:");
        player.setName(scanner.nextLine());

        System.out.println("Enter Age:");
        player.setAge(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter Country:");
        player.setCountry(scanner.nextLine());

        System.out.println("Player Details:");
        System.out.println("Name:" + player.getName());
        System.out.println("Age:" + player.getAge());
        System.out.println("Country:" + player.getCountry());

        scanner.close();
    }
}
