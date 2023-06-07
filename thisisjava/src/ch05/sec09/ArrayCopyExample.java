package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy"};
		//길이 5인 배열
		String[] newStrArray = new String[5];
		//배열항목복사
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//배열항목출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		//추가 문제
		String[] arr = Arrays.copyOf(oldStrArray, 6); // arraycopy메서드와 비교해볼것!!!!
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//향상된 for문
		for (String s : arr) {
		System.out.println(s);
		}
		
		
	}
}
