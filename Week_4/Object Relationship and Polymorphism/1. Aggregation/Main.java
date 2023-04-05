import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter the name of the staff:");
        String staffName = scanner.nextLine();
        
        System.out.println("Enter the staff designation:");
        String designation = scanner.nextLine();
        
        System.out.println("Enter the department name:");
        String departmentName = scanner.nextLine();
        
        // Create objects
        Staff staff = new Staff(staffName, designation);
        Department department = new Department(departmentName, staff);
        
        // Call displayStaff() method
        department.displayStaff();
    }
}
