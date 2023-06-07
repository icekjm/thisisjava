package ch04;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		//숫자 맞히기 게임
		// 컴퓨터가 1~100 사이의 임의의 수를 정함
		// 사용자가 그 수를 맞춤
		// 작은수를 입력했으면 "큰수를 입력하세요" 출력
		// 큰 수를 입력했으면 "작은수를 입력하세요" 출력
		// 맞았으면 "맞았습니다. 시도횟수 0회"
		Scanner scan = new Scanner(System.in);
		int comVa = (int)(Math.random()*100) + 1;	
		int userVa = Integer.parseInt(scan.nextLine());
		while (comVa!=userVa) {
			if (comVa<userVa) {
			System.out.println("작은수를 입력하세요");
			int userVa = Integer.parseInt(scan.nextLine());	
			} else if (comVa>userVa) {
			System.out.println("큰 수를 입력하세요");
			int userVa = Integer.parseInt(scan.nextLine());	
			} else if (comVa == userVa) {
				System.out.println("맞았습니다.");
				break;
			}
		}
	}
}



		int comNumber = (int)(Math.random()*100) + 1;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while (flag) {
			System.out.print("입력>");
			int userNumber = Integer.parseInt(scan.nextLine());
			count++;
			if (comNumber > userNumber) {
				System.out.println("큰 수를 입력하세요.");
			} else if (comNumber < userNumber) {
				system
			} else if ()
		}