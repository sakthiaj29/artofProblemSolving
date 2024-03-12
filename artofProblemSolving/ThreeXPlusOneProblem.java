package artofProblemSolving;

import java.util.Scanner;

public class ThreeXPlusOneProblem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a number");
		int start=scanner.nextInt();
		
		System.out.print("Result: ");
		
		while(start != 1) 
		{
			System.out.print(start+", ");
			if(start%2 == 0)
				start/=2;
			else
				start = 3*start+1;
		}
		System.out.print("1");
		scanner.close();
	}

}
