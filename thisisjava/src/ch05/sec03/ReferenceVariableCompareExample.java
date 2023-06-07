package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		
		
		//기본자료형
		int a = 1;
		int b = a;
		b = 2;
		System.out.println(a);
				
		//참조자료형
				System.out.println(arr1[0]); //위에서 배열변수 arr1을 선언하고
				// 배열{1, 2, 3}을 생성하고 arr1 변수에 대입하였다.따라서, [0]은
				// 배열 {1, 2, 3}에서 인덱스 번호가 0을 가진 '1'을 의미한다.
				System.out.println(arr2[0]);
				System.out.println(arr3[0]);
				arr3[0] = 4;
				System.out.println(arr2[0]);

	}

}

		
	