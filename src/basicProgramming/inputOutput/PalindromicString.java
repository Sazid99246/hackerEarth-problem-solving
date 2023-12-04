package basicProgramming.inputOutput;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        StringBuilder s1 = new StringBuilder();

        s1.append(s);
        s1.reverse();

        if (s.equals(s1.toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
