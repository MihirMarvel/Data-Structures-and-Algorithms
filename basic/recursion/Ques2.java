package basic.recursion;

import java.util.ArrayList;

public class Ques2 {
     
    static Long factorial(long n){
        if(n==1){
            return n;
        }
        return n * factorial(n-1);
    }
    
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> array = new ArrayList<Long>();
        for(int i=1;i<=n;i++){
            if(factorial(i)>n){
                return array;
            }
            array.add(n);
        }
        return (array);
    }

    public static void main(String[] args) {
        factorial(3);
    }
}
