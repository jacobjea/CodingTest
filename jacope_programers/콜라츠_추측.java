import javax.sound.sampled.EnumControl;
import java.util.*;
import java.util.stream.IntStream;

public class 콜라츠_추측 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(626331));
    }

    public static int solution(int num) {
        long longNum = num;
        int count = 0;
        while (longNum != 1){
            if (longNum % 2 == 0){
                longNum /= 2;
            } else {
                longNum = longNum * 3 + 1;
            }
            count++;

            if (count == 501){
                return -1;
            }
        }
        return count;
    }
}
