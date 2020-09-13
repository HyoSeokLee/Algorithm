package Chapter01;

import java.util.Scanner;

public class Prac_Median {
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
	public static void main(String[] args) {
		Scanner Std = new Scanner(System.in);
		
		System.out.print("Input a Number : "); int a = Std.nextInt();
		System.out.print("Input b Number : "); int b = Std.nextInt();
		System.out.print("Input c Number : "); int c = Std.nextInt();
		
		System.out.println("Middle Number is " + med3(a, b, c));
	}
}
