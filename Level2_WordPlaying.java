import java.util.Stack;

public class Level2_WordPlaying {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < words.length; i++) {
            if (strings.isEmpty()) {
                strings.push(words[i]);
            } else if (strings.peek().charAt(strings.peek().length() - 1) == words[i].charAt(0) && !strings.contains(
                    words[i])) {
                strings.push(words[i]);

            } else {
                return new int[]{i%n+1,(int)Math.ceil((i+1)/(double)n)};
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        System.out.println(solution(2,words));

    }
}
