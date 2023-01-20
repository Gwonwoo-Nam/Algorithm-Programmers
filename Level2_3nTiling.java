public class Level2_3nTiling {
    static long REMAINDER = 1000000007;

    public static int solution(int n) {

        long[] dp = new long[n+5];
        dp[0]=1;
        dp[2]=3;
        dp[3]=0;

        int k = 4;
        while (n >= k) {
            dp[k] = (4*dp[k-2]%REMAINDER - dp[k-4] % REMAINDER+REMAINDER)%REMAINDER;
            k = k + 2;
        }
        return (int)dp[n];
    }




    public static void main(String[] args) {

        System.out.println(solution(4));
    }
}
