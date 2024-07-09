import java.util.*;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(Arrays.toString(solution(100, 52)));
    }

    public static long[] solution(long n, long m) {
        long[] result = new long[2];
        long max = Math.max(n, m);
        long min = Math.min(n, m);
        long remain = max % min;
        while (remain != 0) {
            max = min;
            min = remain;
            remain = max % min;
        }
        result[0] = min;
        // 최소 공배수 구하기
        result[1] = (n * m) / result[0];
        return result;
    }
}
