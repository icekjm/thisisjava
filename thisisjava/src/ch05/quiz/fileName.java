package ch05.quiz;

public class fileName {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바");
		if (result ) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
		  System.out.println("자바와 관련 없는 책이군요.");
		}	
		
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
	}
}
