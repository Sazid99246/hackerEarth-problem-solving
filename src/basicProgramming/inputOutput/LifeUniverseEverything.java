package basicProgramming.inputOutput;

import java.util.Scanner;

public class LifeUniverseEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 42) {
                break;
            }

            System.out.println(n);

        }
        scanner.close();
    }
}
