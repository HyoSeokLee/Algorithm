package Chapter01;

import java.util.Scanner;

public class SumOf {
	static int sumof(int a, int b) {
		int sum = 0;
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner Std = new Scanner(System.in);
		
		System.out.print("Input two number : ");
		int num1 = Std.nextInt();
		int num2 = Std.nextInt();
		
		System.out.println("두 숫자 포함 정수의 합은 " + sumof(num1, num2));
	}
}
