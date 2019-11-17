package homework;

import java.util.Scanner;

//末尾0的个数
//输入一个正整数n
//求n的阶乘末尾有多少个零
//输出零的个数
public class zeroNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = 0;
            while (n != 0){
                count += n/5;
                n = n / 5;
            }
            System.out.println(count);
        }
    }
}