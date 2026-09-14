package practice_1;

public class Q6 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 18, 57, 24, 39, 16, 8};
        int sum = 0;

        System.out.print("홀수 번째 요소: ");
        for (int i = 0; i < numbers.length; i += 2 ) {
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("홀수 번째 요소의 합: " + sum);
    }
}
