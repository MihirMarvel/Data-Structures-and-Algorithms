package array;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubarrayWithSumK {

    public static void countSubarrayWithSumK(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {

            prefixSum += nums[i];
            int remove = prefixSum - k;
            count += mpp.getOrDefault(remove, 0);
            mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0) + 1);

        }

        System.out.println("Count :- " + count);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        countSubarrayWithSumK(array, sum);

        sc.close();
    }

}
