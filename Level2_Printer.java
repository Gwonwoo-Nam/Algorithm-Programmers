public class Level2_Printer {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        int cur = 0;
        int temp = 0;
        for (int i = 9; i > 0; i--) {
            for (int loc = cur; loc < priorities.length; loc++) {
                if (priorities[loc] == i) {
                    answer++;
                    temp = loc;
                    if (loc == location) {
                        return answer;
                    }
                }
            }
            for (int loc = 0; loc < cur; loc++) {
                if (priorities[loc] == i) {
                    answer++;
                    temp = loc;
                    if (loc == location) {
                        return answer;
                    }
                }
            }
            cur = temp;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] priorities = {1, 1, 3, 1, 1, 1};
        System.out.println(solution(priorities, 0));

    }

}
