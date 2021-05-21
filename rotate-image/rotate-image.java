class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //transpose
        for(int i=0; i<n ; i++){
            for(int j = i ; j<n ; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        //reverse
        for(int i=0; i<n ; i++){
            for(int j = 0 ; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][n-j-1];
                matrix[i][n-j-1]= temp;
            }
        }
    }
}
// transpose - i=0, j=i
// reverse i, j = 0, ij swap i n-j-1 (j<n/2)