//你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
//
//空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
//
//示例 :
//
//输入: 二叉树: [1,2,3,4]
//       1
//     /   \
//    2     3
//   /
//  4
//
//输出: "1(2(4))(3)"
//
//解释: 原本将是“1(2(4)())(3())”，
//在你省略所有不必要的空括号对之后，
//它将是“1(2(4))(3)”。
public class Solution606 {
    private static void preorder(StringBuilder sb,TreeNode root){
        if(root == null){
            return;
        }
        sb.append("(");
        sb.append(root.val);
        if(root.left == null && root.right != null){
            sb.append("()");
        }else {
            preorder(sb,root.left);
        }
        preorder(sb,root.right);
        sb.append(")");
    }
    public static String tree2str(TreeNode t){
        if(t == null){
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        preorder(sb,t);
        String r = sb.toString();
        return r.substring(1,r.length() - 1);
    }
}
