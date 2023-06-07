package ch04;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int account = 0;
		
		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.println("선택>");
			String val = scanner.nextLine();
			if ("1".equals(val)) {
				System.out.println("예금액>");
				String input = scanner.nextLine();
				account = account + Integer.parseInt(input);
			}
			if ("2".equals(val)) {
				System.out.println("출금액>");
				String input = scanner.nextLine();
				int inputInt = Integer.parseInt(input);
				if (account < inputInt) {
					System.out.println(account+" 이하로만 출금 가능");
				} else {
					account = account - Integer.parseInt(input);
				}
		} else if ("3".equals(val)) {
			System.out.println("잔고>"+account);
		} else if ("4".equals(val)) {
			run = false;
		}
	}
}
}