package Chapter01;

public class Triangle {

	static void triangleLB(int n) {
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void triangleLU(int n) {
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void triangleRU(int n) {
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= i - 1; j++) {
				System.out.print(' ');
			}
			for(int k=1; k <= n - i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void triangleRB(int n) {
	
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= n - i; j++) {
				System.out.print(' ');
			}
			for(int k=1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		//triangleLB(5); // 왼쪽 아래 직각
		//triangleLU(5); // 왼쪽 위가 직각
		//triangleRU(5); // 오른쪽 위가 직각
		//triangleRB(5); // 오른쪽 아래 직각
	}

}
