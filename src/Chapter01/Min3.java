package Chapter01;

import java.util.Scanner;

public class Min3 {
	public static void main(String[] args) {
		Scanner Std = new Scanner(System.in);
		System.out.print("Input a Number! : "); int a = Std.nextInt();
		System.out.print("Input b Number! : "); int b = Std.nextInt();
		System.out.print("Input c Number! : "); int c = Std.nextInt();
		
		System.out.println("Min number is " + min3(a, b, c));
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		return c;
	}
}
