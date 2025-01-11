import java.util.*;

public class EZE_Interview3 {

	public static void main(String[] args) {
		int[] A = { 3, 4, 3, 2, 3, -1, 3, 3 };
		int n = A.length;
		int half = n / 2 + 1;
		int dominator = -1;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			int key = A[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		for (Map.Entry<Integer, Integer> hm : map.entrySet()) {
			if (hm.getValue() >= half) {
				dominator = hm.getKey();
				break;
			}

		}
		System.out.println(dominator);
	}
}
