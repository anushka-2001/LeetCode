class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "",0,0,n);
        return result;
    }
    public void backtrack(List<String> result, String op, int open , int close, int max){
        if(op.length()== 2*max){
            result.add(op);
            return;
        }
        if(open<max){
            backtrack(result,op+"(", open+1, close,max);
        }
        if(close<open) backtrack(result, op+")", open, close+1, max);
    }
}