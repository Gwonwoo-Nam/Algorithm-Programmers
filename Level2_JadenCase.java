import java.util.Arrays;
import java.util.function.Predicate;

public class Level2_JadenCase {

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int flag = 1;
        s = s.toLowerCase();
        for (int i=0; i<s.length();i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
                flag = 0;
            }
            else if (flag == 1 && s.charAt(i) != ' ') {
                sb.append((char)(s.charAt(i) - 32));
                flag = 0;
            }
            else if (s.charAt(i) == ' ') {
                sb.append(s.charAt(i));
                flag = 1;
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(solution("  aba"));

    }
}
