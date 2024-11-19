package basic.sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int n, int[] arr) {

        for (int i = n - 1; i > 0; i--) {
            boolean didSwap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap) break;
        }
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(size, arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}
