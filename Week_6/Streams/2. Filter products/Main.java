import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //fill your code here
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter the maximum price of the product");
        Double num=Double.parseDouble(br.readLine());
        List<Product>mainList=new Product().filterProducts(num);
        if(mainList.isEmpty()){
            System.out.println("No products found within the given price");
        }
        else{
        System.out.println("List of Filtered Products");
        System.out.printf("%-20s %-20s %-20s %-10s %s\n","Name","Brand","Category","Color","Price");
        for(Product p : mainList){
            System.out.print(p.toString());
        }
        }
    }
}
