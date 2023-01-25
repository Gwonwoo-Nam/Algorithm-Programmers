import java.util.Arrays;

public class Level2_HIndex {

    public static int solution(int[] citations) {
        int answer = 0;


        int max = Arrays.stream(citations).max().getAsInt();
        for (int h = 0; h <= max; h++) {
            int upCount = 0;
            int downCount = 0;
            for (int cit : citations) {
                if (cit >= h) {
                    upCount++;
                }
                if (cit <= h) {
                    downCount++;
                }
            }
            if (upCount >= h && downCount <= h) {
                answer = Math.max(answer, h);
            }
        }

        return answer;
    }



    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(solution(citations));

    }
}
