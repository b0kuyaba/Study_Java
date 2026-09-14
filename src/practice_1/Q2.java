package practice_1;

public class Q2 {
    public static void main(String[] args) {
        int score = 86;
        char rank;

        if (score >= 90) {
            rank = 'A';
        } else if (score >= 80) {
            rank = 'B';
        } else if (score >= 70) {
            rank = 'C';
        } else {
            rank = 'D';
        }
        System.out.println("점수: " + score);
        System.out.println("등급: " + rank);
    }
}
