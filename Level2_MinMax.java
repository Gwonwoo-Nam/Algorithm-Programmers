import java.util.Arrays;

public class Level2_MinMax {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] numbers = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }
        answer = min + " " + max;
        return answer;
    }
}
