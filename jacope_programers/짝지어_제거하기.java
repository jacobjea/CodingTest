import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};
        System.out.print(solution("baabaa"));
    }

    public static int solution(String s) {
        // 캐릭터 리스트를 만든다
        // 각 캐릭터의 반복문을 돌린다.
        // 리스트가 비었다면 담는다 첫번쨰 문자열을
        // 첫번째 문자열과 다음 문자열이 같다면 리스트의 요소 삭제
        // 이것을 반복

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if ((long) list.size() == 0 || list.getLast() != currentChar){
                System.out.println("add: " + currentChar);
                list.add(currentChar);
            } else if (list.getLast() == currentChar){
                System.out.println("remove: " + currentChar);
                list.removeLast();
            }
        }
        return list.size() == 0 ? 1 : 0;
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            if (!stack.isEmpty() && stack.peek() == currentChar) {
//                stack.pop();
//            } else {
//                stack.push(currentChar);
//            }
//        }
//        return stack.isEmpty() ? 1 : 0;
    }
}
