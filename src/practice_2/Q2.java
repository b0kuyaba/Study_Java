package practice_2;

public class Q2 {
    public static void main(String[] args) {
        int score = 86;
        System.out.println("점수: "+ score);
        int grade = score / 10;
        char rank;
        switch (grade) {
            case 10:
            case 9:
                rank = 'A';
                break;
            case 8:
                rank = 'B';
                break;
            case 7:
                rank = 'C';
                break;
            default:
                rank = 'D';
        }
        System.out.println("등급: " + rank);
    }
}
