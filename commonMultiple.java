import java.util.Scanner;

//找最小公倍数
public class commonMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = find(a,b);
        int n = a * b / m;
        System.out.print(n);
    }

    private static int find(int a, int b) {
        if (a < b){
            int t = a;
        a = b;
        b = t;
        }
        while (b != 0){
            if (a == b){
                return a;
            }else {
                int k = a % b;
                a = b;
                b = k;
            }
        }
        return a;
    }
}
