public class reversehalfPyramidLeft {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
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
}