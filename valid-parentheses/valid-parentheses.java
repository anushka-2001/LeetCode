class Solution {
    public boolean isValid(String st) {
        Stack<Character> s = new Stack<>();
        if(st.length()==1)return false;
        for(char ch : st.toCharArray()){
            if(ch=='['||ch=='{'|| ch=='('|| s.isEmpty()){
                s.push(ch);
            }
            else if(ch ==']'){
                if(s.pop()!='[') return false;
            }
             else if(ch =='}'){
                if(s.pop()!='{') return false;
            }
             else if(ch ==')'){
                if(s.pop()!='(') return false;
            }
        }
        return s.size()== 0;
    }
}