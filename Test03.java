import java.util.*;
public class Test03 {
    static boolean[] visited;

    public static int[] solution(int total_sp, int[][] skills) {
        int length = 0;
        for (int i = 0; i< skills.length; i++) {
            length = Math.max(length,skills[i][0]);
            length =Math.max(length,skills[i][1]);
        }
        int[] answer = new int[length];
        for (int i=0;i<answer.length;i++) {
            answer[i] = 1;
        }
        for (int i=0;i<skills.length;i++) {
            answer[skills[i][0]-1] = recur(skills[i][0], skills); //상위 스킬
        }
        int sum =0;
        for (int i=0;i<answer.length;i++) {
            sum += answer[i];
        }
        total_sp /= sum;
        for (int i=0;i<answer.length;i++) {
            answer[i] *= total_sp;
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static int recur(int point, int[][] skills) {
        int sum = 0;
        boolean find = false;
        for (int i=0;i<skills.length;i++) {
            if (skills[i][0] == point) {
                sum += recur(skills[i][1], skills);
                find = true;
            }
        }
        if (find == false) {
            return 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] words = {{1,2},{1,3},{3,6},{3,4},{3,5}};
        System.out.println(solution(121, words));
    }
}
