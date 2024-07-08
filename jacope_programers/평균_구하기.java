import java.util.*;

public class 평균_구하기 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4};
        String[] strArray = {};

        System.out.print(solution(intArray));
    }

    public static double solution(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }
}
