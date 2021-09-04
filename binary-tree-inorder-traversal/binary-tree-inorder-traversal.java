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
    List<Integer> ans = new LinkedList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
       Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        while(curr!=null || !stack.isEmpty()){
            
            if(curr!=null){
                stack.push(curr);
                curr= curr.left;
            }
            else{
                curr = stack.pop();
                ans.add(curr.val);
                curr = curr.right;
            }
            
            
        }
        
        
        
        return ans;
        
    }
}