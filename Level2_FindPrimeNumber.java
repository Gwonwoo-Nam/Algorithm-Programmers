
import java.util.HashSet;

import java.util.Set;

public class Level2_FindPrimeNumber {

    static String[] strnums;
    static Set<Integer> resultList = new HashSet<>();

    public static int solution(String numbers) {
        strnums = numbers.split("");
        int n = numbers.length();

        perm(0, "", new boolean[n]); //0,1,3
        System.out.println((resultList));

        return resultList.size();
    }

    public static void perm(int cnt, String strnum, boolean[] check) {

        if (strnum != "") {
            if (isPrime(strnum)) {
                resultList.add(Integer.parseInt(strnum));
            }
        }

        for (int i = 0; i < strnums.length; i++) {
            if (check[i]) {
                continue; //선택 시 skip
            }
            check[i] = true;
            perm(cnt + 1, strnum + strnums[i], check);
            check[i] = false; //재귀가 종료된 후 다른 재귀에서 탐색을 진행
        }
    }

    public static boolean isPrime(String number) {
        int num = Integer.parseInt(number);
        if (num == 2 || num == 3) {
            return true;
        }
        if (num == 1 || num % 2 == 0) {
            return false;
        }
        for (int i = 2; i < (int)Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("0"));
    }
}
