class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return findsum(firstWord) + findsum(secondWord) == findsum(targetWord);
    }
    
    public int findsum(String word){
        int sum =0;
        for(char ch : word.toCharArray()){
            sum = sum*10  + (int)(ch -'a');
        }
        return sum;
    }
}