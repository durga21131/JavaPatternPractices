import java.util.Scanner;

public class halfPyramidRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows or size of Half Pyramid(for better experiance you can enter 3 to 10) :");
        int row=sc.nextInt();
        // i for rows
        // j for columns
        for (int i=1; i<=row;i++){
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}System.out.println();
        }
	}

}