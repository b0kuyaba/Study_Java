package practice_3;

public class Q17 {
    public static void main(String[] args) {
        int[][] score = {
                {80,90,100},
                {74,100,88},
                {65,77,90},
                {45,76,82},
                {98,100,92}
        };
        String[] subName = {"국어", "영어", "수학"};

        for (int i = 0; i < subName.length;i ++) {
            int c = 0;
            for (int j = 0; j < score.length;j ++) {
                c += score[j][i];
            }
            System.out.printf(subName[i] + ": %.1f%n", (double) c / score.length);
        }
    }
}
