public class Customer {
    public String customerName;
    public String customerEmail;
    public String customerType;
    public String customerAddress;

    // default constructor
    public Customer() {}

    // parameterized constructor
    public Customer(String customerName, String customerEmail, String customerType, String customerAddress) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.customerName);
        System.out.println("E-mail: " + this.customerEmail);
        System.out.println("Type: " + this.customerType);
        System.out.println("Location: " + this.customerAddress);
    }
}
