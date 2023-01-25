import java.util.Stack;

public class Level2_CorrectBracket {
    static boolean solution(String s) {
        boolean answer = true;

        Stack<Integer> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                brackets.push(1);
            }
            if (s.charAt(i) == ')') {
                if (brackets.empty()) {
                    return false;
                }
                brackets.pop();
            }
        }
        if (brackets.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("(()("));
    }

}
