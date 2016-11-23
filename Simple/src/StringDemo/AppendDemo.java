package StringDemo;

import java.util.*;

public class AppendDemo {

	

	public static void main(String[] args) {
		
		
		System.out.println("Enter your username: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String username = scanner.nextLine();
		
		StringBuffer sb=new StringBuffer(username);
		
		sb.append(" Saxena");
		
		System.out.println(sb);

		
		scanner.close();
		

	}

}
