package basic.sorting;

import java.util.Scanner;

public class SelectionSort {
    
    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    
    public static void main(String[] args){
        int sizeOfArray;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of an array");
        sizeOfArray = scanner.nextInt();
        int[] arr = new int[sizeOfArray];
        System.out.println("Please enter array of size :"+sizeOfArray);
        for(int i=0;i<sizeOfArray;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Sorted Array :-");
        arr = selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
}
