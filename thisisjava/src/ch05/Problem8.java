package ch05;

public class Problem8 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int totalNum = 0;
		for (int i=0; i<array.length; i++) {
			totalNum += array[i].length;
			for(int j=0; j<array[i].length; j++)
				sum += array[i][j];
		} 
		double avg = (double) sum / totalNum;
		System.out.println("합="+sum+" , "+"평균="+avg);
	}
}	
