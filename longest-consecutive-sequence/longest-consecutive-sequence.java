class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int LongestCS =0;
        for( int num: nums){
            if(!set.contains(num-1)){
                int currentElement = num;
                int currMax = 1;
                while(set.contains(currentElement+1)){
                    currentElement++;
                    currMax++;
                }
                
                LongestCS = Math.max(currMax, LongestCS);
                    
            }
        }
        return LongestCS;
    }
}