//验证回文串
// 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//说明：本题中，我们将空字符串定义为有效的回文串。
//示例 1:
//输入: "A man, a plan, a canal: Panama"
//输出: true
//
//示例 2:
//输入: "race a car"
//输出: false
public class LeetCode125 {
    public boolean isPalindrome(String s) {
        if(null == s){
            return false;
        }
        s = s.toLowerCase();
        String[] ss = s.split("[^-z0-9]");
        StringBuilder buffer = new StringBuilder();
        for(String t : ss){
            buffer.append(t);
        }
        s = buffer.toString();
        String rs = buffer.reverse().toString();
        return rs.equals(s);
    }
}
