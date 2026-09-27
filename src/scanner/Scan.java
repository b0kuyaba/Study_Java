import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = {85, 92, 78, 64, 95, 88};

        while (true) {
            System.out.println("\n=== 학생 점수 관리 프로그램 ===");
            System.out.println("1. 총점 및 평균 계산");
            System.out.println("2. 최고 점수 탐색");
            System.out.println("3. 학생별 등급 조회");
            System.out.println("4. 프로그램 종료");
            System.out.print("원하는 기능의 번호를 입력하세요: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int score : scores) {
                        sum += score;
                    }
                    double average = (double) sum / scores.length;
                    System.out.println("총점: " + sum + "점");
                    System.out.printf("평균: %.2f점\n", average);
                    break;

                case 2:
                    int max = scores[0];
                    for (int i = 1; i < scores.length; i++) {
                        if (scores[i] > max) {
                            max = scores[i];
                        }
                    }
                    System.out.println("최고 점수: " + max + "점");
                    break;

                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        int score = scores[i];
                        char grade;

                        if (score >= 90) {
                            grade = 'A';
                        } else if (score >= 80) {
                            grade = 'B';
                        } else if (score >= 70) {
                            grade = 'C';
                        } else if (score >= 60) {
                            grade = 'D';
                        } else {
                            grade = 'F';
                        }
                        System.out.println((i + 1) + "번 학생: " + score + "점 (" + grade + "등급)");
                    }
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("올바른 번호를 입력해 주세요 (1~4).");
                    break;
            }
        }
    }
}