package Chapter01;

import java.util.Scanner;

public class Minus {
	static int minus(int a, int b) {
		return b-a;
	}
	
	public static void main(String[] args) {
		int num1, num2 = 0;
		Scanner std = new Scanner(System.in);
		
		System.out.print("Input a : ");
		num1 = std.nextInt();
		
		while(true) {
			System.out.print("Input b : ");
			num2 = std.nextInt();
		
			if(num2 > num1) {
				break;
			}
			
			System.out.println("a보다 큰 값을 입력");
		}
		
		
		System.out.println(num2 + " - " + num1 + " = " + minus(num1, num2));
	}

}
