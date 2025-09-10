package array;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionAndIntersectionOfArrays {

    public static ArrayList<Integer> union(int[] array1, int[] array2, int m, int n) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (array1[i] < array2[j]) {
                if (array.isEmpty() || array1[i] != array.getLast()) {
                    array.add(array1[i]);
                }
                i++;
            } else if (array2[j] < array1[i]) {
                if (array.isEmpty() || array2[j] != array.getLast()) {
                    array.add(array2[j]);
                }
                j++;
            } else {
                if (array1[i] != array.getLast()) {
                    array.add(array1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < m) {
            if (array.getLast() != array1[i]) {
                array.add(array1[i]);
            }
            i++;
        }

        while (j < n) {
            if (array.getLast() != array1[j]) {
                array.add(array1[j]);
            }
            j++;
        }

        return array;
    }

    public static ArrayList<Integer> intersection(int[] array1, int[] array2, int m, int n) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (array1[i] == array2[j]) {
                array.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] array1 = new int[m];
        for (int i = 0; i < m; i++)
            array1[i] = sc.nextInt();
        int n = sc.nextInt();
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++)
            array2[i] = sc.nextInt();
        ArrayList<Integer> union = union(array1, array2, m, n);
        ArrayList<Integer> intersection = intersection(array1, array2, m, n);
        System.out.print("Union\n");
        for (int i : union)
            System.out.print(i + " ");
        System.out.print("\nIntersection\n");
        for (int i : intersection)
            System.out.print(i + " ");
        sc.close();

    }

}
