class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int number = n*(n+1)/2;
        for(int i=0; i<n; i++){
            number-=nums[i];
        }
        // System.out.println(number);
        return number;
    }
}