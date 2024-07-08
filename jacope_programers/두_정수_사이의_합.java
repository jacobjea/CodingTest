import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(-9000000,10000000));
    }

    public static long solution(int a, int b) {
        return LongStream.rangeClosed(Math.min(a,b),Math.max(a,b)).sum();
//        int start = Math.min(a,b);
//        int end = Math.max(a,b);
//        int sum = 0;
//        for (int i = start; i <= end; i++){
//            sum += i;
//        }
//        return sum;
    }
}
