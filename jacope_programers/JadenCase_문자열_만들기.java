import java.util.*;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.println(solution("for the last week"));
    }

    public static String solution(String s) {
        s = s.toLowerCase();
        char[] array = s.toCharArray();

        StringBuilder builder = new StringBuilder();
        boolean isUpper = true;
        for (char c :array ){
            if (c == ' '){
                isUpper = true;
            } else if(isUpper){
                c = Character.toUpperCase(c);
                isUpper = false;
            }
            builder.append(c);
        }
        System.out.println(builder);
        return builder.toString();
    }
}
