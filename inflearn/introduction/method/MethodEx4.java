package method;

import java.util.Scanner;

public class MethodEx4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int exit = 0;
        int state, money;
        int balance = 0;

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("------------------------------------");
            System.out.print("선택: ");
            state = scanner.nextInt();

            if (state == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                balance = bankSystem(state, balance);
            }
        }
    }

    public static int bankSystem(int state, int balance) {
        if (state == 1){
            return deposit(balance);
        } else if (state == 2) {
            return withDraw(balance);
        } else if (state == 3) {
            return checkBalance(balance);
        } else {
            return balance;
        }

    }

    public static int deposit(int balance) {
        int money;
        System.out.print("입금액을 입력하세요: ");
        money = scanner.nextInt();
        balance += money;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withDraw(int balance) {
        int money;
        System.out.print("입금액을 입력하세요: ");
        money = scanner.nextInt();
        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액: " + balance);
        } else {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static int checkBalance(int balance){
        System.out.println("현재 잔액: " + balance);
        return balance;
    }
}
