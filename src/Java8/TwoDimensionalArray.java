package Java8;

import java.util.*;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
		int x = equalPairs(grid);
		System.out.println(x);
	}

	public static int equalPairs(int[][] grid) {
		Map<List<Integer>, Integer> map = new HashMap<>();
		int n = grid.length;
		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				list.add(grid[i][j]);
			}
			if (map.containsKey(list)) {
				map.put(list, map.get(list) + 1);
			} else {
				map.put(list, 1);
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				list.add(grid[j][i]);
			}
			if (map.containsKey(list)) {
				count = count + map.get(list);
			}
		}
		return count;
	}

}
