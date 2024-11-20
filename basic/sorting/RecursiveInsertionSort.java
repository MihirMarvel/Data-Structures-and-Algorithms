package basic.sorting;

import java.util.Scanner;

public class RecursiveInsertionSort {

    public static void recursiveInsertionSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        recursiveInsertionSort(arr, n - 1);
        for (int i = n; i >= 1; i--) {
            if (arr[i] <= arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        recursiveInsertionSort(arr, size - 1);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
