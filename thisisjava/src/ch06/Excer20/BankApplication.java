package ch06.Excer20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Account[] account = new Account[100];

		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int size = 0;

		while (flag) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String input = scan.nextLine();

			if ("1".equals(input)) {
				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");
				System.out.print("계좌번호:");
				String number = scan.nextLine();
				System.out.print("계좌주:");
				String owner = scan.nextLine();
				System.out.print("초기입금액:");
				int price = Integer.parseInt(scan.nextLine());
				Account acc = new Account(); // account[size++] = new Account(number, owner, price);
				acc.setNumber(number);
				acc.setOwner(owner);
				acc.setBalance(price);
				account[size++] = acc;
				System.out.println("결과: 계좌가 생성되었습니다.");

			} else if ("2".equals(input)) {
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
				for (int i = 0; i < size; i++) {
					System.out.println(
							account[i].getNumber() + "\t" + account[i].getOwner() + "\t" + account[i].getBalance());
				}
			} else if ("3".equals(input)) {
				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");
				System.out.print("계좌번호:");
				String number = scan.nextLine();
				System.out.print("예금액:");
				int price = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < size; i++) {
					if (number.equals(account[i].getNumber())) {
						account[i].setBalance(account[i].getBalance() + price);
						break;
					}
				}

			} else if ("4".equals(input)) {
				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");
				System.out.print("계좌번호:");
				String number = scan.nextLine();
				System.out.print("출금액:");
				int price = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < size; i++) {
					if (number.equals(account[i].getNumber())) {
						//
						if (account[i].getBalance() < price) {
							System.out.println("잔액부족");
						} else {
							account[i].setBalance(account[i].getBalance() - price);
						}
						break;
					}
						if (number.equals(account[i].getNumber())) {
						account[i].setBalance(account[i].getBalance() + price);
						break;
					}
				}
			} else if ("5".equals(input)) {
				System.out.println("프로그램 종료");
				flag = false;

			}
		}
	}
}
