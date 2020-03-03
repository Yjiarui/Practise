import java.util.Scanner;

//说反话
//例：
//输入： Hello World Here I Come
//输出： Come I Here World Hello
public class PAT1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        for (int i = strs.length - 1;i >= 0;i--){
            if (i >= 1){
                System.out.println(strs[i]+" ");
            }else {
                System.out.println(strs[i]);
            }
        }
    }
}