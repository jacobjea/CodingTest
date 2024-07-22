import java.util.ArrayList;
import java.util.Arrays;

public class 카펫 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};
        System.out.print(Arrays.toString(solution(24, 24)));
    }

    public static int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 3; i <= total; i++) {
            if (total % i == 0) {
                list.add(i);
            }
        }
//        System.out.println(list);
        int width = 0;
        int height = 0;
        for (int i = 0; i < list.size(); i++){
            width = list.get(i);
            height = 0;
            if (total % list.get(i) == 0){
                // 가로임
                height = total / width;
                if ((width -2) * (height -2) == yellow){
                    break;e
                }
            }
        }
//        System.out.println(width);
//        System.out.println(height);
        return new int[] {Math.max(width,height) , Math.min(width,height)};
    }
}
