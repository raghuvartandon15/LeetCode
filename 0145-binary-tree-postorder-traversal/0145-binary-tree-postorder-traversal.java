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
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> result=new ArrayList();
        postordertrav(root, result);
        return result;
    }
    private void postordertrav(TreeNode root, List<Integer> result){
        if(root==null) return;
        postordertrav(root.left, result);
        postordertrav(root.right, result);
        result.add(root.val);

    }
}