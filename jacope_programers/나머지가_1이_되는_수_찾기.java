import java.util.*;

public class 나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(12));
    }

    public static int solution(int n) {
        for (int i = 2; i < n; i++){
            if (n % i == 1){
                return i;
            }
        }
        return 0;
    }
}
