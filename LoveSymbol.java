import java.util.Scanner;

public class LoveSymbol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the heart: ");
        int size = sc.nextInt();
        // Upper part of the heart
        for (int i = size / 2; i <= size; i += 2) {
            // Left spaces
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            // Left half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Right half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         // Lower part of the heart
        for (int i = size; i >= 1; i--) {
            // Leading spaces
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Bottom part
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            // for linebreak
            System.out.println();
        }
        sc.close();
    }
}
