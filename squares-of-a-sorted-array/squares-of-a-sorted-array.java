class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int i=0, j = n-1;
        for(int x = n-1;x>=0;x--){
            if(Math.abs(nums[i])> Math.abs(nums[j])){
                result[x]= nums[i]*nums[i];
                i++;
            }
            else{
                result[x]= nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }
}