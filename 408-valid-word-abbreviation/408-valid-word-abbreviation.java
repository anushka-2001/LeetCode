class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        if (abbr.length() > word.length())
            return false;

        int skipLen = 0;
        int wordIndex = 0;
        
        for (int i = 0; i < abbr.length(); i++) {
            
            char letter = abbr.charAt(i);
            
            if (Character.isLetter(letter)) {
                
                if (skipLen != 0) {
                    wordIndex += skipLen;
                    skipLen = 0;
                }
                if (wordIndex >= word.length() || word.charAt(wordIndex) != letter)
                    return false;
                wordIndex++;
                
            } else {
                
                int no = abbr.charAt(i) - '0';
                if (no == 0 && skipLen == 0)
                    return false;

                skipLen = skipLen * 10 + no;

            }
        }
        return wordIndex + skipLen == word.length();
    }
    
}