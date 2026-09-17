package practice_3;

public class Q18 {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 99;
        int num3 = 77;

        if (num1 > num2 && num1 > num3){
            System.out.println("가장 큰 수는 " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("가장 큰 수는 " + num2);
        }
        else {
            System.out.println("가장 큰 수는 " + num3);
        }
    }
}
