import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows of pyramid");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			// for spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			// for stars
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
