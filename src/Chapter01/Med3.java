package Chapter01;

import java.util.Scanner;

public class Med3 {
	static int med3(int a, int b, int c) {
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
		Scanner StdInt = new Scanner(System.in);
		
		System.out.print("Input three number : ");
		int a = StdInt.nextInt();
		int b = StdInt.nextInt();
		int c = StdInt.nextInt();
		
		System.out.println("Middle Number is " + med3(a, b, c));
	}
}