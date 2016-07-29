//Is your word a palindrome?

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) { 
		Scanner scan1 = new Scanner(System.in);
		String s = scan1.nextLine();
		StringBuilder sb =new StringBuilder(s);
			sb.reverse();
			String s1 = sb.toString();
		boolean entry=s.equalsIgnoreCase(s1);
      System.out.println(entry);
      
      
		/*String s = scan1.nextLine();
		
		for(int i = 0; i<=s.length()-4; i++){
			char x = s.charAt(i);
			System.out.println(x);
		}
		//char x= 0;
		//System.out.println();
*/	}

}
