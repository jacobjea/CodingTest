import java.util.*;
import java.util.stream.IntStream;

public class 개미_군단 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};
        System.out.print(solution(999));
    }

    public static int solution(int hp) {
//        int jangun = 0;
//        int bungjung = 0;
//        int il = 0;
//        jangun = hp / 5;
//        if (hp % 5 != 0){
//            bungjung = hp % 5 / 3;
//            il = hp % 5 % 3;
//        }
//        return jangun + bungjung + il;
        return (hp / 5) + (hp % 5 / 3) + (hp % 5 % 3);
    }
}
