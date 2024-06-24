import java.util.*;

public class Rectangular {
// Codility 2016 REctangular fence
	public static void main(String[] args) {
		int[] A = {  1, 1, 2, 3, 5, 1, 5 };
		System.out.println(Arrays.toString(A));
		// { 1, 2, 5, 1, 1, 2, 3, 5, 1, 5 };
		int X = 5;
		int count = 0;
		Set<Integer> unique = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			int key = A[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		Map<Integer, Integer> sets = new HashMap<>();

		List<Integer> list = new ArrayList<>();
		for (Map.Entry<Integer, Integer> hm : map.entrySet()) {
			if (hm.getValue() % 2 == 0) {
				sets.put(hm.getKey(), hm.getValue() / 2);
				list.add(hm.getKey());
			} else if (((hm.getValue() - 1) % 2) == 0 && ((hm.getValue() - 1) >= 2)) {
				sets.put(hm.getKey(), (hm.getValue() - 1) / 2);
				list.add(hm.getKey());
			}
		}

		for (int i = 0; i < list.size(); i++) {
			int key = list.get(i);
			for (int j = i; j < list.size(); j++) {
				int subKey = list.get(j);
				int mul = key * subKey;
				if (mul >= X && !unique.contains(mul)) {
					boolean cond1 = (key == subKey) && (sets.get(key) >= 2);
					boolean cond2 = key != subKey;
					if (cond1 || cond2) {
						unique.add(mul);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
