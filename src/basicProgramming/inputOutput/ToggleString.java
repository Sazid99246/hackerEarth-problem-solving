package basicProgramming.inputOutput;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder toggleString = new StringBuilder();

        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                toggleString.append(Character.toLowerCase(ch));
            } else {
                toggleString.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(toggleString);

        scanner.close();
    }
}
