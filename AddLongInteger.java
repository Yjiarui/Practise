package homework;

import java.util.Scanner;
//超长正整数相加

public class AddLongInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String addend = scan.nextLine();
            String augeng = scan.nextLine();
            addLongInteger(addend , augeng);
        }//endwhile 
        scan.close();
    }
    /**
     * 超长正整数加法
     * */
    private static void addLongInteger(String addend, String augeng) {
        int addend_length = addend.length();
        int augeng_length = augeng.length();
        int length = addend_length > augeng_length ? addend_length : augeng_length;
        int[] addend_int = new int[length];
        int[] augeng_int = new int[length];
        int[] add_long_integer = new int[length];
//将字符串转化为整形数组                                    999999999998888
//将字符串转化为整形数组                                    111111111111 
//最低位非零，为了操作方便，数组中逆序存放888899999999999
//最低位非零，为了操作方便，数组中逆序存放111111111111000
//结果                                                          "1"+ 999901111111000  
//在逆序输出为最终结果                          "1"+ 000111111109999
        for(int i = 0 ; i < addend_length ; i++){
            addend_int[i] = addend.charAt(addend_length - 1 - i) - '0';
        }
        for(int i = 0 ; i < augeng_length ; i++){
            augeng_int[i] = augeng.charAt(augeng_length - 1 - i) - '0';
        }
        int up = 0;//进位
        int temp_integer = 0;
//选较大的字符串长度进行操作
        for(int i = 0 ; i < length ; i++){
            temp_integer = addend_int[i] + augeng_int[i] + up;
            add_long_integer[i] = temp_integer % 10;
            up = temp_integer / 10;
        }
//如果最高位还有进位，多输出一个1
// 对应这种情况999999999
// 两者长度相等111111111
        if(up > 0){
            System.out.print("1");
            for(int i = length - 1 ; i >= 0 ; i--){
                System.out.print(add_long_integer[i]);
            }
        }else{
            for(int i = length - 1 ; i >= 0 ; i--){
                System.out.print(add_long_integer[i]);
            }
        }
       System.out.println();
    }
}


