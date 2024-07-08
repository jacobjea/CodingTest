import java.util.*;
import java.util.stream.IntStream;

public class 내적 {
    public static void main(String[] args) {
        int[] intArray = {-1,0,1};
        int[] intArray2 = {1,0,-1};

        String[] strArray = {};

        System.out.print(solution(intArray,intArray2));
    }

    public static int solution(int[] a, int[] b) {
        return IntStream.range(0,a.length).map(e->a[e]*b[e]).sum();
    }
}
