import java.util.Arrays;
import java.util.Collections;

public class Level2_Mininum {

    public int solution(int[] A, int[] B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i=0;i<A.length;i++) {
            answer += B[A.length - 1 - i]*A[i];
        }

        return answer;
    }
}
