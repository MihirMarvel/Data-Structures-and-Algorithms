package array;

import java.util.Scanner;

public class CheckArraySortedAndRotated {

    public static boolean CheckSorted(int[] arr, int size) {

        if(size<=1) return true;

        int inversionCount  = 0;
        for(int i=1;i<size;i++){
            if(arr[i]<arr[i-1]){
                inversionCount++;
                if(inversionCount>1) return false;
            }
        }

        if(arr[0]<arr[size-1]) inversionCount++;

        return inversionCount <=1 ;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        boolean sorted = CheckSorted(array, size);
        System.out.println("Array sorted :- " + sorted);
        sc.close();

    }
}
