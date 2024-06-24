package Java8;

import java.util.*;
import java.util.List;

public class FirstUniqueArrayCodility {

	public static void main(String[] args) {
		int[] A = { };
		// TODO Auto-generated method stub
		int res = -1;
		if(A.length==0) {
			System.out.println(res);
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			int key = A[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		for (int i = 0; i < A.length; i++) {
			int key = A[i];
			if (map.get(key)==1) {
				res = A[i];
				break;
			}

		}

		System.out.println(res);
	}

}
