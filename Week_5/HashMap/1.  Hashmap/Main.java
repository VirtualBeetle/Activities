import java.util.*;

class UserMainCode {
    public static int getSumOfEven(HashMap<Integer, Integer> map) {
        int sum = 0;
        for (int key : map.keySet()) {
            if (key % 2 == 0) {
                sum += map.get(key);
            }
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            map.put(key, value);
        }
        int sum = UserMainCode.getSumOfEven(map);
        System.out.println(sum);
        scanner.close();
    }
}
