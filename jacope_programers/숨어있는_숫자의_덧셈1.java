import java.util.*;
import java.util.stream.Stream;

public class 숨어있는_숫자의_덧셈1 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("aAb1B2cC34oOp"));
    }

    public static int solution(String my_string) {
        return my_string.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
    }
}
