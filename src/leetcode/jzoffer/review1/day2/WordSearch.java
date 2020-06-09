package leetcode.jzoffer.review1.day2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/9     13:46
 */
public class WordSearch {

    //小结：第一个几点不用特殊判断，都拿进递归里处理。

    //通过偏移量来上下左右移动
    private  int[][] move =  new int[][]{
        {0,1},//右 0
        {0,-1},//左 1
        {1,0},//下 2
        {-1,0}//上3
    };
    //判断当前节点是否是正确节点
    private boolean exist(char[][] board,String word,int w ,int i , int j,boolean[][] road){
        if(w == word.length()) return  true; //终点
        if(i<0||i>=board.length||j<0||j>=board[0].length) return  false;//越界  //校验是否有效
        //是否重复
        if(road[i][j]) return false;
        if(word.charAt(w)==board[i][j]){
            for(int x = 0 ; x < move.length;x++) {
                 road[i][j] = true;
                if(exist(board,word,w+1,i+move[x][0],j+move[x][1],road)){
                    return  true;
                }
                road[i][j] = false;
            }
        }
                return  false;

    }

    public boolean exist(char[][] board, String word) {
        boolean[][]  road = new boolean[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){//找到出发点
                   for(int x = 0 ; x<move.length;x++){//四个方向移动
                       //记录
                       road[i][j] = true;
                       if(exist(board,word,1,i+move[x][0],j+move[x][1],road)) {
                           return true;
                       }
                       //消除记录
                       road[i][j] = false;
                   }
                }
            }
        }
        return  false;
    }
}
