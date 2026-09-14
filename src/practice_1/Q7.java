package practice_1;

public class Q7 {
    public static void main(String[] args) {
        int[] numbers = {13, 66, 34, 83, 41, 92, 23, 76};
        int bigNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > bigNum) {
                bigNum = numbers[i];
            }
        }
        System.out.println("짝수 중 가장 큰 수: " + bigNum);
    }
}
