import java.util.Scanner;

//回文数
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//示例 1:
//输入: 121
//输出: true
//示例 2:
//输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数
public class LeetCode9 {
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int rem = 0,y = 0;
        int quo = x;
        while(quo != 0){
            rem = quo % 10;
            y = y * 10 + rem;
            quo = quo / 10;
        }
        return y == x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPalindrome(x));
    }
}
