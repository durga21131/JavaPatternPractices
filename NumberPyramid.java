import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			// For Spaces
			for (int j = 1; j <= input - i; j++) {
				System.out.print(" " + " ");
			
             // for line break
			System.out.println();
		}
	}
}
