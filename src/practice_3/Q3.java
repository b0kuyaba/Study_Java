package practice_3;

public class Q3 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 7; i <= 55; i += 3) {
            n += i;
        }
        System.out.println("7부터 55까지 3씩 증가하는 수의 합: " + n);
    }
}
