import java.util.*;

public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {"Jane","Kim"};

        System.out.print(solution(strArray));
    }

    public static String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++){
            if (Objects.equals(seoul[i], "Kim")){
                 return String.format("김서방은 %d에 있다",i);
            }
        }
        return "";
    }
}
