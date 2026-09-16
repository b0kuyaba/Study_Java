package practice_1;

public class Q18 {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 99;
        int num3 = 77;
        int bNum = 0;

        if (num1 > num2 && num1 > num3) {
            bNum = num1;
        }else if (num2 > num1 && num2 > num3) {
            bNum = num2;
        } else {
            bNum = num3;
        }
        System.out.println("가장 큰 수는 " + bNum);
    }
}
