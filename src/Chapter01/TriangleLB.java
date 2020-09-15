package Chapter01;

public class TriangleLB {
	public static void main(String[] args) {
		triangleLB(5);
	}
	
	static void triangleLB(int n) {
	
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}
