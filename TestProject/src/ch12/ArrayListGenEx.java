package ch12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenEx {
	public static void main (String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
	}
}
