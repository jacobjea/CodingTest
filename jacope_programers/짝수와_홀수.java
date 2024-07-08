import java.util.*;

public class 짝수와_홀수 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(3));
    }

    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
