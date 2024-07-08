import java.util.*;
import java.util.stream.IntStream;

public class 하샤드_수 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(3));
    }

    public static boolean solution(int x) {
        return x % Arrays.stream(Integer.toString(x).split("")).mapToInt(Integer::parseInt).sum() == 0;
    }
}
