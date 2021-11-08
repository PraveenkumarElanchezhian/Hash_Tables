package dataStructure_practiceProblem;

import java.util.HashMap;
import java.util.Map;

public class Hash_table {
	public static void main(String[] args) {
		String text = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] keys = text.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String w : keys) {
			Integer n = map.get(w);
			n = (n == null) ? 1 : ++n;
			map.put(w, n);
		}
		RemoveAvoidable rv = new RemoveAvoidable();
		rv.avoidable();
	}
}
	class RemoveAvoidable {
		void avoidable() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Paranoids");
		map.put(2, "are");
		map.put(3, "not");
		map.put(4, "paranoid");
		map.put(5, "because");
		map.put(6, "they");
		map.put(7, "are");
		map.put(8, "paranoid");
		map.put(9, "but");
		map.put(10, "because");
		map.put(11, "they");
		map.put(12, "keep");
		map.put(13, "putting");
		map.put(14, "themselves");
		map.put(15, "deliberately");
		map.put(16, "into");
		map.put(17, "Paranoids");
		map.put(18, "avoidable");
		map.put(19, "situations");
		System.out.println("Initial table is: " +map);
		String returned_value = (String)map.remove(18);
		System.out.println("Returned value is: " + returned_value);
		System.out.println("New table is: " +map);
		}
	}