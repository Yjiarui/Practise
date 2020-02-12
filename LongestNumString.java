import java.util.Scanner;

//读入一个字符串str，输出字符串str中的连续最长的数字串
//例如 输入abc123def12345ghhhhh1234567
//输出 1234567
public class LongestNumString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] c = str.toCharArray();
        String result = "";
        int sum = 0;
        for (int i = 0;i < str.length();i++){
            if (c[i] >= '1' && c[i] <= '9'){
                int n = i;
                sum = 1;
                for (int j = i + 1;j < c.length;j++){
                    if (c[j] >= '1' && c[j] <= '9'){
                        sum++;
                        n = j;
                    }else {
                        break;
                    }
                }
                if (sum > result.length()){
                    result = str.substring(i,n + 1);
                }
            }else {
                continue;
            }
        }
        System.out.println(result);
    }
}
