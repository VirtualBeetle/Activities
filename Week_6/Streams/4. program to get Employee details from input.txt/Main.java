import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(new File("input.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] tokens = line.split(",");
                Employee emp = new Employee(tokens[0], Double.parseDouble(tokens[1]));
                employeeList.add(emp);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }
        System.out.format("%-10s %s\n", "Name", "Salary");
        for (Employee emp : employeeList) {
            System.out.format("%-10s %.1f\n", emp.getName(), emp.getSalary());
        }
    }
}
