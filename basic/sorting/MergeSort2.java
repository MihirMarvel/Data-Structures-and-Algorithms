package basic.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort2 {
    public static void merge(int[] arr, int lower, int mid, int upper){
        ArrayList<Integer> arrFinal = new ArrayList<Integer>();
        int i = lower;
        int j = mid+1;
        while (i<=mid && j<=upper) {
            if(arr[i]<=arr[j]){
                arrFinal.add(arr[i]);
                i++;
            }else{
                arrFinal.add(arr[j]);
                j++;
            }
        }
        while (i<=mid) {
            arrFinal.add(arr[i]);
            i++;
        }
        while (j<=upper) {
            arrFinal.add(arr[j]);
            j++;
        }
        // Copy the merged result back into the original array
        for (int k = 0; k < arrFinal.size(); k++) {
            arr[lower + k] = arrFinal.get(k);
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
