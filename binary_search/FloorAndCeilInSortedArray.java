package binary_search;

import java.util.Scanner;

public class FloorAndCeilInSortedArray {

    public static void findFloorAndCeil(int[] nums, int target) {

        int n = nums.length;
        int low = 0, high = n - 1;
        int floor = -1;
        int ceil = n;
        while (low <= high) {
            int mid = ((low + high) / 2);
            if (nums[mid] >= target) {
                ceil = mid;
                high = mid - 1;
            } else {
                floor = mid;
                low = mid + 1;
            }
        }
        System.out.println("Floor And Ceil of "+target + " :- "+floor+","+ceil);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        findFloorAndCeil(nums, target);
        sc.close();

    }

}

