package array;

import java.util.Scanner;

public class MoveAllZeroToEndArray {

    public static void moveAllZero(int[] arr, int size) {
        
        int j=0;
        for (int i =0 ;i<size;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) return;

        for(int i=j+1;i<size;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        moveAllZero(array, size);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+ " ");
        }
        sc.close();

    }
}
