package basicProgramming.implementation;

import java.util.Scanner;

public class CountInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.valueOf(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < T; i++) {
            String s = scanner.nextLine();
            char k = scanner.nextLine().charAt(0);
            char[] arrayOfS = s.toCharArray();

            for (int j = 0; j < arrayOfS.length; j++) {
                if (arrayOfS[j] == k) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
        scanner.close();
    }
}
