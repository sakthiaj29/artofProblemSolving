package artofProblemSolving;

import java.util.Scanner;

public class FindSquareRoot {
	
	public static int findSquareRoot(int n) {
 
        float start = 1, end = n/2;
        
        while (start <= end) {
            float mid = (start + end) / 2;
            
            if (mid * mid == n)
            	return Math.round(mid);
            
            else if (mid * mid <= n)
                start = (float)(mid+0.1);
                
            else 
                end = (float)(mid-0.1);
        }
        return Math.round(start);
    }
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter number");
        int number = scanner.nextInt(); 
        int squareRoot = findSquareRoot(number);
        
        System.out.println("Square root of " + number + " is " + squareRoot);
        scanner.close();
    }

}
