class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int result[] = new int[2];
        for(int n:nums){
            if(set.contains(n)){
                result[0]=n;
            }
            else
                set.add(n);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i))result[1]=i;
        }
        return result;
    }
}