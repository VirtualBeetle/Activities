import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the cost of the item for n days");
        int cost=s.nextInt();

        try {
            System.out.println("Enter the value of n");
            int days=s.nextInt();

            System.out.println("Cost per day of the item is "+(cost/days));
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
