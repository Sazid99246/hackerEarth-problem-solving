package basicProgramming.inputOutput;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt(); // Read the size of the array
        boolean isDivisible = false;

        for (int i = 0; i < N; i++) {
            int num = stdin.nextInt();
            int lastDigit = num % 10;

            if (i == N - 1) { // Check the last digit of the last number
                isDivisible = (lastDigit == 0);
            }
        }

        if (isDivisible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        stdin.close();
    }
}
