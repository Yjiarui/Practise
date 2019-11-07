import java.util.Scanner;
//统计回文
/*插入b后可以进行几次可构成回文数
* 输入：
* aba
  b
*
* 输出
* 2*/
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        int len = A.length();
        int count = 0;
        String s1,s2;
        StringBuilder sb;
        for (int i = 0;i <= len;i++){
            s1 = A.substring(0,i);
            s2 = A.substring(i,len);
            sb = new StringBuilder(s1);
             sb.append(B).append(s2);
             if (sb.toString().equals(sb.reverse().toString())){
                 count++;
             }
             sb = null;
        }
        System.out.println(count);
        scanner.close();
    }
}
