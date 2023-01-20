public class Level2_JoyStick {

    public static int solution(String name) {
        int answer = 0;
        int maxMove = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            answer += getShortestPath(name.charAt(i));
            int index = i + 1;
            while(index < name.length() && name.charAt(index) == 'A') {
                index++; // index는 A가아닌것이 처음으로 오는 칸
            }
            maxMove = Math.min(2*i+name.length()-index, maxMove);
            maxMove = Math.min(maxMove, i+2*(name.length()-index));
        }


        return answer + maxMove;
    }

    public static int getShortestPath(char src) {
        char dest = 'A';
        int abs = Math.abs(dest - src);
        return Math.min(abs, Math.abs(abs - 25) + 1);
    }

    public static void main(String[] args) {

        System.out.println(solution("AAABBAAAAAAAAAAAAAAAABABAA"));

    }
}
