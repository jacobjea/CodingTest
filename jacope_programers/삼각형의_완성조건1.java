import java.lang.reflect.Array;
import java.util.*;

public class 삼각형의_완성조건1 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        String[] strArray = {};

        System.out.print(solution(intArray));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]){
            return 1;
        } else {
            return 2;
        }
    }
}
