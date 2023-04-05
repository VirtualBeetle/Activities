import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of address:");
        int n = scan.nextInt();
        scan.nextLine();
        
        Map<String, Map<String, Integer>> stateCityCountMap = new TreeMap<>();
        
        for(int i=0;i<n;i++){
            System.out.println("Enter the address:");
            String[] address = scan.nextLine().split(",");
            String city = address[1];
            String state = address[2];
            
            Map<String, Integer> cityCountMap = stateCityCountMap.getOrDefault(state, new TreeMap<>());
            int count = cityCountMap.getOrDefault(city, 0);
            cityCountMap.put(city, count+1);
            stateCityCountMap.put(state, cityCountMap);
        }
        
        System.out.println("Number of entries in city/state wise:\n");
        for(String state : stateCityCountMap.keySet()){
            System.out.println("State:" + state);
            Map<String, Integer> cityCountMap = stateCityCountMap.get(state);
            for(String city : cityCountMap.keySet()){
                System.out.println("City:" + city + " Count:" + cityCountMap.get(city));
            }
            System.out.println();
        }
    }
}
