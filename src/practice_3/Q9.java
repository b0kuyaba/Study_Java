package practice_3;

public class Q9 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 4; i ++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j ++){
                    System.out.print(count + " ");
                    count++;
                }
            }
            else {
                count += 4;
                for (int j = 0; j < 5; j ++) {
                    System.out.print(count + " ");
                    count--;
                }
                count += 6;
            }
            System.out.println();
        }
    }
}
