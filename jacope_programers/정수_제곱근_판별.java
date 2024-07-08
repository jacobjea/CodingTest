import java.util.*;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(3));
    }
    public static long solution(long n) {
        double rout = Math.sqrt(n);
        if (rout % 1 == 0){ // 정수인 경우 -> 제곱근이 있는 경우
            return (long) ((rout + 1) * (rout + 1));
        } else {
            return -1;
        }
    }
}
