package basic.sorting;

import java.util.Scanner;

public class RecursiveBubbleSort {
    
    public static void recursiveBubbleSort(int[] arr,int n){
        if(n==1){
            return;
        }
        boolean didSwap = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                didSwap = true;
            }
        }
        if(didSwap){
            recursiveBubbleSort(arr, n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        recursiveBubbleSort(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
}
