class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0 ; i< matrix.length ; i++){

            for(int j = i; j<matrix[i].length  ;j++){
               int tremp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = tremp;
            }
        }

         for(int i = 0 ; i< matrix.length ; i++){
               int s = 0;
               int e  = matrix.length-1;

            while(s<e){
               int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp ;
                s++;
                e--;
            }
        }
    }
}