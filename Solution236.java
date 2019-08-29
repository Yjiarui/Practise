//给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
//
//百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。
public class Solution236 {
    public boolean search(TreeNode root, TreeNode n){
        if(root == null){
            return false;
        }
        if(root == n){
            return  true;
        }
        if(search(root.left,n)){
            return true;
        }
        return search(root.right,n);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(root == p || root == q){
          return root;
      }
      boolean pinLeft = search(root.left,p);
      boolean qinLeft = search(root.left,q);
      if(pinLeft && qinLeft){
          return lowestCommonAncestor(root.left,p,q);
      }
      if(!pinLeft && !qinLeft){
          return lowestCommonAncestor(root.right,p,q);
      }
      return root;
    }
}