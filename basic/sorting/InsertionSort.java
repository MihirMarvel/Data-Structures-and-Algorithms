package basic.sorting;

import java.util.Scanner;

public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size;
        size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i =0 ;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        arr = insertionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        scanner.close();
    }
}
