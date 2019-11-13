import java.util.Scanner;

//输入一组长度为n的数
//输出出现次数大于 n/2 的数
public class halfOfN {
    private static  String  find(String[] A){
        String sum = new String();
        for (int i = 0;i < A.length;i++){
            int num = 0;
            for (int j = 0;j <A.length;j++){
                if (A[i].equals(A[j])){
                    num++;
                }
            }
            int s = A.length / 2;
            if (num >= s){
                 sum = A[i];
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] A = str.split(" ");
        System.out.println(find(A));
//        for (int i = 0;i < A.length;i++){
//            int num = 0;
//            for (int j = 0;j <A.length;j++){
//                if (A[i].equals(A[j])){
//                    num++;
//                }
//            }
//            int s = A.length / 2;
//            if (num >= s){
//                System.out.println(A[i]);
//                break;
//            }
//        }
    }
}