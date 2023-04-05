public class Country {
    public String name;
    public String countryCode;
    public String isdCode;
    
    // Default Constructor
    public Country() {
        this.name = "";
        this.countryCode = "";
        this.isdCode = "";
    }
    
    // Parameterized Constructor
    public Country(String name, String countryCode, String isdCode) {
        this.name = name;
        this.countryCode = countryCode;
        this.isdCode = isdCode;
    }
    
    // Method to display country details
    public void display() {
        System.out.println("Country Name : " + this.name);
        System.out.println("Country Code : " + this.countryCode);
        System.out.println("ISD Code : " + this.isdCode);
    }
}
