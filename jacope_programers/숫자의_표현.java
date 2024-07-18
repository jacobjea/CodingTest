import java.util.*;

public class 숫자의_표현 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};
        System.out.print(solution(15));
    }

    public static int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++){
            int sum = 0;
            for (int j = i; j <= n; j++){
                sum += j;
                if (sum > n){
                    break;
                } else if (sum == n){
                    count++;
                }
            }
        }
        return count;
    }
}
