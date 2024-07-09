import java.util.*;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] intArray = {4,4,4,3,3};
        String[] strArray = {};

        System.out.print(Arrays.toString(solution(intArray)));
    }

    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int num2 : arr) {
            if (stack.isEmpty() || stack.peek() != num2) {
                stack.push(num2);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
