import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Level1_KthNumber {

    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();

        for(int[] command : commands) {
            int[] subArr = new int[command[1] - command[0] + 1];
            for (int j = command[0] - 1; j <= command[1] - 1; j++) {
                subArr[j - command[0] + 1] = array[j];
            }
            Arrays.sort(subArr);
            answer.add(subArr[command[2] - 1]);
        }

        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(solution(array, commands));
    }
}
