package practice_3;

public class Q15 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                n += i;
            }
        }
        System.out.println(n);
    }
}
