import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no. of Books");
        int n = scanner.nextInt();

        List<Book> books = new ArrayList<>();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter the book details in CSV format");
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(",");
            String title = tokens[0];
            String category = tokens[1];
            String author = tokens[2];
            Double price = Double.parseDouble(tokens[3]);
            Book book = new Book(title, category, author, price);
            books.add(book);
        }

        scanner.close();

        Set<String> distinctTitles = new HashSet<>();
        List<Book> distinctBooks = new ArrayList<>();
        for (Book book : books) {
            if (!distinctTitles.contains(book.getTitle())) {
                distinctTitles.add(book.getTitle());
                distinctBooks.add(book);
            }
        }

        System.out.println("List of Distinct Books");
        System.out.format("%-20s %-20s %-10s %s\n","Title","Category","Author","Price");
        for (Book book : distinctBooks) {
            System.out.format("%-20s %-20s %-10s %.1f\n", book.getTitle(), book.getCategory(), book.getAuthor(), book.getPrice());
        }
    }
}
