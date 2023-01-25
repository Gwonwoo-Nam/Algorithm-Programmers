public class Level2_FibonacciNumber {
    public static int mod = 1234567;
    public static int solution(int n) {
        int[] f = new int[n+1]; //1~n범위
        f[n] = 1;
        for (int i=n; i>=2;i--) {
            dp(f, i);
        }
        return f[1] % mod;
    }

    private static void dp(int[] f, int i) {
        if (f[i] > 0) {
            f[i - 1] = (f[i-1] + f[i])%mod;
            f[i - 2] = (f[i-2] + f[i])%mod;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(1500));
    }
}
