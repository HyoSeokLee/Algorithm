package Chapter01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		
		System.out.println("1부터 n까지 더한다.");
		System.out.print("n 입력 : "); int n = stdInt.nextInt();
		
		int sum = 0;
		
		for(int i=1; i <= n; i++) {
			sum += i;
			if(i < n)
				System.out.print(i + " + ");
			if(i == n)
				System.out.print(i);
		}
		
		System.out.println(" = " + sum);
	}
}
