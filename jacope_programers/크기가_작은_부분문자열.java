import java.util.*;

public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution("191919191919191919", "191919191919191919"));
    }

    public static int solution(String t, String p) {
        ArrayList<Long> list = new ArrayList<Long>();
        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            String subStr = t.substring(i, i + p.length());
            list.add(Long.parseLong(subStr));
        }
        return (int) list.stream().filter(e-> e <=Long.parseLong(p)).count();
    }
}
