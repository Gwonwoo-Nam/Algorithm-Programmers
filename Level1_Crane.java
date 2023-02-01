import java.util.Stack;

public class Level1_Crane {


    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int i=0;i<moves.length;i++) {
            int getBasketLocation = moves[i];
            int dollOrNothing = getDollOrNothing(board, getBasketLocation-1);
            if (dollOrNothing != 0) {
                if (!basket.empty() && basket.peek() == dollOrNothing) {
                    basket.pop();
                    answer = answer + 2;
                    continue;
                }
                basket.push(dollOrNothing);
            }
        }


        return answer;
    }

    private static int getDollOrNothing(int[][] board, int location) {
        for (int i =0;i< board.length;i++) {
            if (board[i][location] != 0) {
                int doll =board[i][location];
                board[i][location] = 0;
                return doll;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }

}
