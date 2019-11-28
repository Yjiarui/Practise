package homework;
//子串判断
import java.util.*;

public class Substr {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
          boolean[] bool=new boolean[n];
          for (int i = 0;i < p.length;i++){
             bool[i]= isSubstr(p[i],s);
          }
          return bool;
    }
    private static boolean isSubstr(String sub,String s){
        if (s.indexOf(sub) != -1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] p = {"a","b","c","d"};
        int n = 4;
        String s = "abc" ;
        System.out.println(chkSubStr(p,n,s));
    }
}
