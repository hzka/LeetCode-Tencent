import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;
        int n = matrix.length, m = matrix[0].length;//行数和列数
        if (m == 0) return result;
        int layers = (Math.min(n, m) - 1) / 2 + 1;//圈数
        for (int i = 0; i < layers; i++) {
            //从左向右添加
            for (int k = i; k < m - i; k++) {
                result.add(matrix[i][k]);
            }
            //从上到下添加每一列数据
            for (int j = i + 1; j < n - i; j++) {
                result.add(matrix[j][m - i - 1]);
            }
            //判断是否会重复打印（从右向左的每行数据），先保证右边再保证左边。
            for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--) {
                result.add(matrix[n - i - 1][k]);
            }
            for (int j = n - i - 2; (j > i) && (m - i - 1 != i); j--) {
                result.add(matrix[j][i]);
            }
        }
        return result;
    }
//    public static List<Integer> spiralOrder(int [][] array) {
//        List<Integer> result = new ArrayList<Integer>();
//        if (array.length == 0) return result;
//        int n = array.length, m = array[0].length;//行数和列数
//        if (m == 0) return result;
//        int layers = (Math.min(n, m) - 1) / 2 + 1;//圈数
//        for (int i = 0; i < layers; i++) {
//            //从左向右打印
//            for (int k = i; k < m - i; k++)
//                result.add(array[i][k]);
//            //从上往下的每一列数据
//            for (int j = i + 1; j < n - i; j++)
//                result.add(array[j][m - i - 1]);
//            //判断是否会重复打印(从右向左的每行数据),首先保证右边再保证左边
//            for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--)
//                result.add(array[n - i - 1][k]);
//            //判断是否会重复打印(从下往上的每一列数据),首先保证下边比上边大，再保证不要往上走越界了，
//            for (int j = n - i - 2; (j > i) && (m - i - 1 != i); j--)
//                result.add(array[j][i]);
//        }
//        return result;
//    }
}
