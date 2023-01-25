public class Level2_NumberExpression {
    public static int solution(int n) {
        int answer = 0;
        for(int i=1;i<n;i++) {
            int k = i + 1;
            int sum = i;
            while (sum < n) {
                sum += k;
                k++;
            }
            if (sum == n) {
                answer++;
            }
        }
        return answer+1;//같은 경우 +1
    }
    public static void main(String[] args) {

        System.out.println(solution(15));

    }
}
