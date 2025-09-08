package array;

import java.util.Scanner;

public class RemoveDuplicatesInPlace {

    public static int removeDuplicates(int[] arr, int size) {

        int unique = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                unique++;
                arr[unique] = arr[i + 1];
            }
        }
        return unique + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int uniqueElement = removeDuplicates(array, size);
        System.out.println("Unique element :- " + uniqueElement);
        for (int i : array) {
            System.out.print(i + " ");
        }
        sc.close();

    }

}
