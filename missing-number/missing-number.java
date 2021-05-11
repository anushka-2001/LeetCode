class Solution {
    public int missingNumber(int[] nums) {
      int n =nums.length;
        int es= (n*(n+1))/2;
        int s=0;
        for(int j:nums) s+=j;
        return es-s;
    }
}