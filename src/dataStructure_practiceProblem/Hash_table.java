package dataStructure_practiceProblem;

import java.util.HashMap;
import java.util.Map;

public class Hash_table {
	public static void main(String[] args) {
		String text = "To be or not to be";
		String[] keys = text.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String w : keys) {
			Integer n = map.get(w);
			n = (n == null) ? 1 : ++n;
			map.put(w, n);
		}
	}
}