package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		// 한문자씩 출력
		for (int i=0; i<ssn.length() ;i++ )  {
			System.out.println(ssn.charAt(i));
		} // ssn.length()대신 i<=13이 들어간다
	}

}
