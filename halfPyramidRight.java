import java.util.Scanner;
public class halfPyramidRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		// i for rows
		// j for columnsfor (int i = 1; i <= row; i++) {
			// for spaces
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			//for stars
			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
		}
		
	}
}
	