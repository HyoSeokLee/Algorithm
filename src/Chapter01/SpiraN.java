package Chapter01;

public class SpiraN {
	
	static void spira(int n) {
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= n - i; j++) {
				System.out.print(' ');
			}
			for(int k=1; k <= (i-1) * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void spira_Num(int n) {
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= n - i; j++) {
				System.out.print(' ');
			}
			for(int k=1; k <= (i-1) * 2 + 1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		spira(4);
		spira_Num(4);
		
	}

}
