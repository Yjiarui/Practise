import java.util.*;

//2的个数
//请编写一个方法，输出0到n（包括n）中数字2出现了几次
//给定一个正整数n，请返回0到n的数字中2出现了几次
public class Count2 {
    public int countNumberOf2s(int n) {
        int count = 0;
        int low = 0;
        int current = 0;
        int high = 0;
        int flag = 1;
        while(n /flag != 0){
            low = n - (n / flag)*flag;
            current = (n / flag)%10;
            high = (n /flag)/10;
            if(current == 1 || current == 0){
                count +=high*flag;
            }else if(current == 2){
                count += high * flag + low + 1;
            }else{
                count += (high + 1) * flag;
            }
            flag *= 10;
        }
        return count;
    }
}