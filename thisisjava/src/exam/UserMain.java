package exam;

import java.util.List;
import java.util.Scanner;

import bank.AccountVO;

public class UserMain {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.회원등록 | 2.회원목록 | 3. 회원상세 | 4.회원수정 | 5.종료");
		System.out.print("입력]");
		String input = scan.nextLine();
		
		if ("1".equals(input)) {
			System.out.println("[회원등록]");
			System.out.print("아이디:");
			String id = scan.nextLine();
			System.out.print("비밀번호:");
			String pwd = scan.nextLine();
			System.out.print("이름:");
			String name = scan.nextLine();
			UserTable table = new UserTable();
			table.insert(id, pwd, name);
			
			
			
		
		}

	}

}
