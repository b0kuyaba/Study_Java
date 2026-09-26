package practice_4;

public class Q4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 50; i ++ ) {
            if (i % 3 == 0 && i % 5 != 0 ) {
                count += i;
            }
        }
        System.out.println("합계: " + count);
    }
}
