package pr;

public class arrayalpha {
    public static void main(String[] args) {
        char[] arr = new char[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char)('Z' - i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
