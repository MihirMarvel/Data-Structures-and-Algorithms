package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MajorityElementN3InArray {

    public static void majorityElementUsingHashing(int[] nums) {

        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int mini = (int) (n / 3) + 1;
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
            if (mpp.get(nums[i]) == mini) {
                ls.add(nums[i]);
            }
            if (ls.size() == 2)
                break;
        }
        for (Integer integer : ls) {
            System.out.println("Majority element (N/3) :- " + integer);
        }
    }

    public static void majorityElementOptimal(int[] nums) {

        int n = nums.length;
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != nums[i]) {
                cnt1 = 1;
                el1 = nums[i];
            } else if (cnt2 == 0 && el1 != 0) {
                cnt2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1)
                cnt1++;
            else if (nums[i] == el2)
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) {
                cnt1++;
            }
            if (nums[i] == el2) {
                cnt2++;
            }
        }
        int mini = (int) (n / 3) + 1;
        if (cnt1 >= mini)
            ls.add(el1);
        if (cnt2 >= mini)
            ls.add(el2);
        for (Integer integer : ls) {
            System.out.println("Majority element (N/3) :- " + integer);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        majorityElementOptimal(array);
        sc.close();

    }

}
