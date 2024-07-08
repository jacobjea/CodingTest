import java.util.*;

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("4444"));
    }

    public static String solution(String phone_number) {
        String start = "";
        String end = "";
        start = phone_number.substring(0,phone_number.length() - 4);
        end = phone_number.substring(phone_number.length() - 4);
        start = start.replaceAll(".","*");
        return start+end;
    }

}
