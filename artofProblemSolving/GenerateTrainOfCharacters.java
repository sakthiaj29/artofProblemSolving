package artofProblemSolving;

import java.util.Scanner;

public class GenerateTrainOfCharacters {

	public static String repeat(char ch, int len) 
	{
		String result="";
		
		for(int i=0;i<len;i++)
			result=result+ch;
		
		return result;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Odd length String");
		String input = scanner.nextLine();
		int mid=input.length()/2+1;
		String left="", right="", output=""+input.charAt(mid-1);
		
		for(int i=0 ; i < input.length()/2 ; i++) 
		{
			left +=  repeat(input.charAt(i), mid);
			right = repeat(input.charAt(input.length()-i-1), mid)+right;
			mid--;
		}
		
		output=left+output+right;
		System.out.println("Result: "+output);
		scanner.close();
	}

}
