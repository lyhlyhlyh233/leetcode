//回溯算法
package leetcode.handpicktop.level2;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/4     14:25
 */

/**
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 */
//不用讨论第一个节点的情况，一视同仁。从每一个节点搜索。
public class WordSearch1 {
    boolean[][] visted;//记录已被访问的位置
    int[][] direct = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};//偏移数组

    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || word == null) return false;
        int row = board.length;
        int col = board[0].length;
        visted = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (back_tracking(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean back_tracking(char[][] board, String word, int i, int j, int n) {
        if(n == word.length()) return  true;//递归终点 
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
        WordSearch1 wordSearch = new WordSearch1();
        System.out.println(wordSearch.exist(board, word));

    }
}
