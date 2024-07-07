public class 피자_나눠_먹기1 {
    public static void main(String[] args) {
        int[] intArray = {};
        String[] strArray = {};

        System.out.print(solution(15));
    }
    public static int solution(int n) {
        return n%7 == 0 ? n/7 : n/7 + 1;
    }
}
