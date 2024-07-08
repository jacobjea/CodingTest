public class 음양_더하기 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3};
        String[] strArray = {};
        boolean[] boolArray = {false,false,true};
        System.out.print(solution(intArray,boolArray));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++){
            sum += signs[i] ? absolutes[i] : absolutes[i] * -1;
        }
        return sum;
    }
}
