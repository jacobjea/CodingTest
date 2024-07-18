import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Stream;

public class 최댓값과_최솟값 {

    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("1 2 3 4"));
    }

    public static String solution(String s) {
        int[] array = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        return String.format("%s %s",min, max);
    }
}
