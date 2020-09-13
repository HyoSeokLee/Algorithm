package Chapter01;

import java.util.Scanner;

public class Max4 {
	public static void main(String[] args) {
		Scanner Std = new Scanner(System.in);
		System.out.print("Input a Number !  "); int a = Std.nextInt();
		System.out.print("Input b Number ! "); int b = Std.nextInt();
		System.out.print("Input c Number ! "); int c = Std.nextInt();
		System.out.print("Input d Number ! "); int d = Std.nextInt();
		
		System.out.println("Max Number is " + max4(a, b, c, d));
		
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
}