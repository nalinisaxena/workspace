package CollectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PincodeDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(300, "Indore");
		hm.put(200, "Bhopal");
		hm.put(100, "Pune");
		

		while (true) {
			System.out.println("enter the pin code");

			Scanner sc = new Scanner(System.in);
			int i = sc.nextLine();

			if (hm.containsKey(i)) {
				System.out.println(hm.get(i));
			} else {
				break;
			}

		}
		
		
		// for(Map.Entry m:hm.entrySet())
		// {
		// System.out.println("enter the pin code");
		//
		// Scanner sc=new Scanner(System.in);
		// int i=sc.nextInt();
		//
		// if(hm.containsKey(i))
		// {
		// System.out.println(m.getKey()+" "+m.getValue());
		// }
		// else
		// {
		// System.out.println("your pin code is not valid");
		// }
		//
		//
		// }
		//

	}

}