import java.util.*;
import java.util.stream.IntStream;

public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(2500,10000,2500));
    }
    public static long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++){
            sum += (long) price * i;
        }
        return Math.max(sum - money, 0);
    }
}
