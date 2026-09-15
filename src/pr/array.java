package pr;

public class array {
    public static void main(String[] args) {
        int[][] seats = {
                {1, 0, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 0}
        };

        int count = 0;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 1) {
                    count ++;
                }
            }
        }

        System.out.println("예매 가능한 좌석의 수는" + count + "입니다.");

    }
}
