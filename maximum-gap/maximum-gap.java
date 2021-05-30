class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==1 || nums==null)return 0;
        Arrays.sort(nums);
        int max1=0;
        for(int i=1; i<nums.length;i++){
            
                max1 =Math.max(nums[i]-nums[i-1],max1);
            
        }
        return max1;
    }
}