class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums); // [1,1,1,2,2,2,2]
        return nums[nums.length/2];
    }
}