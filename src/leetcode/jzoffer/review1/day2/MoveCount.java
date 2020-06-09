package leetcode.jzoffer.review1.day2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/9     15:10
 */
public class MoveCount {
    /**
     * 求数位之和
     *
     * @param i
     * @return
     */
    private int sumOfNum(int i) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i = i / 10;
        }
        return sum;
    }

    private int move(int[][] board, int i, int j, int k) {
        //此路不通:越界，走过，不符合规则
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] == 1 || (sumOfNum(i) + sumOfNum(j)) > k) {
            return 0;
        }
        board[i][j] = 1;
        return 1 + move(board, i + 1, j, k) + move(board, i - 1, j, k) + move(board, i, j + 1, k) + move(board, i, j - 1, k);
    }

    public int movingCount(int m, int n, int k) {
        int[][] board = new int[m][n];
        return move(board, 0, 0, k);
    }
}
