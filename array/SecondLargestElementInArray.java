package array;

import java.util.Scanner;

public class SecondLargestElementInArray {

    public static void secondLargestElement(int[] arr, int size) {

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest :- " + secondLargest);

    }

    public static void secondSmallestElement(int[] arr, int size) {

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.print("Second Smallest :- " + secondSmallest);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        secondLargestElement(array, size);
        secondSmallestElement(array, size);
        sc.close();

    }
}
