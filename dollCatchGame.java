
import java.util.*;

//int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//int[] moves = {1,5,3,5,1,2,1,4};

public class dollCatchGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int prev;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int move: moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move-1] != 0) {
                    prev = stack.peek();
                    stack.push(board[j][move-1]);
                    board[j][move-1] = 0;
                    if (prev == stack.peek()) {
                        answer += 2;
                        stack.pop();
                        stack.pop();
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
