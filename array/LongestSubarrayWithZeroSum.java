package array;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithZeroSum {

    public static void longestSubarrayWithZeroSum(int[] array, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.get(sum) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }
        System.out.println("Longest SubArray with zero sum - " + maxi);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // fourSumUsingHashing(array, sum);
        longestSubarrayWithZeroSum(array, sum);
        sc.close();

    }
}
