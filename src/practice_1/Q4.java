package practice_1;

public class Q4 {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;

        for (;num <= 50; num++) {
            if (num % 3 == 0 && num % 5 != 0) {
                sum += num;
            }
            continue;
        }
        System.out.println("합계: " + sum);
    }
}
