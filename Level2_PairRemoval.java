import java.util.Stack;

public class Level2_PairRemoval {
    public static int solution(String s)
    {
        Stack<Character> sb =new Stack<>();
        for (int i=0;i<s.length();i++) {
            if(!sb.isEmpty()) {
                if (sb.peek() == s.charAt(i)) {
                    sb.pop(); //값 제거
                    continue;
                }
                sb.push(s.charAt(i)); //값이 다르면 스택에 값 쌓기
            }
            else {
                sb.push(s.charAt(i)); //비었으면 값 추가
            }
        }
        if (sb.empty()) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {

        System.out.println(solution("baabaa"));

    }
}
