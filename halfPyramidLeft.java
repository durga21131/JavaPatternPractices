import java.util.Scanner;

public class halfPyramidLeft {

	public static void main(String[] args) {
		halfPyramidLeft p=new halfPyramidLeft();
		// p.m();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows or size of Half Pyramid(for better experiance you can enter 3 to 10) :");
        int row=sc.nextInt();
        // i for rows
        // j for columns
        
	}
		public void  m() {
        for(int i=1;i<=row;i++) {
        	for(int j=1;j<=row;j++) {
        		if(j<=i) {
        			System.out.print("*");
        		}
        	}System.out.println();
        }
		}
}
