import java.util.*;
import java.util.stream.IntStream;

public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(13,17));
    }

    public static int solution(int left, int right) {
        // 제곱근인 경우 약수의 개수는 홀수
        // 제곱근이 아닌 경우 약수의 개수는 짝수
        return IntStream.rangeClosed(left,right)
                .map(e->Math.sqrt(e) % 1 == 0 ? -e : e)
                .sum();
    }
}
