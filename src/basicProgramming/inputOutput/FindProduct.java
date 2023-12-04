package basicProgramming.inputOutput;

import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        // Define the modulo value
        final int MODULO = 1000000007;

        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Initialize the product as 1
        long product = 1;

        // Loop to read array elements and calculate product
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            product = (product * num) % MODULO;
        }

        // Close the scanner
        scanner.close();

        // Print the final product modulo
        System.out.println(product);
    }
}
