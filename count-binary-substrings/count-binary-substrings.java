class Solution {
    public int countBinarySubstrings(String s) {
        int prevblock=0;
        int currblock=1;
        char current = s.charAt(0);
        int binarysubs=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==current){
                currblock++;
            }
            else {binarysubs += Math.min(prevblock,currblock);
            prevblock = currblock;
            currblock =1;}
            current=s.charAt(i);
        }
            binarysubs+=Math.min(prevblock,currblock);
        return binarysubs;
    }
}