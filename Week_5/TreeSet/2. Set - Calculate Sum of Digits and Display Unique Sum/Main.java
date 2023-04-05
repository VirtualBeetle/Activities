import java.util.*;

class NumberSet {
    private Set<Integer> numberSet;
    
    public NumberSet() {
        numberSet = new HashSet<Integer>();
    }
    
    public void insertElement(Integer num) {
        numberSet.add(num);
    }
    
    public SortedSet<Integer> getSumDigits() {
        SortedSet<Integer> sumSet = new TreeSet<Integer>();
        for (Integer num : numberSet) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            sumSet.add(sum);
        }
        return sumSet;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of integers:");
        int n = scanner.nextInt();
        
        NumberSet numSet = new NumberSet();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numSet.insertElement(num);
        }
        
        System.out.println("Unique digit sum");
        SortedSet<Integer> sumSet = numSet.getSumDigits();
        for (int sum : sumSet) {
            System.out.println(sum);
        }
    }
}
