class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num[] = new int[2];
        int length = nums.length;
        for(int i=0; i<length; i++){
            int n = nums[i];
            for(int j = 0; j<length; j++){
                if(target-n == nums[j] && j!=i){
                    num[0]= i;
                    num[1] = j;
                    return num;
                }
            }
        }
        return null;
    }
}