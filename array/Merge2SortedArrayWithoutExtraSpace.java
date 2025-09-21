package array;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2SortedArrayWithoutExtraSpace {

    public static void merge2SortedArrayUsing2Pointers(int[] array1, int[] array2) {

        int n = array1.length;
        int m = array2.length;
        int left = n - 1;
        int right = 0;
        while (left >= 0 && right < m) {
            if (array1[left] > array2[right]) {
                long temp = array1[left];
                array1[left] = array2[right];
                array2[right] = (int) temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("Merged Array :- ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }

    public static void swapIfGreater(int[] array1, int[] array2, int ind1, int ind2) {

        if (array1[ind1] > array2[ind2]) {
            long temp = array1[ind1];
            array1[ind1] = array2[ind2];
            array2[ind2] = (int) temp;
        }

    }

    public static void merge2SortedArrayUsingGapMethod(int[] array1, int[] array2) {

        int n = array1.length;
        int m = array2.length;
        int len = n + m;
        int gap = (len / 2) + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                if (left < n && right >= n) {
                    swapIfGreater(array1, array2, left, right - n);
                } else if (left >= n && right >= n) {
                    swapIfGreater(array2, array2, left - n, right - n);
                } else {
                    swapIfGreater(array1, array1, left, right);
                }
                left++;
                right++;
            }
            if (gap == 1)
                break;
            gap = (gap / 2) + (gap % 2);
        }
        System.out.println("Merged Array :- ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }
        merge2SortedArrayUsingGapMethod(array1, array2);
        sc.close();

    }

}
