import java.util.*;

public class 머쓱이보다_키_큰_사람 {

    public static void main(String[] args) {
    int[] array = {149, 180, 192, 170};
        System.out.print(solution(array, 167));
    }

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(e->e > height).count();
    }
}
