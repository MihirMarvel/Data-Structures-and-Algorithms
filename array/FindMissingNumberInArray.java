package array;

import java.util.Scanner;

public class FindMissingNumberInArray {

    public static void findMissingNumber(int[] array, int n) {

        int totalSum = (n * (n + 1)) / 2;
        for (int i = 0; i < n - 1; i++) {
            totalSum -= array[i];
        }
        System.out.print("Missing number :- " + totalSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size - 1; i++) {
            array[i] = sc.nextInt();
        }
        findMissingNumber(array, size);
        sc.close();

    }
}
