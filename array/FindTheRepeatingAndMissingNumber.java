package array;

import java.util.Scanner;

public class FindTheRepeatingAndMissingNumber {

    public static void findTheRepeatingAndMissingNumberUsingMath(int[] array) {

        long n = array.length;
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * ((2 * n) + 1)) / 6;
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += array[i];
            S2 += (long) array[i] * (long) array[i];
        }
        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;
        int[] ans = { (int) x, (int) y };
        System.out.println("Repeating Number :- " + ans[0]);
        System.out.println("Missing Number :- " + ans[1]);

    }

    public static void findTheRepeatingAndMissingNumberUsingXOR(int[] array) {
        int n = array.length;
        int xr = 0;
        for (int i = 0; i < n; i++) {
            xr = xr ^ array[i];
            xr = xr ^ (i + 1);
        }
        int number = (xr & ~(xr - 1));
        int zero = 0, one = 0;
        for (int i = 0; i < n; i++) {
            if ((array[i] & number) != 0) {
                one = one ^ array[i];
            } else {
                zero = zero ^ array[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i % number) != 0) {
                one = one ^ i;
            } else {
                zero = zero ^ i;
            }
        }
        int cnt = 0;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            if (array[i] == zero)
                cnt++;
            if (cnt == 2) {
                ans[0] = zero;
                ans[1] = one;
            }
        }
        ans[0] = one;
        ans[1] = zero;

        System.out.println("Repeating Number :- " + ans[0]);
        System.out.println("Missing Number :- " + ans[1]);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        findTheRepeatingAndMissingNumberUsingMath(array);
        findTheRepeatingAndMissingNumberUsingXOR(array);
        sc.close();

    }
}
