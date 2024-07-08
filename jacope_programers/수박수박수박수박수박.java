import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 수박수박수박수박수박 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};


//        System.out.print(solution(4));
    }

    public static String solution(int n) {
        return IntStream.range(0,n).mapToObj(i-> i % 2 == 0 ? "수" : "박").collect(Collectors.joining());

//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            builder.append(i % 2 == 0 ? "수" : "박");
//        }
//        return builder.toString();
    }
}
