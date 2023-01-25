import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Level2_BiggestNumber {

    public static String solution(int[] numbers) {

        List<String> strings = new ArrayList<>();
        for (int number : numbers) {
            strings.add(Integer.toString(number));
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return (str2+str1).compareTo(str1+str2);
            }
        });

        StringBuffer sb = new StringBuffer();
        if (strings.get(0).equals("0")) {
            return "0";
        }
        for (String e : strings) {

            sb.append(e);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0, 0};
        System.out.println(solution(numbers));

    }
}
