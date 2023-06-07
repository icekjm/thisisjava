package ch01.sec09;

public class Hello {
	public static void main(String[] args) {
			double d = 1;
			System.out.println(d); // 자동형변환 따라서 1은 정수이지만 1.0으로 출력
			//자동형변환
			// - 작은범위의 타입 -> 큰 범위의 타입
			// 강제형변환
			// (타입)
			// 범위에서 벗어나는 부분 유실
			double j= 1.5;
			int n2 = (int)j;
			system.out.println(n2);
	}
}			
			
			byte b1 = 1;
			byte b2 = 2;
			byte b3 = b1 + b2; //에러
			
			byte b1 = 1;
			byte b2 = 2;
			byte b3 = (byte)(b1 + b2);
			
			//문자열과 + 연산
			String s = "1" + 3;
			//문자열 -> 기본타입
			/*
			 * int -> Integer(클래스)
			 * long -> Long(클래스)
			 * double -> Double(클래스)
			 */
			// 문자열 -> 정수로 바꾸는거 많이 쓴다
			String age = "30";
			int age2 = age; //타입미스매치 에러
			int age2 = Integer.parseInt(age);// 문자열 age를 넣으면 정수로 리턴해준다
			//참고로 앞에 클래스 Inter.parse~를 꼭 써준다
			int age3 = Double.parseDouble(age);
			int age4 = Long.parseLong(age);
			
			// 정수/실수 -> 문자열로 바꾸고 싶다!
			String age5 = String.valueOf(age4);
			String age6 = age4 + "" // 위아래 둘다 같은 결과값을 가지지만, 
					//""을 이용한 것이 더 많이 쓴다.
					
					// 문자열비교
					String id = "admin";
			System.out.println(id);
			String id2 = new String("admin");
			System.out.println(id2);
			System.out.println(id == id2);// 메모리주소를 비교하므로 에러가 난다
			//따라서 아래 식을쓴다. 문자열 비교는 ==를 쓰면 안된다!!
			System.out.println(id.equals(id2));
			
			// 아이디가 admin이면 관리자 출력
			
			if (id.equals("admin")) {
				System.out.println("관리자");
			}//이렇게 쓰는것보다 아래와 같이 쓸것!!!!
			
			id = null;
			if ("admin".equals(id)) {
				System.out.println("관리자");
			}
			
			
			//챕터3
			//전위 : ++변수 -> 실행문보다 먼저 실행
			//후위 : 변수++ -> 실행문보다 나중에 실행
			
			
			// int class = 10
			int a = 10;
			int b = 3;
			System.out.println(a / (double)b);
			System.out.println(a / b); // 정수끼리의 나누기는 반드시 결과가 정수가 나온다
			// 몫
			System.out.println(a % b); // 나머지 
			
			//삼항연산
			System.out.println("당신은 '"+(score>=60?"합격":"불합격")+"'입니다.");
			
			//기타
			double number = Math.random();// 0~1 미만
			//랜덤수의 개수를 곱
			number = number * 6; // 0~6미만
			//정수로 형변환
			number = (int)number; // 0~5
			//시작값 
			number = number + 1;
			System.out.println(number);
			//주사위
			int dice = (int)(Math.random()*6) + 1;
			System.out.println(dice);
	}
}
	
	
	