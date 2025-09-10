package array;

import java.util.Scanner;

public class MaxConsecutiveOneInArray {

    public static void maxConsecutiveOne(int[] array, int n) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 1)
                count++;
            else {
                count = 0;
            }
            max = Math.max(max, count);
        }

        System.out.println("Max Consecutive one in array :- " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        maxConsecutiveOne(array, size);
        sc.close();

    }
}
