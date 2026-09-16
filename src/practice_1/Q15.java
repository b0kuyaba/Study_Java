package practice_1;

public class Q15 {
    public static void main(String[] args) {
        char[] decode = {'I',' ','a','m',' ','a',' ','s','p','y'};
        for (int i = decode.length - 1; i >= 0; i--) {
            System.out.print(decode[i]);
        }
    }
}
