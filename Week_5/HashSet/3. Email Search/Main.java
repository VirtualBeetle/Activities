import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> emailSet=new HashSet<>();

		while(true){
			System.out.println("Enter Email address");
			String email=br.readLine();
            emailSet.add(email);

			System.out.println("Do you want to continue ?(yes/no)");
					String toContinue = br.readLine();
					if (toContinue.equals("no"))
						break;
		}

		System.out.println("Enter the email addresses to be searched separated by comma");
		String emailsToSearch[]=br.readLine().split(",");

		int count=0;
		for(int i=0;i<emailsToSearch.length;i++){
			if(emailSet.contains(emailsToSearch[i])) count++;
		}

		if(count==emailsToSearch.length){
			System.out.println("Email addresses are present");
		}else{
			System.out.println("Email addresses are not present");
		}
	}

}
