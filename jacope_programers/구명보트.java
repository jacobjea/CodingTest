import java.lang.reflect.Array;
import java.util.*;

public class 구명보트 {
    public static void main(String[] args) {
        int[] intArray = {70, 80, 50};
        String[] strArray = {};

        System.out.print(solution(intArray, 100));
    }

    public static int solution(int[] people, int limit) {
        int i =0;
        int j = people.length-1;
        int count = 0;
        Arrays.sort(people);
        while (i <= j){
            if (people[i] + people[j] <= limit){
                i++;
            }
            j--;
            count++;
        }
        return  count;
    }
}
