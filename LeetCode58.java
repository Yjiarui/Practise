//最后一个单词的长度
//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
//如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
//如果不存在最后一个单词，请返回 0 。
//说明：一个单词是指仅由字母组成、不包含任何空格的 最大子字符串。
//示例:
//输入: "Hello World"
//输出: 5
public class LeetCode58 {
    public int lengthOfLastWord(String s) {
        if(s == null){
            return 0;
        }
        char[] c = s.toCharArray();
        int count = 0;
        for(int i = c.length - 1;i > 0;i--){
            if(c[i] != ' '){
                ++count;
            }else if(count > 0){
                return count;
            }
        }
        return count;
    }
}