import java.util.*;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("abcde"));
    }

    public static String solution(String s) {
        String[] array = s.split("");
        StringBuilder builder = new StringBuilder();
        if (array.length % 2 == 0) { // 짝수인 경우
            builder.append(array[(array.length / 2)-1]);
            builder.append(array[(array.length / 2)]);
            return builder.toString();
        } else {
            return builder.append(array[(array.length / 2)]).toString();
        }
    }
}
