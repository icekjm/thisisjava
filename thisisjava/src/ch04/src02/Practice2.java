package ch04.src02;

public class Practice2 {

	public static void main(String[] args) {
		
		double number = Math.random();
		number = (int)(number * 2) + 1;
		System.out.println(number);
		
		if (number == 1) {
			System.out.println("앞이 나왔습니다.");
		} else if (number == 2) {
			System.out.println("뒤가 나왔습니다.");
		}
	}

}
