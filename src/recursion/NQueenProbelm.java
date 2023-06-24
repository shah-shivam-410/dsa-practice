package recursion;

/**
 * 
 * 51. N-Queens https://leetcode.com/problems/n-queens/ 
 * 
 * The n-queens puzzle is
 * the problem of placing n queens on an n x n chessboard such that no two
 * queens attack each other.
 * 
 * Given an integer n, return all distinct solutions to the n-queens puzzle. You
 * may return the answer in any order.
 * 
 * Each solution contains a distinct board configuration of the n-queens'
 * placement, where 'Q' and '.' both indicate a queen and an empty space,
 * respectively.
 * 
 * Example 1: 
 * Input: n = 4 Output:
 * [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]] Explanation:
 * There exist two distinct solutions to the 4-queens puzzle as shown above
 * 
 * Example 2:
 * Input: n = 1 Output: [["Q"]]
 *
 */

public class NQueenProbelm {

	public static void main(String[] args) {
		int n = 4;
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = 0;
			}
		}

		nQueen(board, 0, n);

	}

	private static Boolean nQueen(int[][] board, int row, int N) {

		if (row == N) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("----------------------------");
			return true;
		}

		for (int col = 0; col < N; col++) {
			if (isSafe(board, row, col)) {
				board[row][col] = 1;
				if (Boolean.TRUE.equals(nQueen(board, row + 1, N)))
					return true;
				board[row][col] = 0;
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] board, int row, int col) {
		for (int i = 0; i <= col; i++) {
			if (board[row][i] == 1)
				return false;
		}
		for (int i = 0; i <= row; i++) {
			if (board[i][col] == 1)
				return false;
		}
//		if(board[row-1][col+1] == 1 || board[row+1][col-1] == 1)
//			return false;

		return true;
	}

}
