package todayLecture3;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import

public class toDay3 {

	public static void main(String[] args) {
//		3월15일
		//두날짜 사이의 간격
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		
		cal1.set(2023, 1, 21);
		cal2.set(2023, 2, 15);
		
		
		long diff = cal2.getTimeInMillis() - cal1.getTimeInMillis();
		System.out.println(diff/1000*(60*60*24));
		
		//1000000
		String price = '1,000,000';
		System.out.println();
		
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
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf4.format(new Date()));
		
		//정규표현식
		Pattern p = Pattern.compile("[b]*");
		Matcher m;
		m = p.matcher("abc");
		System.out.println(m.matches());
		System.out.println(Pattern.matches("a[b]*", "abc"));
		
		
		//게시판에 글(내용) 작성할때, 내용에 전화번호가 들어있으면 전화번호를 삭제
		String content = "안녕하세요, 저는 홍길동입니다. 어쩌고 저쩌고... 02-1234-5678이고, 반갑습니다."
		content += "... 제 친구 핸드폰번호는요 010-7890-1234에요"
		p = Pattern.compile("(\\d{2,3}-\\d{3,4}-\\d{4})");
		m = p.matcher(content);
//		System.out.println(m.find());
		
		int cnt=1;
		String newcontent = content;
		while(m.find()) {
//			System.out.println(m.group());
			newcontent = newcontent.replace(m.group(), "");
		}
		System.out.println(newcontent);
		}
		
	//게시판에 글(내용) 작성할때, 내용에 전화번호가 들어있으면 전화번호를 삭제
		String content = "안녕하세요, 저는 홍길동입니다. 어쩌고 저쩌고... 02-1234-5678이고, 반갑습니다."
		content += "... 제 친구 핸드폰번호는요 010-7890-1234에요"
		p = Pattern.compile("(\\d{2,3}-\\d{3,4}-)(\\d{4})");
		m = p.matcher(content);
//			System.out.println(m.find());
		
		int cnt=1;
		String newcontent = content;
		while(m.find()) {
//				System.out.println(m.group());
//				System.out.println(m.group(1)+****);
			newcontent = newcontent.replace(m.group(1)+****, "");
		}
		System.out.println(newcontent);
		}
			
	
	
		
	}

}
