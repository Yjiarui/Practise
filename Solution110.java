//给定一个二叉树，判断它是否是高度平衡的二叉树。
//本题中，一棵高度平衡二叉树定义为：
//一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
import static java.lang.StrictMath.max;

public class Solution110 {
    public static int calcHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = calcHeight(root.left);
        int right = calcHeight(root.right);
        int height = max(left,right) + 1;
        return height;
    }
    public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        boolean leftBalance = isBalanced(root.left);
            if(!leftBalance){
                return false;
            }
        boolean rightBalance = isBalanced(root.right);
            if(!rightBalance){
                return false;
            }
        int leftHeight = calcHeight(root.left);
        int rightHeight = calcHeight(root.right);
        if(leftHeight-rightHeight > 1 || rightHeight - leftHeight >1){
            return false;
        }
        return true;
    }
}
