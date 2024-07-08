import java.lang.reflect.Array;
import java.util.*;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("Zbczdefg"));
    }

    public static String solution(String s) {
        char[] array = s.toCharArray();
        return new StringBuilder(new String(array)).reverse().toString();
    }
}
