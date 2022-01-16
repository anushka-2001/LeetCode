class Solution {
    public int maxArea(int[] height) {
        int start =0, end = height.length-1;
        int maxArea=0, currArea=0;
        while(start<end){
            currArea = Math.min(height[start], height[end])*(end-start);
            maxArea= Math.max(currArea,maxArea);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxArea;
    }
}