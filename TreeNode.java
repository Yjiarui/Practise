//平衡二叉树
public class TreeNode {
    TreeNode left;
    TreeNode right;
    public boolean isBanlanced(TreeNode root){
        if (root == null){
            return true;
        }else {
            return checkNode(root);
        }
    }

    private boolean checkNode(TreeNode root){
        if (root == null){
            return true;
        }

        if (!checkNode(root.left)){
            return false;
        }

        if (!checkNode(root.right)){
            return false;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);

        if (Math.abs(left-right)>1){
            return false;
        }else {
            return true;
        }
    }

    private int getDepth(TreeNode root){
        int left = 0;
        int right = 0;
        if (root == null){
         return 0;
        }else {
            left = 1 + getDepth(root.left);
            right = 1 + getDepth(root.right);
        }
        if (left > right){
            return left;
        }else {
            return right;
        }
    }
}
