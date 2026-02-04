package ch12;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

	public static void main(String[] args) {
		// 고정된 객체들로 ArrayList 구성 (상수 처럼 사용)
		List<String> list1 = Arrays.asList("홍길동", "신길동", "김자바");
		
		for (String name : list1) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		// 추가, 삭제 등 변경 불가
		list1.add("이승헌");	// 에러
		list1.remove(0);	// 에러
	}

}
