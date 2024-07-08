import java.util.*;
import java.util.ArrayList;


public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        StringBuilder builder = new StringBuilder();
        return builder.append(n).reverse().chars().map(Character::getNumericValue).toArray();
//        String[] array = Long.toString(n).split("");
//        int[] intArray = new int[array.length];
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = array.length-1; i >= 0; i--){
//            list.add(Integer.parseInt(array[i]));
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
