package array;

import java.util.Scanner;

public class MajorityElementInArray {

    public static void majorityElement(int[] nums) {

        int n = nums.length;
        int element = nums[0];
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (element == nums[i])
                count++;
            else
                count--;
            if (count == 0) {
                element = nums[i + 1];
                count = 0;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (element == nums[i]) {
                count++;
            }
            if (count > n / 2) {
                System.out.print("Majority Element :- " + element);
                return;
            }
        }
        System.out.print("No Majority Element");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        majorityElement(array);
        sc.close();

    }
}
