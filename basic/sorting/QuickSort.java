package basic.sorting;

import java.util.Scanner;

public class QuickSort {

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        
        int left = low;
        int right = high;
        int pivot = low;

        while (left < right) {
            while (left < high && arr[left] <= arr[pivot])
                left++;
            while (right > low && arr[right] > arr[pivot])
                right--;
            if (left < right) {
                swap(arr, left, right);
            }
        }
        swap(arr, pivot, right);
        return right;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, size - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
