package practice_1;

public class Q14 {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 1; i <= 100; i ++) {
            if (i % 3 == 0) {
                c += i;
            }
        }
        System.out.println(c);
    }
}
