
import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Address addr = new Address();

        System.out.println("Enter Customer Address");

        System.out.println("Enter the street");
        addr.street = sc.nextLine();

        System.out.println("Enter the city");
        addr.city = sc.nextLine();

        System.out.println("Enter the pincode");
        addr.pincode = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the country");
        addr.country = sc.nextLine();

        addr.displayAddress();
	}

}
