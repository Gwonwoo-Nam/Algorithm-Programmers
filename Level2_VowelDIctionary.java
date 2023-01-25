import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Level2_VowelDIctionary {

    static String vowel = "AEIOU";
    static List<String> dic = new ArrayList<>();

    public static int solution(String word) {
        int answer = 0;
        gen("");
        Collections.sort(dic, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = 0;
                while (i < Math.min(o1.length(), o2.length())) {
                    if (o1.charAt(i) < o2.charAt(i)) {
                        return -1;
                    }
                    else if (o1.charAt(i) > o2.charAt(i)) {
                        return 1;
                    }
                    i++;
                }
                return 0;
            }
        });
        for (int i = 0; i<dic.size();i++) {
            if (dic.get(i).equals(word)) {
                answer = i;
            }
        }
        return answer+1;
    }

    public static void gen(String str) {
        if (!dic.contains(str) && !str.isEmpty()) {
            dic.add(str);
        }
        if (str.length() == 5) {
            return ;
        }
        for (int i = 0; i < 5; i++) {
            gen(str + vowel.charAt(i));
        }
    }

    public static void main(String[] args) {
        String word = "AAAAE";

        System.out.println(solution(word));

    }
}
