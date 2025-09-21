package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FourSum {

    private static void fourSumUsingHashing(int[] array, int target) {
        int n = array.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> hashSet = new HashSet<>();
                for (int k = j + 1; k < array.length; k++) {
                    long sum = array[i] + array[j];
                    sum += array[k];
                    long fourth = target - sum;
                    if (hashSet.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(
                                array[i],
                                array[j],
                                array[k],
                                (int) fourth);
                        temp.sort(Integer::compareTo);
                        st.add(temp);
                    }
                    hashSet.add((long) array[k]);
                }
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

    private static void fourSumUsingOptimal(int[] array, int target) {
        int n = array.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < n; i++) {

            if (i != 0 && array[i] == array[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && array[j] == array[j - 1])
                    continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    int sum = array[i];
                    sum += array[j];
                    sum += array[k];
                    sum += array[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> temp = Arrays.asList(array[i], array[j], array[k], array[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while (k < l && array[k] == array[k - 1]) {
                            k++;
                        }
                        while (k < l && array[l] == array[l + 1]) {
                            l--;
                        }
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
        // fourSumUsingHashing(array, sum);
        fourSumUsingOptimal(array, sum);
        sc.close();

    }
}
