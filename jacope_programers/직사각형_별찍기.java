import java.util.*;
// Output size differs 오류로 콘솔에는 잘 찍히지만 프로그래머스에서 작동하지 않음...


public class 직사각형_별찍기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder builder = new StringBuilder();
        for (int i =0; i < b; i++){
            builder.append("\n");
            for (int j = 0; j < a; j++){
                builder.append("*");
            }
        }
        System.out.print(builder.toString());
    }
}
