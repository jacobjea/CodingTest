import java.util.*;

public class 삼총사 {
    public static void main(String[] args) {
        int[] intArray = {-2, 3, 0, 2, -5};
        String[] strArray = {};

        System.out.print(solution(intArray));
    }

    public static int solution(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if ((number[i] + number[j] + number[k]) == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
