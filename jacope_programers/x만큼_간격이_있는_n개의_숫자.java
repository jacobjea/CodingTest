import java.util.*;

public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(Arrays.toString(solution(-4, 2)));
    }

    public static long[] solution(int x, int n) {
        long[] result = new long[n];
        long currentValue = x;
        for (int i = 0; i < n; i++){
            result[i] = currentValue;
            currentValue += x;
        }
        return result;


//        ArrayList<Long> list = new ArrayList<>();
//        long absX = Math.abs(x);
//        for (long i = absX; i <= (long) absX *n; i += absX){
//            list.add(x > 0 ? i : i * -1);
//        }
//        return list.stream().mapToLong(Long::longValue).toArray();
    }
}
