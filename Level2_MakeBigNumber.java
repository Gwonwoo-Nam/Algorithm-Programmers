public class Level2_MakeBigNumber {

    public static String solution(String number, int k) {
        StringBuffer sb = new StringBuffer();
        int strlen = number.length() - k; //만들 숫자 자릿 수
        int big = 0;
        int bigIndex = 0;
        for (int i = 1; i <= strlen; i++) {
            big = 0;
            for (int j = bigIndex; j < number.length() - (strlen - i); j++) {//10 - (6) = 3
                if (number.charAt(j) == 9) {
                    big = 9;
                    bigIndex = j+1;
                    break;
                }
                if (big < number.charAt(j) - '0') {
                    big = number.charAt(j) - '0';
                    bigIndex = j+1;
                }
            }
            sb.append(big);
        }
        return sb.toString();
    }
/*
    public static void recur(String number, int k) {
        if (k == 0 && !number.isEmpty()) {
            MAX = Math.max(MAX, Integer.parseInt(number));
            return;
        }
        for (int i = 0; i < number.length(); i++) {
            recur(number.substring(0, i) + number.substring(i + 1, number.length()), k - 1);
        }
    }*/

    public static void main(String[] args) {

        System.out.println(solution("4321", 1));

    }
}
