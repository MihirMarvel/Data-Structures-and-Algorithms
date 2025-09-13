package array;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {


    public static void bestTimeToBuyAndSellStock(int[] nums){

        int maxPro = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            minValue = Math.min(minValue, nums[i]);
            maxPro = Math.max(maxPro, nums[i] - minValue);
        }
        System.out.println("Max Profit :- "+maxPro);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        bestTimeToBuyAndSellStock(nums);
        sc.close();

    }

}
