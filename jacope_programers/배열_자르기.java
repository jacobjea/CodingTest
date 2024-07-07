import java.util.*;

public class 배열_자르기 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {};
        System.out.print(Arrays.toString(solution(intArray, 1, 3)));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1,num2+1);
    }
}
