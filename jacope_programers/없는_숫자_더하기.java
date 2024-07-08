import java.lang.reflect.Array;
import java.util.*;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,6,7,8,0};
        String[] strArray = {};

        System.out.print(solution(intArray));
    }

    public static int solution(int[] numbers) {
        return Arrays.stream(new int[]{0,1,2,3,4,5,6,7,8,9})
                .filter(e-> Arrays.stream(numbers).noneMatch(n-> n==e)).sum();
    }
}
