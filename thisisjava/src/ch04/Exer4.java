package ch04;

public class Exer4 {

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			System.out.println("("+dice1+", "+dice2+")");
			if (dice1 + dice2 == 5) {
				flag = false;
			} 
		}
	}

}
