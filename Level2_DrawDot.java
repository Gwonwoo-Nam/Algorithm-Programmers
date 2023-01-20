public class Level2_DrawDot {

    public static long solution(int k, int d) {

        long x = 0;
        long y = 0;
        long answer = 0;
        while (x <= d/k) {
            answer += (int)(Math.sqrt((long)d * d - (x * k) * (x * k)) / k) + 1;
            x++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 4));
    }

}

