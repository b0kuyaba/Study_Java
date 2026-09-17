package practice_3;

public class Q7 {
    public static void main(String[] args) {
        int[] numbers = {13,66,34,83,41,92,23,76};
        int n = 0;

        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] % 2 == 0 && numbers[i] > n) {
                n = numbers[i];
            }
        }
        System.out.println("짝수 중 가장 큰 값: " + n);
    }
}
