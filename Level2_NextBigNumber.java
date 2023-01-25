public class Level2_NextBigNumber {
    public int solution(int n) {
        int answer = 0;
        int target = n + 1;
        while (true) {
            String s = Integer.toBinaryString(target);
            if (count(s) == count(Integer.toBinaryString(n))) {
                return target;
            }
            target++;
        }
    }

    private static int count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
