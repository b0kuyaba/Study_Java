package scanner;
import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] itemNames = {"콜라", "사이다", "커피"};
        int[] itemPrices = {1500, 1300, 800};
        int[] itemStocks = {3, 5, 2};

        int userMoney = 0;

        System.out.print("투입할 금액을 입력하세요: ");
        userMoney = scanner.nextInt();

        while (true) {
            System.out.println("\n==============================");
            System.out.println(" 현재 잔액: " + userMoney + "원");
            System.out.println("==============================");
            System.out.println("1. 음료 구매");
            System.out.println("2. 잔액 충전");
            System.out.println("3. 잔액 반환 및 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n[ 음료 목록 ]");
                    for (int i = 0; i < itemNames.length; i++) {
                        System.out.println((i + 1) + ". " + itemNames[i] + " (" + itemPrices[i] + "원) - 재고: " + itemStocks[i] + "개");
                    }
                    System.out.print("구매할 음료 번호를 선택하세요: ");
                    int itemChoice = scanner.nextInt() - 1;

                    if (itemChoice < 0 || itemChoice >= itemNames.length) {
                        System.out.println("잘못된 음료 번호입니다.");
                    } else if (itemStocks[itemChoice] <= 0) {
                        System.out.println("해당 음료는 품절되었습니다.");
                    } else if (userMoney < itemPrices[itemChoice]) {
                        System.out.println("잔액이 부족합니다. (부족한 금액: " + (itemPrices[itemChoice] - userMoney) + "원)");
                    } else {
                        userMoney -= itemPrices[itemChoice];
                        itemStocks[itemChoice]--;
                        System.out.println(itemNames[itemChoice] + "을(를) 구매했습니다.");
                    }
                    break;

                case 2:
                    System.out.print("충전할 금액을 입력하세요: ");
                    int addMoney = scanner.nextInt();
                    if (addMoney <= 0) {
                        System.out.println("올바른 금액을 입력해 주세요.");
                    } else {
                        userMoney += addMoney;
                        System.out.println(addMoney + "원이 충전되었습니다.");
                    }
                    break;

                case 3:
                    System.out.println("\n[ 잔액 반환 ]");
                    System.out.println("총 반환 금액: " + userMoney + "원");

                    int[] units = {10000, 5000, 1000, 500, 100};
                    for (int unit : units) {
                        int count = userMoney / unit;
                        if (count > 0) {
                            System.out.println(unit + "원: " + count + "개");
                            userMoney %= unit;
                        }
                    }

                    System.out.println("이용해 주셔서 감사합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("1~3번 중 하나를 선택하세요.");
                    break;
            }
        }
    }
}
