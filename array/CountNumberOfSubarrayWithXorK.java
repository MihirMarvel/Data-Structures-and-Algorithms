package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumberOfSubarrayWithXorK {

    public static void countNumberOfSubarrayWithXorK(int[] array, int target){

        int n = array.length;
        int xr = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(xr, 1);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            xr = xr ^ array[i];
            int x = xr ^ target;
            if(mpp.containsKey(x)){
                cnt += mpp.get(x);
            }
            if(mpp.containsKey(xr)){
                mpp.put(xr, mpp.get(xr)+1);
            }else{
                mpp.put(xr, 1);
            }
        } 
        System.out.println("Number of subarray with XOR("+target+") :- "+cnt);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        countNumberOfSubarrayWithXorK(array, sum);
        sc.close();

    }

}
