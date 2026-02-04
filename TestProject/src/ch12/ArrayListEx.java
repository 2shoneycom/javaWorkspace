package ch12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList listAr = new ArrayList();
		List list = new ArrayList();

		list.add(100);
		list.add("홍길동");
		list.add(5.77);
		list.add('a');

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println();

		list.add(0, "변경");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println();

		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
