package array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSpiralMatrix {

    public static void printSpiralMatrix(int[][] nums) {

        ArrayList<Integer> ans = new ArrayList<>();
        int m = nums.length;
        int n = nums[0].length;
        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;
        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                ans.add(nums[top][i]);
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(nums[i][right]);
            }

            right--;

            if (top < bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(nums[bottom][i]);
                }

                bottom--;
            }

            if (left < right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(nums[i][left]);
                }

                left++;
            }

        }

        ans.forEach((it) -> {
            System.out.print(it + " ");
        });

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        printSpiralMatrix(array);

        sc.close();
    }
}
