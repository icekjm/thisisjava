package ch05;

public class Problem7 {

	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int max = 0;
		for (int i=0; i<array.length; i++) {
			if (max < array[i]) max = array[i];
		}
		System.out.println(max);
		System.out.println("잘되나"+"잘된다");
		System.out.println("잘되나"+"잘된다"+"추가");
	}
}
