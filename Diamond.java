public class Diamond {

	public static void main(String[] args) {
		int input = 6;
		for (int i = 1; i <= input; i++) {
			// for spaces
			for (int j = 1; j <= input - i; j++) {
				System.out.print(" ");
			}
			// for stars
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}System.out.println();
		}
		for(int i=1;i<=input;i++) { 
			// for spaces
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			// for stars
			for(int j=1;j<=input-i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}