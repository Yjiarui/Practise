//字符串转换整数
//请你来实现一个 atoi 函数，使其能将字符串转换成整数。
//首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
//当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
//该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
//注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
//在任何情况下，若函数不能进行有效的转换时，请返回 0。
//示例 1:
//输入: "42"
//输出: 42

//示例 2:
//输入: "   -42"
//输出: -42
//解释: 第一个非空白字符为 '-', 它是一个负号。
//     我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
public class LeetCode8 {
    public int myAtoi(String str) {
        if (str.isEmpty())
            return 0;
        char[] mychar = str.toCharArray();
        long ans = 0;
        int index = 0, flag = 1, n = str.length();//排除字符串开头的空格元素
        while (index < n && mychar[index] == ' ') {
            index++;
        }//排除空格后判断首字符是+还是-还是都不是
        if (index < n && mychar[index] == '+') {
            index++;
        } else if (index < n && mychar[index] == '-') {
            index++;
            flag = -1;
        }//重点：只管是数字的时候，其余取0
        while (index < n && (mychar[index] >= '0' && mychar[index] <= '9')) {
            if (ans != (int) ans) {
                return (flag == 1) ? Integer.MAX_VALUE :Integer.MIN_VALUE;
            }
            ans = ans * 10 + mychar[index++] - '0';
        }
        if (ans != (int) ans) {
            return (flag == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int) (ans * flag);
    }
}
