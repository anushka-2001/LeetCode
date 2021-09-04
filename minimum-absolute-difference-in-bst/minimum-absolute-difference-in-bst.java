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
    public int getMinimumDifference(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
        ans = inorder(root, ans);
        int absDifference = Integer.MAX_VALUE;
        for(int i=0; i<ans.size()-1;i++){
            
            int ab = Math.abs(ans.get(i+1)- ans.get(i));
            absDifference = Math.min(absDifference,ab);
            
        }
        return absDifference;
    }
    public List<Integer> inorder(TreeNode root, List<Integer> ans){
        
        
        if(root!=null){
            inorder(root.left, ans);
            ans.add(root.val);
            inorder(root.right, ans);
        }
        return ans;
        
    }
}