package practice_1;

public class Switch {
    public static void main(String[] args) {
        int rank = 2;
        String result;

        switch (rank) {
            case 1 -> result = "전액 장학금";
            case 2, 3 -> result = "반액 장학금";
            case 4,5,6 -> result = "노력금";
            default -> result = "장학금 대상자 아님";
        }
        System.out.println(result);
    }
}
