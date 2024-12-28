import java.util.Scanner;

public class Triangel {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int input=sc.nextInt();
	 for(int i=1;i<=input;i++) {
		 for(int j=1;j<=(2*input)-1;j++) {
			// for stars
			 if(i==input || i+j==input+1 || j-i==input-1 ) {
				 System.out.print("*");
			 }
			 else {
				// for spaces
				 System.out.print(" ");
			 }
		 }System.out.println();
	 }
	}

}
