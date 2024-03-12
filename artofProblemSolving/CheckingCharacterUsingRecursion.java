package artofProblemSolving;

import java.util.Scanner;

public class CheckingCharacterUsingRecursion {

	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String");
		String string=scanner.nextLine();
		
		System.out.println("Enter Character");
		char character=scanner.next().charAt(0);
		
		System.out.println( contains( string, character ) );
		scanner.close();
	}
	public static boolean contains(String string, char ch) 
	{
		if(string.length()==1) {
			if(string.charAt(string.length()-1)==ch)
				return true;
				
			return false;
		}
		if(string.charAt(string.length()-1)==ch)
			return true;
		
		return contains(string.substring(0,string.length()-1),ch);
	}
}
