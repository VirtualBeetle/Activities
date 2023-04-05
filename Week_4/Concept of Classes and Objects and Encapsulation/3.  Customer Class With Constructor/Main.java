import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {

				//Fill your code
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Customer Details");

        System.out.print("Enter the name ");
        String name = scanner.nextLine();

        System.out.print("Enter the email ");
        String email = scanner.nextLine();

        System.out.print("Enter the type");
        String type = scanner.nextLine();

        System.out.print("Enter the location ");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, email, type, address);
        customer.displayDetails();

	}
}


