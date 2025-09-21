package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeOverlappingSubIntervals {

    public static void mergeOverlappingSubIntervals(int[][] array) {

        int n = array.length;
        Arrays.sort(array, (a, b) -> {
            return a[0] - b[0];
        });
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || array[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(array[i][0], array[i][1]));
            } else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), array[i][1]));
            }
        }
        for (List<Integer> list : ans) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] array = new int[][] {
                { 1, 3 }, { 2, 6 }, { 8, 9 }, { 9, 11 }, { 8, 10 }, { 2, 4 }, { 15, 18 }, { 16, 17 }
        };
        mergeOverlappingSubIntervals(array);
        sc.close();

    }
}
