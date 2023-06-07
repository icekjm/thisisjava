package ch04;

public class Excer3 {

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
	}

}
