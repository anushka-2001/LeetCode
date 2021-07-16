class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int currmax= 0;
        for(int i=0; i<nums.length;i++){
            if(currmax==0){
                candidate=nums[i];
            }
            currmax += (candidate==nums[i])?1:-1;
        }
        return candidate;
    }
}