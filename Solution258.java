import java.util.Scanner;

//各位相加
//输入 38 则得到 3 + 8 = 11 是两位数
//继续 1 + 1 = 2  则输出2 
public class Solution258 {
    public static int addDigits(int num){
     if (num == 0)
         return 0;
     if (num % 9 == 0)
         return 9;
     else
         return  num % 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();
        System.out.println(addDigits(num));
    }
}
