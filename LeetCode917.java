//仅仅反转字母
//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
//示例 1：
//输入："ab-cd"
//输出："dc-ba"

//示例 2：
//输入："a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"

//示例 3：
//输入："Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
public class LeetCode917 {
    public String reverseOnlyLetters(String S) {
        char[] s = S.toCharArray();
        int left = 0;
        int right = s.length - 1;
        while(left <= right){
            if (!Character.isLetter(s[left])){
                left++;
            }else if (!Character.isLetter(s[right])){
                right--;
            }else {
                char temp = '0';
                temp = s[left];
                s[left] = s[right];
                s[right] = temp;
            }
        }
        S = String.valueOf(s);
        return S;
    }
}