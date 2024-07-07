import java.util.*;

public class 가위_바위_보 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("205"));
    }

    public static String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        for (char e : rsp.toCharArray()){
                result.append((e == '2') ? "0" : (e == '0') ? "5" : (e == '5') ? "2" : 0);
        }
        return result.toString();
    }
}
