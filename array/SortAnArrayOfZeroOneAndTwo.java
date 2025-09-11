package array;

import java.util.Scanner;

public class SortAnArrayOfZeroOneAndTwo {

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void sortAnArray(int[] nums) {

        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sortAnArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        sc.close();

    }

}
