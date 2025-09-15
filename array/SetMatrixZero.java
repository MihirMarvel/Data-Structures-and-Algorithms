package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SetMatrixZero {

    public static void SetMatrixZeroUsingAdditional(ArrayList<ArrayList<Integer>> nums) {

        int m = nums.size();
        int n = nums.get(0).size();

        ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(m, 0));
        ArrayList<Integer> column = new ArrayList<>(Collections.nCopies(n, 0));

        // Step 1: Mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums.get(i).get(j) == 0) {
                    row.set(i, 1);
                    column.set(j, 1);
                }
            }
        }

        // Step 2: Update matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row.get(i) == 1 || column.get(j) == 1) {
                    nums.get(i).set(j, 0);
                }
            }
        }
    }

    public static void SetMatrixZeroOptimal(ArrayList<ArrayList<Integer>> nums) {

        int m = nums.size();
        int n = nums.get(0).size();
        int col0 = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums.get(i).get(j) == 0) {

                    nums.get(i).set(0, 0);

                    if (j != 0) {
                        nums.get(0).set(j, 0);
                    } else {
                        col0 = 0;
                    }

                }

            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (nums.get(i).get(0) == 0 || nums.get(0).get(j) == 0) {
                    nums.get(i).set(j, 0);
                }

            }
        }

        if (nums.get(0).get(0) == 0) {
            for (int j = 0; j < n; j++) {
                nums.get(0).set(j, 0);
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < m; i++) {
                nums.get(i).set(0, 0);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            nums.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                nums.get(i).add(sc.nextInt());
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums.get(i).get(j) + " ");
            }
            System.out.println();
        }

        SetMatrixZeroOptimal(nums);

        System.out.println("Modified Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums.get(i).get(j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
