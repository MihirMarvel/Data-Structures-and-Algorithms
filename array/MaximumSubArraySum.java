package array;

import java.util.Scanner;

public class MaximumSubArraySum {

    public static void maximumSubArraySum(int[] nums) {

        long maxi = Long.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println("Maximum sum of subarray :- " + maxi);

    }

    public static void printSubArrayWithMaxSum(int[] nums) {

        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int start = 0;
        int ansi = -1, ansj = -1;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
                ansi = start;
                ansj = i;
            }

            if (sum < 0) {
                sum = 0;
                start = i+1;
            }

        }

        for (int i = ansi; i <= ansj; i++) {
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
        maximumSubArraySum(nums);
        printSubArrayWithMaxSum(nums);
        sc.close();

    }

}
