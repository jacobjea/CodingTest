import java.util.*;

public class 중복된_숫자_개수 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        System.out.print(solution(array, 4));
    }

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(e ->e == n).count();
    }
}
