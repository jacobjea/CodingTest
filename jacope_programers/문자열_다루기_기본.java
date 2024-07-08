import java.util.*;

public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("a2345"));
    }

    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6){
            return s.chars().allMatch(Character::isDigit);
        }else {
            return false;
        }
    }
}
