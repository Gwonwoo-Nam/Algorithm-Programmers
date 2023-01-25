public class Level2_BinaryTransform {
    public int binaryTCount = 0;
    public int zeroCount = 0;

    public String binaryT(String s) {
        int count = 0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        zeroCount += s.length() - count;
        binaryTCount++;
        return Integer.toBinaryString(count);
    }
    public int[] solution(String s) {
        while (!s.equals("1")) {
            s = binaryT(s);
        }
        return new int[]{binaryTCount,zeroCount};
    }

}
