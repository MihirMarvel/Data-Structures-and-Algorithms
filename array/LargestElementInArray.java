package array;

import java.util.Scanner;

public class LargestElementInArray {

    public static void largestElement(int[] arr, int size) {

        int largest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.print("Largest :- " + largest);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        largestElement(array,size);
        sc.close();

    }
}
