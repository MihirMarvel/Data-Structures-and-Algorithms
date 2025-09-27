package array;

import java.util.Arrays;

public class AssignCookies {
    
    public static int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookie = 0;
        while (cookie<s.length && child<g.length) {
            if(s[cookie]>=g[child]){
                child++;
            }
            cookie++;
            
        }
        return child;
    }

    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        int ans = findContentChildren(g, s);
        System.out.println(ans);
    }
}
