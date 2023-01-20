public class Level2_MaginElevator {

    public static int solution(int storey) {

        int answer = 0;

        while (storey > 0) {
            int leftOver = storey % 10;

            if (leftOver > 5 || (leftOver == 5 && (storey / 10) % 10 >= 5)) { //+버튼을 누르는 경우
                answer = answer + (10 - leftOver);
                storey /= 10;
                storey++;
            }
            else {
                answer = answer + leftOver;
                storey /= 10;
            }



        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(16));

    }
}
