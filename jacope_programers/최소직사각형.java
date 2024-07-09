import java.util.*;

public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] intArray = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        String[] strArray = {};

        System.out.print(solution(intArray));
    }

    public static int solution(int[][] sizes) {
        int maxWidth = 0, height = 0;
        for (int i = 0; i < sizes.length; i++){
            maxWidth = Math.max(maxWidth, Math.max(sizes[i][0], sizes[i][1]));
            height = Math.max(height, Math.min(sizes[i][0],sizes[i][1]));
        }
        return maxWidth * height;


//        int maxWidth = 0;
//        int maxHeight = 0;
//        for (int i = 0; i < sizes.length; i++){
//            // 긴것을 가로로 ㅉ랍은 것을 세세로 놓기
//            int max = Math.max(sizes[i][0],sizes[i][1]);
//            int min = Math.min(sizes[i][0],sizes[i][1]);
//            sizes[i][0] = max;
//            sizes[i][1] = min;
//            if (maxWidth < sizes[i][0]){
//                maxWidth = sizes[i][0];
//            }
//            if (maxHeight < sizes[i][1]){
//                maxHeight = sizes[i][1];
//            }
//        }
//        return maxWidth * maxHeight;
    }
}
