import java.util.Scanner;

import static java.lang.Math.min;

//合法括号序列判断
public class Parenthesis{
    public static boolean chkParenthesis(String A, int n) {
        int bool = 0;
        int left = 0;
        int right = 0;
        char[] array = A.toCharArray();
        if (A == null || A.length() <= 0){
            return false;
        }
        for (int i = 0; i < array.length;i++){
            if (array[i] == '('){
                left++;
            }else if (array[i] == ')'){
                right++;
            }else {
                return false;
            }
        }
        if (left == right){
            bool = left * 2;
        }else {
            bool = min(left,right);
        }
        if (bool == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        int num = A.length();
        System.out.println(num);
        System.out.println(chkParenthesis(A,num));
    }

}