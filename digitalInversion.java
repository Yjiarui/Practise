import java.util.Scanner;

//数字颠倒
//输入int整型
//以字符串形式逆序输出 包括零
public class digitalInversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(inversion(num));
    }

    private static String  inversion(int num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1;i >= 0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}