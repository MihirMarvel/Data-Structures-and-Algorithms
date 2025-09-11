package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    // Only return Yes :- Using 2 pointers and Greedy approach
    public static void twoSumVarient1(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);
        int low = 0, high = n - 1;
        int sum = 0;
        while (low <= high) {
            sum = nums[low] + nums[high];
            if (sum == target) {
                System.out.println("Yes");
                return;
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        System.out.println("No");
    }

    // Only return indices :- Using hashing
    public static int[] twoSumVarient2(int[] nums, int target) {

        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (mpp.containsKey(rem)) {
                ans[0] = mpp.get(rem);
                ans[1] = i;
                return ans;
            }
            mpp.put(nums[i], i);

        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // twoSumVarient1(array, target);
        int[] ans = twoSumVarient2(array, target);
        System.out.print("[" + ans[0] + "," + ans[1] + "]");
        sc.close();

    }
}