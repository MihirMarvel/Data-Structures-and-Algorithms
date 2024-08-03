package basic.patterns;

public class pattern1 {

    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Pattern :-\n");
        pattern(8);
    }
}
