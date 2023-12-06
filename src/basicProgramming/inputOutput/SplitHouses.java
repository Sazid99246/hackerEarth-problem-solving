package basicProgramming.inputOutput;

import java.util.*;

public class SplitHouses {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        char c[] = s.toCharArray();
        String res = "NO";
        if (n != 1) {
            for (int i = 0; i < n - 1; i++) {
                if (c[i] == 'H' && c[i + 1] == 'H') {
                    System.out.println("NO");
                    return;
                }

                else {
                    res = "YES";
                }
            }
        }

        else {
            res = "YES";
        }
        for (int i = 0; i < n; i++) {
            if (c[i] == '.') {
                c[i] = 'B';
            }
        }
        System.out.println(res);
        System.out.println(c);
    }
}