package ch10;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		// 배열 범위 벗어나면 발생하는 오류
		String data1 = args[0];
		String data2 = args[1];
		
		if (args.length == 2) {
			data1 = args[0];
			data2 = args[1];
			
			System.out.println("args[0]" + data1);
			System.out.println("args[1]" + data2);
		} else {
			System.out.println("ArrayIndexOutOfBoundsException 오류가 발생합니다");
		}
	}

}
