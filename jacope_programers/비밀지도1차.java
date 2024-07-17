import java.util.*;

public class 비밀지도1차 {
    public static void main(String[] args) {
        int[] intArray = {9, 20, 28, 18, 11};
        int[] intArray2 = {30, 1, 21, 17, 28};

        String[] strArray = {};

        solution(5, intArray, intArray2);
//        System.out.print();
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < arr1.length; i++){
            int combined = arr1[i] | arr2[i];

            String map = String.format("%" + n + "s" ,Integer.toBinaryString(combined));
            map = map.replace('0', ' ').replace('1', '#');
            answer[i] = map;
        }
        return answer;
    }
}
