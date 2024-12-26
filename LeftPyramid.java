import java.util.Scanner;

public class LeftPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of cloumns");
		int row = sc.nextInt();
		sc.close();
		for (int i = 1; i <= row; i++) {
			// for stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i = 1; i <= row; i++) {
			// for stars
			for (int j = 1; j <= row-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}