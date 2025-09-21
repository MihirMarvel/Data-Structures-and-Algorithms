package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    private static long nCR(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    private static void printElementAtPosRandC(int r, int c) {
        int element = (int) nCR(r - 1, c - 1);
        System.out.println("Element at (Row,C0lumn) => (" + r + "," + c + " = " + element);
    }

    private static List<Integer> printPascalRow(int n) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        System.out.print(ans + " ");
        ansRow.add((int) ans);
        for (int i = 0; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / (i + 1);
            System.out.print(ans + " ");
            ansRow.add((int) ans);
        }
        return ansRow;
    }

    private static void printPascalTriangle(int n) {
        for (int row = 0; row <= n; row++) {
            printPascalRow(row);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        // Variation 1 - Print element from PascalTriangle
        printElementAtPosRandC(row, column);

        // Variation 2 - Print row from PascalTriangle
        System.out.println("\nRow at "+row+" in Pascal Triangle :-");
        printPascalRow(row);

        // Variation 3 - Print pascal triangle
        System.out.println("\n\nPascal Triangle :-");
        printPascalTriangle(row);

        sc.close();
    }
}
