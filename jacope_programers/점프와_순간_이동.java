import java.util.*;

public class 점프와_순간_이동 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(5000));
    }

    public static int solution(int n) {
        int count = 0;
        while(n != 1){
            if (n % 2 != 0){
                n = (n - 1) / 2;
                count++;
            } else {
                n = n /2;
            }
        }
        return count+1;
    }
}
