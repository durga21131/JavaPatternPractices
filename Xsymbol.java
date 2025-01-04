import java.util.Scanner;

public class Xsymbol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=1; j<=input;j++) {
				// For Stars
				
				if(i==j || i+j==input+1) {
					System.out.print("*");
				}else {
					// For Spaces

					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
