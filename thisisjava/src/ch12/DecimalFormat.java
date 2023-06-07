package ch12;



public class DecimalFormat {

	public static void main(String[] args) {
		int price = 1000000;
		decimalformat sdf = new DecimalFormat("#,###");
		System.out.println(sdf.format(price));
		
		//반올림
		double d = 3.141592;
		DecimalFormat sdf2 = new DecimalFormat("#.###");
		System.out.println(sdf2.format(d));
		
		//상품번호 : 5자리로 -> 00001
		DecimalFormat sdf3 = new DecimalFormat("00000");
		System.out.println(sdf.format(123));
		
		
		
	}

}
