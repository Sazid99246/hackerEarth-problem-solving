package basicProgramming.inputOutput;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = scanner.nextInt();

        int countDivisors = 0;

        for (int i = l; i <= r; i++) {
            if (i % k == 0) {
                countDivisors++;
            }
        }

        System.out.println(countDivisors);
        scanner.close();
    }
}
