package binary_search;

import java.util.Scanner;

public class BinarySearch {

    public static int iterativeBinarySearch(int[] nums, int target) {

        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] nums, int low, int high, int target) {

        if (low > high)
            return -1;

        int mid = low + ((high - low) / 2);
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return recursiveBinarySearch(nums, mid + 1, high, target);
        }
        return recursiveBinarySearch(nums, low, mid - 1, target);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // int num = iterativeBinarySearch(nums, target);
        int num = recursiveBinarySearch(nums, 0, n - 1, target);

        System.out.println("Target " + target + " at index :- " + num);

        sc.close();

    }

}
