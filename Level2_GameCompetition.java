public class Level2_GameCompetition {

    public static int solution(int n, int a, int b) {
        int answer = 0;
        //같은 조가 아니면
        while ((int)Math.ceil(a / 2.0) != (int)Math.ceil(b / 2.0)) {
            a = (int)Math.ceil(a / 2.0);
            b = (int)Math.ceil(b / 2.0); //한 라운드 올라간다.
            answer++;
        }


        return answer+1;
    }

    public static void main(String[] args) {

        System.out.println(solution(1,1,1));
    }
}
