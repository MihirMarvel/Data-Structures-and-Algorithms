package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RearrangeElementsBySign {

    public static void rearrangeElementsBySignEqualElements(int[] nums) {

        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int pos = 0, neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans.set(neg, nums[i]);
                neg += 2;
            } else {
                ans.set(pos, nums[i]);
                pos += 2;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans.get(i);
        }

    }

    public static void rearrangeElementsBySignUnEqualElements(int[] nums) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i : nums) {
            if (i < 0)
                neg.add(i);
            else
                pos.add(i);
        }

        if (pos.size() < neg.size()) {
            int index = 0;
            while (index < pos.size()) {
                if (index % 2 == 0) {
                    nums[index] = pos.get(index);
                } else {
                    nums[index] = neg.get(index);
                }
                index++;
            }
            for (int i = pos.size(); i < neg.size(); i++) {
                nums[index] = neg.get(i);
                index++;
            }
        } else {
            int index = 0;
            while (index < neg.size()) {
                if (index % 2 == 0) {
                    nums[index] = pos.get(index);
                } else {
                    nums[index] = neg.get(index);
                }
                index++;
            }
            for (int i = neg.size(); i < pos.size(); i++) {
                nums[index] = pos.get(i);
                index++;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        rearrangeElementsBySignEqualElements(nums);
        // rearrangeElementsBySignUnEqualElements(nums);
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();

    }
}
