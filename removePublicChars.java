import java.util.Scanner;

//删除公共字符
//例：输入 They are delicous aeu
//输出 Thy r dlicos
public class removePublicChars {
    private static void removeAll(String source,String del){
        int[] chars = new int[256];
        for (int i = 0;i < del.length();i++){
            chars[del.charAt(i)]++;
        }
        char[] ret = new char[source.length()];
        int index = 0;
        for (int i = 0;i < source.length();i++){
            if (chars[source.charAt(i)] == 0){
                ret[index++] = source.charAt(i);
            }
        }
        System.out.println(new String(ret,0,index));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String source = sc.nextLine();
            String del = sc.nextLine();
            removeAll(source,del);
        }
    }
}