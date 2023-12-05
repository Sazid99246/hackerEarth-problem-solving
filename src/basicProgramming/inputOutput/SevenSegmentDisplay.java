package basicProgramming.inputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SevenSegmentDisplay {
    public static void main(String args[]) throws Exception {

        int arr[] = new int[] { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder("");
        while (test-- != 0) {
            int count = 0;
            String st = br.readLine();
            for (int i = 0; i < st.length(); i++) {
                count += arr[st.charAt(i) - '0'];
            }
            if (count % 2 == 1) {
                str.append("7");
                count -= 3;
                for (int i = 0; i < count; i += 2) {
                    str.append("1");
                }
            } else {
                for (int i = 0; i < count; i += 2) {
                    str.append("1");
                }
            }
            str.append("\n");
        }
        System.out.println(str);
    }
}
