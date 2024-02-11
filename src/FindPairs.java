import java.util.HashMap;
import java.util.Scanner;

public class FindPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        
        // Map to store frequencies of A[i] - i
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long diff = arr[i] - i;
            map.put(diff, map.getOrDefault(diff, 0L) + 1);
        }
        
        // Calculate the number of valid pairs
        long count = 0;
        for (long freq : map.values()) {
            if (freq > 1) {
                count += freq * (freq - 1) / 2; // nC2 combinations for each unique diff
            }
        }
        count *= 2;
        
        System.out.println(count);
        scanner.close();
    }
}
