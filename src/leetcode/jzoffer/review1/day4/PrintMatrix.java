package leetcode.jzoffer.review1.day4;

import java.util.ArrayList;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/11     15:03
 */
public class PrintMatrix {
    //还有一种方法：打印边界（圆）
    //待看
    private  boolean canMove(int[][] board,int i,int j){
        return i>=0&&i<board.length&&j>=0&&j<board[0].length&&board[i][j]==0;
    }
    public  void move(int[][] matrix, int[][] board,int i , int j ,int direct,ArrayList<Integer> list,int[][] direction){
                board[i][j] = 1;
                list.add(matrix[i][j]);
                int flag = 0;
                //准备移动
                for(int x = 0 ;  x<4; x++){
                    direct = (direct+x)%4;
                    if(canMove(board,i+direction[direct][0],j+direction[direct][1])){
                        flag=1;
                        move(matrix,board,i+direction[direct][0],j+direction[direct][1],direct,list,direction);
                        break;
                    }
                }
                //没有可移动的了
                if(flag==0){
                    return;
                }
    }
    public int[] spiralOrder(int[][] matrix) {
            //m 行  n 列
            int m = matrix.length,n = matrix[0].length;
            //用一个棋盘来记录是否走过
            int[][] board = new int[m][n];
            int i = 0 , j = 0 ;
             ArrayList<Integer> list = new ArrayList<>();
             //方向要有一致性，当原方向不能保持下去了再转向
            // 0 1 2 3 右 下 左 上
            int[][] direction = new int[][]{
                    {0,1},
                    {1,0},
                    {0,-1},
                    {-1,0}
            };
            move(matrix,board,0,0,0,list,direction);
            int[] result = new int [list.size()];
            for(int x= 0 ; x < list.size();x++){
                result[x] = list.get(x);
            }
            return  result;
    }
}
