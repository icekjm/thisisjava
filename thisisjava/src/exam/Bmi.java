package exam;

public class Bmi {

	public static void main(String[] args) {
		double height = 180;
		double weight = 80;
		
		double bmi1 = weight / Math.pow((height/100), 2);
		
		if(bmi1 > 25) {
			System.out.println("비만");
		} else if(bmi1 < 25 && bmi1 > 18.5) {
			System.out.println("표준");
		} else if(bmi1 < 18.5) {
			System.out.println("저체중");
		}
	}

}
