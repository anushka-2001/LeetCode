class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;
        for(char s:stones.toCharArray()){
            if(jewels.contains(s+""))count++;
        }
        return count;
    }
}