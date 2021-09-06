class Solution {
    public int trap(int[] height) {
        int maxLeft =0, maxRight =0, left=0, n = height.length, right=n-1,ans=0;
        while(left<=right){
            
            if(height[left]<=height[right]){
                if(maxLeft<height[left]){
                    maxLeft = height[left];
                }
                else{
                    ans += maxLeft-height[left];
                }
                left++;
            }
            else{
                if(maxRight<height[right]){
                    maxRight = height[right];
                }
                else{
                    ans += maxRight-height[right];
                }
                right--;
            }
            
        }
        return ans;
    }
}