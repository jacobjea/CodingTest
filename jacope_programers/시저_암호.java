import java.util.*;
// 포기 ㅋ
public class 시저_암호 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("a",1));
    }

    public static String solution(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for ( char c : s.toCharArray()){
            if (c >= 'a' && c <= 'z'){
                builder.append((char) (c + 4 % 26));
//                System.out.println(builder.append((char) (c + 4)).toString());
            }
        }
        return null;
    }
}
