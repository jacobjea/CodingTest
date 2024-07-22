import java.util.*;

public class 솔팅문제연습 {
    public static void main(String[] args) {
        int[] intArray = {5, 3, 8, 1, 9, 2, 7, 6, 4};
        String[] strArray = {};

        System.out.println(Arrays.toString(solution(intArray)));
        System.out.println(Arrays.toString(arraySorting(intArray)));

    }

    public static int[] solution(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] arraySorting(int[] array){


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1 -i; j++) {
                if (array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
