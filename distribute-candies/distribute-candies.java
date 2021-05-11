class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set= new HashSet<>();
        for(int n: candyType){
            set.add(n);
        }
        return Math.min(set.size(),candyType.length/2);
    }
}