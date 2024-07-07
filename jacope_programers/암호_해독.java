import java.util.*;

public class 암호_해독 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("pfqallllabwaoclk", 2));
    }

    public static String solution(String cipher, int code) {
        StringBuilder result = new StringBuilder();
        String[] cipherArray = cipher.split("");
        for (int i = code - 1; i < cipherArray.length; i += code){
            result.append(cipher.split("")[i]);
        }
        return result.toString();
    }
}
