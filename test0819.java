//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//注意：给定 n 是一个正整数。
public class test0819 {
    public static int climbStairs(int n) {
        int a = 1,b = 1,re = 0;
        if(n == 1 || n == 0){
            return 1;
        }
        while(--n > 0){
            re = a + b;
            b = a;
            a = re;
        }
        return re;
    }

    public static void main(String[] args) {
        int method = climbStairs(3);
        System.out.printf("共有%d种方法",method);
    }
}