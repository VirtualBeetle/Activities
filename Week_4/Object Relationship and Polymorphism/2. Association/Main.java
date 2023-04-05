import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student name:");
        String name = scanner.nextLine();

        System.out.println("Enter the register number:");
        Integer registerNo = scanner.nextInt();

        System.out.println("Enter the course id:");
        Integer id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the course name:");
        String courseName = scanner.nextLine();

        Student student = new Student(name, registerNo);
        Course course = new Course(id, courseName);

        student.display(course);
    }
}
