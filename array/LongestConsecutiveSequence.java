package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {

    public static void longestConsecutiveSequenceSorting(int[] nums) {
        int n = nums.length;
        int lastSmallest = Integer.MIN_VALUE;
        int longest = 1;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] != lastSmallest) {
                if (nums[i] - lastSmallest == 1) {
                    count++;
                } else {
                    count = 1;
                }
                lastSmallest = nums[i];

            }
            longest = Math.max(longest, count);
        }
        System.out.println("Longest " + longest);
    }

    public static void longestConsecutiveSequenceSet(int[] nums) {

        int longest = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        for (int it : hashSet) {
            int x = it;
            int count = 1;
            if (!hashSet.contains(x - 1)) {
                while (hashSet.contains(x + 1)) {
                    x++;
                    count++;
                }
            }
            longest = Math.max(count, longest);
        }
        System.out.println("Longest " + longest);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        longestConsecutiveSequenceSet(arr);
        sc.close();
    }
}
