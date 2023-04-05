import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        Integer[] intArr = new Integer[n];
        System.out.println("Enter integers one by one");
        for (int i = 0; i < n; i++) {
            intArr[i] = scanner.nextInt();
        }
        Double[] doubleArr = new Double[n];
        System.out.println("Enter double values one by one");
        for (int i = 0; i < n; i++) {
            doubleArr[i] = scanner.nextDouble();
        }
        System.out.println("Printing Integer Array");
        printArray(intArr);
        System.out.println("Printing Double Array");
        printArray(doubleArr);
    }

    public static <E extends Comparable<E>> void printArray(E[] elements) {
        // Sort the array
        java.util.Arrays.sort(elements);

        // Print the sorted array
        for (E element : elements) {
            System.out.println(element);
        }
    }
}
