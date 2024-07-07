import java.util.*;
import java.util.stream.Collectors;


public class 모음_제거 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("nice to meet you"));
    }

    public static String solution(String my_string) {
        return Arrays.stream(my_string.split("")).filter(e-> !"aeiou".contains(e)).collect(Collectors.joining());
    }
}
