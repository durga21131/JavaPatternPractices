import java.util.Scanner;
public class reverseHalfPyramidRight {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows or size of  Reverse Half Pyramid Right :");
		int row = sc.nextInt();
		// i for rows
		// j for columns
		for (int i = 1; i <= row; i++) {
			// for spaces
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			// for stars
			for (int j = 0; j <= row - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}