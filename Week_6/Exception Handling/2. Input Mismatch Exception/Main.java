import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter an integer input");
            int n = s.nextInt();
            System.out.println("Entered value is "+n);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
