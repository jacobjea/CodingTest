import java.util.*;

public class 예산 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 1};
        String[] strArray = {};

        System.out.print(solution(intArray, 74));
    }
    public static int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++){
            sum += d[i];
            if (sum > budget){
                break;
            }
            count++;
        }
        return count;
    }
}
