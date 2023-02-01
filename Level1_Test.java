import java.util.ArrayList;
import java.util.List;

public class Level1_Test {

    public static int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> answer = new ArrayList<>();

        int[] score = {0,0,0};
        int max = 0;
        for (int i = 0; i < answers.length; i++) {
            if (first[i % first.length] == answers[i]) {
                score[0]++;
            }
            if (second[i % second.length] == answers[i]) {
                score[1]++;
            }
            if (third[i % third.length] == answers[i]) {
                score[2]++;
            }
        }
        for (int i = 0; i < score.length; i++) {
            max = Math.max(max, score[i]);
        }
        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 4, 5};

        System.out.println(solution(answers));
    }

}
