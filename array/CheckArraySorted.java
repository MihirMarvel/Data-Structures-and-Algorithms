package array;

import java.util.Scanner;

public class CheckArraySorted {

    public static boolean CheckSorted(int[] arr, int size) {

        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        boolean sorted = CheckSorted(array, size);
        System.out.println("Array sorted :- " + sorted);
        sc.close();

    }
}
