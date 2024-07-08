import java.util.*;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(118372));
    }

    public static long solution(long n) {
        StringBuilder builder = new StringBuilder();
        String[] strArray = Long.toString(n).split("");
        ArrayList<Long> list = new ArrayList<>();
        for (String e : strArray){
             list.add(Long.parseLong(e));
        }
        list.sort(Comparator.reverseOrder());
        for (Long e : list){
            builder.append(e);
        }
        return Long.parseLong(builder.toString());
    }
}
