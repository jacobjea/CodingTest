import java.util.*;

public class 자릿수_더하기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(987));
    }
    public static int solution(int n) {
        return Arrays.stream(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
