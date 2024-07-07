public class 각도기 {
    public static void main(String[] args) {
        System.out.print(solution(90));
    }

    public static int solution(int angle) {
        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }
}
