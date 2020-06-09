package leetcode.jzoffer.review1.day1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/8     16:09
 */
public class FindInDimensionArray {
    //左下表标志数
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
            int row = matrix.length;
            if(row==0) return  false;
            int col =  matrix[0].length;
           // int i = 0 , j = 0;//i代表第几行，j代表第几列
            for(int i = 0 ; i< row ; i++){
                for(int j = 0 ; j<col;j++){
                     int num = matrix[i][j];
                     if(num==target) return true;
                     if(num>target) break;
                }
            }
            return  false;
    }
}
