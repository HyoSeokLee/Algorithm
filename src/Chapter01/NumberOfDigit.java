package Chapter01;

import java.util.Scanner;

public class NumberOfDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("Input Number : ");
			num = input.nextInt();
		} while(num <= 0);
		
		int cnt = 0;
		while(num > 0) {
			num /= 10;
			cnt++;
		}
		
		System.out.println("입력하신 수는 " + cnt + " 자리 입니다.");
	}
}
