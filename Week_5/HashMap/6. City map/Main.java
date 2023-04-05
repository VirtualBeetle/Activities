import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception
    {
        //fill your code here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of address");
        int n = sc.nextInt();
        sc.nextLine();
        
        Map<String, List<Address>> cityAddressMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the address " + (i+1) + " detail");
            String[] addressDetails = sc.nextLine().split(",");
            Address address = new Address(addressDetails[0], addressDetails[1], addressDetails[2], addressDetails[3], Integer.parseInt(addressDetails[4]));
            Address.generateCityAddressMap(cityAddressMap, address);
        }
        
        System.out.println("Enter the city to be searched");
        String city = sc.nextLine();
        
        List<Address> addressList = Address.searchCity(cityAddressMap, city);
        if (addressList == null) {
            System.out.println("Searched city not found");
        } else {
            System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Line 1", "Line 2", "City", "State", "Pincode");
            for (Address address : addressList) {
                System.out.printf("%-15s %-15s %-15s %-15s %s\n", address.getAddressLine1(), address.getAddressLine2(), address.getCity(), address.getState(), address.getPincode());
            }
        }
    
    }
}
