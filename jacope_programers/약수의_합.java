import java.util.*;
import java.util.stream.IntStream;

public class 약수의_합 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(5));
    }

    public static int solution(int n) {
        return IntStream.rangeClosed(1,n).filter(e-> n%e == 0).sum();
    }
}
