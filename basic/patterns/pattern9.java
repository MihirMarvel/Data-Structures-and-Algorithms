package basic.patterns;

public class pattern9 {
    public static void pattern(int n){
      int row = n;
      int column=n-1;
      int midRow=n/2;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
              if(i<midRow&&j>=midRow-1-i&&j<=midRow-1+i){
                System.out.print("*"+" ");
              }else if(i>=midRow&&j>=i-midRow&&j<=(column-1)-(i-midRow)){
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
        pattern(20);
    }
}

/*
3
2,3,4
1,2,3,4,5,
0,1,2,3,4,5,6
0,1,2,3,4,5,6
1,2,3,4,5,
2,3,4
3


 */