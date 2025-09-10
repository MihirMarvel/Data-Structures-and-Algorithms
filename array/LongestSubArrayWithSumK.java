package array;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSumK {

    // Hashing and PrefixSum //Optimal in Both Positive and Negative Numbers
    public static void longestSubArrayBetter(int[] array, int k) {
        HashMap<Long, Integer> prefixSumMap = new HashMap<>();
        Long prefixSum = 0L;
        int maxLen = 0;
        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];
            if (prefixSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            Long rem = prefixSum - k;
            if (prefixSumMap.containsKey(rem)) {
                int len = i - prefixSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!prefixSumMap.containsKey(prefixSum)) {
                prefixSumMap.put(prefixSum, i);
            }
        }
        System.out.println("Longest sub array with sum k=" + k + " :- " + maxLen);
    }

    // 2 pointer approach //Only for Positive Numbers
    public static void longestSubArrayOptimal(int[] array, int k) {

        int n = array.length;
        int maxLen = 0;
        int left = 0, right = 0;
        long sum = array[0];
        while (right < n) {

            while (left <= right && sum > k) {
                sum -= array[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += array[right];
            }
        }
        System.out.println("Longest sub array with sum k=" + k + " :- " + maxLen);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        longestSubArrayOptimal(array, k);
        sc.close();

    }
}
