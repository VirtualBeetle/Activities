import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<String> list = new LinkedList<>();

		System.out.println("Enter the number of participants to be registered : ");
		int n = Integer.parseInt(br.readLine());

		System.out.println("Enter the participants details");
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			String arr[] = input.split("_");

			if (arr[2].length()==7 && (arr[1].equals("IT") || arr[1].equals("CSE") || arr[1].equals("ECE"))) {
				list.add(input);
			}
		}

		if (list.size() == 0) {
			System.out.println("No valid participants");
		} else {
			System.out.println("List of valid participants");
			list.forEach(participant -> System.out.println(participant));
		}

	}

}
