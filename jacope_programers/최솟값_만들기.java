import com.sun.source.doctree.SummaryTree;

import java.util.*;

public class 최솟값_만들기 {
    public static void main(String[] args) {
        int[] intArray = {1, 4, 2};
        int[] intArray2 = {5, 4, 4};

        solution(intArray, intArray2);
    }

    public static int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);// 오름차순

        // 효율성 검사에서 실패하기 때문에 B배열은 for문에서 내림차순 처리해줌
//        Integer[] B_integer = Arrays.stream(A).boxed().toArray(Integer[]::new);
//        Arrays.sort(B_integer, Collections.reverseOrder());
//        A = Arrays.stream(B_integer).mapToInt(Integer::intValue).toArray();

        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum += A[i] * B[B.length -1 - i];
        }
        return sum;
    }
}
