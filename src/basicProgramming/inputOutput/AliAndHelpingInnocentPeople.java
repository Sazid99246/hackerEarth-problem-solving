package basicProgramming.inputOutput;

import java.util.Scanner;

public class AliAndHelpingInnocentPeople {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tag = scanner.nextLine();
        scanner.close();

        if (isValidTag(tag)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    private static boolean isValidTag(String tag) {
        // Check if the letter is a vowel
        if (isVowel(tag.charAt(2))) {
            return false;
        }

        // Check if the sum of every two consecutive digits is even
        for (int i = 0; i < tag.length() - 1; i++) {
            if (Character.isDigit(tag.charAt(i)) && Character.isDigit(tag.charAt(i + 1))) {
                int sum = Character.getNumericValue(tag.charAt(i)) + Character.getNumericValue(tag.charAt(i + 1));
                if (sum % 2 != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isVowel(char ch) {
        return "AEIOUY".indexOf(ch) != -1;
    }
}
