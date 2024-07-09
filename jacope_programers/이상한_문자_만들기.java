import java.util.*;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(" try  hello world "));
    }

    public static String solution(String s) {
        int count = 0;
        String result = "";
        String[] array = s.split("");
        for (int i = 0; i < array.length; i++){
            count = array[i].equals(" ") ? 0 : count + 1;
            array[i] = count % 2 == 0 ? array[i].toLowerCase() : array[i].toUpperCase();
        }
        return  String.join("", array);
    }
}
