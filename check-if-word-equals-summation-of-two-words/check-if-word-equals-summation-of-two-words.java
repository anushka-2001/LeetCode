class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
       return numeric(firstWord) + numeric(secondWord) == numeric(targetWord);
    }
    private int numeric(String word){
        int sum =0;
        for(char ch : word.toCharArray()){
            
           sum = sum*10 + (int)(ch - 'a'); // 97 -97 a-> 0, 98 - 97 -> 1
            
        }
        return sum;
    }
}