package practice_4;

public class Q9 {
    public static void main(String[] args) {
        int n = 1;

        for (int i = 0; i < 4; i ++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j ++) {
                    System.out.print(n + " ");
                    n ++;
                }
            }
            else {
                n += 4;
                for (int j = 0; j < 5; j ++) {
                    System.out.print(n + " ");
                    n --;
                }
                n += 6;
            }
            System.out.println();
        }
    }
}
