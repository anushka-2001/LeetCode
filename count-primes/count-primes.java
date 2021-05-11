class Solution {
    public int countPrimes(int n) {
        boolean ans[] = new boolean[n+1];
        Arrays.fill(ans,true);
        for(int i=2; i*i<n ; i++){
            if(ans[i]){
                for(int j =i;j*i<n;j++ ){
                    ans[i*j]=false;
                }
            }
            
        }
        int count =0;
        for(int i=2; i<n;i++){
            if(ans[i])count++;
        }
        return count;
    }
}