package array;

import java.util.ArrayList;
import java.util.Scanner;

public class CountReversePairInArray {

    public static void merge(int[] array, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(array[left]);
            left++;
        }

        while (right <= high) {
            temp.add(array[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            array[i] = temp.get(i - low);
        }
    }

    public static int countReversePair(int[] array, int low, int mid, int high) {

        int count = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && array[i] > 2 * array[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;

    }

    public static int mergeSort(int[] array, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;
        int mid = (low + high) / 2;
        count += mergeSort(array, low, mid);
        count += mergeSort(array, mid + 1, high);
        count += countReversePair(array, low, mid, high);
        merge(array, low, mid, high);
        return count;
    }

    public static void countReversePairInArray(int[] array) {
        System.out.println("Number Of Reverse pair :- " + mergeSort(array, 0, array.length - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        countReversePairInArray(array);
        sc.close();

    }

}
