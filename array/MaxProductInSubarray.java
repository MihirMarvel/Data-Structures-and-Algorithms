package array;

import java.util.Scanner;

public class MaxProductInSubarray {

    public static void maxProductInSubarrayUsingTraversal(int[] array) {

        int n = array.length;
        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;
            if (suff == 1)
                suff = 1;
            pre *= array[i];
            suff *= array[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        System.out.println("Maximum product of subarray :- " + ans);

    }

    public static void maxProductInSubarrayUsingKadane(int[] array) {

        int maxProd = array[0], minProd = array[0];
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            int temp = Math.max(array[i], Math.max(maxProd * array[i], minProd * array[i]));
            minProd = Math.min(array[i], Math.min(maxProd * array[i], minProd * array[i]));
            maxProd = temp;
            result = Math.max(maxProd, result);
        }
        System.out.println("Maximum product of subarray :- " + result);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        maxProductInSubarrayUsingTraversal(array);
        maxProductInSubarrayUsingKadane(array);
        sc.close();

    }

}
