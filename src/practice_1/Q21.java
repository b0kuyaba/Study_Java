package practice_1;

public class Q21 {
    public static void main(String[] args) {
        int[] score = {78, 95, 64, 88, 100, 73, 82, 59, 91, 67};
        int c = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 90) {
                c += 1;
            }
        }
        System.out.println("점수가 90 이상인 학생은 " + c + "명입니다.");
    }
}
