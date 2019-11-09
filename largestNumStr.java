import java.util.Scanner;
//字符串中找出连续最长的数字串
public class largestNumStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String A = scan.nextLine();
            int end = 0;
            int MaxNum = 0;
            int count = 0;
            for (int i = 0;i < A.length();i++){
                if (A.charAt(i) >= '0' && A.charAt(i) <= '9'){
                    count++;
                    if (MaxNum < count){
                        MaxNum = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(A.substring(end - MaxNum + 1,end + 1));
        }
        scan.close();
    }
}
