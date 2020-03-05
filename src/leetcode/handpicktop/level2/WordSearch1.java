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
    boolean[][] visited;//记录已被访问的位置
    int[][] direct = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};//偏移数组

    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || word == null) return false;
        int row = board.length;
        int col = board[0].length;
        visited = new boolean[row][col];
        //遍历已任意点开始，判断是否存在该单词
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (back_tracking(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    //递归方法,下一个是否相等 留着下一个递归里判断
    public boolean back_tracking(char[][] board, String word, int i, int j, int n) {//n代表第几个字母, i j 代表中心点坐标
        //递归终点
        if (n == word.length()) {
            return true;
        }
        if (isLegal(i, j, board) && !visited[i][j] && board[i][j] == word.charAt(n)) {//满足规则，且相等
            visited[i][j] = true;
            for (int d = 0; d < direct.length; d++) {
                int newRow = i + direct[d][0];
                int newCol = j + direct[d][1];
                //未越界，未访问过，递归
                if (back_tracking(board, word, newRow, newCol, n + 1)) {
                    return true;
                }
            }
            visited[i][j] = false;
        }

        return false;
    }

    //判断是否越界
    public boolean isLegal(int row, int col, char[][] board) {
        return row >= 0 && col >= 0 && row < board.length && col < board[0].length;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEED";
        WordSearch1 wordSearch = new WordSearch1();
        System.out.println(wordSearch.exist(board, word));

    }
}
