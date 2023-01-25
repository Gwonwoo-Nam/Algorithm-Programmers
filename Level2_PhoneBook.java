import java.util.HashMap;
import java.util.Map;

public class Level2_PhoneBook {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> hashMap = new HashMap();
        for (String phoneNumber : phone_book) {
            hashMap.put(phoneNumber, 1);
        }
        for (String phoneNumber : phone_book) {
            for (int i = 0; i < phoneNumber.length(); i++) {
                if (hashMap.containsKey(phoneNumber.substring(0, i))) {
                    return false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] phoneBook = {"123","456","789"};
        System.out.println(solution(phoneBook));

    }
}
