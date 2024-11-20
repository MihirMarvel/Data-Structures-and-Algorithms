package basic.sorting;

import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] arr, int lower, int mid, int upper){
        int[] arrFinal = new int[upper-lower+1];
        int i = lower;
        int j = mid+1;
        int index=0;
        while (i<=mid && j<=upper) {
            if(arr[i]<=arr[j]){
                arrFinal[index] = arr[i];
                i++;
            }else{
                arrFinal[index] = arr[j];
                j++;
            }
            index++;
        }
        while (i<=mid) {
            arrFinal[index] = arr[i];
            i++;
            index++;
        }
        while (j<=upper) {
            arrFinal[index] = arr[j];
            j++;
            index++;
        }
        // Copy the merged result back into the original array
        for (int k = 0; k < arrFinal.length; k++) {
            arr[lower + k] = arrFinal[k];
        }
    }
    
    public static void mergeSort(int[] arr,int lower, int upper){
        if(lower>=upper)
            return;
        int mid = (lower+upper)/2;
        mergeSort(arr, lower, mid);
        mergeSort(arr, mid+1,upper);
        merge(arr, lower, mid, upper);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array :");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        mergeSort(arr, 0, size-1);
        System.out.println("Sorted Array :");
        for(int num:arr){
            System.out.print(num+" ");
        }
        scanner.close();
    }
}
