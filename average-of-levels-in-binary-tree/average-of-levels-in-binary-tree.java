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
    public List<Double> averageOfLevels(TreeNode root) {
        
        ArrayList<Double> ans = new ArrayList<>();
        // Your code here
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            long sum=0,count=0;
            Queue<TreeNode> temp = new LinkedList<>();
            while(!q.isEmpty()){
                TreeNode n = q.poll();
                sum+= n.val;
                count++;
                if(n.left!=null)temp.add(n.left);
                if(n.right!=null)temp.add(n.right);
            }
            q = temp;
            ans.add(sum*1.0 / count);
           
        }
        return ans;
        
    }
}