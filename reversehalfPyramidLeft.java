public class reversehalfPyramidLeft {
    public static void main(String[] args) {
		reversehalfPyramidLeft p = new reversehalfPyramidLeft();
		// p.m();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of rows or size of  Reverse Half Pyramid Left :");
		int row=sc.nextInt();
		// i for rows
		// j for columns
		for(int i=0;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("*");
				}
	        System.out.println();
		}
	}
	// another way
	public void m() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}