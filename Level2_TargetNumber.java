public class Level2_TargetNumber {
    static int answer;
    public static int solution(int[] numbers, int target) {

        recur(0,0,numbers, target);
        return answer;
    }

    public static void recur(int len, int sum, int[] numbers, int target) {
        if (len == numbers.length) {
            if (target == sum) {
                answer++;
            }
            return ;
        }

        recur(len + 1, sum + numbers[len], numbers, target);
        recur(len + 1, sum - numbers[len], numbers, target);
    }

    public static void main(String[] args) {

        int[] numbes = {1,1,1,1,1};
        System.out.println(solution(numbes,3));

    }
}
