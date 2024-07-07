public class 배열의평균값 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print( solution(numbers));
    }

    public static double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        answer = sum / numbers.length;
        return answer;
    }
}
