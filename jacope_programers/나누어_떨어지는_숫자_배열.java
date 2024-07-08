import java.util.*;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int[] intArray = {2, 36, 1, 3};
        String[] strArray = {};

        System.out.print(Arrays.toString(solution(intArray, 1)));
    }

    public static int[] solution(int[] arr, int divisor) {
        var result = Arrays.stream(arr).filter(e->e%divisor == 0).toArray();
        Arrays.sort(result);
        return result.length == 0 ? new int[]{-1} : result;
    }
}
