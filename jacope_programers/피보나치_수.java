import java.io.Console;
import java.util.*;

public class 피보나치_수 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        fibonacci(6);
    }

    public static int solution(int n) {
        int temp = (n-1) + (n-2);
        System.out.println(temp);
        return 0;
    }

    public static int fibonacci(int n){
        if (n == 0)
            return 0;
        if (n == 1){
            return 1;
        } else {
            System.out.println(fibonacci(n-1) + fibonacci(n-2));
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}