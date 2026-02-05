package ch12.HasMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentKeyMatch {
	public static void main (String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student("1", "홍길동"), 90);
		map.put(new Student("2", "이몽룡"), 80);
		map.put(new Student("3", "성춘향"), 100);
		map.put(new Student("3", "성춘향"), 99);
		
		Set<Student> keyset = map.keySet();
		
		for (Student stdKey : keyset) {
			System.out.println(stdKey.getStdNo() + " " + stdKey.getStdName() + "  " + map.get(stdKey));
		}
	}
}
