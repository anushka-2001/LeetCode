// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int row[] = new int[matrix.length];
//         int col[] = new int[matrix[0].length];
//         for(int i=0; i<matrix.length; i++){
//             for(int j =0; j<matrix[0].length; j++){
                
//                 if(matrix[i][j] == 0)
//                 col[j] = -1;
//                 row[i]= -1;
//                 } 
//             }
        
//         for(int i =0; i<matrix.length; i++){
//          for(int j =0; j<matrix[0].length; j++){
//              if( row[i] == -1 && col[j] == -1){
//                  row[i] =1;
//                  col[j] =1;
//                  matrix[i][j]= 0;
//              }
//          //     if(col[j] == 1){
//          //         matrix[i][j]=0;
//          //     }
//          }           
//         }
//         // return matrix;
//     }
// }

class Solution {
  public void setZeroes(int[][] matrix) {
    int R = matrix.length;
    int C = matrix[0].length;
    Set<Integer> rows = new HashSet<Integer>();
    Set<Integer> cols = new HashSet<Integer>();

    // Essentially, we mark the rows and columns that are to be made zero
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (matrix[i][j] == 0) {
          rows.add(i);
          cols.add(j);
        }
      }
    }

    // Iterate over the array once again and using the rows and cols sets, update the elements.
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (rows.contains(i) || cols.contains(j)) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}