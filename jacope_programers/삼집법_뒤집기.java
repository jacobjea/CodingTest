import java.util.*;

public class 삼집법_뒤집기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(125));
    }

    public static int solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int division = 100000000;
        while (division != 0) {
            division = n / 3;
            list.add(n % 3);
            n = division;
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (int) (list.get(i) * Math.pow(3, list.size() - i - 1));
        }
        return sum;
    }
}
