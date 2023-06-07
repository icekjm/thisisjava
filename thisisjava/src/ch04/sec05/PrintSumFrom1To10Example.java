package ch04.sec05;

public class PrintSumFrom1To10Example {

	public static void main(String[] args) {
		 int i = 1;
		 while (i <= 10) {
			 System.out.print(i + " ");
			 i++;
		 }
		 
		 
		 int sum = 0;
		 int j = 1;
		 
		 while(j<=100) {
			 sum += j;
			 j++;
		 }
		System.out.println("1~" + (j-1) + " 합 : " + sum ); 
	}

}
