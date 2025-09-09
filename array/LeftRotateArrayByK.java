package array;

import java.util.Scanner;

public class LeftRotateArrayByK {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void LeftRotateArray(int[] arr, int n, int k) {
        k = k % 10;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void RightRotateArray(int[] arr, int n, int k) {
        k=k%10;
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Left Rotate by " + k);
        // LeftRotateArray(array, size, k);
        // for (int i : array) {
        //     System.out.print(i + " ");
        // }
        System.out.println("\nRight Rotate by " + k);
        RightRotateArray(array, size, k);
        for (int i : array) {
            System.out.print(i + " ");
        }
        sc.close();

    }
}
