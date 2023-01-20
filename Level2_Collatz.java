import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level2_Collatz {

    public static double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        List<Integer> graph = new ArrayList<>();
        while (k > 1) {
            graph.add(k);
            if (k % 2 == 0) {
                k /= 2;
            } else {
                k = 3 * k + 1;
            }
        }
        graph.add(k);
        for (int i = 0; i < ranges.length; i++) {
            answer[i] = getSquareArea(ranges[i], graph);

        }

        return answer;
    }

    public static double getSquareArea(int[] range, List<Integer> graph) {
        double sumArea = 0;

        if (range[0] > graph.size() - 1 + range[1]) {
            return -1;
        }
        for (int i = range[0]; i < graph.size() - 1 + range[1]; i++) {
            sumArea += (graph.get(i) + graph.get(i + 1)) / 2.0;
        }
        return sumArea;
    }

    public static void main(String[] args) {
        int[][] ranges={{0,0},{0,-1},{2,-3},{3,-3}};
        for (double e : solution(5,ranges)) {
            System.out.println(e);

        }
    }
}
