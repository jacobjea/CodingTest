import java.util.*;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("Pyy"));
    }

    public static boolean solution(String s) {
        String lowerCase = s.toLowerCase();
        int pCount = (int) lowerCase.chars().filter(e->e == 'p').count();
        int yCount = (int) lowerCase.chars().filter(e->e == 'y').count();
        return pCount == yCount;
    }
}
