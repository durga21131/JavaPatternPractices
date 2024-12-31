import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			// for spaces
			for (int j = 1; j <= input - i; j++) {
				System.out.print(" " + " ");
			}
			// for decreasing numbers
			for (int j = input; j >= input - i + 1; j--) {
				System.out.print(" " + j);
			}
            // for increasing numbers
			for (int j = input - i + 2; j <= input; j++) {
				System.out.print(" " + j);
			}

			System.out.println();
		}
	}
}
