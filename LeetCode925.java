//长按键入
//你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
//你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
//示例 1：
//
//输入：name = "alex", typed = "aaleex"
//输出：true
//解释：'alex' 中的 'a' 和 'e' 被长按。

//示例 2：
//输入：name = "saeed", typed = "ssaaedd"
//输出：false
//解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。

//示例 3：
//输入：name = "laiden", typed = "laiden"
//输出：true
//解释：长按名字中的字符并不是必要的。

//提示：
//name.length <= 1000
//typed.length <= 1000
//name 和 typed 的字符都是小写字母。
public class LeetCode925 {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        if(name.length()>typed.length()){
            return false;
        }
        while(i < name.length() && j < typed.length()){
            char c1 = name.charAt(i);
            char c2 = typed.charAt(j);
            if(c1 != c2){
                return false;
            }else{
                int num1 = 1;
                int num2 = 1;
                for(int k = i + 1;k < name.length();k++){
                    if(name.charAt(k) == c1){
                        num1++;
                        i++;
                    }else{
                        break;
                    }
                }
                for(int k = j + 1;k < typed.length();k++){
                    if(typed.charAt(k) == c2){
                        num2++;
                        j++;
                    }else{
                        break;
                    }
                }
                if(num1 > num2){
                    return false;
                }
                i++;
                j++;
            }
        }
        if(i == name.length() && j == typed.length()){
            return true;
        }else{
            return false;
        }
    }
}
