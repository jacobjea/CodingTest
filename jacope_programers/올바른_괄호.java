import java.util.*;
import java.util.stream.Stream;

public class 올바른_괄호 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("())(()"));
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] array = s.toCharArray();
        for (char c : array){
            if (c == '('){
                stack.push(c);
            } else if (c == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
