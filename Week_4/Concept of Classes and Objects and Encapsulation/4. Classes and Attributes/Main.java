import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obtain the details of the country
        System.out.println("Enter the country name");
        String name = scanner.nextLine();
        System.out.println("Enter the country code");
        String countryCode = scanner.nextLine();
        System.out.println("Enter the isd code");
        String isdCode = scanner.nextLine();
        
        // Create an object for Country class using parameterized constructor
        Country country = new Country(name, countryCode, isdCode);
        
        // Call the method display() in the Main class
        country.display();
        
        scanner.close();
    }
}
