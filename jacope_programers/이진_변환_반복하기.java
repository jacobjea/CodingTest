import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class 이진_변환_반복하기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(Arrays.toString(solution("1111111")));
    }

    public static int[] solution(String s) {
        int changedCount = 0;
        int removeZeroCount = 0;

        while (!s.equals("1")) {
            int originLength = s.length();
            s = s.replace("0", "");
            removeZeroCount += originLength - s.length();
            s = Integer.toBinaryString(s.length());
            changedCount++;
        }
        return new int[] {changedCount, removeZeroCount};
    }
}
