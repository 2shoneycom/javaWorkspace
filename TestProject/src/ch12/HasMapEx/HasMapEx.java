package ch12.HasMapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김길동", 85);
		map.put("홍길동", 85);
		map.put("동장군", 80);
		map.put("홍길동", 95);	// "홍길동" key값 중복!!! -> 덮어쓰기
		
		System.out.println("총 entry 수 : " + map.size());
		
		System.out.println("key 홍길동에 대한 value : " + map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ": " + value);
		}
		
		for (String k : keySet) {
			Integer value = map.get(k);
			System.out.println("\t" + k + ": " + value);
		}
		
		// map.entrySet(): 모든 entry 반환 (Set 타입으로 반환 - Map은 entry의 중복은 없음)
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println("\t[" + e + "] : (" + key + ", " + value + ")");
		}
		System.out.println();
		
		map.clear();
		
	}
}
