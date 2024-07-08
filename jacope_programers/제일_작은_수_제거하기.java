import java.util.*;

public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        int[] intArray = {10};
        String[] strArray = {};

        System.out.print(Arrays.toString(solution(intArray)));
    }

    public static int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(0);
        int[] array = Arrays.stream(arr).filter(e->e != min).toArray();
        return array.length == 0 ? new int[]{-1} : array;
    }
}
