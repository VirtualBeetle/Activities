import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            hm.put(key, value);
        }
        UserMainCode.findPass(hm);
    }
}

class UserMainCode {
    public static void findPass(HashMap<Integer, Integer> hm) {
        for (int id : hm.keySet()) {
            int marks = hm.get(id);
            if (marks > 75) {
                System.out.println(id);
            }
        }
    }
}
