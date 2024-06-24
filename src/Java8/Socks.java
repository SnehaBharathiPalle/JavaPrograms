package Java8;

import java.util.*;
import java.util.Map;

public class Socks {

	public static void main(String[] args) {
		int K = 3;
		int[] D = { 1, 4 };
		int[] C = { 1, 2, 1, 1 };
		int pair = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < C.length; i++) {
			int key = C[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		if (K >0) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < D.length; i++) {
				int key = D[i];
				if (map.containsKey(key) && map.get(key) % 2 != 0) {
					K--;
					map.put(key, map.get(key) + 1);

				} else {
					list.add(key);

				}
				if (K == 0) {
					break;
				}
			}

			if (K >= 2) {
				Map<Integer, Integer> dmap = new HashMap<>();
				for (int key : list) {
					if (dmap.containsKey(key)) {
						dmap.put(key, dmap.get(key) + 1);
					} else {
						dmap.put(key, 1);
					}
				}

				for (Map.Entry<Integer, Integer> hm : dmap.entrySet()) {
					if (hm.getValue() % 2 == 0) {
						K = K - 2;
						pair = pair + 1;
					}
					if (K < 2) {
						break;
					}
				}

			}
		}

		for (Map.Entry<Integer, Integer> hm : map.entrySet()) {

			pair = pair + (hm.getValue() / 2);
		}
		System.out.println(pair);
	}

}
