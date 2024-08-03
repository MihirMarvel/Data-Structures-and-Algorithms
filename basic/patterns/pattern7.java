package basic.patterns;

public class pattern7 {
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j>=n-i&&j<=n+i){
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
        pattern(10);
    }
}

/*
(0,5)
(1,4),(1,5),(1,6)
(2,3),(2,4),(2,5),(2,6),(2,7) 
(3,3),(3,4),(3,5),(3,6),(3,7),(3,8)

 */