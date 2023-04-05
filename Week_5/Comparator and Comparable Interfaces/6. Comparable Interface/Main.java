import java.util.*;

class Address implements Comparable<Address> {
    private String username;
    private String addressLine1;
    private String addressLine2;
    private Integer pinCode;

    public Address() {}

    public Address(String username, String addressLine1, String addressLine2, Integer pinCode) {
        this.username = username;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.pinCode = pinCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int compareTo(Address other) {
        int pinCodeComparison = this.pinCode.compareTo(other.getPinCode());
        if (pinCodeComparison == 0) {
            return this.addressLine1.compareTo(other.getAddressLine1());
        } else {
            return pinCodeComparison;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        List<Address> addressList = new ArrayList<>();
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
           
        for (int i = 0; i < n; i++) {
             String[] parts = scanner.nextLine().split(",");
            String username = parts[0];
            String addressLine1 = parts[1];
            String addressLine2 = parts[2];
            int pinCode = Integer.parseInt(parts[3]);
            Address address = new Address(username, addressLine1, addressLine2, pinCode);
            addressList.add(address);
        }

        Collections.sort(addressList);

        System.out.println("User Details:");
        for (Address address : addressList) {
            System.out.println(address.getUsername() + "," + address.getAddressLine1() + "," +
                    address.getAddressLine2() + "," + address.getPinCode());
        }
    }
}
