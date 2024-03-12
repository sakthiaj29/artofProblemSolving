package artofProblemSolving;

import java.util.Scanner;

public class AllOffByOneUsingRecursion {

	public static boolean allOffByOne(int[] array1, int[] array2, int index){
		
		if(array1[index]+1 != array2[index] || array1.length != array2.length) 
			return false;
		
		if(array1.length-1==index)
			return (array1[index]+1 == array2[index]);

		return allOffByOne(array1, array2, index+1);
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int len1=0,len2=0;
		System.out.println("Enter array1 length");
		len1=scanner.nextInt();
		int[] array1 = new int[len1];
		
		System.out.println("Enter array2 length");
		len2=scanner.nextInt();
		int[] array2 = new int[len2];
		
		System.out.println("enter array1 elements");
		
		for(int i=0;i<len1;i++) 
			array1[i]=scanner.nextInt();
		
		System.out.println("enter array2 elements");
		
		for(int i=0;i<len2;i++) 
			array2[i]=scanner.nextInt();

		System.out.println("\nResult: "+allOffByOne( array1, array2, 0));
		scanner.close();
	}
}
