import java.util.Scanner;
public class ReversePyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*(input-i)+1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
