package ch05.sec01;

public class ArrayCopy {

	public static void main(String[] args) {
		// 얕은 복사 : 참조 주소만 복사 (동일 객체 참조)
		int[] a = {1, 2, 3, 4};
		int[] b = a;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		a[0] = 100;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		// 깊은 복사 : 새로운 배열 생성해서 원소값 각각을 복사
		int[] deepCopy = new int[4];
		
		for (int i = 0; i < a.length; i++) {
			deepCopy[i] = a[i];
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < deepCopy.length; i++) {
			System.out.print(deepCopy[i] + " ");
		}
		System.out.println();
		
		a[3] = 1000;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < deepCopy.length; i++) {
			System.out.print(deepCopy[i] + " ");
		}
		System.out.println();
		
		int[] deepCopy2 = a.clone();
	}

}
