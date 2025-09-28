package binary_search;

import java.util.Scanner;

public class UpperBound {

    public static int findUpperBound(int[] nums, int target) {

        int n = nums.length;
        int low = 0, high = n - 1;
        int min = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                min = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return min;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int num = findUpperBound(nums, target);

        System.out.println("Upper bound of " + target + " at index :- " + num);

        sc.close();

    }

}

