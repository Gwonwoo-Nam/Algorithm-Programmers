import java.util.Arrays;

public class Level2_LeastCommonMultiple {

    public static int solution(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int count = 1;

        while (true) {
            int c = 0;
            for (int i =0;i<arr.length;i++) {
                if ((count * max) % arr[i] != 0) {
                    break;
                }
                c++;
            }
            if (c==arr.length) {
                return (count*max);
            }
            count++;
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,6,8,14}));

    }
}
