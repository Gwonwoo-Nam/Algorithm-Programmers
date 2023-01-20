public class Level2_NQueen {
    public static int answer = 0;

    public static int solution(int n) {
        int[] board = new int[n];
        for (int i = 0; i < board.length; i++) {
            board[0] = i;
            DFS(board, 1);
        }

        return answer;
    }

    public static void DFS(int[] board, int col) {
        if (col == board.length) {
            answer++;
            return;
        }
        for (int n = 0; n < board.length; n++) {

            board[col] = n;
            if (!check(board, col, n)) {
                DFS(board, col + 1);
            }

        }
    }

    private static boolean check(int[] board, int col, int n) {
        for (int i = 0; i < col; i++) {
            if (board[i] == n || board[i] == n + (col - i) || board[i] == n - (col - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
