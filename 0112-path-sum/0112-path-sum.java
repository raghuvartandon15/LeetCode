/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        Stack<TreeNode> path=new Stack();
        Stack<Integer> sum_path=new Stack();

        path.push(root);
        sum_path.push(root.val);

        while(!path.isEmpty()){
            TreeNode temp=path.pop();
            int tempval=sum_path.pop();

            if(tempval==targetSum && temp.left==null && temp.right==null){
                return true;
            }
            if(temp.right!=null){
                path.push(temp.right);
                sum_path.push(temp.right.val+tempval);
            }
            if(temp.left!=null){
                path.push(temp.left);
                sum_path.push(temp.left.val+tempval);
            }
        }
        return false;
    }
}