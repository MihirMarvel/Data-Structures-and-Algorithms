package array;

import java.util.Scanner;

public class NextPermutation {

    public static void reverse(int[] nums, int start, int end) {

        int left = start, right = end;
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }

    public static void nextPermutation(int[] nums) {

        int n = nums.length;
        int breakpoint = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakpoint = i;
                break;
            }
        }

        if (breakpoint == -1) {
            reverse(nums, 0, n - 1);
            System.out.print("Next Permutation :- ");
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
            return;
        }

        for (int i = n - 1; i > breakpoint; i--) {
            if (nums[i] > nums[breakpoint]) {
                int temp = nums[i];
                nums[i] = nums[breakpoint];
                nums[breakpoint] = temp;
                break;
            }
        }

        reverse(nums, breakpoint + 1, n - 1);

        System.out.print("Next Permutation :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        nextPermutation(nums);
        sc.close();
    }
}
