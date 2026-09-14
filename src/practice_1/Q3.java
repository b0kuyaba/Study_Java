package practice_1;

public class Q3 {
    public static void main(String[] args) {
        int num = 7;
        int sum = 0;

        for (;num <= 55; num += 3) {
            sum = num + sum;
        }
        System.out.println("7부터 55까지 3씩 증가하는 수의 합: " + sum);
    }
}
