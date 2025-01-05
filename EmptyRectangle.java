import java.util.Scanner;

public class EmptyRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input; j++) {
				// For Stars
				if (i == 1 || j == 1 || i == input || j == input) {
					System.out.print("*");
				} 
				// For Spaces
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
