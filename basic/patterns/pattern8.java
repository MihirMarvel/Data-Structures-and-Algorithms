package basic.patterns;

public class pattern8 {
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j>i&&j<2*n-i){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Pattern\n");
        pattern(5);
    }
}

/*
0,1,2,3,4,5,6
1,2,3,4,5,
2,3,4
3


 */