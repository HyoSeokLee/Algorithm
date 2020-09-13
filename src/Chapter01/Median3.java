package Chapter01;

import java.util.Scanner;

public class Median3 {
	private static Scanner inputnum;

	static int median3(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
	
	public static void Main(String[] args) {
		inputnum = new Scanner(System.in);
		
		System.out.print("Input three number : ");
		int a = inputnum.nextInt();
		int b = inputnum.nextInt();
		int c = inputnum.nextInt();
		
		System.out.println("Middle Number is " + median3(a, b, c));
	}
}