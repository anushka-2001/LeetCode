class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length<=1 ||nums==null) return;
        
        int i= nums.length-1;
        
        while(i >0&& nums[i-1] >=nums[i]) i--;
        
        if(i>0){
             int j= nums.length-1;
            while(nums[j] <=nums[i-1]){
                j--;
            }
            swap(nums, i-1,j);
        }
        
        reverse(nums, i, nums.length-1);
        
        
    }
    private void swap (int nums[], int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }
    
    
    private void reverse ( int num[], int i,int j){
        while(i<j){
            swap(num, i++, j--);
        }
    }
    
}