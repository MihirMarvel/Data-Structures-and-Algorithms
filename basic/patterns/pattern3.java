package basic.patterns;

public class pattern3 {


    public static void pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(j<=i){
                    System.out.print(j+1+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Pattern");

        pattern(5);
    }
    
}
