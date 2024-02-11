package basicProgramming.implementation;

import java.util.*;

public class PerfectCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        System.out.println(countPerfectCubeSubarrays(arr));
        scanner.close();
    }

    private static long countPerfectCubeSubarrays(long[] arr) {
        Map<Map<Integer, Integer>, Long> freqMap = new HashMap<>();
        Map<Integer, Integer> current = new HashMap<>();
        freqMap.put(new HashMap<>(current), 1L);
        long count = 0;

        for (long num : arr) {
            Map<Integer, Integer> factors = factorize(num);

            for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
                current.put(entry.getKey(), current.getOrDefault(entry.getKey(), 0) + entry.getValue());
                current.put(entry.getKey(), current.get(entry.getKey()) % 3);
                if (current.get(entry.getKey()) == 0) {
                    current.remove(entry.getKey());
                }
            }

            count += freqMap.getOrDefault(current, 0L);
            freqMap.put(new HashMap<>(current), freqMap.getOrDefault(current, 0L) + 1);
        }

        return count;
    }

    private static Map<Integer, Integer> factorize(long num) {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                num /= i;
            }
        }
        if (num > 1) {
            factors.put((int) num, factors.getOrDefault((int) num, 0) + 1);
        }
        return factors;
    }
}
