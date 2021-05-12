class Solution {
    public int findShortestSubArray(int[] nums) {
          int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        int len = max - min;
        int [] start = new int [len + 1];
        int [] end = new int [len + 1];
        int [] frequency = new int [len + 1];
        int currFre = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(frequency[nums[i] - min] == 0){
                start [nums[i] - min] = i;
            }
            end [nums[i] - min] = i;
            frequency[nums[i] - min]++;
            if(frequency[nums[i] - min] > currFre){
                res = end [nums[i] - min] - start [nums[i] -min] + 1;
                currFre = frequency[nums[i] - min];
            }else if (frequency[nums[i] - min] == currFre){
                res = Math.min(res,end [nums[i] - min] - start [nums[i] - min] + 1);
            }
        }
        return res;
    }
}