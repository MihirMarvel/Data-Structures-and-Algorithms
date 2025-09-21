package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ThreeSum {

    private static void threeSumUsingHashing(int[] array, int sum) {
        int n = array.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = sum - (array[i] + array[j]);
                if (hashSet.contains(third)) {
                    List<Integer> temp = Arrays.asList(array[i], array[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashSet.add(array[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        for (List<Integer> list : ans) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    private static void threeSumUsingOptimal(int[] array, int threeSum) {
        int n = array.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < n; i++) {

            if (i != 0 && array[i] == array[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = array[i] + array[j] + array[k];
                if (sum < threeSum) {
                    j++;
                } else if (sum > threeSum) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(array[i], array[j], array[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && array[j] == array[j - 1]) {
                        j++;
                    }
                    while (j < k && array[k] == array[k + 1]) {
                        k--;
                    }
                }
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
        int size = sc.nextInt();
        int sum = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        threeSumUsingHashing(array, sum);
        threeSumUsingOptimal(array, sum);
        sc.close();

    }
}
