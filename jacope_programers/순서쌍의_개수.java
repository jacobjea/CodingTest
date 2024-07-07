import java.util.*;
import java.util.stream.IntStream;

public class 순서쌍의_개수 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(100));
    }

    public static int solution(int n) {
        return (int) (IntStream.range(1,n).filter(e -> n%e == 0).count() +1);
    }
}
