package basicProgramming.inputOutput;

import java.util.Scanner;

public class RoyProfilePicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = Integer.valueOf(scanner.nextLine()); // length of the photo in square size
        int N = Integer.valueOf(scanner.nextLine()); // Number of photos

        for (int i = 0; i < N; i++) {
            int W = scanner.nextInt();
            int H = scanner.nextInt();

            if (W < L || H < L) {
                System.out.println("UPLOAD ANOTHER");
            } else if (W >= L && H >= L) {
                if (W == H) {
                    System.out.println("ACCEPTED");
                } else {
                    System.out.println("CROP IT");
                }
            }
        }
        scanner.close();
    }
}
