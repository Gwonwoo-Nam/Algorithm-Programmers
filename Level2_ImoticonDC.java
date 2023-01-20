import java.util.Arrays;

public class Level2_ImoticonDC {

    public static int MAX_AMOUNT = 0;
    public static int MAX_USER = 0;

    public static int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        int[] discountRate = new int[emoticons.length];

        DFS(users, emoticons, 0, discountRate);

        answer[0] = MAX_USER;
        answer[1] = MAX_AMOUNT;
        return answer;
    }

    public static void DFS(int[][] users, int[] emoticons, int start, int[] discountRate) {
        if (start == discountRate.length) {
            calculate(users, emoticons, discountRate);
            return ;
        }
        for (int i = 10; i <= 40; i += 10) {
            discountRate[start] = i;
            DFS(users, emoticons, start + 1, discountRate);
        }
    }

    public static void calculate(int[][] users, int[] emoticons, int[] discountRate) {
        int total = 0;
        int count = 0;
        for (int[] user : users) {
            int userTotal = 0;
            int price = user[1];
            int discount = user[0];

            for (int imoji = 0; imoji < emoticons.length; imoji++) {
                if (discountRate[imoji] >= discount) { //할인율 이상인 이모티콘 구매
                    userTotal += (emoticons[imoji]/100) * (100 - discountRate[imoji]); //현재까지 금액 계산
                }
            }
            if (userTotal >= price) {
                count += 1; //넘으면 구매 취소 후 서비스 가입
            }
            else {
                total += userTotal;
            }
        }
        System.out.println(total+"+"+count);
        if (count > MAX_USER) {
            MAX_AMOUNT = total;
            MAX_USER = count;
            return ;
        }
        if (total > MAX_AMOUNT && count == MAX_USER) {
            MAX_AMOUNT = total;
        }

    }

    public static void main(String[] args) {

        int[] emoticons = {1300,1500,1600,4900};
        int[][] users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        System.out.println(solution(users, emoticons)[0]);
        System.out.println(solution(users, emoticons)[1]);

    }
}

