import java.util.*;

public class 다음_큰_숫자 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(78));
    }

    public static int solution(int n) {
        int originCount = Integer.bitCount(n);
        while (true){
            n++;
            int count = Integer.bitCount(n);
            if (count == originCount){
                break;
            }
        }
        return n;
    }
}
