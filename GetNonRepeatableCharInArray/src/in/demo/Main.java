package in.demo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.LinkedHashMap;
/**
 *  Find first non repeatable character in the given string. E.g. “ttytyyax” should return a.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "ttytyyasxxyyttppsls";
		
		System.out.println("First non Repeatable Char for text["+str+"] is["+solution(str)+"]");
	}

	/**
	 * @param str
	 * @return
	 */
	public static char solution(String str) {
		char[] charArr=str.toCharArray();
		Map<Character, Integer> countMap = new LinkedHashMap<>();
		for(char c:charArr) {
			int count=countMap.getOrDefault(c,0);
			countMap.put(c,++count);
		}
		Optional<Entry<Character, Integer>> entry = countMap.entrySet().stream().filter(e-> e.getValue()==1).findFirst();
		
		return entry.map(e->e.getKey()).orElse(null);
	}
}
