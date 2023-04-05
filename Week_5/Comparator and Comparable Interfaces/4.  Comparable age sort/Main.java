import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of passengers");
    int n = sc.nextInt();
    Map<String, Integer> map = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      System.out.println("Enter the name of the passenger " + i);
      String name = sc.next();
      System.out.println("Enter the age of the passenger " + i);
      int age = sc.nextInt();
      map.put(name, age);
    }
    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
      @Override
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o1.getValue().equals(o2.getValue())) {
          return o2.getKey().compareTo(o1.getKey());
        } else {
          return o2.getValue().compareTo(o1.getValue());
        }
      }
    });
    System.out.println("Passengers Details by age(High to Low)");
    for (int i = 0; i < list.size(); i++) {
      Map.Entry<String, Integer> entry = list.get(i);
      System.out.println((i + 1) + " " + entry.getKey() + " " + entry.getValue());
    }
  }
}
