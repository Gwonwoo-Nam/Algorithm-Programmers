
import java.util.Arrays;

public class Level1_StrangeString {

    public static String solution(String s) {


        StringBuffer answer = new StringBuffer();
        int i =0;
        while (i < s.length()) {
            int j=0;

            while(i+j < s.length() && s.charAt(i+j) != ' ') {
                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(s.charAt(i+j)));
                } else {
                    answer.append(Character.toLowerCase(s.charAt(i+j)));
                }
                j++;
            }
            i += j;

            if (i >= s.length()) {
                break;
            }
            answer.append(s.charAt(i));
            i++;
        }
        return answer.toString();
    }

    public static void main(String[] args) {

        String s = "tryhello world  dd";
        System.out.println(solution(s));
    }


}
