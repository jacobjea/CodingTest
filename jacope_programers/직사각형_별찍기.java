import java.util.*;

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

    public static String solution(int n, int m) {
        StringBuilder builder = new StringBuilder();
        for (int i =0; i < m; i++){
            builder.append("\n");
            for (int j = 0; j < n; j++){
                builder.append("*");
            }
        }
        return builder.toString();
    }
}
