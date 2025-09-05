package basic;

import java.util.Scanner;

public class practice {

    public static void recursiveBubbleSort(int[] array, int n) {

        if (n == 0)
            return;

        boolean didSwap = false;
        for (int i = 0; i < n; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                didSwap = true;
            }
        }

        if (!didSwap)
            return;

        recursiveBubbleSort(array, n - 1);
    }

    public static void recursiveInsertionSort(int[] array, int n) {

        if (n == 1)
            return;

        recursiveInsertionSort(array, n - 1);

        boolean didSwap = false;
        int i = n;
        while (i > 0 && array[i] < array[i - 1]) {
            int temp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;
            didSwap = true;
            i--;
        }

        if (!didSwap)
            return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        recursiveInsertionSort(array, size - 1);

        for (int element : array) {
            System.out.print(element + " ");
        }
        sc.close();

    }
}
