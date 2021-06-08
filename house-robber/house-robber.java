class Solution {
    public int rob(int[] nums) {
        int rob =0, donot = 0;
        for(int i=0; i<nums.length; i++){
            int current_rob = donot + nums[i];
            donot = Math.max(donot, rob);
            rob = current_rob;
        }
        return Math.max(rob, donot);
    }
}