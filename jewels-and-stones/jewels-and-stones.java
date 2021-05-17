class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> j = new HashSet<>();
        for(char c : jewels.toCharArray()){
            j.add(c);
        }
        int count=0;
        for(char s : stones.toCharArray()){
            if(j.contains(s))count++;
        }
        return count;
    }
}