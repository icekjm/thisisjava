package todayLecture;

import java.util.Scanner;

public class TodayLecture {

	public static void main(String[] args) {
		/*
		 * for 문이용, 1~100까지의 정수 중 3의 배수의 합
		 * - 1~100까지의 반복 for 문
		 * - 3의 배수의 합
		 */
//		내가 푼 풀이
//		int sum = 0;
//		for (int i=1; i<=33; i++) {
//			sum = sum + 3*i;	
//		}
//		System.out.println("3의 배수의 총합 :" + sum);
		
		int sum = 0;
		for (int i=3; i<100; i+=3) {
			sum += i;
		}
		System.out.println(sum);
		
		//excer4
		boolean flag = true;
		while (flag) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			System.out.println("("+dice1+", "+dice2+")");
			if (dice1 + dice2 == 5) {
				flag = false;
			} 
		}
		
		//excer7 
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
		
		//번외 퀴즈!
		//숫자 맞히기 게임
				// 컴퓨터가 1~100 사이의 임의의 수를 정함
				// 사용자가 그 수를 맞춤
				// 작은수를 입력했으면 "큰수를 입력하세요" 출력
				// 큰 수를 입력했으면 "작은수를 입력하세요" 출력
				// 맞았으면 "맞았습니다. 시도횟수 0회"

		
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
		
	
		//기본자료형
		int a = 1;
		int b = a;
		b = 2;
		System.out.println(a);
						
		//참조자료형
		System.out.println(arr1[0]); //위에서 배열변수 arr1을 선언하고
		// 배열{1, 2, 3}을 생성하고 arr1 변수에 대입하였다.따라서, [0]은
		// 배열 {1, 2, 3}에서 인덱스 번호가 0을 가진 '1'을 의미한다.
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		arr3[0] = 4;
		System.out.println(arr2[0]);
		
		
		//한문자씩 출력 
		String ssn = "880815-1234567";
		for (int i=0; i<ssn.length() ;i++ )  {
			System.out.println(ssn.charAt(i));
		} // ssn.length()대신 i<=13이 들어간다
		
		
		
		// String fileName = "신한DS1회차.xlsx";
		String fileName = "내사진.jpg";
		//확장자 구하기
		String ext = fileName.substring(fileName.indexOf("."));
		System.out.println(ext);
		String fileName2 = System.currentTimeMillis() + ext;
		System.out.println(fileName2);
		//또는
		String fileName3 = System.currentTimeMillis() 
						+ fileName.substring(fileName.indexOf("."));
		System.out.println(fileName3);
		
		
		//문자열 분리
		String[] tokens = board.split(",");
		
		//인덱스별 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println();
		
		//for 문을 이용한 읽기
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		//배열 변수 선언과 배열 생성
		int[] scores = { 83, 90, 87 };
		
		//총합과 평균 구하기
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
		
	}
}
