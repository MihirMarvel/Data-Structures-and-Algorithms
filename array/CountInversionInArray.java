package array;

import java.util.ArrayList;
import java.util.Scanner;

public class CountInversionInArray {

    public static int merge(int[] array, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                count += (mid - left + 1);
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
            array[i] = temp.get(i-low);
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
        count += merge(array, low, mid, high);
        return count;
    }

    public static void countInversionInArray(int[] array) {
        System.out.println("Number Of Inversions :- " + mergeSort(array, 0, array.length - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        countInversionInArray(array);
        sc.close();

    }
}
