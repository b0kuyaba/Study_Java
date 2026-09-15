package pr;

public class arraycopy {
    public static void main(String[] args) {
        String[] array1 = {"가", "나", "다", "라", "마", "바", "사"};
        String[] array2 = {"아", "자", "차", "카", "타", "파", "하"};
        String[] merge = new String[14];

        System.arraycopy(array1,0, merge, 0, array1.length);
        System.arraycopy(array2,0, merge, 7, array2.length);

        for (int j = 0; j < merge.length; j++) {
            System.out.print(merge[j] + " ");
        }
    }
}
