package basic.recursion;

public class Ques3 {

    public static boolean checkPalindrome(String s,int i,int j){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        checkPalindrome(s,i+1,j-1);
        return false;
    }

    public static boolean isPalindrome(String s) {
        String str = "";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122||(int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)
            {

                str+=s.charAt(i);
            }
        }
        System.out.println(str);
        if(str.length()==0){
            return true;
        }else{
            return checkPalindrome(str, 0, str.length()-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    
}
