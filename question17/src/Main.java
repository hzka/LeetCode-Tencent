public class Main {

    public static void main(String[] args) {
       generateMatrix(3);
    }
    public static int[][] generateMatrix(int n) {
        int [][]matrix = new int [n][n];
        int layers = (n-1)/2+1;
        int counting = 1;
        for(int i = 0;i<layers;i++){
            //从左向右
            for(int j = i;j<n-i;j++){
                matrix[i][j] = counting;
                counting++;
            }
            //从上到下
            for(int k = i+1;k<n-i;k++){
                matrix[k][n-i-1] = counting;
                counting++;
            }
            //从右向左
            for(int j = n-i-2;(j>=i);j--){
                matrix[n-i-1][j] = counting;
                counting++;
            }
            //从下往上
            for(int k = n-i-2; (k>i) ;k--){
                matrix[k][i] = counting;
                counting++;
            }
        }
        return matrix;
    }
}
