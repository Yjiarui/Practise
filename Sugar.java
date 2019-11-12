import java.util.Scanner;

//计算糖果
public class Sugar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
//        a = A - B
//        b = B - C
//        c = A + B
//        d = B + C
       int A = (a + c)/2;
       int B = (c - a)/2;
       int C = (d - b)/2;
       if (  a == A - B && b == B - C &&c == A + B && d == B + C ){
           System.out.printf(A+" "+B+" "+C);//空格隔开输出，行末无空格
       }else {
           System.out.println("No");
       }

    }
}