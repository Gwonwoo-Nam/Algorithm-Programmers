import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Level2_Boat {
    public static int solution(int[] people, int limit) {

        int answer = 0;
        List<Integer> pp = new ArrayList();
        for (int e : people) {
            pp.add(e);
        }
        Collections.sort(pp, Collections.reverseOrder());

        int count = 0; //구한 수
        int i = 0;
        int j = people.length - 1;
        while (i < j) {
            if (pp.get(i) + pp.get(j) <= limit) { //두명 태우는 경우
                count += 2;
                i++;
                j--;
            } else { //무거운 사람 한명만
                count++;
                i++;
            }
            answer++;
        }
        if (i == j) {
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] people = {40, 40, 40};
        System.out.println(solution(people, 120));
    }
}
