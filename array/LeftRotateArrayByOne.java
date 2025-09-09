package array;

import java.util.Scanner;

public class LeftRotateArrayByOne {

    public static void LeftRotateArray(int[] arr, int size) {

        int temp = arr[0];
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        arr[size-1] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        LeftRotateArray(array, size);
        for (int i : array) {
            System.out.print(i + " ");
        }
        sc.close();

    }
}
