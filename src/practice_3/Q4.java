package practice_3;

public class Q4 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 10; i <= 50; i ++) {
            if (i % 3 == 0 && i % 5 != 0) {
                n += i;
            }
        }
        System.out.println("합계: " + n);
    }
}
