package basic.recursion;

//Print 1 To N Without Loop
//Print numbers from 1 to n without the help of loops.
//You only need to complete the function printNos() that takes n as a parameter and prints the number from 1 to n recursively.


public class Ques1 {

    public static void printNum(int num){
        if(num==0){
            return;
        }
        printNum(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        printNum(10);
    }
    
}
