package basicProgramming.inputOutput;

import java.util.Scanner;

public class Zoos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countZ = 0;
        int countO = 0;
        String stdin = scanner.nextLine();
        scanner.close();
        char[] zooArray = stdin.toCharArray();

        for (int i = 0; i < zooArray.length; i++) {
            if (zooArray[i] == 'z') {
                countZ++;
            } else {
                countO++;
            }
        }

        if (countO == 2 * countZ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
