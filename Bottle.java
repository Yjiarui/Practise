//汽水瓶
import java.util.Scanner;

public class Bottle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }

            System.out.println(changeNum(n));
        }
    }
     public static int changeNum(int n){
         int count = 0;
         while (n > 2){
             count += n / 3;
             n = n / 3 + n % 3;
         }
         if (n == 2){
             count ++;
         }
         return count;
     }
}
