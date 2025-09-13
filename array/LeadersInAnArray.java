package array;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInAnArray {

    public static void leadersInAnArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = nums[n - 1];
        ans.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        System.out.print("Leaders in Array :- ");
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        leadersInAnArray(nums);
        sc.close();
    }

}
