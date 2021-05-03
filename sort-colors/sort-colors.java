class Solution {
    public void sortColors(int[] nums) {
        int idx=0, p1= -1, n = nums.length ,p2= n-1;
        
        while(idx<=p2){
            if(nums[idx]==0){
                int temp = nums[++p1];
                nums[p1]= nums[idx];
                nums[idx++]= temp;
                
            }
            else  if(nums[idx]==2){
                int temp = nums[idx];
                nums[idx]= nums[p2];
                nums[p2--]= temp;
                
            }
            else idx++;
           
        }
    }
}