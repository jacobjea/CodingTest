import javax.print.attribute.IntegerSyntax;
import java.util.*;
import java.util.stream.IntStream;

public class 행렬의_덧셈 {
    public static void main(String[] args) {
        int[][] intArray = {{1},{2}};
        int[][] intArray2 = {{3},{4}};

        String[] strArray = {};

        System.out.print(Arrays.deepToString(solution(intArray, intArray2)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++){
            for (int j =0; j < arr1[0].length; j++){
                 result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }
}
