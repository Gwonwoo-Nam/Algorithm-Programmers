public class Level2_LongJump {
    public long solution(int n) {
        int mod = 1234567;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = ((dp[i - 1])%mod + dp[i - 2]%mod)%mod; // 1 + 2부터 시작
        }
        return dp[n];
    }
}
