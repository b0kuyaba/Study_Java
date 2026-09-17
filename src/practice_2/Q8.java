package practice_2;

public class Q8 {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 0;i < 4; i ++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                num += 4;
                for (int j = 0; j < 5; j ++) {
                    System.out.print(num + " ");
                    num--;
                }
                num += 6;
            }
            System.out.println();
        }
    }
}
