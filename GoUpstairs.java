import java.util.*;

//上楼梯
//计算一个小孩以一次可以上一阶，两阶，三阶的方式爬 n阶台阶有多少种方法
//为防止溢出，将结果Mod 1000000007
public class GoUpstairs {
    public static int countWays(int n) {
        int a1 = 1;
        int a2 = 2;
        int a3 = 4;
        int sum = 0;
        if(n < 3){
            return n;
        }
        if(n == 3){
            return a3;
        }
        for(int i = 4;i <= n;i++){
            sum = ((a1+a2)%1000000007+a3)%1000000007;
            a1 = a2;
            a2 = a3;
            a3 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }
}